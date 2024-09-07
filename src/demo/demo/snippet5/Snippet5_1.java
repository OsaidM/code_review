package demo.snippet5;

import java.util.Objects;

import demo.snippet1.User;

public class Snippet5_1 {
	// Simplified null check with Objects.nonNull
	public boolean isValidUser(User user) {
	    return Objects.nonNull(user.getName()) && Objects.nonNull(user.getEmail());
	}
}
