package demo.snippet4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import demo.snippet1.User;

public class Snippet4_1 {
	private Connection connection; // Assume this is initialized elsewhere
	
	// Querying user by ID with potential SQL injection risk
	public User getUserById(int id) throws SQLException {
		String query = "SELECT name, email FROM users WHERE id = ?";
	    PreparedStatement stmt = connection.prepareStatement(query);
	    stmt.setInt(1, id);
	    ResultSet result = stmt.executeQuery();
	    return mapUser(result);
	}

	// Method to map a ResultSet row to a User object
	public User mapUser(ResultSet result) throws SQLException {
	    if (result.next()) { // Move the cursor to the first row
	        String name = result.getString("name");
	        String email = result.getString("email");
	        int age = result.getInt("age");
	        return new User(name, email, age);
	    }
	    return null; // Return null if no user is found
	}

	private ResultSet executeQuery(String query) {
		// TODO Auto-generated method stub
		return null;
	}
}
