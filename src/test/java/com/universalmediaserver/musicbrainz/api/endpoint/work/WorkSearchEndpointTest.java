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
package com.universalmediaserver.musicbrainz.api.endpoint.work;

import com.universalmediaserver.musicbrainz.api.BaseTestClass;
import com.universalmediaserver.musicbrainz.api.schema.work.WorkSearchResultsSchema;
import org.junit.jupiter.api.Test;

/**
 *
 * @author SurfaceS
 */
public class WorkSearchEndpointTest extends BaseTestClass {

	static String TITLE = "Frozen Fred";

	public WorkSearchEndpointTest() {
	}

	/**
	 * Test of getResults method, of class WorkSearchEndpoint.
	 */
	@Test
	public void testGetResults() {
		System.out.println("WorkSearchEndpoint getResults");
		WorkSearchResultsSchema result = musicBrainzAPIClient.work().search().withTitle(TITLE).getResults();
		assertParsedObject(result);
	}

}
