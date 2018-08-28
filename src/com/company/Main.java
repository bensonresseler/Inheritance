package com.company;

public class Main {

    public static void main(String[] args) {
        Werknemer w = new Werknemer("Karen", "Damen", "Studio 100");
        System.out.printf("%s %s werkt bij %s.", w.getVoornaam(), w.getAchternaam(), w.getWerkgever());

    }
}

class Werknemer extends Persoon {
    private String werkgever;

    public Werknemer(String voornaam, String achternaam, String werkgever) {
        super(voornaam, achternaam);
        this.werkgever = werkgever;
    }

    public String getWerkgever() {
        return werkgever;
    }
}

class Persoon {
    private String voornaam;
    private String achternaam;

    public Persoon(String voornaam, String achternaam) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }
}
