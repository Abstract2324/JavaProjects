/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.overloadingandoverridingapp;

/**
 *
 * @author Антон
 */
class Alpha{
    void show(){
        System.out.println("Класс Alpha");
    }
    void show(String txt){
        System.out.println(txt);
    }
}
class Bravo extends Alpha{
    void show(){
        System.out.println("Класс Bravo");
    }
    void show(int num){
        System.out.println("Число "+num);
    }
}
public class OverloadingAndOverridingApp {

    public static void main(String[] args) {
        Alpha objA=new Alpha();
        objA.show();
        objA.show("Объект objA");
        Bravo obj=new Bravo();
        obj.show();
        obj.show("Объект objB");
        obj.show(123);
    }
}
