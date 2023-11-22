/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.muslihuljava;

import java.util.Scanner;

public class cekUmur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur Anda: ");
        int umur = input.nextInt();

        if (umur < 0) {
            System.out.println("Umur tidak valid. Masukkan umur yang benar.");
        } else if (umur < 18) {
            System.out.println("Anda masih anak-anak.");
        } else if (umur < 65) {
            System.out.println("Anda sudah dewasa.");
        } else {
            System.out.println("Anda sudah lansia.");
        }
    }
}
