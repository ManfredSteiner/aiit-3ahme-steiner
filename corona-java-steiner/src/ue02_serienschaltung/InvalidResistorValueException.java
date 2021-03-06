
package ue02_serienschaltung;

/**
 * Fehlerklasse
 * @author sx
 */
public class InvalidResistorValueException extends Exception {
    private final double invalidValue;
    
    public InvalidResistorValueException (double invalidValue) {
        super("Fehlerhafter Widerstandswert " + invalidValue);
        this.invalidValue = invalidValue;
    }

    public double getInvalidValue () {
        return invalidValue;
    }
}
