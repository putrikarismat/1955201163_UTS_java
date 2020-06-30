/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class contohscanner {
    public static void main(String[] args) {
        // deklarasi tipe data
        String nama, jeniskelamin, agama, alamatrumah, universitas ,prodi;
        int usia, tahunlulus;
        double beratbadan,tinggibadan;
        
        
        // membuat scanner baru
        Scanner keyboard = new Scanner (System.in);
        
        
        // Tampilkan output ke user
        System.out.println("$$$ Pendaftaran Mahasiswi Ilkom $$$");
        System.out.println("Nama Mahasiswi: ");
        // menggunakan scanner dan menyimpan apa yang diketik 
        nama = keyboard.nextLine();
        // Tampilkan output lagi
        System.out.println("Jenis Kelamin");
        jeniskelamin = keyboard.nextLine();
        
        System.out.println("Agama");
        agama = keyboard.nextLine();
        
        System.out.println("Alamat Rumah: ");
        // menggunakan scanner lagi 
        alamatrumah = keyboard.nextLine();
        
        System.out.println("Universitas");
        universitas = keyboard.nextLine();
        
        System.out.println("Prodi");
        prodi = keyboard.nextLine();
        
        System.out.println("Usia: ");
        usia = keyboard.nextInt();
        
        System.out.println("Tahun Lulus: ");
        tahunlulus = keyboard.nextInt();
        
        System.out.println("Berat Badan: ");
        beratbadan = keyboard.nextDouble();
        
        System.out.println("Tinggi Badan: ");
        tinggibadan = keyboard.nextDouble();
        
        
        // Menampilkan apa yang sudah simpan di variabel data
        System.out.println("----------------------");
        System.out.println("Nama Mahasiwi: " + nama);
        System.out.println("Jenis Kelamin: " + jeniskelamin); 
        System.out.println("Agama: " + agama);
        System.out.println("Alamat Rumah: " + alamatrumah);
        System.out.println("Universitas: " + universitas);
        System.out.println("Prodi: " + prodi);
        System.out.println("Usia: " + usia);
        System.out.println("Tahun Lulus: " + tahunlulus);
        System.out.println("Berat Badan: " + beratbadan);
        System.out.println("Tinggi Badan: " + tinggibadan);
        
        
        
        
    }
    
}
