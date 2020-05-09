
package ue02_serienschaltung;

/**
 * Serienschaltung
 * @author sx
 */
public class Serienschaltung {
    private double strom;    // in Ampere
    private double spannung; // in Volt
    private double [] widerstandsFeld;

    private void updateSpannung () {
        double u = 0;
        if (widerstandsFeld == null) {
            spannung = 0;
        } else {
            for (double r : widerstandsFeld) {
                u += r * strom;
            }
            spannung = u;
        }
    }
    
    public void addWiderstand (double resistorInOhm) throws InvalidResistorValueException {
        if (resistorInOhm < 0 || resistorInOhm > 10E6) {
            throw new InvalidResistorValueException(resistorInOhm);
        }
        if (widerstandsFeld == null) {
            widerstandsFeld = new double[1];
            widerstandsFeld[0] = resistorInOhm;
        } else {
            final double [] neuesFeld = new double[widerstandsFeld.length + 1];
            for (int i = 0; i < widerstandsFeld.length; i++) {
                neuesFeld[i] = widerstandsFeld[i];
            }
            neuesFeld[neuesFeld.length - 1] = resistorInOhm;
            widerstandsFeld = neuesFeld;
        }
        updateSpannung();
    }

    public double getStrom () {
        return strom;
    }

    public void setStrom (double strom) {
        this.strom = strom;
        updateSpannung();
    }

    public double getSpannung () {
        return spannung;
    }

    @Override
    public String toString () {
        return "Serienschaltung{" + "strom=" + strom + ", spannung=" + spannung + ", widerstandsFeld=" + widerstandsFeld + '}';
    }
    
}
