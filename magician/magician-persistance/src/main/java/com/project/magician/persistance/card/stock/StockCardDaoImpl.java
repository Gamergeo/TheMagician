package com.project.magician.persistance.card.stock;

import org.springframework.stereotype.Repository;

import com.project.magician.model.card.stock.StockCard;
import com.project.magician.persistance.AbstractDAO;

@Repository("stockCardDao")
public class StockCardDaoImpl extends AbstractDAO<StockCard> implements StockCardDao {

	@Override
	protected void setTypeParameterClass() {
		typeParameterClass = StockCard.class;
	}
}
