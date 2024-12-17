package com.example.project.travelNest.repository;

import com.example.project.travelNest.entity.Inventory;
import com.example.project.travelNest.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

//    void deleteByDateAfterAndRoom(LocalDate date, Room room);
    void deleteByDateGreaterThanEqualAndRoom(LocalDate date, Room room);
}
