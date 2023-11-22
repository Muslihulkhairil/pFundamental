/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.muslihuljava;

import java.util.Scanner;

public class KonversiPanjang {
    static double konversiKakiKeInci(double kaki) {
        double inci = kaki * 12.0;
        System.out.println(inci);
        return inci;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang dalam kaki: ");
        double panjangKaki = scanner.nextDouble();

        konversiKakiKeInci(panjangKaki);
    }
}

