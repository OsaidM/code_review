package demo.snippet1;

import java.util.List;
import java.util.stream.Collectors;

public class Snippt1_1 {
	// Constant to avoid magic numbers
	private static final int MIN_AGE = 18;

	// Improved function using streams
	public List<User> filterUsers(List<User> users) {
	    return users.stream()
	                .filter(user -> user.getAge() > MIN_AGE)
	                .collect(Collectors.toList());
	}

}
