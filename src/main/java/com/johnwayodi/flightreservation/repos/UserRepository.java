package com.johnwayodi.flightreservation.repos;

import com.johnwayodi.flightreservation.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
