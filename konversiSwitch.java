/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.muslihuljava;

import java.util.Scanner;

public class konversiSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nilai = 0.0;

        System.out.print("Masukkan Huruf = ");
        char huruf = input.next().charAt(0);

        switch (Character.toUpperCase(huruf)) {
            case 'A':
                nilai = 4.0;
                break;
            case 'B':
                nilai = 3.0;
                break;
            case 'C':
                nilai = 2.0;
                break;
            case 'D':
                nilai = 1.0;
                break;
            default:
                System.out.println("Maaf, konversi nilai tidak diketahui.");
                return;
        }

        System.out.println("Hasil Konversi dari " + huruf + " adalah = " + nilai);
    }
}
