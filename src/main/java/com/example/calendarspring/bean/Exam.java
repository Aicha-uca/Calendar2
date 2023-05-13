package com.example.calendarspring.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import javax.persistence.*;
import java.util.Date;


@Entity
public class Exam {
    @Id
    private int id;
    private Date date;
    @ManyToOne
    private  Cours cours;
    @ManyToOne
    private Salle salle;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "calendar_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Calendar calendar;

    public Exam() {
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Salle getSalle() {
        return salle;
    }
    public void setSalle(Salle salle) {
        this.salle = salle;
    }
}
