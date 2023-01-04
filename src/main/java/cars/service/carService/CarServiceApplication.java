package cars.service.carService;

import cars.service.carService.car.Car;
import cars.service.carService.car.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class CarServiceApplication implements CommandLineRunner {

	@Autowired
	private CarRepository carRepository;

	public static void main(String[] args) {
		SpringApplication.run(CarServiceApplication.class, args);
	}

	@Override
	public void run(String...args) throws Exception {
		this.carRepository.save(new Car(1, "Skoda", "Octavia RS", "2.0 twin turbo", 2021, 156000.0, "https://www.skoda-dobron.pl/assets/AKOL/1470/1b671b3ff2/4960013_z2.jpg"));
		this.carRepository.save(new Car(2, "Skoda", "SuperB", "2.0 twin turbo", 1990, 156000.0,"https://bi.im-g.pl/im/e8/27/19/z26375144IER,Skoda-Superb.jpg"));
		this.carRepository.save(new Car(3, "Skoda", "Fabia", "2.0 twin turbo", 1992, 156000.0,"https://f.magazynauto.pl/magazynauto_prod_2020_11/thumb-article-386-tmain.jpg?v=33d720f820d21811c7d09204b219f047"));
		this.carRepository.save(new Car(4, "BMW", "X2", "V8", 2001, 156000.0,"https://ocdn.eu/pulscms-transforms/1/ThRk9kqTURBXy8zMTY2NzcwYWRhZWMwOGMwMTExMjEzZjQ0YzgzODhlZi5qcGVnkpUDACnNBLDNAqOTBc0EsM0CpIKhMAGhMQA"));
		this.carRepository.save(new Car(5, "BMW", "X3", "V8", 2003, 156000.0,"https://www.wyborkierowcow.pl/wp-content/uploads/2021/05/bmw-x2-cennik-sylwetka.jpg"));
		this.carRepository.save(new Car(6, "BMW", "X4", "2.0 twin turbo", 2011, 156000.0,"https://ocdn.eu/pulscms-transforms/1/cZOk9kpTURBXy80ZTdmNjI2OTc3OTc4N2FhNmUyMzEzNGFmMjQzN2IzYy5qcGeSlQMAzJXNBdzNA02TBc0EsM0CpIKhMAGhMQA"));
		this.carRepository.save(new Car(7, "Mercedes", "C Class", "2.0 twin turbo", 2014, 156000.0,"https://www.mercedes-benz.pl/passengercars/mercedes-benz-cars/models/gle/coupe-c167/explore/highlights/_jcr_content/contentgallerycontainer/par/contentgallery/par/contentgallerytile_58586423/image.MQ6.8.20200228144351.jpeg"));
		this.carRepository.save(new Car(8, "Mercedes", "D Class", "2.0 twin turbo", 2015, 156000.0,"https://www.wyborkierowcow.pl/wp-content/uploads/2022/04/modele-mercedesa-15-klasa-g.jpg"));
		this.carRepository.save(new Car(9, "Mercedes", "E Class", "2.0 twin turbo", 2012, 156000.0,"https://www.auto-data.net/images/f51/Mercedes-Benz-E-class-Coupe-C238-facelift-2020.jpg"));
		this.carRepository.save(new Car(10, "Mercedes", "E Class", "V8", 2011, 156000.0,"https://storage.carsmile.pl/uploads/2021/04/thumb-mercedes_c_klasa_kombi-1000x520.jpg"));
		this.carRepository.save(new Car(11, "Skoda", "Fabia", "V8", 1992, 156000.0,"https://bednarek.com.pl/assets/Uploads/_resampled/ResizedImage1039599-nowa-skoda-fabia-2021.jpg"));
		this.carRepository.save(new Car(12, "Skoda", "Octavia", "V8", 1992, 156000.0,"https://www.wyborkierowcow.pl/wp-content/uploads/2021/07/skoda-das-weltauto-1.jpg"));
		this.carRepository.save(new Car(13, "Skoda", "SuperB", "2.0 twin turbo", 1992, 156000.0,"https://www.wyborkierowcow.pl/wp-content/uploads/2018/07/SKODA-Superb.jpg"));
		this.carRepository.save(new Car(14, "Skoda", "Fabia", "2.0 twin turbo", 1992, 156000.0,"https://www.wyborkierowcow.pl/wp-content/uploads/2020/07/Skoda-Fabia-09.jpg"));
//		if(this.carRepository!=null){
//			this.carRepository.findAll();
//		}
	}

}
