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

/**
 * Cover Art Archive Schema.
 *
 * @author SurfaceS
 */
public class CoverArtArchiveSchema {

	@SerializedName("back")
	private Boolean back;
	@SerializedName("front")
	private Boolean front;
	@SerializedName("artwork")
	private Boolean artwork;
	@SerializedName("darkened")
	private Boolean darkened;
	@SerializedName("count")
	private Long count;

	public Boolean getBack() {
		return back;
	}

	public void setBack(Boolean back) {
		this.back = back;
	}

	public Boolean getFront() {
		return front;
	}

	public void setFront(Boolean front) {
		this.front = front;
	}

	public Boolean getArtwork() {
		return artwork;
	}

	public void setArtwork(Boolean artwork) {
		this.artwork = artwork;
	}

	public Boolean getDarkened() {
		return darkened;
	}

	public void setDarkened(Boolean darkened) {
		this.darkened = darkened;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

}
