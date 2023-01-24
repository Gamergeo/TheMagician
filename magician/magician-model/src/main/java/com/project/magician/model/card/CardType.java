package com.project.magician.model.card;

public enum CardType {
	CREATURE("Créature"), 
	INSTANT("Éphémère"),
	SORCERY("Rituel"),
	ARTEFACT("Artefact"),
	LAND("Terrain"),
	ENCHANTMENT("Enchantement");
	
	private String name;

	private CardType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public String getCode() {
		return name();
	}
}
