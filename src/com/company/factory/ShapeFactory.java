package com.company.factory;

public class ShapeFactory {
    private Shape shape;
    public static Shape getShape(String type){
        if (type.equals("Circle")) return new Circle();
        else if (type.equals("Rectangle")) return new Rectangle();
        else if (type.equals("Square")) return new Square();
        else return null;
    }
}
