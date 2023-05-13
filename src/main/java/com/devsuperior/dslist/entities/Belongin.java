package com.devsuperior.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_belonging")
public class Belongin {
    @EmbeddedId
    private BelonginPK id = new BelonginPK();
    private Integer position;

    public Belongin() {}

    public Belongin(Game game, GameList list, Integer position) {
        id.setGame(game);
        id.setList(list);
        this.position = position;
    }

    public BelonginPK getId() {
        return id;
    }

    public void setId(BelonginPK id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Belongin belongin = (Belongin) o;
        return Objects.equals(id, belongin.id) && Objects.equals(position, belongin.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, position);
    }
}
