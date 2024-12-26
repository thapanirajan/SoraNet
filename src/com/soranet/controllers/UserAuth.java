package com.soranet.controllers;

import com.soranet.model.UserModel;
import java.util.ArrayList;
import java.util.List;

public class UserAuth {

    private final String Admin_username = "admin";
    private final String Admin_password = "admin";

    private final String default_username = "alex";
    private final String default_password = "alex123";

    private String loggedInUsername = null;

    // List to store user data
    private final List<UserModel> users = new ArrayList<>();

    public UserAuth() {
        // Add default admin and user to the list
        users.add(new UserModel(Admin_username, Admin_password));
        users.add(new UserModel(default_username, default_password));
    }

    /**
     * Method to handle user signup.
     *
     * @param username Username provided by the user
     * @param password Password provided by the user
     * @param email Email provided by the user
     * @return true if signup is successful, false if username already exists
     */
    public boolean signup(String username, String password, String email) {
        // Check if the username already exists
        if (getUserByUsername(username) != null) {
            return false; // Username already exists
        }
        // Add new user to the system
        users.add(new UserModel(username, password, email));
        return true;
    }

    /**
     * Method to handle user login.
     *
     * @param username Username provided by the user
     * @param password Password provided by the user
     * @return true if login is successful, otherwise return false
     */
    public boolean login(String username, String password) {
        UserModel user = getUserByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            loggedInUsername = username;
            System.out.println("Logged in username : " + loggedInUsername);
            return true;
        }
        return false;
    }

    /**
     * Method to get the total number of users in the system.
     *
     * @return Total number of users
     */
    public int getUserCount() {
        return users.size();
    }

    /**
     * Method to check if a username belongs to an admin.
     *
     * @param username Username to be checked
     * @return true if the provided username matches the admin username,
     * otherwise false
     */
    public boolean isAdmin(String username) {
        return Admin_username.equals(username);
    }

    /**
     * Method to retrieve the currently logged-in username.
     *
     * @return The username of the currently logged-in user
     */
    public String getLoggedInUsername() {
        return loggedInUsername;
    }

    /**
     * Helper method to find a user by username.
     *
     * @param username Username to search for
     * @return The UserModel if found, otherwise null
     */
    private UserModel getUserByUsername(String username) {
        for (UserModel user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
}
