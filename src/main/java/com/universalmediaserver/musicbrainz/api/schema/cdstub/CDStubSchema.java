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
package com.universalmediaserver.musicbrainz.api.schema.cdstub;

import com.google.gson.annotations.SerializedName;

/**
 * CD Stub Schema.
 *
 * @author SurfaceS
 */
public class CDStubSchema {

	@SerializedName("id")
	private String id;
	@SerializedName("count")
	private Long count;
	@SerializedName("title")
	private String title;
	@SerializedName("artist")
	private String artist;
	@SerializedName("barcode")
	private String barcode;
	@SerializedName("comment")
	private String comment;
	@SerializedName("disambiguation")
	private String disambiguation;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getDisambiguation() {
		return disambiguation;
	}

	public void setDisambiguation(String disambiguation) {
		this.disambiguation = disambiguation;
	}

}
