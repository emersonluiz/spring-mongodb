package br.com.emersonluiz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.emersonluiz.model.Person;
import br.com.emersonluiz.repository.PersonRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private PersonRepository personRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        personRepository.deleteAll();

        personRepository.save(new Person("Emerson", "Luiz", "Castro"));
        personRepository.save(new Person("Juca", "Santos", "Silva"));
        personRepository.save(new Person("Joca", "Luiz", "Silva"));

        System.out.println("\n");

        List<Person> list = personRepository.findAll();
        list.stream().forEach(p -> System.out.println(p.toString()));

        System.out.println("\n");

        Person person = personRepository.findOne(list.get(0).getId());
        System.out.println("Person: " + person.toString());

        System.out.println("\n");

        personRepository.findByFirstName("Juca").stream().forEach(p -> System.out.println("Person (First Name): " + p.toString()));

        System.out.println("\n");

        personRepository.findByMiddleName("Luiz").stream().forEach(p -> System.out.println("Person (Middle Name): " + p.toString()));

        System.out.println("\n");

        personRepository.findByLastName("Silva").stream().forEach(p -> System.out.println("Person (Last Name): " + p.toString()));

        System.out.println("\n");
    }
}
