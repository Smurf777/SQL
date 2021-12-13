package com.company;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {
     //   com.mysql.cj.jdbc.Driver driver = new com.mysql.cj.jdbc.Driver();
        Driver driver = new com.mysql.cj.jdbc.Driver();
        DriverManager.registerDriver(driver);
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db_test","root","MySQL");
        Statement statement = connection.createStatement();
      //  statement.execute(String.format("INSERT INTO `my_db_test`.`table_from_java` (`first_name`, `last_name`) VALUES('Joe%d', 'Dannny%d');", 5, 5));
      //  statement.execute("CREATE TABLE IF NOT EXISTS `engines` (`id` INT   AUTO_INCREMENT PRIMARY KEY,`engine_name` VARCHAR(45) NOT NULL, `power` VARCHAR(45) NOT NULL) ");

//        for (Car car : arrayList){
//            try {
//                statement.execute(String.format("INSERT INTO `cars` (`car_name` , `model` , `engine_id`) VALUES('%s', '%s', '%d')",car.carName, car.model, car.engineId));
//                //statement.execute(String.format("INSERT INTO `many_to_one`.`cars` (`mark`, `model`, `engine_id`) VALUES ('lamborgini%d','urus%d','%d');", i, i + 900 ,i));
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
     //   }
//        ResultSet res = statement.executeQuery("SELECT * FROM table_from_java");
//        if(!connection.isClosed()){
//
//            System.out.println("Соеденение с БД установленно ");
//        }
//        connection.close();
        Car car = new Car("engine", 3);
        System.out.println();
    }
}
