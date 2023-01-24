package com.project.magician.business.card.stock;

import org.springframework.stereotype.Service;

import com.project.magician.business.DatabaseService;
import com.project.magician.model.card.stock.StockCard;

@Service
public interface StockCardService extends DatabaseService<StockCard> {
	
}

