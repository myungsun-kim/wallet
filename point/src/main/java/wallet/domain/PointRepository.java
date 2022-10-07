package wallet.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import wallet.domain.*;

@RepositoryRestResource(collectionResourceRel = "points", path = "points")
public interface PointRepository
    extends PagingAndSortingRepository<Point, Long> {}
