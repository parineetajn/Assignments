package com.assignment2.Service;

import com.assignment2.model.Users;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static java.sql.Types.NULL;

@Component
public class UsersDao {

    private static List<Users> usersList = new ArrayList<>();

    private static int UserCount=5;

    static
    {
        usersList.add(new Users("Parineeta" ,"Jain",1,"Delhi"));
        usersList.add(new Users("Pinki","Bhati",2,"Haryana"));
        usersList.add(new Users("Mohit" , "Chandani",3,"Punjab"));
        usersList.add(new Users("Deepak"," Jha",4,"Bihar"));
        usersList.add(new Users("Shivam " ,"Sharma",5,"Delhi"));
    }

    public List<Users> findAllUsers(){return usersList; }

    public Users createNewUsers(Users users) {
        if (users.getRollNo() == NULL)
            users.setRollNo(++UserCount);
            usersList.add(users);
        return users;
    }

    public Users findOneUser(int rollNo) {
        for (Users users: usersList) {
            if (users.getRollNo() == rollNo) {
                return users;
            }
        }
        return null;
    }

}
