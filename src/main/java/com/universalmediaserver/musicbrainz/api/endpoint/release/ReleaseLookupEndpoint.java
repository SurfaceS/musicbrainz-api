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
package com.universalmediaserver.musicbrainz.api.endpoint.release;

import com.universalmediaserver.musicbrainz.api.MusicBrainzAPIClient;
import com.universalmediaserver.musicbrainz.api.schema.release.ReleaseLookupSchema;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Release Lookup endpoint.
 *
 * @author SurfaceS
 */
public class ReleaseLookupEndpoint extends ReleaseEndpoint {

	private final String musicBrainzId;
	private final List<ReleaseLookupInclude> included = new ArrayList<>();

	public ReleaseLookupEndpoint(MusicBrainzAPIClient musicBrainzAPIClient, String musicBrainzId) {
		super(musicBrainzAPIClient);
		this.musicBrainzId = musicBrainzId;
	}

	public ReleaseLookupEndpoint include(ReleaseLookupInclude... values) {
		if (values != null) {
			for (ReleaseLookupInclude value : values) {
				if (!included.contains(value)) {
					included.add(value);
				}
			}
		}
		return this;
	}

	/**
	 * Get release details.
	 *
	 * @return Release details.
	 */
	public ReleaseLookupSchema getDetails() {
		Map<String, String> query = new HashMap<>();
		addQueryEnums(query, QUERY_INCLUDE, included);
		return musicBrainzAPIClient.get(RELEASE_ENDPOINT + musicBrainzId, ReleaseLookupSchema.class, query);
	}

}
