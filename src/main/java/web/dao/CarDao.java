package web.dao;
import model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDao {
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "камаз", 152));
        cars.add(new Car(2, "уаз", 178));
        cars.add(new Car(3, "zaz", 002));
        cars.add(new Car(4, "vaz", 11));
        cars.add(new Car(5, "paz", 101));
    }
    public List<Car> index(int count) {
        if (count == 0) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
