/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.muslihuljava;

import java.util.Random;
import java.util.Scanner;

public class tebakAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int angkaTebakan = random.nextInt(10) + 1;

        int tebakan;
        int percobaan = 0;

        System.out.println("Selamat datang di Permainan Tebak Angka!");
        System.out.println("Tebak angka dari 1-10!");

        do {
            System.out.print("Masukkan tebakan Anda: ");
            tebakan = input.nextInt();
            percobaan++;

            if (tebakan > angkaTebakan) {
                System.out.println("Tebakan terlalu besar. Coba lagi.");
            } else if (tebakan < angkaTebakan) {
                System.out.println("Tebakan terlalu kecil. Coba lagi.");
            } else {
                System.out.println("Selamat! Anda menebak dengan benar setelah " + percobaan + " percobaan.");
            }
        } while (tebakan != angkaTebakan);

    }
}

