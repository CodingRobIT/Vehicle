import java.util.NoSuchElementException;

public class Bicycle extends Vehicle {
    public Bicycle(int id, String bicycleName, int velocity) {
        super(id, bicycleName, velocity);
    }

    public int accelerate(int kmh) {
        if (velocity + kmh < 35) {
            velocity = velocity + kmh;
            System.out.println("Accelerate to: " + (velocity) + " km/h");
            return velocity;
        } throw new NoSuchElementException("to fast");
    }
    @Override
    public int brake() {  // ganz easy break setz
        velocity = 0;     // velocity auf 0
        return velocity;  //und returnt velocity was ja jetzt 0 ist
    }
}

