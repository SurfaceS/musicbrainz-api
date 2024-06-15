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
package com.universalmediaserver.musicbrainz.api.endpoint.annotation;

import com.universalmediaserver.musicbrainz.api.BaseTestClass;
import com.universalmediaserver.musicbrainz.api.schema.annotation.AnnotationSearchResultsSchema;
import org.junit.jupiter.api.Test;

/**
 *
 * @author SurfaceS
 */
public class AnnotationSearchEndpointTest extends BaseTestClass {

	static String ENTITY_ID = "bdb24cb5-404b-4f60-bba4-7b730325ae47";
	static String SEARCH = "Pieds nus";

	public AnnotationSearchEndpointTest() {
	}

	/**
	 * Test of getResults method, of class AnnotationSearchEndpoint.
	 */
	@Test
	public void testGetResults() {
		System.out.println("AnnotationSearchEndpoint getResults");
		AnnotationSearchResultsSchema result = musicBrainzAPIClient.annotation().search()
				.with(SEARCH)
				.withEntityId(ENTITY_ID)
				.getResults();
		assertParsedObject(result);
	}

}
