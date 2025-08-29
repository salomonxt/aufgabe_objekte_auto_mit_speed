//package org.example;
import java.util.Objects;

public class Car {

    public static void main(String[] args) {

        startauto();
        beschleunigung();
    }

    public static void startauto() {
        System.out.println("====");
        System.out.println("Auto wird gestartet...");
    }

    private String marke;
    private String modell;
    private String farbe;
    private String hersteller;
    private String geschwindigkeit;

    //getter
    public String getMarke() {
        return marke;
    }

    public String getModell() {
        return modell;
    }

    public String getFarbe() {
        return farbe;
    }

    public String getHersteller() {
        return hersteller;
    }

    //setter
    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public void starteauto() {
        System.out.println("====");
        System.out.println("Auto_u wird gestartet...");

    }

    public static void beschleunigung() {
        System.out.println("Auto wird beschleunigt !!!");
        int speed = 10;
        int speedmehr = speed + 10;
        System.out.println("Auto beschleunigit auf : " + speedmehr);


    }
}
