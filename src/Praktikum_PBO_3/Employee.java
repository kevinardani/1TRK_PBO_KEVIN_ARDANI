/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_3;

import java.util.Scanner;

public class Employee {
    private int id, age;
    private String name; 
    private double salary;
    
    public Employee(){
        id=age=0;
        name="";
        salary=0;
    }
    
    public void getData(){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Masukkan Id Karyawan");
        id=Integer.parseInt(sc.nextLine());
        
        System.out.println("Masukkan Nama Karyawan: ");
        name=sc.nextLine();
        
        System.out.println("Masukkan Umur Karyawan: ");
        age=Integer.parseInt(sc.nextLine());
        
        System.out.println("Masukkan Gaji Karyawan: ");
        salary=Double.parseDouble(sc.nextLine());
    }
    public void putData(){
        System.out.println(id+"\t"+name+"t"+age+"\t"+salary);
    }
}



