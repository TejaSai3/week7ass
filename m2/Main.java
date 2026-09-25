// Abstract base class ArtPiece
abstract class ArtPiece {
    private static int counter = 0;
    private final String pieceId;

    public ArtPiece() {
        counter++;
        this.pieceId = "PIECE_" + counter;
    }

    public String getPieceId() {
        return pieceId;
    }

    public abstract String describe();
}

// Painting subclass extending ArtPiece
class Painting extends ArtPiece {
    private final String title;

    public Painting(String title) {
        super();
        this.title = title;
    }

    @Override
    public String describe() {
        return "Painting: " + title + ", framed on canvas";
    }
}

// Sculpture subclass extending ArtPiece
class Sculpture extends ArtPiece {
    private final String title;

    public Sculpture(String title) {
        super();
        this.title = title;
    }

    @Override
    public String describe() {
        return "Sculpture: " + title + ", carved from stone";
    }
}

// Main class to test implementation
public class Main {
    public static void main(String[] args) {
        Painting p = new Painting("Sunset Fields");
        System.out.println(p.describe());

        Sculpture s = new Sculpture("The Thinker II");
        System.out.println(s.describe());
    }
}