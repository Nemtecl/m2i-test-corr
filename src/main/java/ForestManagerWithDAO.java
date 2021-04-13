import java.net.ConnectException;
import java.sql.Connection;
import java.sql.SQLException;

public class ForestManagerWithDAO {
    JdbcDAO forestDao;
    Forest forest;

    public void resolveForest(String code) throws SQLException, ConnectException {
        setupConnection();
        forest = forestDao.findForestByCode(code);
    }

    public void saveForest(String code) throws SQLException, ConnectException {
        if(code == null){
            throw new IllegalArgumentException("Le code ne peut pas être null");
        }
        setupConnection();
        forestDao.saveForest();
        forestDao.getConnection().commit();
    }

    public String printForest() throws SQLException, ConnectException {
        setupConnection();
        return forest.toString();
    }

    private void setupConnection() throws SQLException, ConnectException {
        Connection connection = forestDao.setUpConnection();
        connection.setAutoCommit(false);
        if (connection.isClosed()) {
            throw new ConnectException("Impossible d'avoir accès à la base de données");
        }
    }
}
