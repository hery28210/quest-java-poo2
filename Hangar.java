public class Hangar {
    public static void main(String[] args) {
        Car clio = new Car("Clio");
        System.out.println("je suis " + clio.getBrand() + " et " + clio.doStuff());

        Boat titanic = new Boat("Titanic");
        System.out.println("je suis " + titanic.getBrand() + " et " + titanic.doStuff());

    }



}