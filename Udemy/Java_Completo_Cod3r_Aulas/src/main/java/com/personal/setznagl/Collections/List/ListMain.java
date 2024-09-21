package com.personal.setznagl.Collections.List;

import java.util.ArrayList;

public class ListMain {
    public static void main(String[] args) {
        ArrayList<User> userList = new ArrayList<>();
        User user1 = new User("Pedro");
        userList.add(user1);
        userList.add(new User("Maria"));
        userList.add(new User("Carlos"));
        userList.add(new User("Bia"));

        System.out.println(userList);
    }
}
