package cars.service.carService.car;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name=Car.TABLE_NAME)
public class Car {

    public static final String TABLE_NAME = "cars";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String brand;

    private String model;

    private String engine;

    private int year;

    private double price;

    private String image;

    public Car(long id, String brand, String model, String engine, int year, double price, String image) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.year = year;
        this.price = price;
        this.image = image;
    }

    public Car() {
    }
}
