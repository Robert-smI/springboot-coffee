package pl.bykowski.springbootcaffe.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.bykowski.springbootcaffe.entity.Coffee;

@Repository
public interface CoffeRepo extends CrudRepository<Coffee, Long> {
}
