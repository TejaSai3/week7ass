// Interface definition
public interface Ringable {
    String ring();
}

// AlarmClock implementing Ringable directly
class AlarmClock implements Ringable {
    private final String time;

    public AlarmClock(String time) {
        this.time = time;
    }

    @Override
    public String ring() {
        return "Alarm ringing for " + time;
    }
}

// Doorbell implementing Ringable directly
class Doorbell implements Ringable {
    private final String location;

    public Doorbell(String location) {
        this.location = location;
    }

    @Override
    public String ring() {
        return "Doorbell ringing at " + location;
    }
}

// Main class containing the required static method
public class Main {
    public static void ringAll(Ringable[] devices) {
        if (devices == null) return;
        
        for (Ringable device : devices) {
            if (device != null) {
                System.out.println(device.ring());
            }
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        AlarmClock a = new AlarmClock("7:00 AM");
        System.out.println(a.ring());

        Doorbell d = new Doorbell("Front Door");
        System.out.println(d.ring());

        ringAll(new Ringable[]{a, d});
    }
}