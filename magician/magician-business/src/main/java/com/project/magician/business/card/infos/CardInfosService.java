package com.project.magician.business.card.infos;

import org.springframework.stereotype.Service;

import com.project.magician.business.DatabaseService;
import com.project.magician.model.card.infos.CardInfos;

@Service
public interface CardInfosService extends DatabaseService<CardInfos> {
	
	void createTestCard();

	void updateTestCard();
}

