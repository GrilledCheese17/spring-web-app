package com.example.web_app.service;

import com.example.web_app.login_app.ViewUsers;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserMgmt {
    List<ViewUsers> list = new ArrayList<>(Arrays.asList(new ViewUsers("A","B", 52)));
    public List<ViewUsers> getList()
    {
        return list;
    }
    public void addUser(ViewUsers user)
    {
        list.add(user);
    }
}
