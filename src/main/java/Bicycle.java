import java.util.NoSuchElementException;

public class Bicycle extends Vehicle {
    public Bicycle(int id, String name, int velocity) {
        super(id, name, velocity);
    }

    public int accelerate(int kmh) {
        velocity = velocity + kmh;
        if (velocity < 35) {
            System.out.println("Accelerate to: " + (velocity) + " km/h");
            return kmh;
        } throw new NoSuchElementException("to fast");
    }
    @Override
    public int brake() {  // ganz easy break setz
        velocity = 0;     // velocity auf 0
        return velocity;  //und returnt velocity was ja jetzt 0 ist
    }
}

