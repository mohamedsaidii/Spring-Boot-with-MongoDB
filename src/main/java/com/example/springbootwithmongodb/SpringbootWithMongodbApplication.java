package com.example.springbootwithmongodb;

import com.example.springbootwithmongodb.Repositories.StudentRepository;
import com.example.springbootwithmongodb.model.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class SpringbootWithMongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWithMongodbApplication.class, args);
	}


//	@Bean
//	CommandLineRunner runner(StudentRepository repository, MongoTemplate mongoTemplate)
//	{
//		return args -> {
//			Student student = new Student(
//					1,
//					"Saif",
//					40,
//					12
//			);
//
////			Query query = new Query();
////			query.addCriteria(Criteria.where("nom").is("mohamed"));
////			   List<Student> students = mongoTemplate.find(query,Student.class);
//
////			repository.findStudentByName("hamdi").
////					ifPresentOrElse(s ->{
////								System.out.println(s+"already exists");
////
////							},()->{
//								System.out.println("inserting student"+student);
//								repository.insert(student);
//							}
//					);
		//};
	//}
}
