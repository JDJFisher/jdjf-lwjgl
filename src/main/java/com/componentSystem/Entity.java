package com.componentSystem;

public class Entity {
    public int id;

    @Override
    public boolean equals(Object obj) {
        return ((Entity) obj).id == this.id;
    }
}
