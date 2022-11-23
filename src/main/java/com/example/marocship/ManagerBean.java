package com.example.marocship;

import com.example.marocship.dao.ManagerDao;
import com.example.marocship.entities.Manager;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@RequestScoped
@Named
public class ManagerBean {

    private String username;
    private String email;
    private String password;

    @Inject
    private ManagerDao managerDao;


    public String getUsername() {
        return this.username;
    }

    public void setUsername(String name) {
        this.username = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void createManager(){
        Manager manager = new Manager();

        manager.setEmail(email);
        manager.setUsername(username);
        manager.setPassword(password);

        managerDao.save(manager);

        System.out.println("Hello");
    }
}