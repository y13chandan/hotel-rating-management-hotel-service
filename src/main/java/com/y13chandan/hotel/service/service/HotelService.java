package com.y13chandan.hotel.service.service;

import com.y13chandan.hotel.service.entities.Hotel;

import java.util.List;

public interface HotelService {

    Hotel saveHotel(Hotel hotel);
    List<Hotel> getAllHotel();
    Hotel getHotelById(String hotelId);

}
