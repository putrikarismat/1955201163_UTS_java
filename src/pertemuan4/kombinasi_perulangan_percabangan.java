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
public class kombinasi_perulangan_percabangan {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("############################");
        System.out.println("     TOKOH PUTRI KHARISMA   ");
        System.out.println("###33#######################");
        
        System.out.println("Masukan jumlah barang yang akan beli : ");
        int beli = input.nextInt();
        
        for ( int i = 1; i<=beli; i++)
        {
            System.out.print("Masukan Nama Barang Ke- "+i+" : ");
            String nama = input.next();
            System.out.print("Masukan Harga Barang Ke- "+i+" : ");
            int harga = input.nextInt();
            System.out.print("Masukan Jumlah Barang Ke- "+i+" : ");
            int jumlah = input.nextInt();
            System.out.println("");
            
            System.out.println("##########################");
            System.out.println("Nama Barang : "+nama);
            System.out.println("Harga Barang : "+harga);
            System.out.println("Jumlah Barang : "+jumlah);
            System.out.println("##########################");
            
            int total,totalb, diskon =0;
            total = harga * jumlah;
            System.out.println("Total Belanja  = Rp."+total);
            
            if (total >=50000){
                diskon=total/5;
            }else {diskon = 0;}
            
            System.out.println("Diskon         = Rp."+diskon);
            total = total - diskon;
            System.out.println("Total Bayar = Rp."+total);
            
            System.out.print("Uang Bayar = Rp.");
            int bayar = input.nextInt();
            
            int kembali = bayar - total;
            System.out.println("Uang Kembali = Rp."+kembali);
            
            
            }
            
            
            
        }
        
        
        
    }
    
