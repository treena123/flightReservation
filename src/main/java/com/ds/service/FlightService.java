package com.ds.service;

import com.ds.dao.FlightDao;
import com.ds.entity.FlightDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class FlightService {

    @Autowired
    private FlightDao flightDao;

    public List<FlightDetails> getFlightByFlightName(String name, LocalDate departureDate){
        return flightDao.getFlightsByAirlinesNameAndDate(name, departureDate);
    }

    public List<FlightDetails> getFlightsByOriginAndDestinationAndFlightDate(String origin, String destination, LocalDate departureDate, boolean isInternational){
        return flightDao.getFlightsByOriginAndDestinationAndFlightDate(origin,destination,departureDate,isInternational);
    }
}
