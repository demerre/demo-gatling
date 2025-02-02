package com.example;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarRestController {
    private List<Car> carList = new ArrayList<>();
    private List<CarPart> carPartList = new ArrayList<>();

    public CarRestController() {
        CarPart huayraCarPart = new CarPart("engine", 8342.28);
        carPartList.add(huayraCarPart);

        Car huayra = new Car("Pagani", "Huayra", List.of(huayraCarPart));
        carList.add(huayra);
    }

    @GetMapping("/car")
    public List<Car> retrieveCar() {
        return carList;
    }

    @GetMapping("/carpart")
    public List<CarPart> retrieveCarPart() {
        return carPartList;
    }

    @PostMapping(path = "/car")
    public Car addCar(@RequestBody Car car) {
        carList.add(car);
        return car;

    }
}
