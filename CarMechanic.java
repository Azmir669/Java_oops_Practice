
class Car {

    private String model;
    private String color;
    private int year;
    private boolean isEngineRunning;
    private String problem;

    Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.isEngineRunning = false;
        this.problem = "None";

    }

    public boolean isEngineRunning() {
        return isEngineRunning;
    }

    public String getModel() {
        return model;
    }

    public String getProblem() {
        return problem;
    }

    public void startEngine() {
        isEngineRunning = true;
        System.out.print("Engine Started");
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    @Override
    public String toString() {
        return "Car{"
                + "model='" + model + '\''
                + ", color='" + color + '\''
                + ", isEngineRunning=" + isEngineRunning
                + ", problem='" + problem + '\''
                + '}';
    }
}

class Mechanic {

    private String name;

    Mechanic(String name) {
        this.name = name;
    }

    public void repair(Car c) {
        if (c.getModel().equals("tayota") && c.isEngineRunning()) {
            c.setProblem("overheating");
        } else if (c.getModel().equals("Honda Civic") && !c.isEngineRunning()) {
            c.setProblem("Battery dead");
            System.out.println("Diagnosed: " + c.getModel() + " has a " + c.getProblem());
        } else {
            c.setProblem("Minor issue");
            System.out.println("Diagnosed: " + c.getModel() + " has a " + c.getProblem());
        }
        System.out.println(name + " is now repairing the " + c.getModel());
        c.setProblem("Fixed"); // Assume repair was successful
        System.out.println(name + " finished repairing the " + c.getModel());
        System.out.println("Car status: " + c.toString());
    }
}

public class CarMechanic {

    public static void main(String[] args) {
        Car c = new Car("tayota", "blue", 2023);
        c.startEngine();
        c.setProblem("Engine making weird noises");
        Mechanic m = new Mechanic("azmir");
        m.repair(c);

    }
}
