package io.pivotal;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by vijaypivotal on 12/15/16.
 */

@Getter
@Setter
@Entity
public class Greeting {

    @Id
    private Integer id;
    private String text;

    public Greeting(){
        //required for hibernate

        /*
        Caused by: org.hibernate.InstantiationException: No default constructor for entity:  : io.pivotal.Greeting

         */
    }

    public Greeting(Integer id, String text ){
        this.id = id;
        this.text = text;
    }


    @Override
    public String toString() {
        return "Greeting [id=" + id + ", text=" + text + "]";
    }
}


