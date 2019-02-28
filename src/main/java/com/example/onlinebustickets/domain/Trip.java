package com.example.onlinebustickets.domain;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
@Entity
public class Trip implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotEmpty(message = "Name cannot be empty!")
    private String name;
    private int sight_stop;
    private int dayDurations;
    private int nightDurations;
    private String typeDurations;
    private String otherTransports;
    private String language;
    private double priceAdult;
    private double priceKids;

    @OneToOne
    private StationDetails stationDetails;

    public StationDetails getStationDetails() {
        return stationDetails;
    }

    public void setStationDetails(StationDetails stationDetails) {
        this.stationDetails = stationDetails;
    }

    public Trip(){
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSight_stop() {
        return sight_stop;
    }

    public void setSight_stop(int sight_stop) {
        this.sight_stop = sight_stop;
    }

    public int getDayDurations() {
        return dayDurations;
    }

    public void setDayDurations(int dayDurations) {
        this.dayDurations = dayDurations;
    }

    public int getNightDurations() {
        return nightDurations;
    }

    public void setNightDurations(int nightDurations) {
        this.nightDurations = nightDurations;
    }

    public String getTypeDurations() {
        return typeDurations;
    }

    public void setTypeDurations(String typeDurations) {
        this.typeDurations = typeDurations;
    }

    public String getOtherTransports() {
        return otherTransports;
    }

    public void setOtherTransports(String otherTransports) {
        this.otherTransports = otherTransports;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public double getPriceAdult() {
        return priceAdult;
    }

    public void setPriceAdult(double priceAdult) {
        this.priceAdult = priceAdult;
    }

    public double getPriceKids() {
        return priceKids;
    }

    public void setPriceKids(double priceKids) {
        this.priceKids = priceKids;
    }
}
