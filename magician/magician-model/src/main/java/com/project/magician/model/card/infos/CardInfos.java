package com.project.magician.model.card.infos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.project.magician.model.DatabaseName;
import com.project.magician.model.ModelObject;

@Entity(name = DatabaseName.CARD_INFOS.TABLE)
@Table(name = DatabaseName.CARD_INFOS.TABLE)
public class CardInfos implements Serializable, ModelObject {

	private static final long serialVersionUID = -1864542003746307771L;

	@Id
	@Column(name=DatabaseName.ID)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name=DatabaseName.CARD_INFOS.ORIGINAL_NAME)
	private String originalName;
	
	@ManyToOne
	@JoinColumn(name=DatabaseName.CARD_INFOS.ID_CARD_INFOS_LAYOUT, referencedColumnName=DatabaseName.ID)
	private CardLayout layout;

	@Column(name=DatabaseName.CARD_INFOS.CONVERTED_MANA_COST)
	private Integer convertedManaCost;

	@Column(name=DatabaseName.CARD_INFOS.MANA_COST)
	private String manaCost;

    @OneToMany(cascade = {CascadeType.REMOVE})
    @JoinTable(name = DatabaseName.CARD_INFOS_COLOR.TABLE,
                joinColumns = @JoinColumn( name = DatabaseName.CARD_INFOS_COLOR.ID_CARD_INFOS),
                inverseJoinColumns = @JoinColumn( name = DatabaseName.CARD_INFOS_COLOR.ID_CARD_COLOR))
    private List<CardColor> colors = new ArrayList<>();

    @OneToMany(cascade = {CascadeType.REMOVE})
    @JoinTable(name = DatabaseName.CARD_INFOS_COLOR_IDENTITY.TABLE,
                joinColumns = @JoinColumn( name = DatabaseName.CARD_INFOS_COLOR_IDENTITY.ID_CARD_INFOS),
                inverseJoinColumns = @JoinColumn( name = DatabaseName.CARD_INFOS_COLOR_IDENTITY.ID_CARD_COLOR))
    private List<CardColor> colorIdentities = new ArrayList<>();

    @OneToMany(cascade = {CascadeType.REMOVE})
    @JoinTable(name = DatabaseName.CARD_INFOS_TYPE.TABLE,
                joinColumns = @JoinColumn( name = DatabaseName.CARD_INFOS_TYPE.ID_CARD_INFOS),
                inverseJoinColumns = @JoinColumn( name = DatabaseName.CARD_INFOS_TYPE.ID_CARD_TYPE))
    private List<CardType> types = new ArrayList<>();

    @OneToMany(cascade = {CascadeType.REMOVE})
    @JoinTable(name = DatabaseName.CARD_INFOS_SUPERTYPE.TABLE,
                joinColumns = @JoinColumn( name = DatabaseName.CARD_INFOS_SUPERTYPE.ID_CARD_INFOS),
                inverseJoinColumns = @JoinColumn( name = DatabaseName.CARD_INFOS_SUPERTYPE.ID_CARD_SUPERTYPE))
    private List<CardSupertype> sypertypes = new ArrayList<>();

    @OneToMany(cascade = {CascadeType.REMOVE})
    @JoinTable(name = DatabaseName.CARD_INFOS_SUBTYPE.TABLE,
                joinColumns = @JoinColumn( name = DatabaseName.CARD_INFOS_SUBTYPE.ID_CARD_INFOS),
                inverseJoinColumns = @JoinColumn( name = DatabaseName.CARD_INFOS_SUBTYPE.ID_CARD_SUBTYPE))
    private List<CardSubtype> subtypes = new ArrayList<>();

	@ManyToOne
	@JoinColumn(name=DatabaseName.CARD_INFOS.ID_CARD_RARITY, referencedColumnName=DatabaseName.ID)
	private CardRarity rarity;

	@Column(name=DatabaseName.CARD_INFOS.RAW_TEXT)
	private String rawText;

	@Column(name=DatabaseName.CARD_INFOS.FLAVOR)
	private String flavor;

	@Column(name=DatabaseName.CARD_INFOS.ARTIST)
	private String artist;

	@Column(name=DatabaseName.CARD_INFOS.NUMBER)
	private String number;

	@Column(name=DatabaseName.CARD_INFOS.POWER)
	private String power;

	@Column(name=DatabaseName.CARD_INFOS.TOUGHNESS)
	private String toughness;

	@Column(name=DatabaseName.CARD_INFOS.LOYALTY)
	private String loyalty;

	@Column(name=DatabaseName.CARD_INFOS.OFFICIAL_ID)
	private String officialId;
	
	@Column(name=DatabaseName.CARD_INFOS.MULTIVERSE_ID)
	private Integer multiverseId;

	@Column(name=DatabaseName.CARD_INFOS.IMAGE_URL)
	private String imageUrl;

	@Column(name=DatabaseName.CARD_INFOS.RESERVED)
	private boolean reserved;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOriginalName() {
		return originalName;
	}

	public void setOriginalName(String originalName) {
		this.originalName = originalName;
	}

	public CardLayout getLayout() {
		return layout;
	}

	public void setLayout(CardLayout layout) {
		this.layout = layout;
	}

	public Integer getConvertedManaCost() {
		return convertedManaCost;
	}

	public void setConvertedManaCost(Integer convertedManaCost) {
		this.convertedManaCost = convertedManaCost;
	}

	public String getManaCost() {
		return manaCost;
	}

	public void setManaCost(String manaCost) {
		this.manaCost = manaCost;
	}

	public List<CardColor> getColors() {
		return colors;
	}

	public void setColors(List<CardColor> colors) {
		this.colors = colors;
	}

	public List<CardColor> getColorIdentities() {
		return colorIdentities;
	}

	public void setColorIdentities(List<CardColor> colorIdentities) {
		this.colorIdentities = colorIdentities;
	}

	public List<CardType> getTypes() {
		return types;
	}

	public void setTypes(List<CardType> types) {
		this.types = types;
	}

	public List<CardSupertype> getSypertypes() {
		return sypertypes;
	}

	public void setSypertypes(List<CardSupertype> sypertypes) {
		this.sypertypes = sypertypes;
	}

	public List<CardSubtype> getSubtypes() {
		return subtypes;
	}

	public void setSubtypes(List<CardSubtype> subtypes) {
		this.subtypes = subtypes;
	}

	public CardRarity getRarity() {
		return rarity;
	}

	public void setRarity(CardRarity rarity) {
		this.rarity = rarity;
	}

	public String getRawText() {
		return rawText;
	}

	public void setRawText(String rawText) {
		this.rawText = rawText;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getToughness() {
		return toughness;
	}

	public void setToughness(String toughness) {
		this.toughness = toughness;
	}

	public String getLoyalty() {
		return loyalty;
	}

	public void setLoyalty(String loyalty) {
		this.loyalty = loyalty;
	}

	public String getOfficialId() {
		return officialId;
	}

	public void setOfficialId(String officialId) {
		this.officialId = officialId;
	}

	public Integer getMultiverseId() {
		return multiverseId;
	}

	public void setMultiverseId(Integer multiverseId) {
		this.multiverseId = multiverseId;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public boolean isReserved() {
		return reserved;
	}

	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}
}