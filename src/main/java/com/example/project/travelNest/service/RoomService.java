package com.example.project.travelNest.service;

import com.example.project.travelNest.dto.RoomDto;

import java.util.List;

public interface RoomService {

    RoomDto createNewRoom(Long HotelId, RoomDto roomDto);

    List<RoomDto> getAllRoomsInHotel(Long hotelId);

    RoomDto getRoomById(Long roomId);

    void deleteRoomById(Long roomId);
}
