package pl.bykowski.springbootcaffe.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.bykowski.springbootcaffe.entity.Place;

@Repository
public interface PlaceRepo extends CrudRepository<Place, Long> {
}
