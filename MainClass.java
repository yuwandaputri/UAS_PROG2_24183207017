import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();
        ArrayList<Dosen> listDosen = new ArrayList<>();
        ArrayList<MataKuliah> listMataKuliah = new ArrayList<>();
                
        int pilihan;
        do {
            System.out.println("===== SISTEM AKADEMIK ===== ");
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. Input Data Dosen");
            System.out.println("3. Input Mata Kuliah");
            System.out.println("4. Input Nilai Mahasiswa");
            System.out.println("5. Tampilkan Data ");
            System.out.println("6. Keluar ");
            System.out.print("Pilih Menu : ");
            pilihan = input.nextInt();
            input.nextLine();
           
            switch (pilihan){
                case 1:
                    System.out.print("Nama : ");
                    String nama = input.nextLine();
                    System.out.print("NPM : ");
                    String npm = input.nextLine();
                    System.out.print("Program Studi: ");
                    String programStudi  = input.nextLine();
                    
                    Mahasiswa mhs= new Mahasiswa(nama, npm, programStudi);
                    listMahasiswa.add (mhs);
                    System.out.println("Data Mahasiswa Berhasil Ditambahkan");
                
                case 2:
                    System.out.print("NIDN : ");
                    String nidn = input.nextLine();
                    System.out.print("Nama Dosen : ");
                    String namadosen = input.nextLine();
                    
                    Dosen dsn= new Dosen(nidn, namadosen);
                    listDosen.add (dsn);
                    System.out.println("Data Dosen Berhasil Ditambahkan");
                    
                case 3:
                    System.out.print("Kode MK : ");
                    String kodemk = input.nextLine();
                    System.out.print("Nama MK : ");
                    String namamk = input.nextLine();
                    
                    MataKuliah mk= new MataKuliah(kodemk, namamk);
                    listMataKuliah.add (mk);
                    System.out.println("Data Mata Kuliah Berhasil Ditambahkan");
                    
                case 4:
                    System.out.print("Nilai Tugas : ");
                    double nilaitugas = input.nextDouble();
                    System.out.print("Nilai UTS : ");
                    double nilaiuts = input.nextDouble();
                    System.out.print("Nilai UAS : ");
                    double nilaiuas = input.nextDouble();
                    
                    NilaiMahasiswa nilai= new NilaiMahasiswa(nilaitugas, nilaiuts, nilaiuas);
                    System.out.println("Nilai Akhir : "+nilai.hitungNilaiAkhir());
                    break;
                    
                case 5:
                    System.out.println("=====DATA MAHASISWA=====");
                    for (Mahasiswa m: listMahasiswa){
                        m.tampilInfo();
                        System.out.println("=============");
                    }
                    System.out.println("=====DATA DOSEN=====");
                    for (Dosen d: listDosen){
                        d.tampilInfo();
                        System.out.println("=============");
    }
                    System.out.println("=====DATA MATA KULIAH=====");
                    for (MataKuliah matkul: listMataKuliah){
                        matkul.tampilInfo();
                    }
                    
                    System.out.println("Total Mahasiswa : "+ Mahasiswa.totalMahasiswa);
                    break;
                    }
                    
        }while (pilihan!=0);
System.out.println("Program selesai");
        }
}
