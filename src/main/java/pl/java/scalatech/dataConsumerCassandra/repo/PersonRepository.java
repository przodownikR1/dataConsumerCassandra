package pl.java.scalatech.dataConsumerCassandra.repo;

import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import org.springframework.stereotype.Repository;

import pl.java.scalatech.dataConsumerCassandra.domain.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface PersonRepository extends ReactiveCassandraRepository<Person, String> {
    Flux<Person> findByKeyFirstName(final String firstName);
    Mono<Person> findOneByKeyFirstName(final String firstName);
}