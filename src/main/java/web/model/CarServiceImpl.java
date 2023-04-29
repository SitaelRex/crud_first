package web.model;

import java.util.List;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCarList(List<Car> cars, int count) {
        int checkCount = count < 0 ? cars.size() : Math.min(count, cars.size());
        return cars.subList(0, checkCount);
    }
}
