package be.jslm.onetwothree.domain;

import java.time.*;

public class Persoon {

    private Long id;
    private String voornaam;
    private String naam;
    private LocalDate geboorteDatum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public LocalDate getGeboorteDatum() {
        return geboorteDatum;
    }

    public void setGeboorteDatum(LocalDate geboorteDatum) {
        this.geboorteDatum = geboorteDatum;
    }

    @Override
    public String toString() {
        return String.format("Persoon[id=%s, voornaam=%s, naam=%s, geboorteDatum=%s]",id, voornaam, naam, geboorteDatum);
    }

}
