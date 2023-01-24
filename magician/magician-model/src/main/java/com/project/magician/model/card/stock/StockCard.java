package com.project.magician.model.card.stock;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.project.magician.model.DatabaseName;
import com.project.magician.model.ModelObject;
import com.project.magician.model.card.language.LanguageCard;

@Entity(name = DatabaseName.STOCK_CARD.TABLE)
@Table(name = DatabaseName.STOCK_CARD.TABLE)
public class StockCard implements Serializable, ModelObject {

	private static final long serialVersionUID = -1864542003746307771L;

	@Id
	@Column(name=DatabaseName.ID)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name=DatabaseName.STOCK_CARD.ID_LANGUAGE_CARD, referencedColumnName=DatabaseName.ID)
	private LanguageCard languageCard;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LanguageCard getLanguageCard() {
		return languageCard;
	}

	public void setLanguageCard(LanguageCard languageCard) {
		this.languageCard = languageCard;
	}

}