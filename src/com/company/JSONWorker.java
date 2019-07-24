package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import java.io.*;

public class JSONWorker {

    public static void saveToJSONFile(Student student, File file) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String gsonSt = gson.toJson(student);

        try (PrintWriter pw = new PrintWriter(file)) {
            pw.println(gsonSt);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public static Student loadFromJSON(File file) {

        Gson gson = new Gson();
        Student student = null;

        try {
            student = gson.fromJson(new FileReader(file), Student.class);
        } catch (JsonSyntaxException | JsonIOException | FileNotFoundException e) {
            e.printStackTrace();
        } return student;
    }
}