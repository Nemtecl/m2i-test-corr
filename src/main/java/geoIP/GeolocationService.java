package geoIP;


public class GeolocationService {
    private IGeolocationProvider geolocationProvider;


    public GeolocationService(IGeolocationProvider geolocationProvider) {
        this.geolocationProvider = geolocationProvider;
    }

    public static void main(String[] args) {
        System.out.println(
                    new GeolocationService(new GeoIPProvider())
                        .getLocation().humanReadableString()
        );
    }


    public Geolocation getLocation() {
        if (null == geolocationProvider) {
            throw new IllegalStateException("The provider cannot be null");
        }
        return geolocationProvider.getCurrentLocation();
    }
}
