public abstract class Vehicle {
    private String name;
    private String color;
    private String speed;

    public Vehicle(String name, String color, String speed) {
        this.name = name;
        this.color = color;
        this.speed = speed;
    }

    public Vehicle() {
    }
    public void start(){
        System.out.println("The " + color + name + " is starting.");
    }
    public void accelerate(){
        System.out.println("The " + color + name + " is accelerating.");
    }
    public void stop(){
        System.out.println("The " + color + name + " is stopped.");
    }
    public void emissions(){
        System.out.println("The " + color + name + " passed it's emissions test.");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
}
