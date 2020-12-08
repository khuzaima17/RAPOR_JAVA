
package remed.pro.rpl;

import java.util.Scanner;


public class REMEDPRORPL {

 
    public static void main(String[] args) {
                //deklarasi variabel
        int Tugas,Pemahaman,Pts,Pas;
        double NilaiPelajaran,JumlahNilai,jumlahpenilaian;
        boolean running = true;
        Scanner input = new Scanner (System.in);
        String jawab;
        
        //perulangan
       
        while (running) {
           System.out.println("RAPOR KHUZAIMA FILLA JANUARTHA");
           System.out.println("Nilai Tugas : ");
           Tugas=input.nextInt();
           System.out.println("Nilai Pemahaman : ");
           Pemahaman=input.nextInt();
           System.out.println("Nilai Pts : ");
           Pts=input.nextInt();
           System.out.println("Nilai Pas : ");
           Pas=input.nextInt();
           
           //proses menghitung nilai rapor
           
           jumlahpenilaian=4;
           JumlahNilai=(Tugas+Pemahaman+Pts+Pas)/jumlahpenilaian;
           if (JumlahNilai>75){
               System.out.println("Nilai Di Atas KKM , Anda Lulus");
               System.out.println("Rata-Rata Nilai Anda adalah = "+JumlahNilai);
               
           }
           else {
               System.out.println("Nilai Anda dibawah KKM , Anda harus mengulang");
               System.out.println("Rata-Rata Nilai Anda adalah ="+JumlahNilai);
           }   
           
           //perulangan
           
           System.out.println("Apakah Anda Ingin Mengulangi Program Ini? [Jawab" + " ya/tidak");
           jawab = input.next();
           if (jawab.equalsIgnoreCase("ya")){
               running = true;
                       
           }
           if (jawab.equalsIgnoreCase("tidak")){
               running = false;
           }
               
               
               

    }
    }
    
}
