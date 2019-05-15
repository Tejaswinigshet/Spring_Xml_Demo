package com.stackroute.spring.beans;
public class Movie {
    Actor actor = new Actor();

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

}
