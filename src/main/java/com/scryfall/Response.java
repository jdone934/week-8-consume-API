package com.scryfall;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Response{

	@JsonProperty("total_cards")
	private int totalCards;

	@JsonProperty("data")
	private List<DataItem> data;

	@JsonProperty("has_more")
	private boolean hasMore;

	@JsonProperty("object")
	private String object;

	public void setTotalCards(int totalCards){
		this.totalCards = totalCards;
	}

	public int getTotalCards(){
		return totalCards;
	}

	public void setData(List<DataItem> data){
		this.data = data;
	}

	public List<DataItem> getData(){
		return data;
	}

	public void setHasMore(boolean hasMore){
		this.hasMore = hasMore;
	}

	public boolean isHasMore(){
		return hasMore;
	}

	public void setObject(String object){
		this.object = object;
	}

	public String getObject(){
		return object;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"total_cards = '" + totalCards + '\'' + 
			",data = '" + data + '\'' + 
			",has_more = '" + hasMore + '\'' + 
			",object = '" + object + '\'' + 
			"}";
		}
}