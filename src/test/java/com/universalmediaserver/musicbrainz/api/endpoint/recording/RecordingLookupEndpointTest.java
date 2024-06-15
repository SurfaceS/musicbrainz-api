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
package com.universalmediaserver.musicbrainz.api.endpoint.recording;

import com.universalmediaserver.musicbrainz.api.BaseTestClass;
import com.universalmediaserver.musicbrainz.api.schema.recording.RecordingLookupSchema;
import org.junit.jupiter.api.Test;

/**
 *
 * @author SurfaceS
 */
public class RecordingLookupEndpointTest extends BaseTestClass {

	static String RECORDING_ID = "b9ad642e-b012-41c7-b72a-42cf4911f9ff";

	public RecordingLookupEndpointTest() {
	}

	/**
	 * Test of getDetails method, of class RecordingLookupEndpoint.
	 */
	@Test
	public void testGetDetails() {
		System.out.println("RecordingLookupEndpoint getDetails");
		RecordingLookupSchema result = musicBrainzAPIClient.recording()
				.lookupFor(RECORDING_ID)
				.include(RecordingLookupInclude.ARTIST_CREDIT)
				.include(RecordingLookupInclude.RELEASES)
				.include(RecordingLookupInclude.ISRCS)
				.getDetails();
		assertParsedObject(result);
	}

}
