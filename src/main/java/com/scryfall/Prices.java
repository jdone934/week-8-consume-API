package com.scryfall;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Prices{

	@JsonProperty("usd_foil")
	private Object usdFoil;

	@JsonProperty("tix")
	private Object tix;

	@JsonProperty("eur")
	private String eur;

	@JsonProperty("usd")
	private String usd;

	public void setUsdFoil(Object usdFoil){
		this.usdFoil = usdFoil;
	}

	public Object getUsdFoil(){
		return usdFoil;
	}

	public void setTix(Object tix){
		this.tix = tix;
	}

	public Object getTix(){
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