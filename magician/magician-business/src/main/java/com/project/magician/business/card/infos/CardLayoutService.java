package com.project.magician.business.card.infos;

import org.springframework.stereotype.Service;

import com.project.magician.business.DatabaseService;
import com.project.magician.model.card.infos.CardLayout;

@Service
public interface CardLayoutService extends DatabaseService<CardLayout> {
	
	public CardLayout createLayout(String name);
}

