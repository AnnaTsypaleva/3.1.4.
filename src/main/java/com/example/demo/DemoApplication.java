package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

public class DemoApplication {

    public static void main(String[] args) {

        UserService userService = new UserService();

        User user = new User(3L, "James", "Brown", (byte) 35);
        User user2 = new User(3L, "Thomas", "Shelby", (byte) 36);

        userService.getAllUsers();
        String result1 = userService.addUser(user);
        String result2 = userService.editUser(user2);
        String result3 = userService.deleteUser(3L);
        System.out.println(result1 + result2 + result3);
    }

}