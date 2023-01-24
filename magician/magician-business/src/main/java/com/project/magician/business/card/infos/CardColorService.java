package com.project.magician.business.card.infos;

import org.springframework.stereotype.Service;

import com.project.magician.business.DatabaseService;
import com.project.magician.model.card.infos.CardColor;

@Service
public interface CardColorService extends DatabaseService<CardColor> {
	
}

