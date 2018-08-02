package com.johnwayodi.flightreservation.services;

import com.johnwayodi.flightreservation.dto.ReservationRequest;
import com.johnwayodi.flightreservation.models.Flight;
import com.johnwayodi.flightreservation.models.Passenger;
import com.johnwayodi.flightreservation.models.Reservation;
import com.johnwayodi.flightreservation.repos.FlightRepository;
import com.johnwayodi.flightreservation.repos.PassengerRepository;
import com.johnwayodi.flightreservation.repos.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements ReservationService{

    private final FlightRepository fRepository;
    private final PassengerRepository pRepository;
    private final ReservationRepository rRepository;

    @Autowired
    public ReservationServiceImpl(FlightRepository flightRepository,
                                  PassengerRepository passengerRepository,
                                  ReservationRepository reservationRepository) {
        this.fRepository = flightRepository;
        this.pRepository = passengerRepository;
        this.rRepository = reservationRepository;
    }

    @Override
    public Reservation bookFlight(ReservationRequest request) {
        //Make Payment

        Long flightId = request.getFlightId();
        Flight flight = fRepository.getOne(flightId);

        Passenger passenger = new Passenger();
        passenger.setFirstName(request.getPassengerFirstName());
        passenger.setLastName(request.getPassengerLastName());
        passenger.setPhone(request.getPassengerPhone());
        passenger.setEmail(request.getPassengerEmail());

        Passenger savedPassenger = pRepository.save(passenger);

        Reservation reservation = new Reservation();
        reservation.setFlight(flight);
        reservation.setPassenger(savedPassenger);
        reservation.setCheckedIn(false);

        return rRepository.save(reservation);
    }
}
