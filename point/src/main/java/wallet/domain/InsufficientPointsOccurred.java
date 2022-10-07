package wallet.domain;

import wallet.domain.*;
import wallet.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class InsufficientPointsOccurred extends AbstractEvent {

    private Long id;

    public InsufficientPointsOccurred(Point aggregate){
        super(aggregate);
    }
    public InsufficientPointsOccurred(){
        super();
    }
}
