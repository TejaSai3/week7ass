// Abstract base class
abstract class ClassroomDevice {
    public abstract String operate();
}

// Chargeable interface with overloaded methods
interface Chargeable {
    String charge();
    String charge(int minutes);
}

// Tablet extending ClassroomDevice and implementing Chargeable
class Tablet extends ClassroomDevice implements Chargeable {
    private final String assetTag;

    public Tablet(String assetTag) {
        this.assetTag = assetTag;
    }

    @Override
    public String operate() {
        return "Tablet " + assetTag + " displaying lesson";
    }

    @Override
    public String charge() {
        return assetTag + " charging";
    }

    @Override
    public String charge(int minutes) {
        return assetTag + " charging for " + minutes + " minutes";
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        Tablet t = new Tablet("TAB-5");
        System.out.println(t.operate());
        System.out.println(t.charge());
        System.out.println(t.charge(30));
    }
}