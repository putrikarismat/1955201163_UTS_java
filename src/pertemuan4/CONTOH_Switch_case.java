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
public class CONTOH_Switch_case {

    public static void main(String[] args) {
       String nama = JOptionPane.showInputDialog(null, "masukkan nama anda");
      String alamat = JOptionPane.showInputDialog(null, "masukkan alamat anda");
      String cat = JOptionPane.showInputDialog(null, "apa warna cat anda");
      String hargacat = JOptionPane.showInputDialog(null, "berapa harga cat yang anda beli");
      
      switch (hargacat){
          case "bagus":
          JOptionPane.showMessageDialog(null, "selamat" + nama + ", anda mendapat cat yang bagus");
          break;
          case "murah":
          JOptionPane.showMessageDialog(null, "selamat" + nama + ", anda mendapat cat yang murah");
          break;
          default: JOptionPane.showMessageDialog(null, " cat yang anda cari tidak tersedia");
    }
}

}
