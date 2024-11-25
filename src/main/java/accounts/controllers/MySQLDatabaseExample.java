package accounts.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class MySQLDatabaseExample {

    // Database credentials
    private static final String URL = "jdbc:mysql://localhost:3306/my_database_name?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        try {
            // Establish the connection
            Connection connection = connectToDatabase();
            
            // Create a table
            createTable(connection);

            // Insert data into the table
            insertData(connection);

            // Retrieve and display data from the table
            retrieveData(connection);

            // Close the connection
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to establish a connection to the database
    private static Connection connectToDatabase() throws Exception {
        System.out.println("Connecting to the database...");
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        System.out.println("Connected successfully!");
        return connection;
    }

    // Method to create a table
    private static void createTable(Connection connection) throws Exception {
        String createTableSQL = """
            CREATE TABLE IF NOT EXISTS Vehicles (
                id INT AUTO_INCREMENT PRIMARY KEY,
                name VARCHAR(50) NOT NULL,
                type VARCHAR(50) NOT NULL
            )
        """;

        Statement statement = connection.createStatement();
        statement.execute(createTableSQL);
        System.out.println("Table 'Vehicles' created successfully!");
    }

    // Method to insert data into the table
    private static void insertData(Connection connection) throws Exception {
        String insertDataSQL = """
            INSERT INTO Vehicles (name, type)
            VALUES 
                ('Car RT', 'Sedan'),
                ('Car BT', 'SUV'),
                ('Bike AT', 'Motorbike')
        """;

        Statement statement = connection.createStatement();
        int rowsInserted = statement.executeUpdate(insertDataSQL);
        System.out.println(rowsInserted + " rows inserted into 'Vehicles' table!");
    }

    // Method to retrieve and display data
    private static void retrieveData(Connection connection) throws Exception {
        String selectDataSQL = "SELECT * FROM Vehicles";

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(selectDataSQL);

        System.out.println("Data in 'Vehicles' table:");
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String type = resultSet.getString("type");
            System.out.println("ID: " + id + ", Name: " + name + ", Type: " + type);
        }
    }
}

