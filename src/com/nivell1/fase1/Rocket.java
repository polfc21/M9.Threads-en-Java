package com.nivell1.fase1;

public class Rocket {

    private String id;
    private int propulsors;

    public Rocket(String id, int propulsors) {
        this.id = id;
        this.propulsors = propulsors;
    }

    @Override
    public String toString() {
        return "Rocket id=" + id + ": Te " + propulsors + " propulsors";
    }
}
