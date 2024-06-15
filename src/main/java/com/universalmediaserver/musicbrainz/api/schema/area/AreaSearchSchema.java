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
package com.universalmediaserver.musicbrainz.api.schema.area;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Area Search Schema.
 *
 * @author SurfaceS
 */
public class AreaSearchSchema extends AreaSchema {

	@SerializedName("score")
	private Long score;
	@SerializedName("relation-list")
	private List<RelationsSchema> relationList;

	public Long getScore() {
		return score;
	}

	public void setScore(Long score) {
		this.score = score;
	}

	public List<RelationsSchema> getRelationList() {
		return relationList;
	}

	public void setRelationList(List<RelationsSchema> relationList) {
		this.relationList = relationList;
	}

}
