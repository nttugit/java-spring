package dependency_injection;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

// FactoryDAO đóng vai trò là IOC Container (Spring container)
// giúp khởi tạo và quản lý life cycle của các Beans (MySqlDAO,...)
public class FactoryDAO {

    public static IAbstractDAO getDAO() {
        Properties prop = new Properties();
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("config.properties");
            prop.load(inputStream);
            String database = prop.getProperty("database");
            System.out.println(database);
            switch (database) {
                case "1":
                    return new MySqlDAO();
                case "2":
                    return new PostgreDAO();
                case "3":
                    return new MSSqlDAO();
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
