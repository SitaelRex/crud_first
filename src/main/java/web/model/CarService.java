package web.model;

import java.util.List;

public interface CarService {
    List<Car> getCarList(List<Car> cars, int count);
}
