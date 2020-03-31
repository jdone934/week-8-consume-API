package com.scryfall;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Legalities{

	@JsonProperty("standard")
	private String standard;

	@JsonProperty("oldschool")
	private String oldschool;

	@JsonProperty("historic")
	private String historic;

	@JsonProperty("legacy")
	private String legacy;

	@JsonProperty("pioneer")
	private String pioneer;

	@JsonProperty("commander")
	private String commander;

	@JsonProperty("modern")
	private String modern;

	@JsonProperty("pauper")
	private String pauper;

	@JsonProperty("future")
	private String future;

	@JsonProperty("vintage")
	private String vintage;

	@JsonProperty("duel")
	private String duel;

	@JsonProperty("brawl")
	private String brawl;

	@JsonProperty("penny")
	private String penny;

	public void setStandard(String standard){
		this.standard = standard;
	}

	public String getStandard(){
		return standard;
	}

	public void setOldschool(String oldschool){
		this.oldschool = oldschool;
	}

	public String getOldschool(){
		return oldschool;
	}

	public void setHistoric(String historic){
		this.historic = historic;
	}

	public String getHistoric(){
		return historic;
	}

	public void setLegacy(String legacy){
		this.legacy = legacy;
	}

	public String getLegacy(){
		return legacy;
	}

	public void setPioneer(String pioneer){
		this.pioneer = pioneer;
	}

	public String getPioneer(){
		return pioneer;
	}

	public void setCommander(String commander){
		this.commander = commander;
	}

	public String getCommander(){
		return commander;
	}

	public void setModern(String modern){
		this.modern = modern;
	}

	public String getModern(){
		return modern;
	}

	public void setPauper(String pauper){
		this.pauper = pauper;
	}

	public String getPauper(){
		return pauper;
	}

	public void setFuture(String future){
		this.future = future;
	}

	public String getFuture(){
		return future;
	}

	public void setVintage(String vintage){
		this.vintage = vintage;
	}

	public String getVintage(){
		return vintage;
	}

	public void setDuel(String duel){
		this.duel = duel;
	}

	public String getDuel(){
		return duel;
	}

	public void setBrawl(String brawl){
		this.brawl = brawl;
	}

	public String getBrawl(){
		return brawl;
	}

	public void setPenny(String penny){
		this.penny = penny;
	}

	public String getPenny(){
		return penny;
	}

	@Override
 	public String toString(){
		return 
			"Legalities{" + 
			"standard = '" + standard + '\'' + 
			",oldschool = '" + oldschool + '\'' + 
			",historic = '" + historic + '\'' + 
			",legacy = '" + legacy + '\'' + 
			",pioneer = '" + pioneer + '\'' + 
			",commander = '" + commander + '\'' + 
			",modern = '" + modern + '\'' + 
			",pauper = '" + pauper + '\'' + 
			",future = '" + future + '\'' + 
			",vintage = '" + vintage + '\'' + 
			",duel = '" + duel + '\'' + 
			",brawl = '" + brawl + '\'' + 
			",penny = '" + penny + '\'' + 
			"}";
		}
}