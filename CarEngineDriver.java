
class Engine {

    private String type;
    private int horsePower;

    Engine(String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    public void start() {
        System.out.println("Engine started");
    }

    public void stop() {
        System.out.println("Engine stopped");
    }

    @Override
    public String toString() {
        return "Engine{"
                + "type='" + type + '\''
                + ", horsepower=" + horsePower
                + '}';
    }
}

class Car {

    private Engine engine;
    private String model;
    private String color;
    private int year;

    Car(String model, String color, int year, Engine engine) {
        this.engine = engine;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getModel() {
        return model;

    }

    public Engine getEngine() {
        return engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void drive(Driver driver) {
        System.out.println(driver.getName() + " is driving a " + model + " " + color);
        driver.drive(this);

    }

}

class Driver {

    private String name;

    Driver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void drive(Car c) {
        System.out.println("Driving");
        c.start();
        c.stop();
    }

}

public class CarEngineDriver {

    public static void main(String[] args) {
        Engine powerfulEngine = new Engine("V8", 400);
        Car c = new Car("tayota", "blue", 2003, powerfulEngine);
        Driver d = new Driver("azmir");
        c.drive(d);
    }
}
