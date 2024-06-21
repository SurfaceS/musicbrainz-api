/*
 * Copyright (C) 2024 Universal Media Server
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.universalmediaserver.musicbrainz.api.schema.artist;

import com.google.gson.annotations.SerializedName;
import com.universalmediaserver.musicbrainz.api.schema.LifeSpanSchema;
import com.universalmediaserver.musicbrainz.api.schema.RatingSchema;
import com.universalmediaserver.musicbrainz.api.schema.area.AreaSchema;
import java.util.List;

/**
 * Artist Schema.
 *
 * @author SurfaceS
 */
public class ArtistSchemaExtended extends ArtistSchema {

	@SerializedName("life-span")
	private LifeSpanSchema lifeSpan;
	@SerializedName("country")
	private String country;
	@SerializedName("area")
	private AreaSchema area;
	@SerializedName("isnis")
	private List<String> isnis;
	@SerializedName("ipis")
	private List<String> ipis;
	@SerializedName("begin-area")
	private AreaSchema beginArea;
	@SerializedName("gender")
	private String gender;
	@SerializedName("gender-id")
	private String genderId;
	@SerializedName("rating")
	private RatingSchema rating;

	public LifeSpanSchema getLifeSpan() {
		return lifeSpan;
	}

	public void setLifeSpan(LifeSpanSchema lifeSpan) {
		this.lifeSpan = lifeSpan;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public AreaSchema getArea() {
		return area;
	}

	public void setArea(AreaSchema area) {
		this.area = area;
	}

	public List<String> getIsnis() {
		return isnis;
	}

	public void setIsnis(List<String> isnis) {
		this.isnis = isnis;
	}

	public List<String> getIpis() {
		return ipis;
	}

	public void setIpis(List<String> ipis) {
		this.ipis = ipis;
	}

	public AreaSchema getBeginArea() {
		return beginArea;
	}

	public void setBeginArea(AreaSchema beginArea) {
		this.beginArea = beginArea;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGenderId() {
		return genderId;
	}

	public void setGenderId(String genderId) {
		this.genderId = genderId;
	}

	public RatingSchema getRating() {
		return rating;
	}

	public void setRating(RatingSchema rating) {
		this.rating = rating;
	}

}
