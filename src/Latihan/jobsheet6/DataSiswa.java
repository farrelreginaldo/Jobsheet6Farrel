/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan.jobsheet6;

/**
 *
 * @author Farrel
 */
import java.util.Scanner;
public class DataSiswa {
    public static void main(String[] args) {
     // Deklarasi variabel
     String nama, alamat;
     int usia, absen;
     
     // Membuat scanner baru
     Scanner keyboard = new Scanner(System.in);
     
     // Tampilkan output ke user
     System.out.println("### DATA SISWA SMK TELKOM MALANG ###");
     System.out.print("Nama siswa: ");
        
     // Menggunakan scanner dan menyimpan apa yang diketik di variabel nama
     nama = keyboard.next();
     
     // Tampilkan output lagi
     System.out.print("Alamat: ");
     
     // Menggunakan scanner lagi
     alamat = keyboard.next();
     System.out.print("Absen: ");
     usia = keyboard.nextInt();
     System.out.print("usia: ");
     absen = keyboard.nextInt();
     
     // Menampilkan apa yang sudah simpan di variabel
     System.out.println("--------------------");
     System.out.println("Nama Siswa: " + nama);
     System.out.println("Alamat: " + alamat);
     System.out.println("Absen: " + usia);
     System.out.println("Usia: " + absen + "tahun");
    }
}