package ue06_serialcircuit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Serianschaltung.
 * @author steiner
 */
public class SerialCircuit {
    private final List<Component> components = new ArrayList<>();
    private double current;

    public SerialCircuit () {
    }
    
    public SerialCircuit (Collection<Component> components) {
        this.components.addAll(components);
    }

    public double getCurrent () {
        return current;
    }

    public void add (Component c) {
        components.add(c);
        c.setCurrent(current);
    }
    
    public void setCurrent (double current) {
        this.current = current;
        for (Component component : components) {
            component.setCurrent(current);
        }
    }
    
    public double totalVoltage () {
        double rv = 0.0;
        for (Component component : components) {
            rv += component.getVoltage();
        }
        return rv;
    }

    public double totalPower () {
        double rv = 0.0;
        for (Component component : components) {
            rv += component.power();
        }
        return rv;
    }

    public double totalEnergy () {
        double rv = 0.0;
        for (Component component : components) {
            rv += component.energy();
        }
        return rv;
    }

    public Component component (String id) {
        for (Component component : components) {
            if (component.getId().equals(id)) {
                return component;
            }
        }
        return null; // oder Exception werfen
    }
    
    public Collection<Component> getComponents () {
        return components;
    }
    
    public Component [] toArray () {
        final Component [] rv = new Component[components.size()];
        return components.toArray(rv);
    }
    
    @Override
    public String toString () {
        return "not implemented yet";
    }
    
    
}
