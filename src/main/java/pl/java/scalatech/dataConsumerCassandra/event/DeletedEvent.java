package pl.java.scalatech.dataConsumerCassandra.event;

import java.io.Serializable;
import java.util.UUID;

public final class DeletedEvent implements Event{
    private static final long serialVersionUID = -172380197909576652L;

    @Override
    public UUID uuid() {
        return UUID.randomUUID();
    }
    
    @Override
    public Serializable payload() {
        return "deleted";
    }
}
