package com.company;

public class Student {

    private String name;
    private String lastName;
    private int age;
    private String groupName;

    public Student(String name, String lastName, int age, String groupName) {
        super();
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.groupName = groupName;

    } public Student() {
        super();

    } public String getName() {
        return name;

    } public void setName(String name) {
        this.name = name;

    } public String getLastName() {
        return lastName;

    } public void setLastName(String lastName) {
        this.lastName = lastName;

    } public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

            @Override
    public String toString() {
        return "Student [name=" + name + ", lastName=" + lastName + ", age=" + age + ", groupName=" + groupName + "]";
    }
}

