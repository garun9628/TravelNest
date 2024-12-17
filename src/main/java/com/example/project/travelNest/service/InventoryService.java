package com.example.project.travelNest.service;

import com.example.project.travelNest.entity.Room;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteFutureInventories(Room room);

}
