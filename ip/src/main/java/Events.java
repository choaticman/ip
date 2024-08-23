public class Events extends Task {
    private String start;
    private String end;
    public Events(String name, String start, String end) {
        super(name);
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "[E] " + super.toString() + "( " + start + end + ")";
    }
}
