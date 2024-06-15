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
package com.universalmediaserver.musicbrainz.api.schema.track;

import com.google.gson.annotations.SerializedName;
import com.universalmediaserver.musicbrainz.api.schema.artist.ArtistCreditSchema;
import com.universalmediaserver.musicbrainz.api.schema.recording.RecordingBaseSchema;
import java.util.List;

/**
 * Track Schema.
 *
 * @author SurfaceS
 */
public class TrackSchema extends TrackBaseSchema {

	@SerializedName("position")
	private Long position;
	@SerializedName("recording")
	private RecordingBaseSchema recording;
	@SerializedName("artist-credit")
	private List<ArtistCreditSchema> artistCredit;

	public Long getPosition() {
		return position;
	}

	public void setPosition(Long position) {
		this.position = position;
	}

	public RecordingBaseSchema getRecording() {
		return recording;
	}

	public void setRecording(RecordingBaseSchema recording) {
		this.recording = recording;
	}

	public List<ArtistCreditSchema> getArtistCredit() {
		return artistCredit;
	}

	public void setArtistCredit(List<ArtistCreditSchema> artistCredit) {
		this.artistCredit = artistCredit;
	}

}
