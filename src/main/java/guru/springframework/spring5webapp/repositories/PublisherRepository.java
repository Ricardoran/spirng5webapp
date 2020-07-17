package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * @author haoran
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
