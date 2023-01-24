package com.project.magician.business.card.infos;

import org.springframework.stereotype.Service;

import com.project.magician.business.DatabaseService;
import com.project.magician.model.card.infos.CardType;

@Service
public interface CardTypeService extends DatabaseService<CardType> {
	
}

