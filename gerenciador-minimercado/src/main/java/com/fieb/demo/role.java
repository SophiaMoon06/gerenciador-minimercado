package com.fieb.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class role{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
// construtor padrão (não possui parametros)

public role() {
}

public role (String name) {
super ();

this.name = name;
}

public Long getId () {
	return id;
}

public void setId (Long id) {
	this.id = id;
}
 

public String getName() {
	return name;
}

public void setName(String name) {
	this.name =name;
}
 
}