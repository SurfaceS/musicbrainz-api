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
package com.universalmediaserver.musicbrainz.api.endpoint.instrument;

import com.universalmediaserver.musicbrainz.api.MusicBrainzAPIClient;
import com.universalmediaserver.musicbrainz.api.schema.instrument.InstrumentSearchResultsSchema;
import java.util.HashMap;
import java.util.Map;

/**
 * Instrument Search endpoint.
 *
 * @author SurfaceS
 */
public class InstrumentSearchEndpoint extends InstrumentEndpoint {

	private Long limit = 25L;
	private Long offset = 0L;
	private Boolean dismax = false;
	private String unspecified;
	private String alias;
	private String comment;
	private String description;
	private String iid;
	private String instrument;
	private String instrumentaccent;
	private String tag;
	private String type;

	public InstrumentSearchEndpoint(MusicBrainzAPIClient musicBrainzAPIClient) {
		super(musicBrainzAPIClient);
	}

	/**
	 * @param value (part of) value searched for in the alias, description and
	 * instrument fields.
	 * @return
	 */
	public InstrumentSearchEndpoint with(String value) {
		this.unspecified = value;
		return this;
	}

	/**
	 * @param value (part of) any alias attached to the instrument (diacritics
	 * are ignored)
	 * @return
	 */
	public InstrumentSearchEndpoint withAlias(String value) {
		this.alias = value;
		return this;
	}

	/**
	 * @param value (part of) the instrument' disambiguation comment
	 * @return
	 */
	public InstrumentSearchEndpoint withComment(String value) {
		this.comment = value;
		return this;
	}

	/**
	 * @param value (part of) the description of the instrument (in English)
	 * @return
	 */
	public InstrumentSearchEndpoint withDescription(String value) {
		this.description = value;
		return this;
	}

	/**
	 * @param value (part of) the instrument's name (diacritics are ignored)
	 * @return
	 */
	public InstrumentSearchEndpoint withName(String value) {
		this.instrument = value;
		return this;
	}

	/**
	 * @param value (part of) the instrument's name (with the specified
	 * diacritics)
	 * @return
	 */
	public InstrumentSearchEndpoint withAccentedName(String value) {
		this.instrumentaccent = value;
		return this;
	}

	/**
	 * @param value the MBID of the instrument
	 * @return
	 */
	public InstrumentSearchEndpoint withInstrumentId(String value) {
		this.iid = value;
		return this;
	}

	/**
	 * @param value (part of) a tag attached to the instrument
	 * @return
	 */
	public InstrumentSearchEndpoint withTag(String value) {
		this.tag = value;
		return this;
	}

	/**
	 * @param value the instrument's type
	 * @return
	 */
	public InstrumentSearchEndpoint withType(String value) {
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
	public InstrumentSearchEndpoint setLimit(Long value) {
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
	public InstrumentSearchEndpoint setOffset(Long value) {
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
	public InstrumentSearchEndpoint setdismax(Boolean value) {
		this.dismax = value;
		return this;
	}

	/**
	 * Search for instruments.
	 *
	 * @return Instrument Results
	 */
	public InstrumentSearchResultsSchema getResults() {
		Map<String, String> search = new HashMap<>();
		addQueryLuceneString(search, "", unspecified);
		addQueryLuceneString(search, SEARCH_ALIAS, alias);
		addQueryLuceneString(search, SEARCH_COMMENT, comment);
		addQueryLuceneString(search, SEARCH_DESCRIPTION, description);
		addQueryString(search, SEARCH_INSTRUMENT_ID, iid);
		addQueryLuceneString(search, SEARCH_INSTRUMENT, instrument);
		addQueryLuceneString(search, SEARCH_INSTRUMENT_ACCENT, instrumentaccent);
		addQueryLuceneString(search, SEARCH_TAG, tag);
		addQueryString(search, SEARCH_TYPE, type);
		String searchQuery = getSearchString(search);
		Map<String, String> query = new HashMap<>();
		query.put(QUERY, searchQuery);
		addQueryNumber(query, QUERY_LIMIT, limit, 25L);
		addQueryNumber(query, QUERY_OFFSET, offset, 0L);
		addQueryBoolean(query, QUERY_DISMAX, dismax, false);
		return musicBrainzAPIClient.get(INSTRUMENT_ENDPOINT, InstrumentSearchResultsSchema.class, query);
	}

}
