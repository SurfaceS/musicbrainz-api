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
package com.universalmediaserver.musicbrainz.api.schema.label;

import com.google.gson.annotations.SerializedName;
import com.universalmediaserver.musicbrainz.api.schema.LifeSpanSchema;
import com.universalmediaserver.musicbrainz.api.schema.alias.AliasSchema;
import com.universalmediaserver.musicbrainz.api.schema.area.AreaSchema;
import com.universalmediaserver.musicbrainz.api.schema.tag.TagExtendedSchema;
import java.util.List;

/**
 * Label Extended Schema.
 *
 * @author SurfaceS
 */
public class LabelExtendedSchema extends LabelSchema {

	@SerializedName("life-span")
	private LifeSpanSchema lifeSpan;
	@SerializedName("area")
	private AreaSchema area;
	@SerializedName("tags")
	private List<TagExtendedSchema> tags;
	@SerializedName("country")
	private String country;
	@SerializedName("aliases")
	private List<AliasSchema> aliases;
	@SerializedName("label-code")
	private Long labelCode;
	@SerializedName("ipis")
	private List<String> ipis;
	@SerializedName("isnis")
	private List<String> isnis;

	public LifeSpanSchema getLifeSpan() {
		return lifeSpan;
	}

	public void setLifeSpan(LifeSpanSchema lifeSpan) {
		this.lifeSpan = lifeSpan;
	}

	public AreaSchema getArea() {
		return area;
	}

	public void setArea(AreaSchema area) {
		this.area = area;
	}

	public List<TagExtendedSchema> getTags() {
		return tags;
	}

	public void setTags(List<TagExtendedSchema> tags) {
		this.tags = tags;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<AliasSchema> getAliases() {
		return aliases;
	}

	public void setAliases(List<AliasSchema> aliases) {
		this.aliases = aliases;
	}

	public Long getLabelCode() {
		return labelCode;
	}

	public void setLabelCode(Long labelCode) {
		this.labelCode = labelCode;
	}

	public List<String> getIpis() {
		return ipis;
	}

	public void setIpis(List<String> ipis) {
		this.ipis = ipis;
	}

	public List<String> getIsnis() {
		return isnis;
	}

	public void setIsnis(List<String> isnis) {
		this.isnis = isnis;
	}

}
