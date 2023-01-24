package com.project.magician.model;

public class DatabaseName {
	
	public static final String ID = "id";
	
	public static final String CODE = "code";
	
	public class STOCK_CARD {
		public static final String TABLE = "stock_card";
		
		public static final String ID_LANGUAGE_CARD = "id_language_card";
	}
	
	public class LANGUAGE_CARD {
		public static final String TABLE = "language_card";
		
		public static final String ID_EXPANSION_CARD = "id_expansion_card";
		
		public static final String TRANSLATED_NAME = "translated_name";
	}
	
	public class EXPANSION_CARD {
		public static final String TABLE = "expansion_card";
		
		public static final String ID_CARD_INFOS = "id_card_infos";
		
		public static final String ID_EXPANSION = "id_expansion";
	}
	
	public class CARD_INFOS {
		
		public static final String TABLE = "card_infos";
		
		public static final String ORIGINAL_NAME = "original_name";
		
		public static final String ID_CARD_INFOS_LAYOUT = "id_card_layout";
		
		public static final String CONVERTED_MANA_COST = "converted_mana_cost";
		
		public static final String MANA_COST = "mana_cost";
		
		public static final String ID_CARD_RARITY = "id_card_rarity";
		
		public static final String DESCRIPTION = "description";
		
		public static final String RAW_TEXT = "raw_text";
		
		public static final String FLAVOR = "flavor";
		
		public static final String ARTIST = "artist";
		
		public static final String NUMBER = "number";
		
		public static final String POWER = "power";
		
		public static final String TOUGHNESS = "toughness";
		
		public static final String LOYALTY = "loyalty";
		
		public static final String OFFICIAL_ID = "official_id";
		
		public static final String MULTIVERSE_ID = "multiverse_id";
		
		public static final String IMAGE_URL = "image_url";
		
		public static final String RESERVED = "reserved";
		
	}
	
	public class EXPANSION {
		
		public static final String TABLE = "expansion";
		
		public static final String CODE = DatabaseName.CODE;
		
		public static final String NAME = "name";
	}
	
	public class CARD_LAYOUT {
		
		public static final String TABLE = "card_layout";
		
		public static final String CODE = DatabaseName.CODE;
		
		public static final String NAME = "name";
	}
	
	public class CARD_COLOR {
		
		public static final String TABLE = "card_color";

		public static final String CODE = DatabaseName.CODE;
		
		public static final String NAME = "name";
	}
	
	public class CARD_TYPE {
		
		public static final String TABLE = "card_type";
		
		public static final String CODE = DatabaseName.CODE;
		
		public static final String NAME = "name";
	}
	
	public class CARD_SUPERTYPE {
		
		public static final String TABLE = "card_supertype";
		
		public static final String CODE = DatabaseName.CODE;
		
		public static final String NAME = "name";
	}
	
	public class CARD_SUBTYPE {
		
		public static final String TABLE = "card_subtype";
		
		public static final String CODE = DatabaseName.CODE;
		
		public static final String NAME = "name";
	}
	
	public class CARD_RARITY {
		
		public static final String TABLE = "card_rarity";
		
		public static final String CODE = DatabaseName.CODE;
		
		public static final String NAME = "name";
	}
	
	public class CARD_ARTIST {
		
		public static final String TABLE = "card_artist";
		
		public static final String NAME = "name";
	}
	
	/*********************************************************************************************************************/
	/************************************								**************************************************/
	/************************************		Association table		**************************************************/
	/************************************								**************************************************/
	/*********************************************************************************************************************/
	
	public class CARD_INFOS_COLOR {
		
		public static final String TABLE = "card_infos_color";
		
		public static final String ID_CARD_INFOS = "id_card_infos";
		
		public static final String ID_CARD_COLOR = "id_card_color";
	}
	
	public class CARD_INFOS_COLOR_IDENTITY {
		
		public static final String TABLE = "card_infos_color_identity";
		
		public static final String ID_CARD_INFOS = "id_card_infos";
		
		public static final String ID_CARD_COLOR = "id_card_color";
	}
	
	public class CARD_INFOS_TYPE {
		
		public static final String TABLE = "card_infos_type";
		
		public static final String ID_CARD_INFOS = "id_card_infos";
		
		public static final String ID_CARD_TYPE = "id_card_type";
	}
	
	public class CARD_INFOS_SUPERTYPE {
		
		public static final String TABLE = "card_infos_supertype";
		
		public static final String ID_CARD_INFOS = "id_card_infos";
		
		public static final String ID_CARD_SUPERTYPE = "id_card_supertype";
	}
	
	public class CARD_INFOS_SUBTYPE {
		
		public static final String TABLE = "card_infos_subtype";
		
		public static final String ID_CARD_INFOS = "id_card_infos";
		
		public static final String ID_CARD_SUBTYPE = "id_card_subtype";
	}
	
}