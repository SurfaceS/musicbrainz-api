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
package com.universalmediaserver.musicbrainz.api.endpoint.place;

import com.universalmediaserver.musicbrainz.api.MusicBrainzAPIClient;
import com.universalmediaserver.musicbrainz.api.schema.place.PlaceSearchResultsSchema;
import java.util.HashMap;
import java.util.Map;

/**
 * Place Search endpoint.
 *
 * @author SurfaceS
 */
public class PlaceSearchEndpoint extends PlaceEndpoint {

	private Long limit = 25L;
	private Long offset = 0L;
	private Boolean dismax = false;
	private String unspecified;
	private String address;
	private String alias;
	private String area;
	private String begin;
	private String comment;
	private String end;
	private Boolean ended;
	private String latitude;
	private String longitude;
	private String place;
	private String placeaccent;
	private String pid;
	private String type;

	public PlaceSearchEndpoint(MusicBrainzAPIClient musicBrainzAPIClient) {
		super(musicBrainzAPIClient);
	}

	/**
	 * @param value (part of) value searched for in the address, alias, area and
	 * place fields.
	 * @return
	 */
	public PlaceSearchEndpoint with(String value) {
		this.unspecified = value;
		return this;
	}

	/**
	 * @param value (part of) the physical address for this place
	 * @return
	 */
	public PlaceSearchEndpoint withAddress(String value) {
		this.address = value;
		return this;
	}

	/**
	 * @param value (part of) any alias attached to the series (diacritics are
	 * ignored)
	 * @return
	 */
	public PlaceSearchEndpoint withAlias(String value) {
		this.alias = value;
		return this;
	}

	/**
	 * @param value (part of) the name of the place's main associated area
	 * @return
	 */
	public PlaceSearchEndpoint withAreaName(String value) {
		this.area = value;
		return this;
	}

	/**
	 * @param value the place's begin date (e.g. "1980-01-22")
	 * @return
	 */
	public PlaceSearchEndpoint withBeginDate(String value) {
		this.begin = value;
		return this;
	}

	/**
	 * @param value (part of) the series' disambiguation comment
	 * @return
	 */
	public PlaceSearchEndpoint withComment(String value) {
		this.comment = value;
		return this;
	}

	/**
	 * @param value the place's end date (e.g. "1980-01-22")
	 * @return
	 */
	public PlaceSearchEndpoint withEndDate(String value) {
		this.end = value;
		return this;
	}

	/**
	 * @param value a boolean flag (true/false) indicating whether or not the
	 * place has ended (is closed)
	 * @return
	 */
	public PlaceSearchEndpoint withEnded(Boolean value) {
		this.ended = value;
		return this;
	}

	/**
	 * @param value the (WGS 84) latitude of the place's coordinates (e.g.
	 * "58.388226")
	 * @return
	 */
	public PlaceSearchEndpoint withLatitude(String value) {
		this.latitude = value;
		return this;
	}

	/**
	 * @param value the (WGS 84) longitude of the place's coordinates (e.g.
	 * "26.702817")
	 * @return
	 */
	public PlaceSearchEndpoint withLongitude(String value) {
		this.longitude = value;
		return this;
	}

	/**
	 * @param value (part of) the place's name (diacritics are ignored)
	 * @return
	 */
	public PlaceSearchEndpoint withName(String value) {
		this.place = value;
		return this;
	}

	/**
	 * @param value (part of) the place' name (with the specified diacritics)
	 * @return
	 */
	public PlaceSearchEndpoint withAccentedName(String value) {
		this.placeaccent = value;
		return this;
	}

	/**
	 * @param value the place's MBID
	 * @return
	 */
	public PlaceSearchEndpoint withPlaceId(String value) {
		this.pid = value;
		return this;
	}

	/**
	 * @param value the place's type
	 * @return
	 */
	public PlaceSearchEndpoint withType(String value) {
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
	public PlaceSearchEndpoint setLimit(Long value) {
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
	public PlaceSearchEndpoint setOffset(Long value) {
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
	public PlaceSearchEndpoint setdismax(Boolean value) {
		this.dismax = value;
		return this;
	}

	/**
	 * Search for places.
	 *
	 * @return Place Results
	 */
	public PlaceSearchResultsSchema getResults() {
		Map<String, String> search = new HashMap<>();
		addQueryLuceneString(search, "", unspecified);
		addQueryLuceneString(search, SEARCH_ADDRESS, address);
		addQueryLuceneString(search, SEARCH_ALIAS, alias);
		addQueryLuceneString(search, SEARCH_AREA, area);
		addQueryLuceneString(search, SEARCH_BEGIN, begin);
		addQueryLuceneString(search, SEARCH_COMMENT, comment);
		addQueryLuceneString(search, SEARCH_END, end);
		addQueryBoolean(search, SEARCH_ENDED, ended);
		addQueryLuceneString(search, SEARCH_LATITUDE, latitude);
		addQueryLuceneString(search, SEARCH_LONGITUDE, longitude);
		addQueryLuceneString(search, SEARCH_PLACE, place);
		addQueryLuceneString(search, SEARCH_PLACE_ACCENT, placeaccent);
		addQueryString(search, SEARCH_PLACE_ID, pid);
		addQueryString(search, SEARCH_TYPE, type);
		String searchQuery = getSearchString(search);
		Map<String, String> query = new HashMap<>();
		query.put(QUERY, searchQuery);
		addQueryNumber(query, QUERY_LIMIT, limit, 25L);
		addQueryNumber(query, QUERY_OFFSET, offset, 0L);
		addQueryBoolean(query, QUERY_DISMAX, dismax, false);
		return musicBrainzAPIClient.get(PLACE_ENDPOINT, PlaceSearchResultsSchema.class, query);
	}

}
