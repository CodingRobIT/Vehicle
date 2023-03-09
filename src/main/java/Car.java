public class Car extends Vehicle implements Accelerateable {




    public Car(int id, String name,int velocity) {
        super(id, name,velocity);
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
