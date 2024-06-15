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
package com.universalmediaserver.musicbrainz.api.schema.event;

import com.google.gson.annotations.SerializedName;
import com.universalmediaserver.musicbrainz.api.schema.LifeSpanSchema;
import com.universalmediaserver.musicbrainz.api.schema.RelationSchema;
import com.universalmediaserver.musicbrainz.api.schema.alias.AliasSchema;
import java.util.List;

/**
 * Event Schema.
 *
 * @author SurfaceS
 */
public class EventSchema {

	@SerializedName("id")
	private String id;
	@SerializedName("name")
	private String name;
	@SerializedName("type")
	private String type;
	@SerializedName("type-id")
	private String typeId;
	@SerializedName("life-span")
	private LifeSpanSchema lifeSpan;
	@SerializedName("time")
	private String time;
	@SerializedName("relations")
	private List<RelationSchema> relations;
	@SerializedName("aliases")
	private List<AliasSchema> aliases;
	@SerializedName("disambiguation")
	private String disambiguation;

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

	public LifeSpanSchema getLifeSpan() {
		return lifeSpan;
	}

	public void setLifeSpan(LifeSpanSchema lifeSpan) {
		this.lifeSpan = lifeSpan;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public List<RelationSchema> getRelations() {
		return relations;
	}

	public void setRelations(List<RelationSchema> relations) {
		this.relations = relations;
	}

	public List<AliasSchema> getAliases() {
		return aliases;
	}

	public void setAliases(List<AliasSchema> aliases) {
		this.aliases = aliases;
	}

	public String getDisambiguation() {
		return disambiguation;
	}

	public void setDisambiguation(String disambiguation) {
		this.disambiguation = disambiguation;
	}

}
