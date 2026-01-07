/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class NilaiMahasiswa implements Penilaian{
    private double nilaiTugas;
    private double nilaiUTS;
    private double nilaiUAS;
    
    public NilaiMahasiswa(double nilaiTugas, double nilaiUTS, double nilaiUAS){
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
    @Override
    public double hitungNilaiAkhir(){
        return (0.3*nilaiTugas)+(0.3*nilaiUTS)+(0.4*nilaiUAS);
    }
}
