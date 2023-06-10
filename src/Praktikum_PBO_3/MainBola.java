/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_3;

public class MainBola {
    public static void main(String[] args) {
        Bola bola1 = new Bola();
        bola1.printBola();

        Bola bola2 = new Bola(10, "Basket");
        bola2.printBola();

        bola1.setJari(20);
        bola1.setJenis("Bola pimpong");
        bola1.printBola();

        bola2.setJari(2);
        bola2.setJenis("Kelereng");
        bola2.printBola();
    }
}

