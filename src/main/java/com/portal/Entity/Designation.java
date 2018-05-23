package com.portal.Entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author rajneesh yadav
 * date 21/5/2018
 */
@Entity
@Getter
@Setter
public class Designation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    private String name;

    public Designation() {
    }

}