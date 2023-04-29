package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.model.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {
    private final CarServiceImpl service = new CarServiceImpl();
    private final List<Car> cars;

    public CarController() {
        cars = new ArrayList<>();
        cars.add(new Car());
        cars.add(new Car("buggatti veyron superspot", 6_900_000, 42));
        cars.add(new Car("moskvich", 110000, 11));
        cars.add(new Car("tesla model x", 100000, 6));
        cars.add(new Car());
    }

    @GetMapping(value = "")
    public String printWelcome(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        List<Car> loadedCars = service.getCarList(this.cars, count != null ? count : -1);
        model.addAttribute("cars", loadedCars);
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm Table Of Cars");
        model.addAttribute("messages", messages);
        return "cars";
    }
}
