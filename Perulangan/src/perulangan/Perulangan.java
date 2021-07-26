/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan;

/**
 *
 * @author MarKoN TeaM
 */
import java.util.Scanner;
public class Perulangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean running = true;
        int counter = 0;
        String jawab;
        Scanner scan = new Scanner(System.in);

        while( running ) {
            System.out.println("Apakah anda dalam keadaan sehat?");
            System.out.print("Jawab (ya/tidak)> ");

            jawab = scan.nextLine();

            // cek jawabnnya, kalau ya maka berhenti mengulang
            if( jawab.equalsIgnoreCase("ya") ){
                running = true;
            }

            counter++;
        }
        System.out.println("Silahkan Masuk ");
        System.out.println("Anda sudah melakukan perulangan sebanyak " + counter + " kali");

    }
}