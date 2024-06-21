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
package com.universalmediaserver.musicbrainz.api.schema.release;

import com.google.gson.annotations.SerializedName;
import com.universalmediaserver.musicbrainz.api.schema.artist.ArtistCreditSchema;
import com.universalmediaserver.musicbrainz.api.schema.medium.MediumSchema;
import com.universalmediaserver.musicbrainz.api.schema.release_group.ReleaseGroupLookupSchema;
import java.util.List;

/**
 * Release Base Schema.
 *
 * @author SurfaceS
 */
public class ReleaseBaseSchema {

	@SerializedName("id")
	private String id;
	@SerializedName("status-id")
	private String statusId;
	@SerializedName("count")
	private Long count;
	@SerializedName("title")
	private String title;
	@SerializedName("status")
	private String status;
	@SerializedName("artist-credit")
	private List<ArtistCreditSchema> artistCredit;
	@SerializedName("release-group")
	private ReleaseGroupLookupSchema releaseGroup;
	@SerializedName("date")
	private String date;
	@SerializedName("country")
	private String country;
	@SerializedName("release-events")
	private List<ReleaseEventSchema> releaseEvents;
	@SerializedName("track-count")
	private Long trackCount;
	@SerializedName("media")
	private List<MediumSchema> media;
	@SerializedName("disambiguation")
	private String disambiguation;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStatusId() {
		return statusId;
	}

	public void setStatusId(String statusId) {
		this.statusId = statusId;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<ArtistCreditSchema> getArtistCredit() {
		return artistCredit;
	}

	public void setArtistCredit(List<ArtistCreditSchema> artistCredit) {
		this.artistCredit = artistCredit;
	}

	public ReleaseGroupLookupSchema getReleaseGroup() {
		return releaseGroup;
	}

	public void setReleaseGroup(ReleaseGroupLookupSchema releaseGroup) {
		this.releaseGroup = releaseGroup;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<ReleaseEventSchema> getReleaseEvents() {
		return releaseEvents;
	}

	public void setReleaseEvents(List<ReleaseEventSchema> releaseEvents) {
		this.releaseEvents = releaseEvents;
	}

	public Long getTrackCount() {
		return trackCount;
	}

	public void setTrackCount(Long trackCount) {
		this.trackCount = trackCount;
	}

	public List<MediumSchema> getMedia() {
		return media;
	}

	public void setMedia(List<MediumSchema> media) {
		this.media = media;
	}

	public String getDisambiguation() {
		return disambiguation;
	}

	public void setDisambiguation(String disambiguation) {
		this.disambiguation = disambiguation;
	}

}
