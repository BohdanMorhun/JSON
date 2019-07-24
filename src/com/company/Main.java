package com.company;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Bob", "Harison", 35, "BM21");
        JSONWorker.saveToJSONFile(student, new File("a.gson"));

        Student studentOne = JSONWorker.loadFromJSON(new File("a.gson"));
        System.out.println(studentOne);
    }
}

