package com.scryfall;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RelatedUris{

	@JsonProperty("tcgplayer_decks")
	private String tcgplayerDecks;

	@JsonProperty("gatherer")
	private String gatherer;

	@JsonProperty("mtgtop8")
	private String mtgtop8;

	@JsonProperty("edhrec")
	private String edhrec;

	public void setTcgplayerDecks(String tcgplayerDecks){
		this.tcgplayerDecks = tcgplayerDecks;
	}

	public String getTcgplayerDecks(){
		return tcgplayerDecks;
	}

	public void setGatherer(String gatherer){
		this.gatherer = gatherer;
	}

	public String getGatherer(){
		return gatherer;
	}

	public void setMtgtop8(String mtgtop8){
		this.mtgtop8 = mtgtop8;
	}

	public String getMtgtop8(){
		return mtgtop8;
	}

	public void setEdhrec(String edhrec){
		this.edhrec = edhrec;
	}

	public String getEdhrec(){
		return edhrec;
	}

	@Override
 	public String toString(){
		return 
			"RelatedUris{" + 
			"tcgplayer_decks = '" + tcgplayerDecks + '\'' + 
			",gatherer = '" + gatherer + '\'' + 
			",mtgtop8 = '" + mtgtop8 + '\'' + 
			",edhrec = '" + edhrec + '\'' + 
			"}";
		}
}