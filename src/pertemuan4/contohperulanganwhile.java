/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

/**
 *
 * @author LENOVO
 */
public class contohperulanganwhile {
    public static void main(String[] args) {
        
         int n = 5 ;
        String beli = "";
        System.out.println("mulai");
        System.out.println("siapkan uang");
        System.out.println("datang ke tokoh");
        System.out.println("memilih barang");
        System.out.println("datang ke kasir");
        System.out.println("membayar uang ke kasir");
        
        String barang;
        barang = "beli";
        System.out.println("apakah barang sudah cocok");
        if("beli".equals(barang)){
            
        }
        else {
            System.out.println("belum cocok");
            
        }
        int i = 1;
        while (i<5){
            System.out.println("pilih barang lagi - " + i);
            i++;
        }
        System.out.println("bayar");
        System.out.println("selesai");
    }
}
