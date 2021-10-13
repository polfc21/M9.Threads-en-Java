package com.nivell1.fase1;

import java.util.ArrayList;
import java.util.List;

public class Rocket {

    private String id;
    private List<Propulsor> propulsors;

    public Rocket(String id) {
        this.id = id;
        this.propulsors = new ArrayList<>();
    }

    public void addPropulsor(Propulsor propulsor){
        this.propulsors.add(propulsor);
    }

    @Override
    public String toString() {
        return "Rocket id=" + id +
                "\nPotència Màxima propulsors: [" + getPropulsorsString() ;
    }

    private String getPropulsorsString() {
        String propulsorsString = "";
        for (Propulsor propulsor : this.propulsors) {
            propulsorsString += propulsor.getMaxPower() + " ";
        }
        return propulsorsString + "]";
    }
}
