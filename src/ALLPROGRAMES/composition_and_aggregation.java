package ALLPROGRAMES;

//Composition: Car class composed of Engine and Wheels
class Engine {
 void start() {
     System.out.println("Engine started");
 }
}

class Wheel {
 void rotate() {
     System.out.println("Wheel rotating");
 }
}

class Car {
 private Engine engine;
 private Wheel[] wheels;

 public Car() {
     engine = new Engine();
     wheels = new Wheel[4];
     for (int i = 0; i < 4; i++) {
         wheels[i] = new Wheel();
     }
 }

 public void startCar() {
     engine.start();
     for (Wheel wheel : wheels) {
         wheel.rotate();
     }
     System.out.println("Car started");
 }
}

//Aggregation: University class aggregates Student objects
class Student {
 private String name;

 public Student(String name) {
     this.name = name;
 }

 public String getName() {
     return name;
 }
}

class University {
 private String name;
 private Student[] students;

 public University(String name, int size) {
     this.name = name;
     students = new Student[size];
 }

 public void addStudent(int index, Student student) {
     if (index >= 0 && index < students.length) {
         students[index] = student;
     }
 }

 public void displayStudents() {
     System.out.println("Students in " + name + ":");
     for (Student student : students) {
         if (student != null) {
             System.out.println(student.getName());
         }
     }
 }
}

public class composition_and_aggregation {
 public static void main(String[] args) {
     // Composition
     Car car = new Car();
     car.startCar();

     // Aggregation
     University university = new University("ABC University", 3);
     university.addStudent(0, new Student("Alice"));
     university.addStudent(1, new Student("Bob"));
     university.addStudent(2, new Student("Charlie"));

     university.displayStudents();
 }
}
