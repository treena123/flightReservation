package com.ds.controller;


import com.ds.dao.FlightDao;
import com.ds.entity.FlightDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController //it is the class level annotation. RestController is the combination of  ResponseBody  and controller.
//so, we don't need to add @ResponseBody annotation in every method;
@RequestMapping("flight")
public class FlightReservationController {

    @Autowired
    private FlightDao flightDao;

    @RequestMapping(name="/searchFlight", method = RequestMethod.GET)
    //public List<FlightDetails> getFlightDetails(@RequestParam String departureCity, @RequestParam String arrivalCity, @RequestParam boolean isInternational, @RequestParam LocalDate departureDate){
    public List<FlightDetails> getFlightsByOriginAndDestinationAndFlightDate(@RequestParam FlightDetails flightDetails) {

        return flightDao.getFlightsByOriginAndDestinationAndFlightDate(flightDetails.getDepartureCity(), flightDetails.getArrivalCity(), flightDetails.getDepartureDay(), flightDetails.isInternational());

    }

        @RequestMapping(value = "/getByAirlinesName", method = RequestMethod.GET)
        public List<FlightDetails> getFlightByName(@PathVariable String flightName){
            LocalDate currentDate = LocalDate.now();
            return flightDao.getFlightsByAirlinesNameAndDate(flightName,currentDate);


    }
}
