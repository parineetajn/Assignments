package com.example.Student;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mca implements Course {

    @Override
    public void show() {
        System.out.println("Mca Course..");
    }
}
