package com.project.magician.business.card.stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.magician.business.AbstractDatabaseService;
import com.project.magician.model.card.stock.StockCard;
import com.project.magician.persistance.card.stock.StockCardDao;

@Service("stockCardService")
public class StockCardServiceImpl extends AbstractDatabaseService<StockCard> implements StockCardService {

	@Autowired
	StockCardDao stockCardDao;

	@Override
	public StockCardDao getDao() {
		return stockCardDao;
	}

}