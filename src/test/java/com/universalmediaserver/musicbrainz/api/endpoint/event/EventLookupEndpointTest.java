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
package com.universalmediaserver.musicbrainz.api.endpoint.event;

import com.universalmediaserver.musicbrainz.api.BaseTestClass;
import com.universalmediaserver.musicbrainz.api.schema.event.EventLookupSchema;
import org.junit.jupiter.api.Test;

/**
 *
 * @author SurfaceS
 */
public class EventLookupEndpointTest extends BaseTestClass {

	static String EVENT_ID = "fe39727a-3d21-4066-9345-3970cbd6cca4";

	public EventLookupEndpointTest() {
	}

	/**
	 * Test of getDetails method, of class EventLookupEndpoint.
	 */
	@Test
	public void testGetDetails() {
		System.out.println("EventLookupEndpoint getDetails");
		EventLookupSchema result = musicBrainzAPIClient.event()
				.lookupFor(EVENT_ID)
				.include(EventLookupInclude.ALIASES)
				.include(EventLookupInclude.ARTIST_RELATIONS)
				.include(EventLookupInclude.PLACE_RELATIONS)
				.getDetails();
		assertParsedObject(result);
	}

}
