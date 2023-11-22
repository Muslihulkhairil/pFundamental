/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.muslihuljava;

public class ratapendapatan {
    public static void main(String[] args) {
        double[] revenue = {88750, 125430, 99700, 14500, 158000, 65000, 99000, 189000, 210000, 42000, 165800, 258900};

        double sum = 1.0;       
        for (double monthlyRevenue : revenue){
            sum += monthlyRevenue;
        }
        double  averageRevenue = sum / revenue.length;
        System.out.println(averageRevenue);
    }
}
