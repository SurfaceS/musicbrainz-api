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
import java.util.List;

/**
 * Release Group Base Schema.
 *
 * @author SurfaceS
 */
public class ReleaseGroupBaseSchema {

	@SerializedName("id")
	private String id;
	@SerializedName("type-id")
	private String typeId;
	@SerializedName("primary-type-id")
	private String primaryTypeId;
	@SerializedName("title")
	private String title;
	@SerializedName("primary-type")
	private String primaryType;
	@SerializedName("secondary-types")
	private List<String> secondaryTypes;
	@SerializedName("secondary-type-ids")
	private List<String> secondaryTypesIds;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getPrimaryTypeId() {
		return primaryTypeId;
	}

	public void setPrimaryTypeId(String primaryTypeId) {
		this.primaryTypeId = primaryTypeId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPrimaryType() {
		return primaryType;
	}

	public void setPrimaryType(String primaryType) {
		this.primaryType = primaryType;
	}

	public List<String> getSecondaryTypes() {
		return secondaryTypes;
	}

	public void setSecondaryTypes(List<String> secondaryTypes) {
		this.secondaryTypes = secondaryTypes;
	}

	public List<String> getSecondaryTypesIds() {
		return secondaryTypesIds;
	}

	public void setSecondaryTypesIds(List<String> secondaryTypesIds) {
		this.secondaryTypesIds = secondaryTypesIds;
	}

}
