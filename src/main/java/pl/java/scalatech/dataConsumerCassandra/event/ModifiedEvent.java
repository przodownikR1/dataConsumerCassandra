package pl.java.scalatech.dataConsumerCassandra.event;

import java.io.Serializable;
import java.util.UUID;

public final class ModifiedEvent implements Event{

    private static final long serialVersionUID = 7534178522018645360L;

    @Override
    public UUID uuid() {
        return UUID.randomUUID();
    }
    @Override
    public Serializable payload() {
        return "modified";
    }
}
