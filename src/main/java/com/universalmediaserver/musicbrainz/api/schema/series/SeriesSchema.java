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
package com.universalmediaserver.musicbrainz.api.schema.series;

import com.google.gson.annotations.SerializedName;
import com.universalmediaserver.musicbrainz.api.schema.alias.AliasSchema;
import com.universalmediaserver.musicbrainz.api.schema.tag.TagExtendedSchema;
import java.util.List;

/**
 * Series Schema.
 *
 * @author SurfaceS
 */
public class SeriesSchema {

	@SerializedName("id")
	private String id;
	@SerializedName("name")
	private String name;
	@SerializedName("type")
	private String type;
	@SerializedName("type-id")
	private String typeId;
	@SerializedName("disambiguation")
	private String disambiguation;
	@SerializedName("tags")
	private List<TagExtendedSchema> tags;
	@SerializedName("aliases")
	private List<AliasSchema> aliases;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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

	public String getDisambiguation() {
		return disambiguation;
	}

	public void setDisambiguation(String disambiguation) {
		this.disambiguation = disambiguation;
	}

	public List<TagExtendedSchema> getTags() {
		return tags;
	}

	public void setTags(List<TagExtendedSchema> tags) {
		this.tags = tags;
	}

	public List<AliasSchema> getAliases() {
		return aliases;
	}

	public void setAliases(List<AliasSchema> aliases) {
		this.aliases = aliases;
	}

}
