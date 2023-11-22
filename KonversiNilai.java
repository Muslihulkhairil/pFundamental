/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.muslihuljava;

import java.util.Scanner;

public class KonversiNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nilaiA = 4.0;
        double nilaiB = 3.0;
        double nilaiC = 2.0;
        double nilaiD = 1.0;

        System.out.print("Masukkan Huruf = ");
        char huruf = input.next().charAt(0);

        if (huruf == 'A' || huruf == 'a') {
            System.out.println("Hasil Konversi dari A adalah = " + nilaiA);
        } else if (huruf == 'B' || huruf == 'b') {
            System.out.println("Hasil Konversi dari B adalah = " + nilaiB);
        } else if (huruf == 'C' || huruf == 'c') {
            System.out.println("Hasil Konversi dari C adalah = " + nilaiC);
        } else if (huruf == 'D' || huruf == 'd') {
            System.out.println("Hasil Konversi dari D adalah = " + nilaiD);
        } else {
            System.out.println("Maaf, konversi nilai tidak diketahui.");
        }
    }
}

