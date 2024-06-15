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
package com.universalmediaserver.musicbrainz.api.schema.medium;

import com.google.gson.annotations.SerializedName;
import com.universalmediaserver.musicbrainz.api.schema.disc.DiscBaseSchema;
import com.universalmediaserver.musicbrainz.api.schema.track.TrackBaseSchema;
import com.universalmediaserver.musicbrainz.api.schema.track.TrackSchema;
import java.util.List;

/**
 * Medium Schema.
 *
 * @author SurfaceS
 */
public class MediumSchema extends MediumBaseSchema {

	@SerializedName("title")
	private String title;
	@SerializedName("discs")
	private List<DiscBaseSchema> discs;
	@SerializedName("format-id")
	private String formatId;
	@SerializedName("tracks")
	private List<TrackSchema> tracks;
	@SerializedName("track")
	private List<TrackBaseSchema> track;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<DiscBaseSchema> getDiscs() {
		return discs;
	}

	public void setDiscs(List<DiscBaseSchema> discs) {
		this.discs = discs;
	}

	public String getFormatId() {
		return formatId;
	}

	public void setFormatId(String formatId) {
		this.formatId = formatId;
	}

	public List<TrackSchema> getTracks() {
		return tracks;
	}

	public void setTracks(List<TrackSchema> tracks) {
		this.tracks = tracks;
	}

	public List<TrackBaseSchema> getTrack() {
		return track;
	}

	public void setTrack(List<TrackBaseSchema> track) {
		this.track = track;
	}

}
