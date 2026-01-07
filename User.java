/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
abstract class User {
    protected String id;
    protected String nama;
    
    public User(){}
    
    public User(String id, String nama){
        this.id = id;
        this.nama = nama;
    }
    
    public abstract void tampilInfo();
}

