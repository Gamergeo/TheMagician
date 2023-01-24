package com.project.magician.business.card.infos;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.magician.business.AbstractDatabaseService;
import com.project.magician.model.card.infos.CardColor;
import com.project.magician.model.card.infos.CardInfos;
import com.project.magician.model.card.infos.CardLayout;
import com.project.magician.model.card.infos.CardRarity;
import com.project.magician.persistance.card.infos.CardInfosDao;

@Service("cardInfosService")
public class CardInfosServiceImpl extends AbstractDatabaseService<CardInfos> implements CardInfosService {

	@Autowired
	CardInfosDao cardInfosDao;
	
	@Autowired 
	CardLayoutService cardLayoutService;
	
	@Autowired 
	CardColorService cardColorService;
	
	@Autowired 
	CardRarityService cardRarityService;

	@Override
	public CardInfosDao getDao() {
		return cardInfosDao;
	}

	@Override
	@Transactional
	public void createTestCard() {
		CardInfos cardInfos = new CardInfos();
		
		// Original name
		cardInfos.setOriginalName("Test original name");
		
		// Layout
		CardLayout layout = new CardLayout();
		layout.setCode("test");
		layout.setName("Test Layout");
		cardLayoutService.saveOrUpdate(layout);
		cardInfos.setLayout(layout);
		
		// CMC
		cardInfos.setConvertedManaCost(2);
		
		// Color
		CardColor colorRed = new CardColor();
		colorRed.setCode("R");
		colorRed.setName("Red");
		cardColorService.saveOrUpdate(colorRed);
		CardColor colorGreen = new CardColor();
		colorGreen.setName("Green");
		colorGreen.setCode("G");
		cardColorService.saveOrUpdate(colorGreen);
		List<CardColor> colors = new ArrayList<CardColor>();
		colors.add(colorRed);
		colors.add(colorGreen);
		cardInfos.setColors(colors);
		
		// Color Identity
		CardColor colorBlue = new CardColor();
		colorBlue.setCode("B");
		colorBlue.setName("Blue");
		cardColorService.saveOrUpdate(colorBlue);
		List<CardColor> colorIdentities = new ArrayList<CardColor>();
		colorIdentities.add(colorRed);
		colorIdentities.add(colorGreen);
		colorIdentities.add(colorBlue);
		cardInfos.setColorIdentities(colorIdentities);
		
		// Rarity
		CardRarity rarity = new CardRarity();
		rarity.setCode("test");
		rarity.setName("Test rarity");
		cardRarityService.saveOrUpdate(rarity);
		cardInfos.setRarity(rarity);
		
		cardInfosDao.saveOrUpdate(cardInfos);
	}
	
	@Override
	@Transactional
	public void updateTestCard() {
		CardInfos cardInfos = cardInfosDao.findById(1);
		
		// Original name
		cardInfos.setOriginalName("Test modified name");
		
		// Layout
		CardLayout layout = new CardLayout();
		layout.setCode("test");
		layout.setName("Test Modified Layout");
		cardLayoutService.saveOrUpdate(layout);
		cardInfos.setLayout(layout);
		
		// CMC
		cardInfos.setConvertedManaCost(3);
		
		// Color
		cardInfos.getColors().remove(0);
		
		// Color Identity
		cardInfos.getColorIdentities().remove(0);
		
		// Rarity
		CardRarity rarity = new CardRarity();
		rarity.setCode("test 2 ");
		rarity.setName("Test modified rarity");
		cardRarityService.saveOrUpdate(rarity);
		cardInfos.setRarity(rarity);
		
		cardInfosDao.saveOrUpdate(cardInfos);
	}

}