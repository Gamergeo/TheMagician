delete from stock_card;
delete from language_card;
delete from expansion_card;
delete from card_infos_color;
delete from card_infos_color_identity;
delete from card_color;
delete from card_infos_type;
delete from card_type;
delete from card_infos_subtype;
delete from card_subtype;
delete from card_infos_supertype;
delete from card_supertype;
delete from card_infos;
delete from card_layout;
delete from card_rarity;
delete from expansion;

ALTER TABLE stock_card AUTO_INCREMENT = 1;
ALTER TABLE language_card AUTO_INCREMENT = 1;
ALTER TABLE expansion_card AUTO_INCREMENT = 1;
ALTER TABLE card_infos AUTO_INCREMENT = 1;
ALTER TABLE card_color AUTO_INCREMENT = 1;
ALTER TABLE card_infos_color AUTO_INCREMENT = 1;
ALTER TABLE card_infos_color_identity AUTO_INCREMENT = 1;
ALTER TABLE card_type AUTO_INCREMENT = 1;
ALTER TABLE card_infos_type AUTO_INCREMENT = 1;
ALTER TABLE card_subtype AUTO_INCREMENT = 1;
ALTER TABLE card_infos_subtype AUTO_INCREMENT = 1;
ALTER TABLE card_supertype AUTO_INCREMENT = 1;
ALTER TABLE card_infos_supertype AUTO_INCREMENT = 1;
ALTER TABLE card_layout AUTO_INCREMENT = 1;
ALTER TABLE card_rarity AUTO_INCREMENT = 1;
ALTER TABLE expansion AUTO_INCREMENT = 1;