package com.nivell1;

import javax.swing.*;

public class RaceRockets {

    public static void main(String[] args) {

        Rocket rocket32 = new Rocket("32WESSDS");
        rocket32.addPropulsor(new Propulsor("1","32WESSDS",10));
        rocket32.addPropulsor(new Propulsor("2","32WESSDS",30));
        rocket32.addPropulsor(new Propulsor("3","32WESSDS",80));
        System.out.println(rocket32);
        Rocket rocketld = new Rocket("LDSFJA32");
        rocketld.addPropulsor(new Propulsor("1","LDSFJA32",30));
        rocketld.addPropulsor(new Propulsor("2","LDSFJA32",40));
        rocketld.addPropulsor(new Propulsor("3","LDSFJA32",50));
        rocketld.addPropulsor(new Propulsor("4","LDSFJA32",50));
        rocketld.addPropulsor(new Propulsor("5","LDSFJA32",30));
        rocketld.addPropulsor(new Propulsor("6","LDSFJA32",10));
        System.out.println(rocketld);

        rocket32.startRace();
        rocketld.startRace();
        while (true) {
            try {
                String coetSeleccionat = JOptionPane.showInputDialog(null, "Coet (1 o 2) / Sortir=S",
                        JOptionPane.QUESTION_MESSAGE);
                Rocket rocketSelected = null;

                if (coetSeleccionat.equalsIgnoreCase("S")) {
                    break;
                }

                if (coetSeleccionat.equals("1")) {
                    rocketSelected = rocket32;
                } else if (coetSeleccionat.equals("2")) {
                    rocketSelected = rocketld;
                } else {
                    JOptionPane.showMessageDialog(null, "Coet no vàlid");
                }

                if (rocketSelected != null) {
                    String inputIdPropulsor = JOptionPane.showInputDialog(null,
                            "Codi del propulsor / S per sortir", JOptionPane.QUESTION_MESSAGE);
                    if (inputIdPropulsor.equalsIgnoreCase("S")) {
                        break;
                    }

                    int codiPropulsorNumber = Integer.parseInt(inputIdPropulsor);

                    if (codiPropulsorNumber <= 0 || codiPropulsorNumber > rocketSelected.getSizePropulsors()) {
                        JOptionPane.showMessageDialog(null, "Codi inexistent");
                    } else {
                        String input = JOptionPane.showInputDialog(null,
                                "Acció (P=Pujar potència, B=Baixar potència, S=Sortir)", JOptionPane.QUESTION_MESSAGE);
                        if (input.equalsIgnoreCase("S")) {
                            break;
                        }
                        if (input.equalsIgnoreCase("P")) {
                            rocketSelected.accelerate(codiPropulsorNumber);
                        } else if (input.equalsIgnoreCase("B")) {
                            rocketSelected.toBrake(codiPropulsorNumber);
                        } else {
                            JOptionPane.showMessageDialog(null, "Acció inexistent");
                        }

                    }
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }

        }
        rocket32.finishRace();
        rocketld.finishRace();
        System.out.println("Finalitzant carrera ...");
    }
}
