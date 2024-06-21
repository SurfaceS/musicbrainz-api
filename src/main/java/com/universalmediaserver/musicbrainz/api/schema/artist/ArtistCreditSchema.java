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

/**
 * Artist Credit Schema.
 *
 * @author SurfaceS
 */
public class ArtistCreditSchema {

	@SerializedName("name")
	private String name;
	@SerializedName("joinphrase")
	private String joinphrase;
	@SerializedName("artist")
	private ArtistSchemaExtended artist;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJoinphrase() {
		return joinphrase;
	}

	public void setJoinphrase(String joinphrase) {
		this.joinphrase = joinphrase;
	}

	public ArtistSchemaExtended getArtist() {
		return artist;
	}

	public void setArtist(ArtistSchemaExtended artist) {
		this.artist = artist;
	}

}
