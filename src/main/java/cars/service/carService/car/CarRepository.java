package cars.service.carService.car;

//import org.kolobok.annotation.FindWithOptionalParams;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
@EnableJpaRepositories
public interface CarRepository extends JpaRepository<Car, Integer>, JpaSpecificationExecutor<Car> {
    List<Car> findAll();

    Car findCarById(long id);

    List<Car> findAllByBrand(String brand);

//    List<Car> findAllByBrandAndModel(String brand, String model);

//    @FindWithOptionalParams

//    Iterable<Car> findByBrandAndModel(String brand, String model);

}
