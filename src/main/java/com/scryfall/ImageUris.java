package com.scryfall;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ImageUris{

	@JsonProperty("small")
	private String small;

	@JsonProperty("normal")
	private String normal;

	@JsonProperty("large")
	private String large;

	@JsonProperty("png")
	private String png;

	@JsonProperty("border_crop")
	private String borderCrop;

	@JsonProperty("art_crop")
	private String artCrop;

	public void setSmall(String small){
		this.small = small;
	}

	public String getSmall(){
		return small;
	}

	public void setNormal(String normal){
		this.normal = normal;
	}

	public String getNormal(){
		return normal;
	}

	public void setLarge(String large){
		this.large = large;
	}

	public String getLarge(){
		return large;
	}

	public void setPng(String png){
		this.png = png;
	}

	public String getPng(){
		return png;
	}

	public void setBorderCrop(String borderCrop){
		this.borderCrop = borderCrop;
	}

	public String getBorderCrop(){
		return borderCrop;
	}

	public void setArtCrop(String artCrop){
		this.artCrop = artCrop;
	}

	public String getArtCrop(){
		return artCrop;
	}

	@Override
 	public String toString(){
		return 
			"ImageUris{" + 
			"small = '" + small + '\'' + 
			",normal = '" + normal + '\'' + 
			",large = '" + large + '\'' + 
			",png = '" + png + '\'' + 
			",border_crop = '" + borderCrop + '\'' + 
			",art_crop = '" + artCrop + '\'' + 
			"}";
		}
}