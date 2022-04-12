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
public class soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil;
        int total = 0;
        
        System.out.println("Masukkan bilangan : ");
        bil = input.nextInt();
        
        for(int i = 1; i <= bil; i++){
            if(bil == i){
                System.out.print(i);
            }else{
                System.out.print(i+" + ");
            }
            total += i;
        }
        System.out.println(" = "+total);
    }
}
