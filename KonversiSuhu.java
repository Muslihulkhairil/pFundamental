/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.muslihuljava;

import java.util.Scanner;

public class KonversiSuhu {
    static double konversiCelsiusKeFahrenheit(double celsius) {
        double fahrenheit = 1.8 * celsius + 32;
        return fahrenheit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan suhu dalam Celsius: ");
        double suhuCelsius = scanner.nextDouble();

        double suhuFahrenheit = konversiCelsiusKeFahrenheit(suhuCelsius);

        System.out.println("Hasil konversi ke Fahrenheit: " + suhuFahrenheit);
    }
}

