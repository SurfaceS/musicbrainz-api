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
package com.universalmediaserver.musicbrainz.api.schema.place;

import com.google.gson.annotations.SerializedName;
import com.universalmediaserver.musicbrainz.api.schema.LifeSpanSchema;

/**
 * Place Search Schema.
 *
 * @author SurfaceS
 */
public class PlaceSearchSchema extends PlaceBaseSchema {

	@SerializedName("score")
	private Long score;
	@SerializedName("coordinates")
	private CoordinatesStringSchema coordinates;
	@SerializedName("life-span")
	private LifeSpanSchema lifeSpan;

	public Long getScore() {
		return score;
	}

	public void setScore(Long score) {
		this.score = score;
	}

	public CoordinatesStringSchema getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(CoordinatesStringSchema coordinates) {
		this.coordinates = coordinates;
	}

	public LifeSpanSchema getLifeSpan() {
		return lifeSpan;
	}

	public void setLifeSpan(LifeSpanSchema lifeSpan) {
		this.lifeSpan = lifeSpan;
	}

}
