public class Car extends Vehicle {




    public Car(int id, String vehicleName,int velocity) {
        super(id, vehicleName,velocity);
    }

    public int accelerate(int kmh) {
        velocity = velocity + kmh;
        System.out.println("Accelerate to: " + (velocity) + " km/h");
        return kmh;

    }

    @Override
    public int brake() {
        velocity = 0;  //wert velocity wird auf 0 gesetz
        return velocity;//neuer wert velocity 0 wird returnt
    }




}
