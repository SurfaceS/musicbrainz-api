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
package com.universalmediaserver.musicbrainz.api.schema.work;

import com.google.gson.annotations.SerializedName;
import com.universalmediaserver.musicbrainz.api.schema.AttributeSchema;
import com.universalmediaserver.musicbrainz.api.schema.RelationSchema;
import com.universalmediaserver.musicbrainz.api.schema.alias.AliasSchema;
import com.universalmediaserver.musicbrainz.api.schema.tag.TagExtendedSchema;
import java.util.List;

/**
 * Work Schema.
 *
 * @author SurfaceS
 */
public class WorkSchema {

	@SerializedName("id")
	private String id;
	@SerializedName("title")
	private String title;
	@SerializedName("type")
	private String type;
	@SerializedName("type-id")
	private String typeId;
	@SerializedName("language")
	private String language;
	@SerializedName("languages")
	private List<String> languages;
	@SerializedName("relations")
	private List<RelationSchema> relations;
	@SerializedName("iswcs")
	private List<String> iswcs;
	@SerializedName("attributes")
	private List<AttributeSchema> attributes;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	public List<RelationSchema> getRelations() {
		return relations;
	}

	public void setRelations(List<RelationSchema> relations) {
		this.relations = relations;
	}

	public List<String> getIswcs() {
		return iswcs;
	}

	public void setIswcs(List<String> iswcs) {
		this.iswcs = iswcs;
	}

	public List<AttributeSchema> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<AttributeSchema> attributes) {
		this.attributes = attributes;
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
