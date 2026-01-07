/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class MataKuliah {
    private String kodeMk;
    private String namaMk;
    
    public MataKuliah(){
    }
    public MataKuliah(String kodeMk,String namaMk){
        this.kodeMk = kodeMk;
        this.namaMk = namaMk;
    }
    
    public void setkodeMk(String kodeMk){
        this.kodeMk = kodeMk;
    }
    public String getkodeMk(){
        return kodeMk;
    }
    public void setnamaMk(String namaMk){
        this.namaMk = namaMk;
    }
    public String getnamaMk(){
        return namaMk;
    }
    public void tampilInfo(){
       System.out.println("Kode Mata Kuliah : "+kodeMk);
       System.out.println("Nama Mata Kuliah : "+namaMk);
    }
   }
