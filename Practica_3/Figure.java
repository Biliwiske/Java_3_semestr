package Practica_3;

abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract String toString();
}

class Circle extends Shape {
    protected double radius;

    public Circle() {
        this.filled = false;
        this.color = "blue";
        radius = 1;
    }

    public Circle(double radius) {
        this.filled = false;
        this.color = "blue";
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Shape: circle, radius: " + this.radius + ", color: " + this.color + ", filled: " + this.filled;
    }
}

class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        this.filled = false;
        this.color = "Red";
        this.width = 0;
        this.length = 0;
    }

    public Rectangle(double width, double length) {
        this.filled = false;
        this.color = "Red";
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.filled = filled;
        this.color = color;
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Shape: rectangle, width: " + this.width + ", length: " + this.length + ", color: " + this.color;
    }
}

class Square extends Rectangle {
    public Square() {
        this.color = "Green";
        this.filled = false;
        this.length = 0;
    }

    public Square(double side) {
        this.color = "Green";
        this.filled = false;
        this.length = side;
    }

    public Square(double side, String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.length = side;
    }

    public double getSide() {
        return length;
    }

    public void setSide(double side) {
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        this.length = side;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
    }

    @Override
    public String toString() {
        return "Shape: square, side: " + this.length + ", color: " + this.color + ", filled: " + this.filled;
    }
}