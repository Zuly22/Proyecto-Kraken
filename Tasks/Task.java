/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tasks;

import Coments.Coment;
import Users.User;
import java.util.ArrayList;

/**
 *
 * @author zulay
 */
public class Task {
    private int id;
    private String description;
    private boolean complet;
    private User user;
    private  ArrayList <Coment> comment;

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isComplet() {
        return complet;
    }

   

    public User getUser() {
        return user;
    }

    public ArrayList<Coment> getComment() {
        return comment;
    }

    public void setComplet(boolean complet) {
        this.complet = complet;
    }

   

   public Task(int id, String description, User user) {
        this.id = id;
        this.description = description;
        this.complet = false;
        this.user = user;
        this.comment = new ArrayList();
    }
    
    public Task(){
        this(0,"",new User(), new coment());
    }
    
    public AgregarComentario(){
        this.comment.add(comment);
    }
    
    
}
