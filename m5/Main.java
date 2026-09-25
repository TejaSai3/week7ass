// Trackable interface
interface Trackable {
    String getLocation();
}

// Abstract Drone base class
abstract class Drone {
    public abstract String fly();
}

// DeliveryDrone extends Drone and implements Trackable
class DeliveryDrone extends Drone implements Trackable {
    private final String id;

    public DeliveryDrone(String id) {
        this.id = id;
    }

    @Override
    public String fly() {
        return "DeliveryDrone " + id + " is flying";
    }

    @Override
    public String getLocation() {
        return id + " at Sector 4";
    }
}

// ScoutDrone extends Drone (sibling to DeliveryDrone) but does NOT implement Trackable
class ScoutDrone extends Drone {
    private final String id;

    public ScoutDrone(String id) {
        this.id = id;
    }

    @Override
    public String fly() {
        return "ScoutDrone " + id + " is flying";
    }
}

// GroundRobot implements Trackable with no relationship to Drone
class GroundRobot implements Trackable {
    private final String id;

    public GroundRobot(String id) {
        this.id = id;
    }

    @Override
    public String getLocation() {
        return id + " at Sector 4";
    }
}

// Main class containing the required static method
public class Main {
    public static String getLocationIfTrackable(Object o) {
        if (o instanceof Trackable) {
            Trackable t = (Trackable) o;
            return t.getLocation();
        }
        return "Tracking not available";
    }

    public static void main(String[] args) {
        DeliveryDrone d = new DeliveryDrone("DR-1");
        System.out.println(getLocationIfTrackable(d));

        ScoutDrone s = new ScoutDrone("SC-1");
        System.out.println(getLocationIfTrackable(s));

        GroundRobot g = new GroundRobot("GR-1");
        System.out.println(getLocationIfTrackable(g));
    }
}