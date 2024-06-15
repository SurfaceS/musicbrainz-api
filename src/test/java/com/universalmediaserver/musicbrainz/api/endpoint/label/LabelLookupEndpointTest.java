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
package com.universalmediaserver.musicbrainz.api.endpoint.label;

import com.universalmediaserver.musicbrainz.api.BaseTestClass;
import com.universalmediaserver.musicbrainz.api.schema.label.LabelExtendedSchema;
import org.junit.jupiter.api.Test;

/**
 *
 * @author SurfaceS
 */
public class LabelLookupEndpointTest extends BaseTestClass {

	static String LABEL_ID = "46f0f4cd-8aab-4b33-b698-f459faf64190";

	public LabelLookupEndpointTest() {
	}

	/**
	 * Test of getDetails method, of class LabelLookupEndpoint.
	 */
	@Test
	public void testGetDetails() {
		System.out.println("LabelLookupEndpoint getDetails");
		LabelExtendedSchema result = musicBrainzAPIClient.label()
				.lookupFor(LABEL_ID)
				.include(LabelLookupInclude.ALIASES)
				.getDetails();
		assertParsedObject(result);
	}

}
