/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Dosen extends User{
    private String namadosen;
    private String nidn;
    
    public Dosen(){
    }
    
    public Dosen(String nidn, String namadosen){
        this.nidn = nidn;
        this.namadosen = nama;
    }
    public void setnidn(String nidn){
        this.nidn = nidn;
    }
    public String getnidn(){
        return nidn;
    }
    public void setnamadosen(String namadosen){
        this.namadosen = namadosen;
    }
    public String getnamadosen(){
        return namadosen;
    }
    public void tampilInfo(){
        System.out.println("NIDN : "+nidn);
        System.out.println("Nama Dosen : "+namadosen);
        
    }
    
}