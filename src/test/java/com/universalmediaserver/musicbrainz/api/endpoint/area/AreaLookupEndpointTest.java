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
package com.universalmediaserver.musicbrainz.api.endpoint.area;

import com.universalmediaserver.musicbrainz.api.BaseTestClass;
import com.universalmediaserver.musicbrainz.api.schema.area.AreaSchema;
import org.junit.jupiter.api.Test;

/**
 *
 * @author SurfaceS
 */
public class AreaLookupEndpointTest extends BaseTestClass {

	static String AREA_ID = "2db42837-c832-3c27-b4a3-08198f75693c";

	public AreaLookupEndpointTest() {
	}

	/**
	 * Test of getDetails method, of class AreaLookupEndpoint.
	 */
	@Test
	public void testGetDetails() {
		System.out.println("AreaLookupEndpoint getDetails");
		AreaSchema result = musicBrainzAPIClient.area()
				.lookupFor(AREA_ID)
				.include(AreaLookupInclude.ALIASES)
				.getDetails();
		assertParsedObject(result);
	}

}
