/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.muslihuljava;

import java.util.Scanner;
import static java.lang.System.out;

public class kasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Harga barang
        int hargaBarang1 = 2500;
        int hargaBarang2 = 3000;
        int hargaBarang3 = 4000;
        int hargaBarang4 = 5000;
        int hargaBarang5 = 6000;

        out.print("Barang-0 : ");
        int jumlahBarang1 = input.nextInt();

        out.print("Barang-1 : ");
        int jumlahBarang2 = input.nextInt();

        out.print("Barang-2 : ");
        int jumlahBarang3 = input.nextInt();

        out.print("Barang-3 : ");
        int jumlahBarang4 = input.nextInt();

        out.print("Barang-4 : ");
        int jumlahBarang5 = input.nextInt();

        int totalHarga1 = hargaBarang1 * jumlahBarang1;
        out.println("Harga Barang ke-0 : Rp " + hargaBarang1 + ", jumlah : " + jumlahBarang1 + ", Total : Rp " + totalHarga1);

        int totalHarga2 = hargaBarang2 * jumlahBarang2;
        out.println("Harga Barang ke-1 : Rp " + hargaBarang2 + ", jumlah : " + jumlahBarang2 + ", Total : Rp " + totalHarga2);

        int totalHarga3 = hargaBarang3 * jumlahBarang3;
        out.println("Harga Barang ke-2 : Rp " + hargaBarang3 + ", jumlah : " + jumlahBarang3 + ", Total : Rp " + totalHarga3);

        int totalHarga4 = hargaBarang4 * jumlahBarang4;
        out.println("Harga Barang ke-3 : Rp " + hargaBarang4 + ", jumlah : " + jumlahBarang4 + ", Total : Rp " + totalHarga4);

        int totalHarga5 = hargaBarang5 * jumlahBarang5;
        out.println("Harga Barang ke-4 : Rp " + hargaBarang5 + ", jumlah : " + jumlahBarang5 + ", Total : Rp " + totalHarga5);

        int totalJumlahBarang = jumlahBarang1 + jumlahBarang2 + jumlahBarang3 + jumlahBarang4 + jumlahBarang5;
        out.println("TOTAL JUMLAH BARANG : " + totalJumlahBarang);

        int totalHargaSemua = totalHarga1 + totalHarga2 + totalHarga3 + totalHarga4 + totalHarga5;
        out.print("Total Harga : Rp"+totalHargaSemua);

    }
}

