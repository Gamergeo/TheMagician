package com.project.magician.model;

public class DatabaseName {
	
	public static final String ID = "id";
	
	public class CARD {
		public static final String TABLE = "card";
		
		public static final String ID_CARD_INFOS = "id_card_infos";
		
		public static final String ID_EXPANSION = "id_expansion";
	}
	
	public class CARD_INFOS {
		
		public static final String TABLE = "card_infos";
		
		public static final String NAME = "name";
		
		public static final String MAIN_TYPE = "main_type";
		
		public static final String SECOND_TYPE = "second_type";
		
		public static final String DESCRIPTION = "description";
		
		public static final String COST = "cost";
		
		public static final String POWER = "power";
		
		public static final String TOUGHNESS = "toughness";
	}
	
	public class EXPANSION {
		
		public static final String TABLE = "expansion";
		
		public static final String NAME = "name";
	}
}
