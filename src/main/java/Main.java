import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car(131414, "Subaru", 100);

        System.out.println("Start velocity " + car1.velocity + " km/h");
        car1.accelerate(50); //Wenn hier null gilt nur die Geschwindigkeit in Linie 5

        System.out.println("_______________________________________");

        Bicycle bicycle1 = new Bicycle(451,"Cube", 20);
        bicycle1.accelerate(5);

        try {bicycle1.accelerate(34);
        }
        catch (NoSuchElementException myException){
            System.out.println("Too high"); //Wird immer geprintet wenn unter 35 und ab 35 throwt die Exception mit nem Error
        }

    }
}
