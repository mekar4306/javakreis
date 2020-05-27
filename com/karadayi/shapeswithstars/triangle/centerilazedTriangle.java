package com.karadayi.shapeswithstars.triangle;

import java.util.Scanner;

public class centerilazedTriangle {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Height of The Triangle: ");
        int totalNumberOfRows=sc.nextInt();


        
        int numberOfStars=1;
        for (int i = totalNumberOfRows; i >=1 ; i--) {
            for (int numberOfSpace =i-1 ; numberOfSpace >=1 ; numberOfSpace--) {
                System.out.print(" ");
            }

            for (int j = 0; j <numberOfStars ; j++) {
                System.out.print("*");
            }
            System.out.println();
            numberOfStars+=2;
            
        }
     

    }
}
