package com.standarDeviasi;

import java.util.Scanner;

public class standarDeviasi {
    public static String[] data;
    public static void main(String[] args) {
        System.out.println("\n=====================================================");
        System.out.println("PROGRAM MENENTUKAN STANDAR DEVIASI SUATU DATA TUNGGAL");
        System.out.println("=====================================================");

        System.out.println();
        input();
        System.out.println("Standar Deviasinya adalah " + sigmaStandar());
    }
    public static void input(){
        Scanner inputan = new Scanner(System.in);
        System.out.println("Masukan data (setiap data dipisahkan dengan spasi)");
        var rawData = inputan.nextLine();
        data= rawData.split(" ");
    }
    public static double meanData(){
        double sum = Double.parseDouble(data[0]);
        double rata;
        for (var i = 1; i<data.length; i++){
            sum = sum + Double.parseDouble(data[i]);
        }
        rata = sum / data.length;
        return rata;
    }
    public static double[] pengubahan(){
        double[] dataBilangan = new double[data.length];
        for (var i =0 ; i<dataBilangan.length; i++){
            dataBilangan[i]= Double.parseDouble(data[i]);
        }
        return dataBilangan;
    }
    public static double sigmaStandar (){
        double jml = 0;
        for (var j = 0; j<data.length; j++){
            jml = jml + Math.pow((pengubahan()[j]-meanData()), 2);
        }
        double devide = jml / (data.length-1);
        return Math.pow(devide, 0.5);
    }
}

