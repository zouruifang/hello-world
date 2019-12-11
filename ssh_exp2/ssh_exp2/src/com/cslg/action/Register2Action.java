package com.cslg.action;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Administrator
 */
public class Register2Action  extends ActionSupport{
    private String userName;
    private String userPassword;
    private String ruserPassword;
    private int userAge;
    private int userTelephone;
    private String userEmail;
    
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public String getRuserPassword() {
        return ruserPassword;
    }
    public void setRuserPassword(String ruserPassword) {
        this.ruserPassword = ruserPassword;
    }
    public int getUserAge() {
        return userAge;
    }
    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }
    public int getUserTelephone() {
        return userTelephone;
    }
    public void setUserTelephone(int userTelephone) {
        this.userTelephone = userTelephone;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public String execute(){
        return SUCCESS;
    } 
}
