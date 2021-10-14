package com.nivell1.fase1;

import java.util.ArrayList;
import java.util.List;

public class Rocket {

    private final String id;
    private final List<Propulsor> propulsors;

    public Rocket(String id) {
        this.id = id;
        this.propulsors = new ArrayList<>();
    }

    public void addPropulsor(Propulsor propulsor){
        this.propulsors.add(propulsor);
    }

    public int getSizePropulsors(){
        return this.propulsors.size();
    }

    public void toBrake(int propulsor){
        this.propulsors.get(propulsor-1).decrementActualPower();
    }

    public void accelerate(int propulsor){
        this.propulsors.get(propulsor-1).incrementActualPower();
    }
    public void startRace() {
        for (Propulsor propulsor : this.propulsors) {
            new Thread(propulsor).start();
        }
    }
    public void finishRace() {
        for (Propulsor propulsor : this.propulsors) {
            propulsor.finish();
        }
    }

    @Override
    public String toString() {
        return "Coet [id=" + id +", propulsors=" + propulsors + "]";
    }


}
