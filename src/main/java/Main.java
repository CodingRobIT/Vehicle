public class Main {

    public static void main(String[] args) {

        Car car1 = new Car(131414, "Subaru",100);

        System.out.println("Start velocity " + car1.velocity + " km/h");
        car1.accelerate(0);
    }
}
