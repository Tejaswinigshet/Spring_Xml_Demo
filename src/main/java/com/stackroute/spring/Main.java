package com.stackroute.spring;
import com.stackroute.spring.beans.Actor;
import com.stackroute.spring.beans.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie = (Movie) context.getBean("movie");
        System.out.println(movie.welcomeMsg()+"\nMovie name : "+movie.getMovieName()+"\nActor Name : "+movie.getActorNAme()+"\nGenre : "+movie.getGenre());
        Actor actor = (Actor) context.getBean("actor");
        System.out.println(actor.Msg()+"\nActorName : "+actor.getName()+"\ngender : "+actor.getGender()+"\nAge : "+actor.getAge());

    }
}