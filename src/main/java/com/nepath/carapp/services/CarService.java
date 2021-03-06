package com.nepath.carapp.services;

import com.nepath.carapp.dtos.input.CarCreateDto;
import com.nepath.carapp.dtos.output.CarDto;

import java.util.List;

public interface CarService {
    void registerCar(CarCreateDto carCreateDto);

    List<CarDto> getAllCars();
}
