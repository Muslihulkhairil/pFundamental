/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.muslihuljava;

import java.util.Scanner;

public class seats {
    
    public static void main(String[] args) {
        int[][] seats = {
            {0, 0, 0, 1, 1, 1, 0, 0, 1, 1},
            {1, 1, 0, 1, 0, 1, 1, 0, 0, 0},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
            {0, 1, 1, 1, 0, 0, 0, 1, 1, 1}
        };
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nomor baris: ");
        int row = sc.nextInt();

        System.out.print("Masukkan nomor kolom: ");
        int col = sc.nextInt();

        if (row >= 0 && row < seats.length && col >= 0 && col < seats[row].length){
            if(seats[row][col] == 0){
                System.out.println("Free");
            }else{
                System.out.println("Sold");
            }
        } else {
            System.out.println("Invalid input. Please enter valid row and column numbers.");
        }

    }
}

