public class Car extends Vehicle {




    public Car(int id, String name,int velocity) {
        super(id, name,velocity);
    }

    public int accelerate(int kmh) {
        kmh = kmh + 30;
        System.out.println("Accelerate to: " + (velocity + kmh) + " km/h");
        return kmh;

    }




}
