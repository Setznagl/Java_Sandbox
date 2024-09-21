package com.personal.setznagl.Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<Integer , String> usersMap = new HashMap<>();
        usersMap.put(1 , "Amanda");
        usersMap.put(2 , "Bob");
        usersMap.put(3 , "David"); // Será atualizado na linha abaixo
        usersMap.put(3 , "Bartolomeu");
        System.out.println(usersMap);
//        System.out.println(usersMap.keySet());
//        System.out.println(usersMap.values());
//        System.out.println(usersMap.entrySet());
        System.out.println(usersMap.containsKey(2));
        System.out.println(usersMap.containsValue("Sávio"));

        //for (Integer chave: usersMap.keySet()) {System.out.println(chave);}
        //for (String value: usersMap.values()) {System.out.println(value);}
        for(Map.Entry<Integer , String> entry: usersMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
