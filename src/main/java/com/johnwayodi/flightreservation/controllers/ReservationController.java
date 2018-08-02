package com.johnwayodi.flightreservation.controllers;

import com.johnwayodi.flightreservation.dto.ReservationRequest;
import com.johnwayodi.flightreservation.models.Flight;
import com.johnwayodi.flightreservation.models.Reservation;
import com.johnwayodi.flightreservation.repos.FlightRepository;
import com.johnwayodi.flightreservation.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReservationController {

    private final FlightRepository flightRepository;
    private final ReservationService reservationService;

    @Autowired
    public ReservationController(FlightRepository flightRepository, ReservationService reservationService) {
        this.flightRepository = flightRepository;
        this.reservationService = reservationService;
    }

    @RequestMapping("/showCompleteReservation")
    public String showCompleteReservation(@RequestParam("flightId") Long flightId,
                                           ModelMap modelMap){
        Flight flight = flightRepository.getOne(flightId);
        modelMap.addAttribute("flight", flight);
        return "completeReservation";
    }

    @RequestMapping(value = "completeReservation", method = RequestMethod.POST)
    public String completeReservation(ReservationRequest request, ModelMap modelMap){
        Reservation reservation = reservationService.bookFlight(request);

        modelMap.addAttribute(
                "msg",
                "Reservation Created Successfully, id is "+ reservation.getId());

        return "reservationConfirmation";
    }
}
