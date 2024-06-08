package com.y13chandan.hotel.service.service.impl;

import com.y13chandan.hotel.service.entities.Hotel;
import com.y13chandan.hotel.service.exception.ResourceNotFoundException;
import com.y13chandan.hotel.service.repository.HotelRepository;
import com.y13chandan.hotel.service.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository repository;

    @Override
    public Hotel saveHotel(Hotel hotel) {
        String randomId = UUID.randomUUID().toString();
        hotel.setId(randomId);
        //
        return repository.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotel() {
        return repository.findAll();
    }

    @Override
    public Hotel getHotelById(String hotelId) {
        return repository.findById(hotelId).orElseThrow(() -> new ResourceNotFoundException("Hotel with given id not found !! "+ hotelId));
    }
}
