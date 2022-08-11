package com.demo.bigbear.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "conf_registration")
public class Registration {
    @Id
    @GeneratedValue
    private Long id;

}
