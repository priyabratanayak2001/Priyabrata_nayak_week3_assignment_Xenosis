
abstract class Shape6 {
	
    abstract double calculateArea();
}

class Sphere extends Shape6 {
    double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape6 {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }
}

class Pyramid extends Shape6 {
    double base, height;

    Pyramid(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class AbstractClassInterfaceClass {
    public static void main(String[] args) {
       
        Shape6 sphere = new Sphere(5);
        Shape6 square = new Square(4);
        Shape6 pyramid = new Pyramid(3, 7);

        System.out.println("Area of Sphere: " + sphere.calculateArea());
        System.out.println("Area of Square: " + square.calculateArea());
        System.out.println("Area of Pyramid: " + pyramid.calculateArea());
    }
}
