package demo.snippet4;

import java.sql.ResultSet;
import java.sql.SQLException;

import demo.snippet1.User;

public class Snippet {
	// Querying user by ID with potential SQL injection risk
	public User getUserById(int id) throws SQLException {
	    String query = "SELECT * FROM users WHERE id = " + id ;
	    ResultSet result = executeQuery(query);
	    return mapUser(result);
	}

	// Method to map a ResultSet row to a User object
	public User mapUser(ResultSet result) throws SQLException {
	    if (result.next()) { 
	        String name = result.getString("name");
	        String email = result.getString("email");
	        int age = result.getInt("age");
	        return new User(name, email, age);
	    }
	    return null;
	}

	private String executeQuery(String query) {
		query = "something";
		return query;
	}

}
