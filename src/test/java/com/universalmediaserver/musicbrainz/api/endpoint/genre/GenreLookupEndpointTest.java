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
package com.universalmediaserver.musicbrainz.api.endpoint.genre;

import com.universalmediaserver.musicbrainz.api.BaseTestClass;
import com.universalmediaserver.musicbrainz.api.schema.genre.GenreSchema;
import org.junit.jupiter.api.Test;

/**
 *
 * @author SurfaceS
 */
public class GenreLookupEndpointTest extends BaseTestClass {

	static String GENRE_ID = "f66d7266-eb3d-4ef3-b4d8-b7cd992f918b";

	public GenreLookupEndpointTest() {
	}

	/**
	 * Test of getDetails method, of class GenreLookupEndpoint.
	 */
	@Test
	public void testGetDetails() {
		System.out.println("GenreLookupEndpoint getDetails");
		GenreSchema result = musicBrainzAPIClient.genre()
				.lookupFor(GENRE_ID)
				.getDetails();
		assertParsedObject(result);
	}

}
