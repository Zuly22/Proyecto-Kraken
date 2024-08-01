/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Coments;

import Users.User;

/**
 *
 * @author dashs
 */
public class Coment {
    private String id;
    private User user;
    private String coment;

    public String getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public String getComent() {
        return coment;
    }

    public void setComent(String coment) {
        this.coment = coment;
    }

    public Coment(String id, User user, String coment) {
        this.id = id;
        this.user = user;
        this.coment = coment;
    }

    public Coment(){
        this("",new User(),"");
    }
    
}
