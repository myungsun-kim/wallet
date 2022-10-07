package wallet.domain;

import java.util.*;
import lombok.*;
import wallet.domain.*;
import wallet.infra.AbstractEvent;

@Data
@ToString
public class CouponCancelled extends AbstractEvent {

    private Long id;
    private String buyer;
    private Long price;
    private String name;
}
