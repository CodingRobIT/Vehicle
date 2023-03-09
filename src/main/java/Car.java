public class Car extends Vehicle {




    public Car(int id, String name,int velocity) {
        super(id, name,velocity);
    }

    public int accelerate(int kmh) {
        velocity = velocity + kmh;
        System.out.println("Accelerate to: " + (velocity) + " km/h");
        return kmh;

    }




}
