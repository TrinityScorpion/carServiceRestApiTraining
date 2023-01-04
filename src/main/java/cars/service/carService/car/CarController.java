package cars.service.carService.car;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/cars")
    public List<Car> search(@RequestParam Map<String, String> params, @RequestParam(value = "search") String search) {
        params.remove("search");
        System.out.println("Angular params: " + params);
        System.out.println("Search params: " + search);
        for (int i = 0; i < params.size(); i++) {
            System.out.println(params.keySet().toArray()[i]);
            if(params.keySet().toArray()[i].equals("yearFrom")){
                search += "year" + ">" + Integer.parseInt(params.values().toArray()[i].toString());

                if (i != params.size()-1) {
                    search+= ",";
                }
            }else if(params.keySet().toArray()[i].equals("yearTo")){
                search += "year" + "<" + Integer.parseInt(params.values().toArray()[i].toString());
                if (i != params.size()-1) {
                    search+= ",";
                }

            }else if(params.keySet().toArray()[i].equals("priceFrom")){
                search += "price" + ">" + params.values().toArray()[i].toString();
                if (i != params.size()-1) {
                    search+= ",";
                }

            }else if(params.keySet().toArray()[i].equals("priceTo")){
                search += "price" + "<" + params.values().toArray()[i].toString();
                if (i != params.size()-1) {
                    search+= ",";
                }
            }else{
                search += params.keySet().toArray()[i] + ":" + params.values().toArray()[i];
                if (i != params.size()-1) {
                    search+= ",";
                }
            }

        }
        CarSpecificationBuilder builder = new CarSpecificationBuilder();
        Pattern pattern = Pattern.compile("(\\w+?)(:|<|>)(\\w+?),", Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(search + ",");
        while (matcher.find()) {
            builder.with(matcher.group(1), matcher.group(2), matcher.group(3));
        }

        Specification<Car> spec = builder.build();
        if (params != null) {
            return carRepository.findAll(spec);
        }
        return carRepository.findAll();
    }

    @GetMapping("/cars/{id}")
    public Car carDetail(@PathVariable Long id) {
        Car car = this.carRepository.findCarById(id);
        System.out.println(car);
        return car;
    }

    @PostMapping("/cars")
    public void addCar(@RequestBody Car car) {
        carRepository.save(car);
        System.out.println(car);
    }

    @PutMapping("/cars/{id}")
    public void putCar(@RequestBody Car car, @PathVariable Long id) {
        Car updatedCar = carRepository.findCarById(id);
        updatedCar.equals(car);
        carRepository.save(updatedCar);
        System.out.println("Updated" + updatedCar);
    }

    @DeleteMapping("/cars/{id}")
    public Car deleteCar(@PathVariable Long id) {
        Car car = carRepository.findCarById(id);
        carRepository.delete(car);
        System.out.println("Deleted" + car);
        return car;
    }
}
