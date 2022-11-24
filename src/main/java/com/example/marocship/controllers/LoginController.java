package com.example.marocship.controllers;

import com.example.marocship.beans.Alert;
import com.example.marocship.beans.Auth;
import com.example.marocship.beans.Login;
import com.example.marocship.dao.PersonDao;
import com.example.marocship.entities.DeliveryManager;
import com.example.marocship.entities.Person;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
@RequestScoped
public class LoginController implements Serializable {

    @Inject
    Login credentials;

    @Inject
    Alert alert;

    @Inject
    Auth auth;

    public void login(){
        Person person = new PersonDao<DeliveryManager>().userExist(credentials.getEmail(),credentials.getPassword(), DeliveryManager.class);
        if(person != null) auth.setUser(person);
        else alert.setMessage("Wrong email or password!");
        // TODO: check for user role
        // TODO: set the role...
        // ...
    }

}
