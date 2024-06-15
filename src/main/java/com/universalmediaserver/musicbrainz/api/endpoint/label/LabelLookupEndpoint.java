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
package com.universalmediaserver.musicbrainz.api.endpoint.label;

import com.universalmediaserver.musicbrainz.api.MusicBrainzAPIClient;
import com.universalmediaserver.musicbrainz.api.schema.label.LabelExtendedSchema;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Label Lookup endpoint.
 *
 * @author SurfaceS
 */
public class LabelLookupEndpoint extends LabelEndpoint {

	private final String musicBrainzId;
	private final List<LabelLookupInclude> included = new ArrayList<>();

	public LabelLookupEndpoint(MusicBrainzAPIClient musicBrainzAPIClient, String musicBrainzId) {
		super(musicBrainzAPIClient);
		this.musicBrainzId = musicBrainzId;
	}

	public LabelLookupEndpoint include(LabelLookupInclude... values) {
		if (values != null) {
			for (LabelLookupInclude value : values) {
				if (!included.contains(value)) {
					included.add(value);
				}
			}
		}
		return this;
	}

	/**
	 * Get label details.
	 *
	 * @return Label details.
	 */
	public LabelExtendedSchema getDetails() {
		Map<String, String> query = new HashMap<>();
		addQueryEnums(query, QUERY_INCLUDE, included);
		return musicBrainzAPIClient.get(LABEL_ENDPOINT + musicBrainzId, LabelExtendedSchema.class, query);
	}

}
