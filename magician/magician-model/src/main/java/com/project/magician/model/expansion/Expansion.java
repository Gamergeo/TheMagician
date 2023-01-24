package com.project.magician.model.expansion;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.project.magician.model.DatabaseName;
import com.project.magician.model.ModelObject;

@Entity(name = DatabaseName.EXPANSION.TABLE)
@Table(name = DatabaseName.EXPANSION.TABLE)
public class Expansion implements Serializable, ModelObject {

	private static final long serialVersionUID = -1864542003746307771L;

	@Id
	@Column(name=DatabaseName.ID)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name=DatabaseName.EXPANSION.NAME)
	private String name;
	
	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
}