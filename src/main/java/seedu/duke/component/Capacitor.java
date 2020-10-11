package seedu.duke.component;

public class Capacitor extends LoadComponent {
    private static final String SI_UNIT = "µF";

    public Capacitor(double value) {
        super(value);
        siUnit = SI_UNIT;
        isDirectSeries = false;
    }
}