package ALLPROGRAMES;

//Generalization: Creating a general class
class Shape {
 void draw() {
     System.out.println("Drawing a shape");
 }
}

//Specialization: Creating specific classes that inherit from Shape
class Circle extends Shape {
 @Override
 void draw() {
     System.out.println("Drawing a circle");
 }
}

class Rectangle extends Shape {
 @Override
 void draw() {
     System.out.println("Drawing a rectangle");
 }
}

public class generalization_and_specialization {
 public static void main(String[] args) {
     Shape shape1 = new Circle();
     Shape shape2 = new Rectangle();

     shape1.draw(); // Calls the draw method in Circle
     shape2.draw(); // Calls the draw method in Rectangle
 }
}
