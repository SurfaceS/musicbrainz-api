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
import com.universalmediaserver.musicbrainz.api.schema.SearchResultsSchema;
import java.util.List;

/**
 * Artist Search Results Schema.
 *
 * @author SurfaceS
 */
public class ArtistSearchResultsSchema extends SearchResultsSchema {

	@SerializedName("artists")
	private List<ArtistSearchSchema> artists;

	public List<ArtistSearchSchema> getArtists() {
		return artists;
	}

	public void setArtists(List<ArtistSearchSchema> artists) {
		this.artists = artists;
	}

}
