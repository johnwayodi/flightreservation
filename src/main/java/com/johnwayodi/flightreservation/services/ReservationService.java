package com.johnwayodi.flightreservation.services;

import com.johnwayodi.flightreservation.dto.ReservationRequest;
import com.johnwayodi.flightreservation.models.Reservation;

public interface ReservationService {
    public Reservation bookFlight(ReservationRequest request);
}
