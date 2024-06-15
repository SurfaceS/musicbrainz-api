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
package com.universalmediaserver.musicbrainz.api.endpoint.artist;

import com.universalmediaserver.musicbrainz.api.BaseTestClass;
import com.universalmediaserver.musicbrainz.api.schema.artist.ArtistSearchResultsSchema;
import org.junit.jupiter.api.Test;

/**
 *
 * @author SurfaceS
 */
public class ArtistSearchEndpointTest extends BaseTestClass {

	static String NAME = "TOKIO";

	public ArtistSearchEndpointTest() {
	}

	/**
	 * Test of getResults method, of class ArtistSearchEndpoint.
	 */
	@Test
	public void testGetResults() {
		System.out.println("ArtistSearchEndpoint getResults");
		ArtistSearchResultsSchema result = musicBrainzAPIClient.artist().search().withName(NAME).getResults();
		assertParsedObject(result);
	}

}
