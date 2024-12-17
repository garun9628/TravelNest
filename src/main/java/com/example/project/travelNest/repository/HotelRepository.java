package com.example.project.travelNest.repository;

import com.example.project.travelNest.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
