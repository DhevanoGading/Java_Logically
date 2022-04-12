/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logically;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        int bil1, bil2;
        
        System.out.println("Masukkan bilangan pertama :");
        bil1 = myObj.nextInt();
        System.out.println("Masukkan bilangan kedua :");
        bil2 = myObj.nextInt();

        if(bil1>bil2) {
            System.out.println("Bilangan Terbesarnya : " + bil1);
        }else {
            System.out.println("Bilangan Terbesarnya : " +bil2);
        }
    }
}
