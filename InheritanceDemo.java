// Ito ang "child" class - gumagamit ng "extends" para mag-inherit mula sa Bicycle
class MountainBike extends Bicycle {
    // Bagong field na wala sa Bicycle - unique lang sa MountainBike
    int seatHeight;

    // Bagong method na wala sa Bicycle
    void setHeight(int newValue) {
        seatHeight = newValue;
        System.out.println("Seat height set to " + seatHeight);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        MountainBike mBike = new MountainBike();

        // Kahit galing pa sa Bicycle, magagamit ito ng MountainBike
        mBike.changeCadence(50);
        mBike.speedUp(10);
        mBike.changeGear(2);
        mBike.printStates();

        // Unique lang ito sa MountainBike, wala sa Bicycle
        mBike.setHeight(5);
    }
}
