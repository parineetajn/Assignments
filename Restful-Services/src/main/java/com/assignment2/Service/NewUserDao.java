package com.assignment2.Service;

import com.assignment2.model.Address;
import com.assignment2.model.NewUsers;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class NewUserDao {

    private static List<NewUsers> NewUsersList = new ArrayList<>();

    private static int UserCount=3;

    static
    {
        NewUsersList.add(new NewUsers("Parineeta" ,"Jain",1,new Address ("New Delhi","Delhi")));
        NewUsersList.add(new NewUsers("Pinki","Bhati",2,new Address ("Gurgaon","Haryana")));
        NewUsersList.add(new NewUsers("Mohit" , "Chandani",3,new Address ("Chandigarh","Punjab")));
        NewUsersList.add(new NewUsers("Deepak"," Jha",4,new Address( "Chapra","Bihar")));
        NewUsersList.add(new NewUsers("Shivam " ,"Sharma",5,new Address( "Gk","Delhi")));

    }

    public List<NewUsers> findAllUsers(){return NewUsersList; }
}
