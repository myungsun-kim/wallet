package wallet.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import wallet.domain.*;

@RepositoryRestResource(collectionResourceRel = "coupons", path = "coupons")
public interface CouponRepository
    extends PagingAndSortingRepository<Coupon, Long> {}
