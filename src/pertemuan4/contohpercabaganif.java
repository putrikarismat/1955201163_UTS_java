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
public class contohpercabaganif {
    public static void main(String[] args) {
        
        String nama = JOptionPane.showInputDialog(null, "masukkan nama anda");
      String alamat = JOptionPane.showInputDialog(null, "masukkan alamat anda");
      String cat = JOptionPane.showInputDialog(null, "apa warna cat anda");
      int hargacat = Integer.parseInt(JOptionPane.showInputDialog(null, "berapa harga cat yang anda beli"));
      
      if(hargacat >=100){
          System.out.println("kamu dapat cat bagus");
          JOptionPane.showMessageDialog(null, "selamat kamu dapat cat bagus");
      }
      JOptionPane.showMessageDialog(null, "selesai");
      
}   
    }
    