
package com.mycompany.dinamicarray;

public class Prueba {
    public static void main(String[] args) {
        DinamicArray<Integer> din = new DinamicArray();
        din.pushBack(2);
        din.pushBack(4);
        System.out.println("cap: " + din.getCapacity());
        din.pushBack(5);
        din.stringTo();
        System.out.println("cap2: " + din.getCapacity());
        din.removes(3);
        din.stringTo();
        //din.remove(6);
        //din.stringTo();
        
        
    }
}
