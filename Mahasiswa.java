/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Mahasiswa extends User{
    private String nama;
    private String npm;
    private String programStudi;
    static int totalMahasiswa = 0;
    
    public Mahasiswa(){
        totalMahasiswa++;
    }
    
    public Mahasiswa(String nama, String npm, String programStudi){
        this.nama = nama;
        this.npm = npm;
        this.programStudi = programStudi;
        totalMahasiswa++;
    
    }
    public void setnama(String nama){
        this.nama = nama;
    }
    public String getnama(){
        return nama;
    }
    public void setnpm(String npm){
        this.npm = npm;
    }
    public String getnpm(){
        return npm;
    }
    public void setprogramStudi(String programStudi){
        this.programStudi = programStudi;
    }
    public String getprogramStudi(){
        return programStudi; 
    }
    
    public void tampilInfo(){
        System.out.println("NPM : "+npm);
        System.out.println("Program Studi : "+programStudi);
    }
    
}
