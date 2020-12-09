package com.bazanovmv.students;

import com.bazanovmv.students.model.AcademicPerformance;
import com.bazanovmv.students.repository.AcademicPerformanceRepository;
import com.bazanovmv.students.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class StudentsApplication {
	private static final Logger log = LoggerFactory.getLogger(StudentsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(StudentsApplication.class, args);
	}



//	@Autowired
//	AcademicPerformanceRepository academicPerformanceRepository;
//
//	@Autowired
//	StudentRepository studentRepository;
	@Bean
	public CommandLineRunner AcademicPerformanceRepositoryInit(AcademicPerformanceRepository academicPerformanceRepository, StudentRepository studentRepository) {
		return (args) -> {

			academicPerformanceRepository.save(new AcademicPerformance(2L, "неуд"));
			academicPerformanceRepository.save(new AcademicPerformance(3L, "уд"));
			academicPerformanceRepository.save(new AcademicPerformance(4L, "хор"));
			academicPerformanceRepository.save(new AcademicPerformance(5L, "отл"));

//			studentRepository.save(new Student("Ivan Petrov", new Date(1286668800000L), academicPerformanceRepository.findById(4L)));

			log.info("AcademicPerformances found with findAll():");
			log.info("-------------------------------");
			for (AcademicPerformance academicPerformance : academicPerformanceRepository.findAll()) {
				log.info(academicPerformance.toString());
			}
			log.info("");

			AcademicPerformance academicPerformance = academicPerformanceRepository.findById(3L);
			log.info("AcademicPerformance found with findById(1L):");
			log.info("--------------------------------");
			log.info(academicPerformance.toString());
			log.info("");

			log.info("AcademicPerformance found with findByText('хор'):");
			log.info("--------------------------------------------");
			academicPerformanceRepository.findByText("хор").forEach(bauer -> {
				log.info(bauer.toString());
			});
			for (AcademicPerformance otl : academicPerformanceRepository.findByText("отл")) {
				log.info(otl.toString());
			}
			log.info("");

		};
	}

}
