/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class contohJOptionPane {
    
    public static void main(String[] args) {
        String tanya = JOptionPane.showInputDialog("Siapa Nama Anda?");
        String jeniskelamin = JOptionPane.showInputDialog("Jenis Kelamin : Anda?");
        String agama = JOptionPane.showInputDialog("Agama : Anda?");
        String alamatrumah = JOptionPane.showInputDialog("Alamat Rumah : Anda?");
        String universitas = JOptionPane.showInputDialog("Universitas : Anda?");
        String prodi = JOptionPane.showInputDialog("Prodi : Anda?");
        String usia = JOptionPane.showInputDialog("Usia : Anda");
        String tahunlulus = JOptionPane.showInputDialog("Tahun Lulus : Anda");
        String beratbadan = JOptionPane.showInputDialog("Berat Badan : Anda");
        String tinggibadan = JOptionPane.showInputDialog("Tinggi Badan : Anda");
        
        int Jumlah = Integer.parseInt(usia);
        int banyakmahasiswi = 120;
        double total = Jumlah*banyakmahasiswi;
        
        System.out.println("Siapa Nama Anda :" + tanya);
        System.out.println("Jenis Kelamin :" + jeniskelamin);
        System.out.println("Agama :" + agama);
        System.out.println("Alamat Rumah :" + alamatrumah);
        System.out.println("Universitas :" + universitas);
        System.out.println("Prodi :" + prodi);
        System.out.println("Usia :" + usia);
        System.out.println("Tahun Lulus :" + tahunlulus);
        System.out.println("Berat Badan :" + beratbadan);
        System.out.println("Tinggi Badan :" + tinggibadan);
        
    }
    
}
