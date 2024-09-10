package org.example.schoolproject;

import org.example.schoolproject.beans.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchoolProjectApplication {

    public static void main(String[] args) {
       var appcontex= SpringApplication.run(SchoolProjectApplication.class, args);
       var studentbean= appcontex.getBean("student", Student.class);
        System.out.println(studentbean);



    }

}
