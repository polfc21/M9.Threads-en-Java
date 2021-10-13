package com.nivell1.fase1;

public class RaceRockets {

    public static void main(String[] args) {
        Rocket rocket32 = new Rocket("32WESSDS");
        rocket32.addPropulsor(new Propulsor(10));
        rocket32.addPropulsor(new Propulsor(30));
        rocket32.addPropulsor(new Propulsor(80));
        System.out.println(rocket32);
        Rocket rocketld = new Rocket("LDSFJA32");
        rocketld.addPropulsor(new Propulsor(30));
        rocketld.addPropulsor(new Propulsor(40));
        rocketld.addPropulsor(new Propulsor(50));
        rocketld.addPropulsor(new Propulsor(50));
        rocketld.addPropulsor(new Propulsor(30));
        rocketld.addPropulsor(new Propulsor(10));
        System.out.println(rocketld);
    }
}
