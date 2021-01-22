package com.sicred.api.schedule.model;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="AGENDA")
@Getter
@Setter
public class Agenda implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @NotNull
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @NotNull
    private String name;

    @NotNull
    private Calendar closure;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "agenda")
    private Set<Vote> votes = new HashSet<>();

    @NotNull
    private Boolean active;

    public Boolean isActive(){
        return active.equals(Boolean.TRUE)?Boolean.TRUE:Boolean.FALSE;
    }
}
