/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengulangankata;

import java.util.Scanner;

/**
 *
 * @author MarKoN TeaM
 */
public class Pengulangankata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan absen");
        int angka = scan.nextInt();
        for(int i=0;i<angka;i++)
        System.out.println("Saya hebat semangat selamat!!!");
    }
    
}
