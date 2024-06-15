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
package com.universalmediaserver.musicbrainz.api.endpoint.release_group;

import com.universalmediaserver.musicbrainz.api.BaseTestClass;
import com.universalmediaserver.musicbrainz.api.schema.release_group.ReleaseGroupSchema;
import org.junit.jupiter.api.Test;

/**
 *
 * @author SurfaceS
 */
public class ReleaseGroupLookupEndpointTest extends BaseTestClass {

	static String RELEASE_GROUP_ID = "c9fdb94c-4975-4ed6-a96f-ef6d80bb7738";

	public ReleaseGroupLookupEndpointTest() {
	}

	/**
	 * Test of getDetails method, of class ReleaseGroupLookupEndpoint.
	 */
	@Test
	public void testGetDetails() {
		System.out.println("ReleaseGroupLookupEndpoint getDetails");
		ReleaseGroupSchema result = musicBrainzAPIClient.releaseGroup()
				.lookupFor(RELEASE_GROUP_ID)
				.include(ReleaseGroupLookupInclude.ARTIST_CREDITS)
				.include(ReleaseGroupLookupInclude.RECORDING)
				.getDetails();
		assertParsedObject(result);
	}

}
