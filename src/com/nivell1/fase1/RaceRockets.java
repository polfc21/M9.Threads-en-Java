package com.nivell1.fase1;

public class RaceRockets {
    public static void main(String[] args) {
        Rocket[] rockets = new Rocket[2];
        rockets[0] = new Rocket("32WESSDS", 3);
        rockets[1] = new Rocket("LDSFJA32", 6);
        for (Rocket rocket : rockets){
            System.out.println(rocket.toString());
        }
    }
}
