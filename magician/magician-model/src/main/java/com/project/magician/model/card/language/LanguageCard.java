package com.project.magician.model.card.language;

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
import com.project.magician.model.card.expansion.ExpansionCard;

@Entity(name = DatabaseName.LANGUAGE_CARD.TABLE)
@Table(name = DatabaseName.LANGUAGE_CARD.TABLE)
public class LanguageCard implements Serializable, ModelObject {

	private static final long serialVersionUID = -1864542003746307771L;

	@Id
	@Column(name=DatabaseName.ID)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name=DatabaseName.LANGUAGE_CARD.ID_EXPANSION_CARD, referencedColumnName=DatabaseName.ID)
	private ExpansionCard expansionCard;
	
	@Column(name=DatabaseName.LANGUAGE_CARD.TRANSLATED_NAME)
	private String translatedName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public ExpansionCard getExpansionCard() {
		return expansionCard;
	}

	public void setExpansionCard(ExpansionCard expansionCard) {
		this.expansionCard = expansionCard;
	}

	public String getTranslatedName() {
		return translatedName;
	}

	public void setTranslatedName(String translatedName) {
		this.translatedName = translatedName;
	}
}