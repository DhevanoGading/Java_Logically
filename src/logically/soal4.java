/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logically;


/**
 *
 * @author MOKLET-2
 */
public class soal4 {
    public static void main(String[] args) {
        int[] bilangan = {4, 6, 1, 3, 5};
        
        for(int i=0; i < bilangan.length; i++){
               if(bilangan[i] % 2 == 0){
                   System.out.print("genap ");
                }else{
                   System.out.print("ganjil ");
            }
        }
    }
}
