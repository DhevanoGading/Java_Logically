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
public class soal5 {
    public static void main(String[] args) {
        int[] bilangan = {4, 6, 1, 3, 5};
        int maksimum = bilangan[0];
        
        for(int i = 0; i < bilangan.length; i++){
            if(bilangan[1] > maksimum) {
                maksimum = bilangan[i];
            }
        }
        System.out.println(maksimum);
    }
}