class Car{
    private String model;
    private String color;
    private int year;
    Car(String model, String color, int year){
        this.model = model;
        this.color=color;
        this.year=year;   
    }
    Car(){
        this("base model", "default blue", 2010);
    }
    Car(String name, String color){
        this(name, color, 2020);

    }
    public String toString(){
        return "Model: "+model+" Color: "+color+" Year: "+year;
    }

    
}
public class MainCar{
    public static void main(String[] args) {

        Car c1= new Car();
        System.out.print("car1:"+c1+"\n");
        Car c2 = new Car("mustang","safron");
            System.out.print("car1:"+c2);
        
    }
}
