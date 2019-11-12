package ValueNotInArray;

public class ValueNotInArray extends RuntimeException {
    public ValueNotInArray() {
        super();
    }

    public ValueNotInArray(String s) {
        super(s);
    }

    public String toString() {
        return "No value found";
    }
}
