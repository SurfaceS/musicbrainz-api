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

import com.universalmediaserver.musicbrainz.api.MusicBrainzAPIClient;
import com.universalmediaserver.musicbrainz.api.schema.annotation.AnnotationSearchResultsSchema;
import java.util.HashMap;
import java.util.Map;

/**
 * Search Annotation endpoint.
 *
 * @author SurfaceS
 */
public class AnnotationSearchEndpoint extends AnnotationEndpoint {

	private Long limit = 25L;
	private Long offset = 0L;
	private Boolean dismax = false;
	private String unspecified;
	private String entity;
	private Long id;
	private String name;
	private String text;
	private String type;

	public AnnotationSearchEndpoint(MusicBrainzAPIClient musicBrainzAPIClient) {
		super(musicBrainzAPIClient);
	}

	/**
	 * Global search
	 *
	 * @param value name, text or type fields
	 * @return
	 */
	public AnnotationSearchEndpoint with(String value) {
		this.unspecified = value;
		return this;
	}

	/**
	 * @param value the annotated entity's MBID
	 * @return
	 */
	public AnnotationSearchEndpoint withEntityId(String value) {
		this.entity = value;
		return this;
	}

	/**
	 * @param value the numeric ID of the annotation (e.g. 703027)
	 * @return
	 */
	public AnnotationSearchEndpoint withId(Long value) {
		this.id = value;
		return this;
	}

	/**
	 * @param value the annotated entity's name or title (diacritics are
	 * ignored)
	 * @return
	 */
	public AnnotationSearchEndpoint withName(String value) {
		this.name = value;
		return this;
	}

	/**
	 * @param value the annotation's content (includes wiki formatting)
	 * @return
	 */
	public AnnotationSearchEndpoint withText(String value) {
		this.text = value;
		return this;
	}

	/**
	 * @param value the annotated entity's entity type
	 * @return
	 */
	public AnnotationSearchEndpoint withType(String value) {
		this.type = value;
		return this;
	}

	/**
	 * @param value A value defining how many entries should be returned.
	 *
	 * Only values between 1 and 100 (both inclusive) are allowed. If not given,
	 * this defaults to 25.
	 *
	 * @return
	 */
	public AnnotationSearchEndpoint setLimit(Long value) {
		if (value != null && value > 0 && value < 101) {
			this.limit = value;
		}
		return this;
	}

	/**
	 * @param value Return search results starting at a given offset.
	 *
	 * Used for paging through more than one page of results.
	 *
	 * @return
	 */
	public AnnotationSearchEndpoint setOffset(Long value) {
		if (value != null && value >= 0) {
			this.offset = value;
		}
		return this;
	}

	/**
	 * @param value If set to "true", switches the Solr query parser from
	 * edismax to dismax, which will escape certain special query syntax
	 * characters by default for ease of use. This is equivalent to switching
	 * from the "Indexed search with advanced query syntax" method to the plain
	 * "Indexed search" method on the website.
	 *
	 * Defaults to "false".
	 *
	 * @return
	 */
	public AnnotationSearchEndpoint setdismax(Boolean value) {
		this.dismax = value;
		return this;
	}

	/**
	 * Search for a area.
	 *
	 * @return Area Results
	 */
	public AnnotationSearchResultsSchema getResults() {
		Map<String, String> search = new HashMap<>();
		addQueryLuceneString(search, "", unspecified);
		addQueryString(search, SEARCH_ENTITY, entity);
		addQueryNumber(search, SEARCH_ID, id);
		addQueryLuceneString(search, SEARCH_NAME, name);
		addQueryLuceneString(search, SEARCH_TEXT, text);
		addQueryString(search, SEARCH_TYPE, type);
		String searchQuery = getSearchString(search);
		Map<String, String> query = new HashMap<>();
		query.put(QUERY, searchQuery);
		addQueryNumber(query, QUERY_LIMIT, limit, 25L);
		addQueryNumber(query, QUERY_OFFSET, offset, 0L);
		addQueryBoolean(query, QUERY_DISMAX, dismax, false);
		return musicBrainzAPIClient.get(ANNOTATION_ENDPOINT, AnnotationSearchResultsSchema.class, query);
	}

}
