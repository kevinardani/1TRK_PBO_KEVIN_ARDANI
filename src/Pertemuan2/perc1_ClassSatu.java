/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2;

import java.util.Scanner;

/**
 *
 * @author PC - 26 316
 */
public class perc1_ClassSatu {

    public static int tambah(int num1, int num2) {
        return num1 + num2;
    }
    public static int kurang(int num1, int num2) {
        return num1 - num2;
    }
    public static int kali(int num1, int num2) {
        return num1 * num2;
    }
    public static int bagi(int num1, int num2) {
        return num1 / num2;
    }
    public void cetak(String kata) {
        System.out.println("Kata yang anda masukkan: " + kata);
    }
    
    public static void main(String[] args) {
        double result1, result2, result3, result4; 
        result1 = tambah(10,4);
        result2 = kurang(10,4);
        result3 = kali(10,4);
        result4 = bagi(10,4);
   
        Scanner input=new Scanner(System.in);
        System.out.println("Masukkan sebuah kata: ");
        String txt=input.nextLine();
        
        perc1_ClassSatu obj=new perc1_ClassSatu();
        
        System.out.println("Hasil tambah " + result1);
        System.out.println("Hasil kurang " + result2);
        System.out.println("Hasil kali " + result3);
        System.out.println("Hasil Bagi " + result4);
        
        obj.cetak(txt);
    }
}


