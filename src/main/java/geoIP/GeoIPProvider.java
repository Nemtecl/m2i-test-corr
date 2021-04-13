package geoIP;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

public class GeoIPProvider implements IGeolocationProvider{
    public String URL_BASE = "https://freegeoip.app/json/";

    public GeoIPProvider() {
        super();
    }

    public GeoIPProvider(String URL_BASE) {
        this.URL_BASE = URL_BASE;
    }

    public String getURL_BASE() {
        return URL_BASE;
    }

    public void setURL_BASE(String URL_BASE) {
        this.URL_BASE = URL_BASE;
    }

    @Override
    public Geolocation getCurrentLocation() {
        ClientConfig clientConfig = new DefaultClientConfig();
        Geolocation geolocation;

        clientConfig.getFeatures().put(
                JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
        Client client = Client.create(clientConfig);
        WebResource webResource = client
                .resource(URL_BASE);
        ClientResponse response = webResource.accept("application/json")
                .type("application/json").get(ClientResponse.class);
        if (response.getStatus() != 200) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + response.getStatus());
        }
        try {
            final JSONObject geolocJson = new JSONObject(response.getEntity(String.class));
            geolocation=new Geolocation(geolocJson.getString("ip"),
                    geolocJson.getString("country_code"),
                    geolocJson.getString("country_name"),
                    geolocJson.getString("region_code"),
                    geolocJson.getString("region_name"),
                    geolocJson.getString("city"),
                    geolocJson.getString("zip_code"),
                    geolocJson.getString("time_zone"),
                    geolocJson.getString("latitude"),
                    geolocJson.getString("longitude"),
                    geolocJson.getString("metro_code"));
        } catch (JSONException jse) {
            geolocation=new Geolocation();
        }
        return geolocation;
    }

}
