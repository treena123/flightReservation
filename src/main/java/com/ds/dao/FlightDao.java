package com.ds.dao;

import com.ds.entity.FlightDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface FlightDao extends JpaRepository<FlightDetails,Long> {

    List<FlightDetails> getFlightsByOriginAndDestinationAndFlightDate(String departureCity, String arrivalCity,
                                                                              LocalDate flightDate, boolean isInternational);

    List<FlightDetails> getFlightsByAirlinesNameAndDate(String airlineName, LocalDate departureDate);
}
