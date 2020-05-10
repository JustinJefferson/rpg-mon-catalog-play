package models;

import io.ebean.Finder;

import javax.persistence.Entity;

@Entity
public class Element extends GenericModel {
    public static final Finder<Integer, Element> FIND = new Finder<>(Element.class);

    private String name;

    public Element(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
