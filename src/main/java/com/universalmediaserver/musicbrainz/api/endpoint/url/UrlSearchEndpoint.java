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
package com.universalmediaserver.musicbrainz.api.endpoint.url;

import com.universalmediaserver.musicbrainz.api.MusicBrainzAPIClient;
import com.universalmediaserver.musicbrainz.api.schema.url.UrlSearchResultsSchema;
import java.util.HashMap;
import java.util.Map;

/**
 * Url Search endpoint.
 *
 * @author SurfaceS
 */
public class UrlSearchEndpoint extends UrlEndpoint {

	private Long limit = 25L;
	private Long offset = 0L;
	private Boolean dismax = false;
	private String relationtype;
	private String targetid;
	private String targettype;
	private String uid;
	private String url;
	private String urlAncestor;
	private String urlDescendent;

	public UrlSearchEndpoint(MusicBrainzAPIClient musicBrainzAPIClient) {
		super(musicBrainzAPIClient);
	}

	/**
	 * @param value the type of a relationship the URL is in (e.g. "wikidata")
	 * @return
	 */
	public UrlSearchEndpoint withRelationType(String value) {
		this.relationtype = value;
		return this;
	}

	/**
	 * @param value an entity type related to the URL (e.g. "artist")
	 * @return
	 */
	public UrlSearchEndpoint withTargetId(String value) {
		this.targettype = value;
		return this;
	}

	/**
	 * @param value the MBID of an entity related to the URL
	 * @return
	 */
	public UrlSearchEndpoint withTargetType(String value) {
		this.targetid = value;
		return this;
	}

	/**
	 * @param value the URL's MBID
	 * @return
	 */
	public UrlSearchEndpoint withUrlId(String value) {
		this.uid = value;
		return this;
	}

	/**
	 * @param value the actual URL string
	 * @return
	 */
	public UrlSearchEndpoint withUrl(String value) {
		this.url = value;
		return this;
	}

	/**
	 * @param value the actual URL string, but also returns any ancestor paths (e.g. "https://example.org/some/stuff" will match "https://example.org/some")
	 * @return
	 */
	public UrlSearchEndpoint withUrlAncestor(String value) {
		this.urlAncestor = value;
		return this;
	}

	/**
	 * @param value the actual URL string, but also returns any descendant paths (e.g. "https://example.org/some/stuff" will match "https://example.org/some/stuff/here")
	 * @return
	 */
	public UrlSearchEndpoint withUrlDescendent(String value) {
		this.urlDescendent = value;
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
	public UrlSearchEndpoint setLimit(Long value) {
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
	public UrlSearchEndpoint setOffset(Long value) {
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
	public UrlSearchEndpoint setdismax(Boolean value) {
		this.dismax = value;
		return this;
	}

	/**
	 * Search for URLs.
	 *
	 * @return URL Results
	 */
	public UrlSearchResultsSchema getResults() {
		Map<String, String> search = new HashMap<>();
		addQueryString(search, SEARCH_RELATION_TYPE, relationtype);
		addQueryString(search, SEARCH_TARGET_ID, targetid);
		addQueryString(search, SEARCH_TARGET_TYPE, targettype);
		addQueryString(search, SEARCH_URL_ID, uid);
		addQueryLuceneString(search, SEARCH_URL, url);
		addQueryLuceneString(search, SEARCH_URL_ANCESTOR, urlAncestor);
		addQueryLuceneString(search, SEARCH_URL_DESCENDENT, urlDescendent);
		String searchQuery = getSearchString(search);
		Map<String, String> query = new HashMap<>();
		query.put(QUERY, searchQuery);
		addQueryNumber(query, QUERY_LIMIT, limit, 25L);
		addQueryNumber(query, QUERY_OFFSET, offset, 0L);
		addQueryBoolean(query, QUERY_DISMAX, dismax, false);
		return musicBrainzAPIClient.get(URL_ENDPOINT, UrlSearchResultsSchema.class, query);
	}

}
