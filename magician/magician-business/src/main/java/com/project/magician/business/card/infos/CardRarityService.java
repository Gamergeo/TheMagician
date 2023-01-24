package com.project.magician.business.card.infos;

import org.springframework.stereotype.Service;

import com.project.magician.business.DatabaseService;
import com.project.magician.model.card.infos.CardRarity;

@Service
public interface CardRarityService extends DatabaseService<CardRarity> {
	
}

