package com.example.web_app.controller;

import com.example.web_app.login_app.ViewUsers;
import com.example.web_app.service.UserMgmt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    @RequestMapping("/hello")
    public String message()
    {
        return "Hello World";
    }
    @Autowired
    UserMgmt userMgmt;
    @RequestMapping("/view")
    public ViewUsers[] getLoginDetails()
    {
        List<ViewUsers> list = new ArrayList<ViewUsers>();
        list.add(new ViewUsers("X","A",27));
        list.add(new ViewUsers("Y","B",24));
        list.add(new ViewUsers("Z","C",19));
        return list.toArray(new ViewUsers[0]);

    }

    @RequestMapping(value="/view/add", method= RequestMethod.POST)
    public void addUser(@RequestBody ViewUsers user)
    {
        userMgmt.addUser(user);
    }
}
