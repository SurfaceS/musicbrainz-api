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
import com.universalmediaserver.musicbrainz.api.schema.artist.ArtistSchemaExtended;
import org.junit.jupiter.api.Test;

/**
 *
 * @author SurfaceS
 */
public class ArtistLookupEndpointTest extends BaseTestClass {

	static String ARTIST_ID = "d210bd3e-68db-4987-a714-0214449e361d";

	public ArtistLookupEndpointTest() {
	}

	/**
	 * Test of getDetails method, of class ArtistLookupEndpoint.
	 */
	@Test
	public void testGetDetails() {
		System.out.println("ArtistLookupEndpoint getDetails");
		ArtistSchemaExtended result = musicBrainzAPIClient.artist()
				.lookupFor(ARTIST_ID)
				.include(ArtistLookupInclude.ALIASES)
				.getDetails();
		assertParsedObject(result);
	}

}
