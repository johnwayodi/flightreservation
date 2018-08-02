package com.johnwayodi.flightreservation.repos;

import com.johnwayodi.flightreservation.models.Passenger;
import com.johnwayodi.flightreservation.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}
