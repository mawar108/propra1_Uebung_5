package kino;

import java.util.Objects;
import java.util.UUID;

public class AbstractID {

    private final UUID uuid;

    protected AbstractID(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AbstractID id = (AbstractID) o;
        return uuid.equals(id.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid);
    }

}
