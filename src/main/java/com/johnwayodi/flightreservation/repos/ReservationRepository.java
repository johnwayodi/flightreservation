package com.johnwayodi.flightreservation.repos;

import com.johnwayodi.flightreservation.models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
