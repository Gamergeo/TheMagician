package com.project.magician.model.card.infos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.project.magician.model.CodeObject;
import com.project.magician.model.DatabaseName;

@Entity(name = DatabaseName.CARD_RARITY.TABLE)
@Table(name = DatabaseName.CARD_RARITY.TABLE)
public class CardRarity implements Serializable, CodeObject {

	private static final long serialVersionUID = -1864542003746307771L;

	@Id
	@Column(name=DatabaseName.ID)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name=DatabaseName.CARD_RARITY.CODE)
	private String code;

	@Column(name=DatabaseName.CARD_RARITY.NAME)
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	@Override
	public String getCode() {
		return code;
	}
	
	@Override
	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}