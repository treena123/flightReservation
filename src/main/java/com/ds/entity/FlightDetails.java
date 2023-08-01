package com.ds.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;

@Component //it's a class level annotation. It is used to mark a java class as a bean.
        // A class with @component annotation is found in classpath.
        // The Spring Framework pick it up and configure it in the application context as the Spring bean
public class FlightDetails {

    private int airLineId;
    private int airlineName;
    private String departureCity;
    private String arrivalCity;
    private boolean isInternational;
    private LocalDate departureDay;
    private Timestamp departureTimeStamp;

    private int businessSeat;

    private int economySeat;

    private float businessPrice;

    private float economyPrice;

    public int getBusinessSeat() {
        return businessSeat;
    }

    public void setBusinessSeat(int businessSeat) {
        this.businessSeat = businessSeat;
    }

    public int getEconomySeat() {
        return economySeat;
    }

    public void setEconomySeat(int economySeat) {
        this.economySeat = economySeat;
    }

    public float getBusinessPrice() {
        return businessPrice;
    }

    public void setBusinessPrice(float businessPrice) {
        this.businessPrice = businessPrice;
    }

    public float getEconomyPrice() {
        return economyPrice;
    }

    public void setEconomyPrice(float economyPrice) {
        this.economyPrice = economyPrice;
    }

    public  FlightDetails(){

    }
    public int getAirLineId() {
        return airLineId;
    }

    public void setAirLineId(int airLineId) {
        this.airLineId = airLineId;
    }

    public int getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(int airlineName) {
        this.airlineName = airlineName;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public boolean isInternational() {
        return isInternational;
    }

    public void setInternational(boolean international) {
        isInternational = international;
    }

    public LocalDate getDepartureDay() {
        return departureDay;
    }

    public void setDepartureDay(LocalDate departureDay) {
        this.departureDay = departureDay;
    }

    public Timestamp getDepartureTimeStamp() {
        return departureTimeStamp;
    }

    public void setDepartureTimeStamp(Timestamp departureTimeStamp) {
        this.departureTimeStamp = departureTimeStamp;
    }

}
