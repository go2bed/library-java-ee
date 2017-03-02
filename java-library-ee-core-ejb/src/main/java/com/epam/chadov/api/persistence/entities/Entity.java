package com.epam.chadov.api.persistence.entities;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * @author Andrey_Chadov on 3/2/2017.
 */
public class Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Long id;

    /**
     * Creates a new Entity object.
     */
    public Entity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Entity entity = (Entity) o;

        return Objects.equals(id, entity.id);

    }

    @Override public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
