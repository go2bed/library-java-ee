package com.epam.chadov.api.persistence.entities;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

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

        return id == entity.id;

    }

    @Override public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
