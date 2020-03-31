package com.scryfall;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Prices{

	@JsonProperty("usd_foil")
	private String usdFoil;

	@JsonProperty("tix")
	private String tix;

	@JsonProperty("eur")
	private String eur;

	@JsonProperty("usd")
	private String usd;

	public void setUsdFoil(String usdFoil){
		this.usdFoil = usdFoil;
	}

	public String getUsdFoil(){
		return usdFoil;
	}

	public void setTix(String tix){
		this.tix = tix;
	}

	public String getTix(){
		return tix;
	}

	public void setEur(String eur){
		this.eur = eur;
	}

	public String getEur(){
		return eur;
	}

	public void setUsd(String usd){
		this.usd = usd;
	}

	public String getUsd(){
		return usd;
	}

	@Override
 	public String toString(){
		return 
			"Prices{" + 
			"usd_foil = '" + usdFoil + '\'' + 
			",tix = '" + tix + '\'' + 
			",eur = '" + eur + '\'' + 
			",usd = '" + usd + '\'' + 
			"}";
		}
}