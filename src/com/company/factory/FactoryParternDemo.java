package com.company.factory;

import java.util.Scanner;

public class FactoryParternDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Shape here");
        String type = scanner.nextLine();
        Shape shape = ShapeFactory.getShape(type);
        shape.draw();
    }
}
