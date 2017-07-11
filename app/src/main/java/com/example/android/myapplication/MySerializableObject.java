package com.example.android.myapplication;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Inklocal on 7/11/2017.
 */

public class MySerializableObject implements Serializable{
    private String name;
    private int age;
    private ArrayList<String> address;

    public MySerializableObject(String name, int age, ArrayList<String> address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<String> getAddress() {
        return address;
    }
}
