
class Vehicle {
    String name;
    int speed;
    
    Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
    
    void move() {
        System.out.println("The " + name + " moves at " + speed + " km/h.");
    }
}

class Car extends Vehicle {
	
    Car(String name, int speed) {
        super(name, speed);
    }

    @Override
    void move() {
        System.out.println("The " + name + " car drives at " + speed + " km/h.");
    }
}

class Bike extends Vehicle {
    
    Bike(String name, int speed) {
        super(name, speed);
    }
    
    @Override
    void move() {
        System.out.println("The " + name + " bike rides at " + speed + " km/h.");
    }
}

public class Polymerphisim {
    public static void main(String[] args) {
        
        Vehicle car = new Car("Toyota", 150);
        Vehicle bike = new Bike("Yamaha", 80);

        
        car.move();  
        bike.move(); 
    }
}
