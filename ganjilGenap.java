/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.muslihuljava;

import java.util.Scanner;

public class ganjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka1 = input.nextInt();
        
        System.out.print("Masukkan angka: ");
        int angka2 = input.nextInt();
        
        System.out.print("Masukkan angka: ");
        int angka3 = input.nextInt();
        
        System.out.print("Masukkan angka: ");
        int angka4 = input.nextInt();
        
        System.out.print("Masukkan angka: ");
        int angka5 = input.nextInt();
        

        if (angka1 % 2 == 0) {
            System.out.println("Angka " + angka1 + " adalah angka genap.");
        } else {
            System.out.println("Angka " + angka1 + " adalah angka ganjil.");
        }
        
        if (angka2 % 2 == 0) {
            System.out.println("Angka " + angka2 + " adalah angka genap.");
        } else {
            System.out.println("Angka " + angka2 + " adalah angka ganjil.");
        }
        
        if (angka3 % 2 == 0) {
            System.out.println("Angka " + angka3 + " adalah angka genap.");
        } else {
            System.out.println("Angka " + angka3 + " adalah angka ganjil.");
        }
        
        if (angka4 % 2 == 0) {
            System.out.println("Angka " + angka4 + " adalah angka genap.");
        } else {
            System.out.println("Angka " + angka4 + " adalah angka ganjil.");
        }
        
        if (angka5 % 2 == 0) {
            System.out.println("Angka " + angka5 + " adalah angka genap.");
        } else {
            System.out.println("Angka " + angka5 + " adalah angka ganjil.");
        }
        
    }
}

