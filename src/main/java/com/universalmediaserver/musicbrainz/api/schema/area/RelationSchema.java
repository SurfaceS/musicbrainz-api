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

/**
 * Relation Schema.
 *
 * @author SurfaceS
 */
public class RelationSchema {

	@SerializedName("type")
	private String type;
	@SerializedName("type-id")
	private String typeId;
	@SerializedName("target")
	private String target;
	@SerializedName("direction")
	private String direction;
	@SerializedName("area")
	private AreaSchema area;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public AreaSchema getArea() {
		return area;
	}

	public void setArea(AreaSchema area) {
		this.area = area;
	}

}
