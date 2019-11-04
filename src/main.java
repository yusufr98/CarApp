import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();
        Car car = new Car();
        System.out.println("Enter the name:");
        car.setName(k.next());
        System.out.println("Enter the color: ");
        car.setColor(k.next());
        System.out.println("Enter the top speed: ");
        car.setSpeed(k.next());

        cars.add(car);
        for(Car c: cars){
            System.out.println(c.getColor() + " " + c.getName());
        }
    }
}
