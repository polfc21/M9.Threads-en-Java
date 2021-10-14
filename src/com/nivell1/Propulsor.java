package com.nivell1;

public class Propulsor implements Runnable{

    private final String id;
    private final String idRocket;
    private int actualPower;
    private final int maxPower;
    private boolean isFinished;


    public Propulsor(String id, String idRocket, int maxPower) {
        this.id = id;
        this.idRocket = idRocket;
        this.actualPower = 0;
        this.maxPower = maxPower;
        this.isFinished = false;
    }

    public int getActualPower(){
        return this.actualPower;
    }

    public String getId(){
        return this.id;
    }

    public String getIdRocket(){
        return this.idRocket;
    }

    public boolean isFinished(){
        return this.isFinished;
    }

    public void incrementActualPower() {
        if (this.actualPower < this.maxPower){
            this.actualPower++;
        }
    }

    public void decrementActualPower() {
        if (this.actualPower > 0) {
            this.actualPower--;
        }
    }

    public void finish(){
        this.isFinished = true;
    }

    @Override
    public String toString() {
        return "Propulsor [id=" + id +
                ",idRocket=" + idRocket +
                ", potènciaMàxima=" + maxPower +
                ", potènciaActual=" + actualPower
                + "]";
    }

    @Override
    public void run() {
        while (!this.isFinished()) {
            if (this.getActualPower() > 0) {
                System.out.println(this);
            } else {
                System.out.println(this.getIdRocket() + "-" + this.getId() + " - Propulsor sense arrancar");
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(this.getIdRocket() + "-" + this.getId() + " - Propulsor finalitzat");
    }
}
