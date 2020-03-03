package com.example.Student;

import org.springframework.stereotype.Component;

@Component
public class Btech implements Course {
    @Override
    public void show() {
        System.out.println("Btech course..");
    }
}
