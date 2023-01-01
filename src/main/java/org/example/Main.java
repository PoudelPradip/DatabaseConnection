package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
                String url = "jdbc:mysql://localhost:3306/zorba_sql_exam";//url and schema name
                String username = "root";//Database login username
                String password ="Java@2022";//Database login password
                String query = "Select * from employees";//Query and table name(worker)
                Class.forName("com.mysql.cj.jdbc.Driver");//Driver name,standard for SQL connection
                Connection connection = DriverManager.getConnection(url,username,password);//connection Interface

                System.out.println("connection established with Database successful!!!");

                Statement statement = connection.createStatement();//interface

                ResultSet resultSet = statement.executeQuery(query);//interface

                System.out.println("Name of the employees:");
                System.out.println("emp_name");
                while (resultSet.next()){
                    String name= resultSet.getString("emp_name");
                    System.out.println(name);

                }System.out.println("connection successfully closed!!!");
                statement.close();//closing interface
                connection.close();//closing connection
            }
        }




