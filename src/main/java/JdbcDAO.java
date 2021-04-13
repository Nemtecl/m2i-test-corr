import java.sql.Connection;
import java.util.List;

public interface JdbcDAO {
    Connection setUpConnection();

    Forest findForestByCode(String code);

    void saveForest();

    Connection getConnection();
}
