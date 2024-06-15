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
package com.universalmediaserver.musicbrainz.api.endpoint.place;

import com.universalmediaserver.musicbrainz.api.MusicBrainzAPIClient;
import com.universalmediaserver.musicbrainz.api.endpoint.Endpoint;

/**
 * Place endpoint.
 *
 * @author SurfaceS
 */
public class PlaceEndpoint extends Endpoint {

	protected static final String PLACE_ENDPOINT = "place/";

	public PlaceEndpoint(MusicBrainzAPIClient musicBrainzAPIClient) {
		super(musicBrainzAPIClient);
	}

	public PlaceLookupEndpoint lookupFor(String musicBrainzId) {
		return new PlaceLookupEndpoint(musicBrainzAPIClient, musicBrainzId);
	}

	public PlaceSearchEndpoint search() {
		return new PlaceSearchEndpoint(musicBrainzAPIClient);
	}

}
