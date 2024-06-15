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
package com.universalmediaserver.musicbrainz.api.endpoint.tag;

import com.universalmediaserver.musicbrainz.api.MusicBrainzAPIClient;
import com.universalmediaserver.musicbrainz.api.endpoint.Endpoint;

/**
 * Tag endpoint.
 *
 * @author SurfaceS
 */
public class TagEndpoint extends Endpoint {

	protected static final String TAG_ENDPOINT = "tag/";

	public TagEndpoint(MusicBrainzAPIClient musicBrainzAPIClient) {
		super(musicBrainzAPIClient);
	}

	public TagSearchEndpoint search() {
		return new TagSearchEndpoint(musicBrainzAPIClient);
	}

}
