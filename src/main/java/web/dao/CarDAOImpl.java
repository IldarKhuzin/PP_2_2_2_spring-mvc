package web.dao;

import web.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDAOImpl implements CarDAO {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        Car car1 = new Car("Audi","black", 2002);
        Car car2 = new Car("BMW", "white", 2020);
        Car car3 = new Car("Lada", "white", 2000);
        Car car4 = new Car("Toyota", "green", 1995);
        Car car5 = new Car("Mersedes", "blue", 2004);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return cars;
        }

        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
