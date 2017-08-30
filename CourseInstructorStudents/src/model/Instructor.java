package model;

import java.util.ArrayList;
import java.util.List;

public class Instructor {

    private final String name;
    private List<Course> courses = new ArrayList<>();

    public Instructor(String name) {
        this.name = name;
    }


}