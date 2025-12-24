import Entities.TransportPlatform;
import Entities.Train;
import Entities.Bus;

public class Main {
    public static void main(String[] args) {
        TransportPlatform platform = new TransportPlatform("Astana");

        Bus b1 = new Bus("B-101", 50);
        Train t1 = new Train("T-500", 300);

        platform.addVehicle(b1);
        platform.addVehicle(t1);

        platform.updateLocation("B-101", "Bayterek Station");
        platform.updateLocation("T-500", "Nurly Zhol Terminal");

        b1.move();
        t1.move();

        platform.showStatus();
    }
}
