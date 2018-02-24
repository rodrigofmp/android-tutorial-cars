package devmasterteamudemy.carros.data;

import java.util.ArrayList;
import java.util.List;

import devmasterteamudemy.carros.entities.Car;

public class CarMock {

    private List<Car> mListCars;

    public CarMock() {
        this.mListCars = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            this.mListCars.add(new Car(i, String.valueOf(i), i * 10, Double.valueOf(i * 100)));
        }
    }

    public List<Car> getList() {
        return this.mListCars;
    }

    public Car get(int id) {
        return this.mListCars.get(id);
    }
}
