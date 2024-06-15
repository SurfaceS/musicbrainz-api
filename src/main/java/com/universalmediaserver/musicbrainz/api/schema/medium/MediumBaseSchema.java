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

/**
 * Medium Schema.
 *
 * @author SurfaceS
 */
public class MediumBaseSchema {

	@SerializedName("position")
	private Long position;
	@SerializedName("format")
	private String format;
	@SerializedName("track-count")
	private Long trackCount;
	@SerializedName("track-offset")
	private Long trackOffset;
	@SerializedName("disc-count")
	private Long discCount;

	public Long getPosition() {
		return position;
	}

	public void setPosition(Long position) {
		this.position = position;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public Long getTrackCount() {
		return trackCount;
	}

	public void setTrackCount(Long trackCount) {
		this.trackCount = trackCount;
	}

	public Long getTrackOffset() {
		return trackOffset;
	}

	public void setTrackOffset(Long trackOffset) {
		this.trackOffset = trackOffset;
	}

	public Long getDiscCount() {
		return discCount;
	}

	public void setDiscCount(Long discCount) {
		this.discCount = discCount;
	}

}
