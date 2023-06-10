/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan5;

/**
 *
 * @author PC - 26 316
 */
 class Dog1 extends Animal1 {
    public Dog1(){
        super();
        System.out.println("I am a dog");
    }
    
    @Override
    public void eat(){
        super.eat();
        System.out.println("I eat dog food");
    }
    
    public void bark() {
        System.out.println("I can bark");
    }
}
