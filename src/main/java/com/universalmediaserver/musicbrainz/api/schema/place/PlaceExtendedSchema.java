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
import com.universalmediaserver.musicbrainz.api.schema.alias.AliasSchema;
import java.util.List;

/**
 * Place Extended Schema.
 *
 * @author SurfaceS
 */
public class PlaceExtendedSchema extends PlaceSchema {

	@SerializedName("aliases")
	private List<AliasSchema> aliases;
	@SerializedName("life-span")
	private LifeSpanSchema lifeSpan;

	public List<AliasSchema> getAliases() {
		return aliases;
	}

	public void setAliases(List<AliasSchema> aliases) {
		this.aliases = aliases;
	}

	public LifeSpanSchema getLifeSpan() {
		return lifeSpan;
	}

	public void setLifeSpan(LifeSpanSchema lifeSpan) {
		this.lifeSpan = lifeSpan;
	}

}
