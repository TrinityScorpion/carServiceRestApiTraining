package cars.service.carService.car;

import cars.service.carService.support.SearchCriteria;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.transaction.Transactional;
import java.util.List;

import static org.hamcrest.collection.IsIn.isIn;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration()
@Transactional
public class JPASpecificationIntegrationTest {

    @Autowired
    private CarRepository carRepository;

    private Car car1;
    private Car car2;

//    @Before
//    public void init(){
//        car1 = new Car(4, "BMW", "OcdsaRS", "2dasin turbo", 23132, 12000.0);
//        car2 = new Car(5, "Mercedes", "OctddsadasdasdRS", "dsaturbo", 20220, 15000.0);
//        carRepository.save(car1);
//        carRepository.save(car2);
//
//    }

    @Test
    public void givenLast_whenGettingListOfUsers_thenCorrect() {
        CarSpecification spec =
                new CarSpecification(new SearchCriteria("brand", ":", "Skoda"));

        List<Car> results = carRepository.findAll(spec);

        assertThat(car1, isIn(results));
        assertThat(car2, isIn(results));
    }

}
