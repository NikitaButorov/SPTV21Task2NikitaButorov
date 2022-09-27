/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv21task2nikitabutorov;

import java.util.Scanner;

/**
 *
 * @author Nikita Butorov
 */
public class SPTV21Task2NikitaButorov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input 3-digit number: ");
        int number = scanner.nextInt();
        System.out.printf("Your number is %d%n",number);
        int units = (number%10);
        int dozens = (number/10%10);
        int hundreds = (number/100);
        int summa = (units+dozens+hundreds);
        System.out.print("\nsumma numbers: "+summa);
        // TODO code application logic here
    }
    
}
