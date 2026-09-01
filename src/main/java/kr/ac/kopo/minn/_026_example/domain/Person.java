package kr.ac.kopo.minn._026_example.domain;

import lombok.Data;

@Data
public class Person {
    private String name;
    private int age;
    private String email;

    public Person() {

    }
    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
}