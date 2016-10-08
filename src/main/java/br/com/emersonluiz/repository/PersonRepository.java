package br.com.emersonluiz.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.emersonluiz.model.Person;

public interface PersonRepository extends MongoRepository<Person, String> {
    
    public List<Person> findByFirstName(String firstName);
    public List<Person> findByMiddleName(String middleName);
    public List<Person> findByLastName(String lastName);

}
