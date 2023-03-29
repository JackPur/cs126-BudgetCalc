import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Car {
    private double x; // x-coordinate of car
    private double y; // y-coordinate of car
    
    public Car() {
        Random rand = new Random();
        this.x = rand.nextDouble() * 10; // random x-coordinate within range [0, 10)
        this.y = rand.nextDouble() * 10; // random y-coordinate within range [0, 10)
    }
    
    public double distance(Car other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx*dx + dy*dy); // distance formula
    }
    
    public String toString() {
        return String.format("(%.2f, %.2f)", x, y);
    }
}

 public class Cars {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<Car>();
        Scanner scanner = new Scanner(System.in);
        boolean hasCrash = false;
        
        
        int numCars = 5;
        
        for (int i = 0; i < numCars; i++) {
            Car car = new Car();
            cars.add(car);
            System.out.printf("Car %d location: %s%n", i+1, car);
        }
        
        while (!hasCrash) {
            for (int i = 0; i < cars.size(); i++) {
                for (int j = i+1; j < cars.size(); j++) {
                    double dist = cars.get(i).distance(cars.get(j));
                    if (dist < 10) {
                        System.out.printf("Alert! Car %d and Car %d are about to crash!%n", i+1, j+1);
                        cars.remove(j);
                        cars.remove(i);
                        hasCrash = true;
                        break;
                    }
                }
                if (hasCrash) break;
            }
        }
        
        System.out.println("Final car locations:");
        for (int i = 0; i < cars.size(); i++) {
            System.out.printf("Car %d location: %s%n", i+1, cars.get(i));
        }
    }
}
