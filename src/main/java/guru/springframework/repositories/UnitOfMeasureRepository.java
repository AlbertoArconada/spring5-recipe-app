package guru.springframework.repositories;

import guru.springframework.domain.UnitOfMeasure;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 * Class: UnitOfMeasureRespository
 * <p>
 * Created by: aarconada on 9/12/22
 * <p>
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

  Optional<UnitOfMeasure> findByDescription(String description);
}
