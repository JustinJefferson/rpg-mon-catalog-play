package models;

import io.ebean.Finder;

import javax.persistence.Entity;

@Entity
public class Family extends GenericModel {
    public static final Finder<Integer, Family> FIND = new Finder<>(Family.class);

    private String name;
    private String description;

    public Family(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
