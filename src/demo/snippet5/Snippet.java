package demo.snippet5;

import demo.snippet1.User;

public class Snippet {
	// Checking if user has valid data
	public boolean isValidUser(User user) {
	    if (user.getName() == null || user.getEmail() == null) {
	        return false;
	    }
	    return true;
	}
}
