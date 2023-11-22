/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.muslihuljava;

import java.util.Scanner;

public class kodeNegara {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String ES = "Spain";
        String TN = "Tunisia";
        String ID = "Indonesia";
        String MM = "Myanmar";
        String IN = "India";

        System.out.print("Masukkan Kode Negara (ES, TN, ID, MM, IN):");
        String kode = input.nextLine().toUpperCase();

        switch (kode) {
            case "ES":
                System.out.println("ES = " + ES);
                break;
            case "TN":
                System.out.println("TN = " + TN);
                break;
            case "ID":
                System.out.println("ID = " + ID);
                break;
            case "MM":
                System.out.println("MM = " + MM);
                break;
            case "IN":
                System.out.println("IN = " + IN);
                break;
            default:
                System.out.println("Maaf, kode negara TIDAK DIKETAHUI");
        }
    }
}

