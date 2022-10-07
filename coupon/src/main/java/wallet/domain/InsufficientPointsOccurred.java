package wallet.domain;

import java.util.*;
import lombok.*;
import wallet.domain.*;
import wallet.infra.AbstractEvent;

@Data
@ToString
public class InsufficientPointsOccurred extends AbstractEvent {

    private Long id;
}
