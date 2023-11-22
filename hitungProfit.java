/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.muslihuljava;

import java.util.Scanner;

public class hitungProfit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan modal: Rp ");
        double modal = input.nextDouble();

        System.out.print("Masukkan persentase keuntungan: ");
        double persentaseKeuntungan = input.nextDouble();

        double keuntungan = modal * (persentaseKeuntungan / 100);
        double hargaJual = modal + keuntungan;

        System.out.println("Modal: Rp " + modal);
        System.out.println("Persentase Keuntungan: " + persentaseKeuntungan + "%");
        System.out.println("Harga Jual: Rp " + hargaJual);
        System.out.println("Keuntungan: Rp " + keuntungan);
    }
}

