package org.example;

public class Main {
    public static void main(String[] args) {

        SolarSystem jupiter = SolarSystem.JUPITER;
        System.out.println("Порядковий номер: " + jupiter.orderNum);
        System.out.println("Віддаленість від сонця: " + jupiter.distancePlanetToSun);
        System.out.println("Радіус: " + jupiter.radius);
        System.out.println("Віддаленість від попередньої планети: " + jupiter.prevDistance);
        System.out.println(jupiter.getPrevious());
        System.out.println(jupiter.getNext());
    }
}