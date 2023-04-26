package com.example.TutorialExample.Model;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;

@Entity
@Table(name="tutorials")
@Getter
@Setter
public class Tutorial {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "title")
    @Value("${props.string.title:nope}")
    private String title;

    @Column(name = "description")
    @Value("${props.string.description:nothing}")
    private String description;

    @Column(name = "published")
    @Value("${props.boolean.published:true}")
    private boolean published;

    public Tutorial(){}
    public Tutorial(String title, String description, boolean published){
        this.title = title;
        this.description = description;
        this.published = published;
    }

}
