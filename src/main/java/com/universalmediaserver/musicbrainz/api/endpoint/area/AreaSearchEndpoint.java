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

import com.universalmediaserver.musicbrainz.api.MusicBrainzAPIClient;
import com.universalmediaserver.musicbrainz.api.schema.area.AreaSearchResultsSchema;
import java.util.HashMap;
import java.util.Map;

/**
 * Area Search endpoint.
 *
 * @author SurfaceS
 */
public class AreaSearchEndpoint extends AreaEndpoint {

	private Long limit = 25L;
	private Long offset = 0L;
	private Boolean dismax = false;
	private String unspecified;
	private String aid;
	private String alias;
	private String area;
	private String areaaccent;
	private String begin;
	private String comment;
	private String end;
	private Boolean ended;
	private String iso;
	private String iso1;
	private String iso2;
	private String iso3;
	private String tag;
	private String type;

	public AreaSearchEndpoint(MusicBrainzAPIClient musicBrainzAPIClient) {
		super(musicBrainzAPIClient);
	}

	/**
	 * @param value (part of) the area's name (diacritics are ignored)
	 * @return
	 */
	public AreaSearchEndpoint with(String value) {
		this.unspecified = value;
		return this;
	}

	/**
	 * @param value (part of) the area's name (diacritics are ignored)
	 * @return
	 */
	public AreaSearchEndpoint withName(String value) {
		this.area = value;
		return this;
	}

	/**
	 * @param value (part of) the area's name (with the specified diacritics)
	 * @return
	 */
	public AreaSearchEndpoint withAccentedName(String value) {
		this.areaaccent = value;
		return this;
	}

	/**
	 * @param value the area's MBID
	 * @return
	 */
	public AreaSearchEndpoint withAreaId(String value) {
		this.aid = value;
		return this;
	}

	/**
	 * @param value (part of) any alias attached to the artist (diacritics are
	 * ignored)
	 * @return
	 */
	public AreaSearchEndpoint withAlias(String value) {
		this.alias = value;
		return this;
	}

	/**
	 * @param value the area's begin date (e.g. "1980-01-22")
	 * @return
	 */
	public AreaSearchEndpoint withBeginDate(String value) {
		this.begin = value;
		return this;
	}

	/**
	 * @param value (part of) the area's disambiguation comment
	 * @return
	 */
	public AreaSearchEndpoint withComment(String value) {
		this.comment = value;
		return this;
	}

	/**
	 * @param value the area's end date (e.g. "1980-01-22")
	 * @return
	 */
	public AreaSearchEndpoint withEndDate(String value) {
		this.end = value;
		return this;
	}

	/**
	 * @param value a boolean flag (true/false) indicating whether or not the
	 * area has ended (is no longer current)
	 * @return
	 */
	public AreaSearchEndpoint withEnded(Boolean value) {
		this.ended = value;
		return this;
	}

	/**
	 * @param value an ISO 3166-1, 3166-2 or 3166-3 code attached to the area
	 * @return
	 */
	public AreaSearchEndpoint withIsoCode(String value) {
		this.iso = value;
		return this;
	}

	/**
	 * @param value an ISO 3166-1 code attached to the area
	 * @return
	 */
	public AreaSearchEndpoint withIso1Code(String value) {
		this.iso1 = value;
		return this;
	}

	/**
	 * @param value an ISO 3166-2 code attached to the area
	 * @return
	 */
	public AreaSearchEndpoint withIso2Code(String value) {
		this.iso2 = value;
		return this;
	}

	/**
	 * @param value an ISO 3166-3 code attached to the area
	 * @return
	 */
	public AreaSearchEndpoint withIso3Code(String value) {
		this.iso3 = value;
		return this;
	}

	/**
	 * @param value (part of) a tag attached to the area
	 * @return
	 */
	public AreaSearchEndpoint withTag(String value) {
		this.tag = value;
		return this;
	}

	/**
	 * @param value the area's type
	 * @return
	 */
	public AreaSearchEndpoint withType(String value) {
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
	public AreaSearchEndpoint setLimit(Long value) {
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
	public AreaSearchEndpoint setOffset(Long value) {
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
	public AreaSearchEndpoint setdismax(Boolean value) {
		this.dismax = value;
		return this;
	}

	/**
	 * Search for a area.
	 *
	 * @return Area Results
	 */
	public AreaSearchResultsSchema getResults() {
		Map<String, String> search = new HashMap<>();
		addQueryLuceneString(search, "", unspecified);
		addQueryString(search, SEARCH_AREA_ID, aid);
		addQueryLuceneString(search, SEARCH_ALIAS, alias);
		addQueryLuceneString(search, SEARCH_AREA, area);
		addQueryLuceneString(search, SEARCH_AREA_ACCENT, areaaccent);
		addQueryLuceneString(search, SEARCH_BEGIN, begin);
		addQueryLuceneString(search, SEARCH_COMMENT, comment);
		addQueryLuceneString(search, SEARCH_END, end);
		addQueryBoolean(search, SEARCH_ENDED, ended);
		addQueryLuceneString(search, SEARCH_ISO, iso);
		addQueryLuceneString(search, SEARCH_ISO1, iso1);
		addQueryLuceneString(search, SEARCH_ISO2, iso2);
		addQueryLuceneString(search, SEARCH_ISO3, iso3);
		addQueryLuceneString(search, SEARCH_TAG, tag);
		addQueryString(search, SEARCH_TYPE, type);
		String searchQuery = getSearchString(search);
		Map<String, String> query = new HashMap<>();
		query.put(QUERY, searchQuery);
		addQueryNumber(query, QUERY_LIMIT, limit, 25L);
		addQueryNumber(query, QUERY_OFFSET, offset, 0L);
		addQueryBoolean(query, QUERY_DISMAX, dismax, false);
		return musicBrainzAPIClient.get(AREA_ENDPOINT, AreaSearchResultsSchema.class, query);
	}

}
