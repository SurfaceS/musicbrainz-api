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
package com.universalmediaserver.musicbrainz.api.schema;

import com.google.gson.annotations.SerializedName;

/**
 * MusicBrainz API Response Schema.
 *
 * @author SurfaceS
 */
public class SearchResultsSchema {

	@SerializedName("created")
	private String created;
	@SerializedName("count")
	private Long count;
	@SerializedName("offset")
	private Long offset;

	public String getCreated() {
		return created;
	}

	public Long getCount() {
		return count;
	}

	public Long getOffset() {
		return offset;
	}

	public void setCreated(String value) {
		this.created = value;
	}

	public void setCount(Long value) {
		this.count = value;
	}

	public void setOffset(Long value) {
		this.offset = value;
	}

}
