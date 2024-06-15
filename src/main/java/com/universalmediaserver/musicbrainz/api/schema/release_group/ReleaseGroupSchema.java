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
package com.universalmediaserver.musicbrainz.api.schema.release_group;

import com.google.gson.annotations.SerializedName;
import com.universalmediaserver.musicbrainz.api.schema.artist.ArtistCreditSchema;
import com.universalmediaserver.musicbrainz.api.schema.release.ReleaseSchemaExtended;
import com.universalmediaserver.musicbrainz.api.schema.tag.TagExtendedSchema;
import java.util.List;

/**
 * Release Group Schema.
 *
 * @author SurfaceS
 */
public class ReleaseGroupSchema extends ReleaseGroupBaseSchema {

	@SerializedName("first-release-date")
	private String firstReleaseDate;
	@SerializedName("artist-credit")
	private List<ArtistCreditSchema> artistCredit;
	@SerializedName("releases")
	private List<ReleaseSchemaExtended> releases;
	@SerializedName("disambiguation")
	private String disambiguation;
	@SerializedName("tags")
	private List<TagExtendedSchema> tags;

	public String getFirstReleaseDate() {
		return firstReleaseDate;
	}

	public void setFirstReleaseDate(String firstReleaseDate) {
		this.firstReleaseDate = firstReleaseDate;
	}

	public List<ArtistCreditSchema> getArtistCredit() {
		return artistCredit;
	}

	public void setArtistCredit(List<ArtistCreditSchema> artistCredit) {
		this.artistCredit = artistCredit;
	}

	public List<ReleaseSchemaExtended> getReleases() {
		return releases;
	}

	public void setReleases(List<ReleaseSchemaExtended> releases) {
		this.releases = releases;
	}

	public String getDisambiguation() {
		return disambiguation;
	}

	public void setDisambiguation(String disambiguation) {
		this.disambiguation = disambiguation;
	}

	public List<TagExtendedSchema> getTags() {
		return tags;
	}

	public void setTags(List<TagExtendedSchema> tags) {
		this.tags = tags;
	}

}
