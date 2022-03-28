package java.com.example.test.model;

import javax.persistence.Transient;

public abstract class Reward {

    @Transient
    protected Long points;

    public abstract Long getPoints();

}