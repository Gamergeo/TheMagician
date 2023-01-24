package com.project.magician.model.card.infos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.project.magician.model.DatabaseName;
import com.project.magician.model.card.CardType;

@Entity(name = DatabaseName.CARD_INFOS.TABLE)
@Table(name = DatabaseName.CARD_INFOS.TABLE)
public class CardInfos implements Serializable {

	private static final long serialVersionUID = -1864542003746307771L;

	@Id
	@Column(name=DatabaseName.ID)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name=DatabaseName.CARD_INFOS.NAME)
	private String name;
	
	@Column(name=DatabaseName.CARD_INFOS.MAIN_TYPE)
	@Enumerated(EnumType.STRING)
	private CardType mainType;
	
	@Column(name=DatabaseName.CARD_INFOS.SECOND_TYPE)
	@Enumerated(EnumType.STRING)
	private CardType secondType;

	@Column(name=DatabaseName.CARD_INFOS.COST)
	private String cost;

	@Column(name=DatabaseName.CARD_INFOS.POWER)
	private Integer power;

	@Column(name=DatabaseName.CARD_INFOS.TOUGHNESS)
	private Integer toughness;

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

	public CardType getMainType() {
		return mainType;
	}

	public CardType getSecondType() {
		return secondType;
	}

	public void setMainType(CardType mainType) {
		this.mainType = mainType;
	}

	public void setSecondType(CardType secondType) {
		this.secondType = secondType;
	}
	
	public List<CardType> getTypes() {
		List<CardType> cardTypes = new ArrayList<CardType>();
		cardTypes.add(this.getMainType());
		cardTypes.add(this.getSecondType());
		
		return getTypes();
	}

	public String getCost() {
		return cost;
	}

	public Integer getPower() {
		return power;
	}

	public Integer getToughness() {
		return toughness;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public void setPower(Integer power) {
		this.power = power;
	}

	public void setToughness(Integer toughness) {
		this.toughness = toughness;
	}
	
}