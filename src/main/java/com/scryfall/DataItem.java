package com.scryfall;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DataItem{

	@JsonProperty("oracle_text")
	private String oracleText;

	@JsonProperty("tcgplayer_id")
	private int tcgplayerId;

	@JsonProperty("prints_search_uri")
	private String printsSearchUri;

	@JsonProperty("variation")
	private boolean variation;

	@JsonProperty("set_search_uri")
	private String setSearchUri;

	@JsonProperty("flavor_text")
	private String flavorText;

	@JsonProperty("set_name")
	private String setName;

	@JsonProperty("scryfall_uri")
	private String scryfallUri;

	@JsonProperty("edhrec_rank")
	private int edhrecRank;

	@JsonProperty("mana_cost")
	private String manaCost;

	@JsonProperty("games")
	private List<String> games;

	@JsonProperty("id")
	private String id;

	@JsonProperty("foil")
	private boolean foil;

	@JsonProperty("purchase_uris")
	private PurchaseUris purchaseUris;

	@JsonProperty("scryfall_set_uri")
	private String scryfallSetUri;

	@JsonProperty("watermark")
	private String watermark;

	@JsonProperty("type_line")
	private String typeLine;

	@JsonProperty("color_identity")
	private List<String> colorIdentity;

	@JsonProperty("set_type")
	private String setType;

	@JsonProperty("related_uris")
	private RelatedUris relatedUris;

	@JsonProperty("legalities")
	private Legalities legalities;

	@JsonProperty("border_color")
	private String borderColor;

	@JsonProperty("mtgo_foil_id")
	private int mtgoFoilId;

	@JsonProperty("reserved")
	private boolean reserved;

	@JsonProperty("name")
	private String name;

	@JsonProperty("cmc")
	private int cmc;

	@JsonProperty("object")
	private String object;

	@JsonProperty("rarity")
	private String rarity;

	@JsonProperty("frame")
	private String frame;

	@JsonProperty("oracle_id")
	private String oracleId;

	@JsonProperty("artist")
	private String artist;

	@JsonProperty("released_at")
	private String releasedAt;

	@JsonProperty("colors")
	private List<String> colors;

	@JsonProperty("booster")
	private boolean booster;

	@JsonProperty("illustration_id")
	private String illustrationId;

	@JsonProperty("promo")
	private boolean promo;

	@JsonProperty("artist_ids")
	private List<String> artistIds;

	@JsonProperty("mtgo_id")
	private int mtgoId;

	@JsonProperty("rulings_uri")
	private String rulingsUri;

	@JsonProperty("collector_number")
	private String collectorNumber;

	@JsonProperty("set_uri")
	private String setUri;

	@JsonProperty("lang")
	private String lang;

	@JsonProperty("prices")
	private Prices prices;

	@JsonProperty("highres_image")
	private boolean highresImage;

	@JsonProperty("digital")
	private boolean digital;

	@JsonProperty("set")
	private String set;

	@JsonProperty("reprint")
	private boolean reprint;

	@JsonProperty("full_art")
	private boolean fullArt;

	@JsonProperty("image_uris")
	private ImageUris imageUris;

	@JsonProperty("nonfoil")
	private boolean nonfoil;

	@JsonProperty("card_back_id")
	private String cardBackId;

	@JsonProperty("uri")
	private String uri;

	@JsonProperty("layout")
	private String layout;

	@JsonProperty("multiverse_ids")
	private List<Integer> multiverseIds;

	@JsonProperty("oversized")
	private boolean oversized;

	@JsonProperty("story_spotlight")
	private boolean storySpotlight;

	@JsonProperty("textless")
	private boolean textless;

	public void setOracleText(String oracleText){
		this.oracleText = oracleText;
	}

	public String getOracleText(){
		return oracleText;
	}

	public void setTcgplayerId(int tcgplayerId){
		this.tcgplayerId = tcgplayerId;
	}

	public int getTcgplayerId(){
		return tcgplayerId;
	}

	public void setPrintsSearchUri(String printsSearchUri){
		this.printsSearchUri = printsSearchUri;
	}

	public String getPrintsSearchUri(){
		return printsSearchUri;
	}

	public void setVariation(boolean variation){
		this.variation = variation;
	}

	public boolean isVariation(){
		return variation;
	}

	public void setSetSearchUri(String setSearchUri){
		this.setSearchUri = setSearchUri;
	}

	public String getSetSearchUri(){
		return setSearchUri;
	}

	public void setFlavorText(String flavorText){
		this.flavorText = flavorText;
	}

	public String getFlavorText(){
		return flavorText;
	}

	public void setSetName(String setName){
		this.setName = setName;
	}

	public String getSetName(){
		return setName;
	}

	public void setScryfallUri(String scryfallUri){
		this.scryfallUri = scryfallUri;
	}

	public String getScryfallUri(){
		return scryfallUri;
	}

	public void setEdhrecRank(int edhrecRank){
		this.edhrecRank = edhrecRank;
	}

	public int getEdhrecRank(){
		return edhrecRank;
	}

	public void setManaCost(String manaCost){
		this.manaCost = manaCost;
	}

	public String getManaCost(){
		return manaCost;
	}

	public void setGames(List<String> games){
		this.games = games;
	}

	public List<String> getGames(){
		return games;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setFoil(boolean foil){
		this.foil = foil;
	}

	public boolean isFoil(){
		return foil;
	}

	public void setPurchaseUris(PurchaseUris purchaseUris){
		this.purchaseUris = purchaseUris;
	}

	public PurchaseUris getPurchaseUris(){
		return purchaseUris;
	}

	public void setScryfallSetUri(String scryfallSetUri){
		this.scryfallSetUri = scryfallSetUri;
	}

	public String getScryfallSetUri(){
		return scryfallSetUri;
	}

	public void setWatermark(String watermark){
		this.watermark = watermark;
	}

	public String getWatermark(){
		return watermark;
	}

	public void setTypeLine(String typeLine){
		this.typeLine = typeLine;
	}

	public String getTypeLine(){
		return typeLine;
	}

	public void setColorIdentity(List<String> colorIdentity){
		this.colorIdentity = colorIdentity;
	}

	public List<String> getColorIdentity(){
		return colorIdentity;
	}

	public void setSetType(String setType){
		this.setType = setType;
	}

	public String getSetType(){
		return setType;
	}

	public void setRelatedUris(RelatedUris relatedUris){
		this.relatedUris = relatedUris;
	}

	public RelatedUris getRelatedUris(){
		return relatedUris;
	}

	public void setLegalities(Legalities legalities){
		this.legalities = legalities;
	}

	public Legalities getLegalities(){
		return legalities;
	}

	public void setBorderColor(String borderColor){
		this.borderColor = borderColor;
	}

	public String getBorderColor(){
		return borderColor;
	}

	public void setMtgoFoilId(int mtgoFoilId){
		this.mtgoFoilId = mtgoFoilId;
	}

	public int getMtgoFoilId(){
		return mtgoFoilId;
	}

	public void setReserved(boolean reserved){
		this.reserved = reserved;
	}

	public boolean isReserved(){
		return reserved;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setCmc(int cmc){
		this.cmc = cmc;
	}

	public int getCmc(){
		return cmc;
	}

	public void setObject(String object){
		this.object = object;
	}

	public String getObject(){
		return object;
	}

	public void setRarity(String rarity){
		this.rarity = rarity;
	}

	public String getRarity(){
		return rarity;
	}

	public void setFrame(String frame){
		this.frame = frame;
	}

	public String getFrame(){
		return frame;
	}

	public void setOracleId(String oracleId){
		this.oracleId = oracleId;
	}

	public String getOracleId(){
		return oracleId;
	}

	public void setArtist(String artist){
		this.artist = artist;
	}

	public String getArtist(){
		return artist;
	}

	public void setReleasedAt(String releasedAt){
		this.releasedAt = releasedAt;
	}

	public String getReleasedAt(){
		return releasedAt;
	}

	public void setColors(List<String> colors){
		this.colors = colors;
	}

	public List<String> getColors(){
		return colors;
	}

	public void setBooster(boolean booster){
		this.booster = booster;
	}

	public boolean isBooster(){
		return booster;
	}

	public void setIllustrationId(String illustrationId){
		this.illustrationId = illustrationId;
	}

	public String getIllustrationId(){
		return illustrationId;
	}

	public void setPromo(boolean promo){
		this.promo = promo;
	}

	public boolean isPromo(){
		return promo;
	}

	public void setArtistIds(List<String> artistIds){
		this.artistIds = artistIds;
	}

	public List<String> getArtistIds(){
		return artistIds;
	}

	public void setMtgoId(int mtgoId){
		this.mtgoId = mtgoId;
	}

	public int getMtgoId(){
		return mtgoId;
	}

	public void setRulingsUri(String rulingsUri){
		this.rulingsUri = rulingsUri;
	}

	public String getRulingsUri(){
		return rulingsUri;
	}

	public void setCollectorNumber(String collectorNumber){
		this.collectorNumber = collectorNumber;
	}

	public String getCollectorNumber(){
		return collectorNumber;
	}

	public void setSetUri(String setUri){
		this.setUri = setUri;
	}

	public String getSetUri(){
		return setUri;
	}

	public void setLang(String lang){
		this.lang = lang;
	}

	public String getLang(){
		return lang;
	}

	public void setPrices(Prices prices){
		this.prices = prices;
	}

	public Prices getPrices(){
		return prices;
	}

	public void setHighresImage(boolean highresImage){
		this.highresImage = highresImage;
	}

	public boolean isHighresImage(){
		return highresImage;
	}

	public void setDigital(boolean digital){
		this.digital = digital;
	}

	public boolean isDigital(){
		return digital;
	}

	public void setSet(String set){
		this.set = set;
	}

	public String getSet(){
		return set;
	}

	public void setReprint(boolean reprint){
		this.reprint = reprint;
	}

	public boolean isReprint(){
		return reprint;
	}

	public void setFullArt(boolean fullArt){
		this.fullArt = fullArt;
	}

	public boolean isFullArt(){
		return fullArt;
	}

	public void setImageUris(ImageUris imageUris){
		this.imageUris = imageUris;
	}

	public ImageUris getImageUris(){
		return imageUris;
	}

	public void setNonfoil(boolean nonfoil){
		this.nonfoil = nonfoil;
	}

	public boolean isNonfoil(){
		return nonfoil;
	}

	public void setCardBackId(String cardBackId){
		this.cardBackId = cardBackId;
	}

	public String getCardBackId(){
		return cardBackId;
	}

	public void setUri(String uri){
		this.uri = uri;
	}

	public String getUri(){
		return uri;
	}

	public void setLayout(String layout){
		this.layout = layout;
	}

	public String getLayout(){
		return layout;
	}

	public void setMultiverseIds(List<Integer> multiverseIds){
		this.multiverseIds = multiverseIds;
	}

	public List<Integer> getMultiverseIds(){
		return multiverseIds;
	}

	public void setOversized(boolean oversized){
		this.oversized = oversized;
	}

	public boolean isOversized(){
		return oversized;
	}

	public void setStorySpotlight(boolean storySpotlight){
		this.storySpotlight = storySpotlight;
	}

	public boolean isStorySpotlight(){
		return storySpotlight;
	}

	public void setTextless(boolean textless){
		this.textless = textless;
	}

	public boolean isTextless(){
		return textless;
	}

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"oracle_text = '" + oracleText + '\'' + 
			",tcgplayer_id = '" + tcgplayerId + '\'' + 
			",prints_search_uri = '" + printsSearchUri + '\'' + 
			",variation = '" + variation + '\'' + 
			",set_search_uri = '" + setSearchUri + '\'' + 
			",flavor_text = '" + flavorText + '\'' + 
			",set_name = '" + setName + '\'' + 
			",scryfall_uri = '" + scryfallUri + '\'' + 
			",edhrec_rank = '" + edhrecRank + '\'' + 
			",mana_cost = '" + manaCost + '\'' + 
			",games = '" + games + '\'' + 
			",id = '" + id + '\'' + 
			",foil = '" + foil + '\'' + 
			",purchase_uris = '" + purchaseUris + '\'' + 
			",scryfall_set_uri = '" + scryfallSetUri + '\'' + 
			",watermark = '" + watermark + '\'' + 
			",type_line = '" + typeLine + '\'' + 
			",color_identity = '" + colorIdentity + '\'' + 
			",set_type = '" + setType + '\'' + 
			",related_uris = '" + relatedUris + '\'' + 
			",legalities = '" + legalities + '\'' + 
			",border_color = '" + borderColor + '\'' + 
			",mtgo_foil_id = '" + mtgoFoilId + '\'' + 
			",reserved = '" + reserved + '\'' + 
			",name = '" + name + '\'' + 
			",cmc = '" + cmc + '\'' + 
			",object = '" + object + '\'' + 
			",rarity = '" + rarity + '\'' + 
			",frame = '" + frame + '\'' + 
			",oracle_id = '" + oracleId + '\'' + 
			",artist = '" + artist + '\'' + 
			",released_at = '" + releasedAt + '\'' + 
			",colors = '" + colors + '\'' + 
			",booster = '" + booster + '\'' + 
			",illustration_id = '" + illustrationId + '\'' + 
			",promo = '" + promo + '\'' + 
			",artist_ids = '" + artistIds + '\'' + 
			",mtgo_id = '" + mtgoId + '\'' + 
			",rulings_uri = '" + rulingsUri + '\'' + 
			",collector_number = '" + collectorNumber + '\'' + 
			",set_uri = '" + setUri + '\'' + 
			",lang = '" + lang + '\'' + 
			",prices = '" + prices + '\'' + 
			",highres_image = '" + highresImage + '\'' + 
			",digital = '" + digital + '\'' + 
			",set = '" + set + '\'' + 
			",reprint = '" + reprint + '\'' + 
			",full_art = '" + fullArt + '\'' + 
			",image_uris = '" + imageUris + '\'' + 
			",nonfoil = '" + nonfoil + '\'' + 
			",card_back_id = '" + cardBackId + '\'' + 
			",uri = '" + uri + '\'' + 
			",layout = '" + layout + '\'' + 
			",multiverse_ids = '" + multiverseIds + '\'' + 
			",oversized = '" + oversized + '\'' + 
			",story_spotlight = '" + storySpotlight + '\'' + 
			",textless = '" + textless + '\'' + 
			"}";
		}
}