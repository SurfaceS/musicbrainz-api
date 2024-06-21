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

import com.universalmediaserver.musicbrainz.api.BaseTestClass;
import com.universalmediaserver.musicbrainz.api.schema.release.ReleaseLookupSchema;
import org.junit.jupiter.api.Test;

/**
 *
 * @author SurfaceS
 */
public class LookupReleaseEndpointTest extends BaseTestClass {

	static String RELEASE_ID = "6283480c-5004-4da7-993c-69fd7d2f0681";

	public LookupReleaseEndpointTest() {
	}

	/**
	 * Test of getDetails method, of class ReleaseLookupEndpoint.
	 */
	@Test
	public void testGetDetails() {
		System.out.println("LookupReleaseEndpoint getDetails");
		ReleaseLookupSchema result = musicBrainzAPIClient.release()
				.lookupFor(RELEASE_ID)
				.include(ReleaseLookupInclude.ARTIST_CREDITS)
				.include(ReleaseLookupInclude.LABELS)
				.include(ReleaseLookupInclude.DISCIDS)
				.include(ReleaseLookupInclude.RECORDING)
				.include(ReleaseLookupInclude.RELEASE_GROUPS)
				.include(ReleaseLookupInclude.RATINGS)
				.getDetails();
		assertParsedObject(result);
	}

}
