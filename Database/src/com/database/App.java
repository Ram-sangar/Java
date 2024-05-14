//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//    }
//}
package com.database;

import java.sql.*;
import java.util.*;

/**
 * Hello world!
 *
 */

class Employee{
    int id;
    String name;
    String position;
    Double Salary;

    public Employee(int id, String name, String position, Double salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        Salary = salary;
    }
}

public class App
{
    public static void main( String[] args ) throws SQLException {

        Employee e1 = new Employee(4,"B", "Intern", 10000.0);
        Employee e2 = new Employee(5,"B", "Intern", 10000.0);

        List<Employee> empList = List.of(e1,e2);

        System.out.println( "Hello World!" );

        String url = "jdbc:mysql://localhost:3306/jdbc-test";
        String username = "root";
        String password = "password";

        try( Connection connection = DriverManager.getConnection(url, username, password)){

            // Creating Database Connection

            Class.forName(
                    "com.mysql.cj.jdbc.Driver");
            System.out.println("Connected to the database!");

            // Create Statement
            Statement stmt = connection.createStatement();
            String tableSql = "CREATE TABLE IF NOT EXISTS employees"
                    + "(emp_id int PRIMARY KEY AUTO_INCREMENT, name varchar(30),"
                    + "position varchar(30), salary double)";
            stmt.execute(tableSql);


            //insert statement
            for(Employee e: empList) {
                int result = stmt.executeUpdate(
                        "insert into employees(emp_id,name,position,salary) values('" + e.id + "','" + e.name + "','" + e.position + "'" +
                                ", '" + e.Salary + "' )");

                if (result > 0)
                    System.out.println("successfully inserted");

                else
                    System.out.println(
                            "unsucessful insertion ");
            }
            // if result is greater than 0, it means values
            // has been added


            String selectSql = "SELECT * FROM employees";
            try (ResultSet rs = stmt.executeQuery(selectSql)) {
                while(rs.next()){
                    //Display values
                    System.out.print("Emp ID: " + rs.getInt("emp_id"));
                    System.out.print(", Name: " + rs.getString("name"));
                    System.out.print(", Position: " + rs.getString("position"));
                    System.out.println(", salary: " + rs.getDouble("salary"));
                }
                // use resultSet here
            }


        } catch (SQLException | ClassNotFoundException e) {
            System.err.println("Connection error: " + e.getMessage());
        }finally{

        }

    }
}