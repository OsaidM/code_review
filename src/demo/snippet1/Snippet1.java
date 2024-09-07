package demo.snippet1;

import java.util.ArrayList;
import java.util.List;

public class Snippet1 {
	// Function to filter users by age
	public List<User> filterUsers(List<User> users) {
	    List<User> filteredUsers = new ArrayList<>();
	    for (User user : users) {
	        if (user.getAge() > 18) {
	            filteredUsers.add(user);
	        }
	    }
	    return filteredUsers;
	}

}
