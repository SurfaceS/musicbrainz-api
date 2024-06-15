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
import com.universalmediaserver.musicbrainz.api.schema.release.ReleaseSearchResultsSchema;
import org.junit.jupiter.api.Test;

/**
 *
 * @author SurfaceS
 */
public class SearchReleaseEndpointTest extends BaseTestClass {

	static String TITLE = "Autumntunes";

	public SearchReleaseEndpointTest() {
	}

	/**
	 * Test of getResults method, of class ReleaseSearchEndpoint.
	 */
	@Test
	public void testGetResults() {
		System.out.println("SearchReleaseEndpoint getResults");
		ReleaseSearchResultsSchema result = musicBrainzAPIClient.release().search().withTitle(TITLE).getResults();
		assertParsedObject(result);
	}

}
