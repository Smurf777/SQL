import com.company.Car;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;

public class Povtorenie {
    public static void main(String[] args) throws SQLException {
        Driver driver = new Driver();
        DriverManager.registerDriver(driver);
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sunday_artyom_database", "root","MySQL" );
        Statement statement = connection.createStatement();
       // statement.execute("INSERT INTO `cars` (`car_name`, `model`, `engine_id`) VALUES ('name_four', 'vazvaziik', '3')");
       // statement.execute(String.format("INSERT INTO `cars` (`car_name` , `model` , `engine_id`) VALUES('%s', '%s', '%d')","name_four", "vazvaziik", 3));
        try {
            statement.execute("UPDATE `cars` SET `model` = 'dobrin' WHERE (`id` = '1');");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ArrayList<Car> arrayList = new ArrayList();
        try {
                ResultSet res = statement.executeQuery("SELECT * FROM `cars`");
                while (res.next()) {
                        int id = res.getInt(1);
                        String str1 = res.getString(2);
                        String str2 = res.getString(3);
                        int str3 = res.getInt(4);
                        arrayList.add(new Car(str1, str3));
                }
            for(Car car : arrayList){
                System.out.println(car.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
