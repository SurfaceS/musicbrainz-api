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

import com.universalmediaserver.musicbrainz.api.MusicBrainzAPIClient;
import com.universalmediaserver.musicbrainz.api.schema.event.EventSearchResultsSchema;
import java.util.HashMap;
import java.util.Map;

/**
 * Event Search endpoint.
 *
 * @author SurfaceS
 */
public class EventSearchEndpoint extends EventEndpoint {

	private Long limit = 25L;
	private Long offset = 0L;
	private Boolean dismax = false;
	private String unspecified;
	private String alias;
	private String aid;
	private String area;
	private String arid;
	private String artist;
	private String begin;
	private String comment;
	private String end;
	private Boolean ended;
	private String eid;
	private String event;
	private String eventaccent;
	private String pid;
	private String place;
	private String tag;
	private String type;

	public EventSearchEndpoint(MusicBrainzAPIClient musicBrainzAPIClient) {
		super(musicBrainzAPIClient);
	}

	/**
	 * @param value (part of) value searched for in the alias, artist and event
	 * fields.
	 * @return
	 */
	public EventSearchEndpoint with(String value) {
		this.unspecified = value;
		return this;
	}

	/**
	 * @param value (part of) any alias attached to the event (diacritics are
	 * ignored)
	 * @return
	 */
	public EventSearchEndpoint withAlias(String value) {
		this.alias = value;
		return this;
	}

	/**
	 * @param value the MBID of an area related to the event
	 * @return
	 */
	public EventSearchEndpoint withAreaId(String value) {
		this.aid = value;
		return this;
	}

	/**
	 * @param value (part of) the name of an area related to the event
	 * @return
	 */
	public EventSearchEndpoint withAreaName(String value) {
		this.area = value;
		return this;
	}

	/**
	 * @param value the MBID of an artist related to the event
	 * @return
	 */
	public EventSearchEndpoint withArtistId(String value) {
		this.arid = value;
		return this;
	}

	/**
	 * @param value (part of) the name of an artist related to the event
	 * @return
	 */
	public EventSearchEndpoint withArtistName(String value) {
		this.artist = value;
		return this;
	}

	/**
	 * @param value the event's begin date (e.g. "1980-01-22")
	 * @return
	 */
	public EventSearchEndpoint withBeginDate(String value) {
		this.begin = value;
		return this;
	}

	/**
	 * @param value (part of) the event's disambiguation comment
	 * @return
	 */
	public EventSearchEndpoint withComment(String value) {
		this.comment = value;
		return this;
	}

	/**
	 * @param value the event's end date (e.g. "1980-01-22")
	 * @return
	 */
	public EventSearchEndpoint withEndDate(String value) {
		this.end = value;
		return this;
	}

	/**
	 * @param value a boolean flag (true/false) indicating whether or not the
	 * event has an end date set
	 * @return
	 */
	public EventSearchEndpoint withEnded(Boolean value) {
		this.ended = value;
		return this;
	}

	/**
	 * @param value the MBID of the event
	 * @return
	 */
	public EventSearchEndpoint withEventId(String value) {
		this.eid = value;
		return this;
	}

	/**
	 * @param value (part of) the event's name (diacritics are ignored)
	 * @return
	 */
	public EventSearchEndpoint withName(String value) {
		this.event = value;
		return this;
	}

	/**
	 * @param value (part of) the event's name (with the specified diacritics)
	 * @return
	 */
	public EventSearchEndpoint withAccentedName(String value) {
		this.eventaccent = value;
		return this;
	}

	/**
	 * @param value the MBID of a place related to the event
	 * @return
	 */
	public EventSearchEndpoint withPlaceId(String value) {
		this.pid = value;
		return this;
	}

	/**
	 * @param value (part of) the name of a place related to the event
	 * @return
	 */
	public EventSearchEndpoint withPlaceName(String value) {
		this.place = value;
		return this;
	}

	/**
	 * @param value (part of) a tag attached to the event
	 * @return
	 */
	public EventSearchEndpoint withTag(String value) {
		this.tag = value;
		return this;
	}

	/**
	 * @param value the event's type
	 * @return
	 */
	public EventSearchEndpoint withType(String value) {
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
	public EventSearchEndpoint setLimit(Long value) {
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
	public EventSearchEndpoint setOffset(Long value) {
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
	public EventSearchEndpoint setdismax(Boolean value) {
		this.dismax = value;
		return this;
	}

	/**
	 * Search for an event.
	 *
	 * @return Event Results
	 */
	public EventSearchResultsSchema getResults() {
		Map<String, String> search = new HashMap<>();
		addQueryLuceneString(search, "", unspecified);
		addQueryLuceneString(search, SEARCH_ALIAS, alias);
		addQueryLuceneString(search, SEARCH_AREA_ID, aid);
		addQueryLuceneString(search, SEARCH_AREA, area);
		addQueryLuceneString(search, SEARCH_ARTIST_ID, arid);
		addQueryLuceneString(search, SEARCH_ARTIST, artist);
		addQueryLuceneString(search, SEARCH_BEGIN, begin);
		addQueryLuceneString(search, SEARCH_COMMENT, comment);
		addQueryLuceneString(search, SEARCH_END, end);
		addQueryBoolean(search, SEARCH_ENDED, ended);
		addQueryString(search, SEARCH_EVENT_ID, eid);
		addQueryLuceneString(search, SEARCH_EVENT, event);
		addQueryLuceneString(search, SEARCH_EVENT_ACCENT, eventaccent);
		addQueryString(search, SEARCH_PLACE_ID, pid);
		addQueryLuceneString(search, SEARCH_PLACE, place);
		addQueryLuceneString(search, SEARCH_TAG, tag);
		addQueryString(search, SEARCH_TYPE, type);
		String searchQuery = getSearchString(search);
		Map<String, String> query = new HashMap<>();
		query.put(QUERY, searchQuery);
		addQueryNumber(query, QUERY_LIMIT, limit, 25L);
		addQueryNumber(query, QUERY_OFFSET, offset, 0L);
		addQueryBoolean(query, QUERY_DISMAX, dismax, false);
		return musicBrainzAPIClient.get(EVENT_ENDPOINT, EventSearchResultsSchema.class, query);
	}

}
