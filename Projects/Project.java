/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projects;

import java.util.ArrayList;

/**
 *
 * @author dashs
 */
public class Project {
    private int id;
    private String name;
    private ArrayList<Task> task;

    
    public Project(int id, String name) {
        this.id = id;
        this.name = name;
        this.task = new ArrayList();
    }

    public Project() {
        
    }
    
    public void addTask(Task task){
        
    }
    
}
