package com.project.magician.model.card.expansion;

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
import com.project.magician.model.card.infos.CardInfos;
import com.project.magician.model.expansion.Expansion;

@Entity(name = DatabaseName.EXPANSION_CARD.TABLE)
@Table(name = DatabaseName.EXPANSION_CARD.TABLE)
public class ExpansionCard implements Serializable, ModelObject {

	private static final long serialVersionUID = -1864542003746307771L;

	@Id
	@Column(name=DatabaseName.ID)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name=DatabaseName.EXPANSION_CARD.ID_CARD_INFOS, referencedColumnName=DatabaseName.ID)
	private CardInfos cardInfos;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name=DatabaseName.EXPANSION_CARD.ID_EXPANSION, referencedColumnName=DatabaseName.ID)
	private Expansion expansion;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CardInfos getCardInfos() {
		return cardInfos;
	}

	public void setCardInfos(CardInfos cardInfos) {
		this.cardInfos = cardInfos;
	}

	public Expansion getExpansion() {
		return expansion;
	}

	public void setExpansion(Expansion expansion) {
		this.expansion = expansion;
	}
}