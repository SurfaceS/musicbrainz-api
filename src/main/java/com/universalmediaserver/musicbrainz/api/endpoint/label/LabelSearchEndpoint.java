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

import com.universalmediaserver.musicbrainz.api.MusicBrainzAPIClient;
import com.universalmediaserver.musicbrainz.api.schema.label.LabelSearchResultsSchema;
import java.util.HashMap;
import java.util.Map;

/**
 * Label Search endpoint.
 *
 * @author SurfaceS
 */
public class LabelSearchEndpoint extends LabelEndpoint {

	private Long limit = 25L;
	private Long offset = 0L;
	private Boolean dismax = false;
	private String unspecified;
	private String alias;
	private String area;
	private String begin;
	private String code;
	private String comment;
	private String country;
	private String end;
	private Boolean ended;
	private String ipi;
	private String isni;
	private String label;
	private String labelaccent;
	private String laid;
	private Long releaseCount;
	private String tag;
	private String type;

	public LabelSearchEndpoint(MusicBrainzAPIClient musicBrainzAPIClient) {
		super(musicBrainzAPIClient);
	}

	/**
	 * @param value (part of) value searched for in the alias and label fields.
	 * @return
	 */
	public LabelSearchEndpoint with(String value) {
		this.unspecified = value;
		return this;
	}

	/**
	 * @param value (part of) any alias attached to the label (diacritics are
	 * ignored)
	 * @return
	 */
	public LabelSearchEndpoint withAlias(String value) {
		this.alias = value;
		return this;
	}

	/**
	 * @param value (part of) the name of the label's main associated area
	 * @return
	 */
	public LabelSearchEndpoint withAreaName(String value) {
		this.area = value;
		return this;
	}

	/**
	 * @param value the label's begin date (e.g. "1980-01-22")
	 * @return
	 */
	public LabelSearchEndpoint withBeginDate(String value) {
		this.begin = value;
		return this;
	}

	/**
	 * @param value the label code for the label (only the numbers, without
	 * "LC")
	 * @return
	 */
	public LabelSearchEndpoint withCode(String value) {
		this.code = value;
		return this;
	}

	/**
	 * @param value (part of) the label' disambiguation comment
	 * @return
	 */
	public LabelSearchEndpoint withComment(String value) {
		this.comment = value;
		return this;
	}

	/**
	 * @param value the 2-letter code (ISO 3166-1 alpha-2) for the label's
	 * associated country
	 * @return
	 */
	public LabelSearchEndpoint withCountry(String value) {
		this.country = value;
		return this;
	}

	/**
	 * @param value the label's end date (e.g. "1980-01-22")
	 * @return
	 */
	public LabelSearchEndpoint withEndDate(String value) {
		this.end = value;
		return this;
	}

	/**
	 * @param value a boolean flag (true/false) indicating whether or not the
	 * label has ended (is dissolved)
	 * @return
	 */
	public LabelSearchEndpoint withEnded(Boolean value) {
		this.ended = value;
		return this;
	}

	/**
	 * @param value an IPI code associated with the label
	 * @return
	 */
	public LabelSearchEndpoint withIPI(String value) {
		this.ipi = value;
		return this;
	}

	/**
	 * @param value an ISNI code associated with the label
	 * @return
	 */
	public LabelSearchEndpoint withISNI(String value) {
		this.isni = value;
		return this;
	}

	/**
	 * @param value (part of) the label's name (diacritics are ignored)
	 * @return
	 */
	public LabelSearchEndpoint withName(String value) {
		this.label = value;
		return this;
	}

	/**
	 * @param value (part of) the label' name (with the specified diacritics)
	 * @return
	 */
	public LabelSearchEndpoint withAccentedName(String value) {
		this.labelaccent = value;
		return this;
	}

	/**
	 * @param value the label's MBID
	 * @return
	 */
	public LabelSearchEndpoint withLabelId(String value) {
		this.laid = value;
		return this;
	}

	/**
	 * @param value the amount of releases related to the label
	 * @return
	 */
	public LabelSearchEndpoint withReleaseCount(Long value) {
		this.releaseCount = value;
		return this;
	}

	/**
	 * @param value (part of) a tag attached to the label
	 * @return
	 */
	public LabelSearchEndpoint withTag(String value) {
		this.tag = value;
		return this;
	}

	/**
	 * @param value the place's type
	 * @return
	 */
	public LabelSearchEndpoint withType(String value) {
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
	public LabelSearchEndpoint setLimit(Long value) {
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
	public LabelSearchEndpoint setOffset(Long value) {
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
	public LabelSearchEndpoint setdismax(Boolean value) {
		this.dismax = value;
		return this;
	}

	/**
	 * Search for labels.
	 *
	 * @return Label Results
	 */
	public LabelSearchResultsSchema getResults() {
		Map<String, String> search = new HashMap<>();
		addQueryLuceneString(search, "", unspecified);
		addQueryLuceneString(search, SEARCH_ALIAS, alias);
		addQueryLuceneString(search, SEARCH_AREA, area);
		addQueryLuceneString(search, SEARCH_BEGIN, begin);
		addQueryLuceneString(search, SEARCH_CODE, code);
		addQueryLuceneString(search, SEARCH_COMMENT, comment);
		addQueryLuceneString(search, SEARCH_COUNTRY, country);
		addQueryLuceneString(search, SEARCH_END, end);
		addQueryBoolean(search, SEARCH_ENDED, ended);
		addQueryLuceneString(search, SEARCH_IPI, ipi);
		addQueryLuceneString(search, SEARCH_ISNI, isni);
		addQueryLuceneString(search, SEARCH_LABEL, label);
		addQueryLuceneString(search, SEARCH_LABEL_ACCENT, labelaccent);
		addQueryString(search, SEARCH_LABEL_ID, laid);
		addQueryNumber(search, SEARCH_RELEASE_COUNT, releaseCount);
		addQueryLuceneString(search, SEARCH_TAG, tag);
		addQueryString(search, SEARCH_TYPE, type);
		String searchQuery = getSearchString(search);
		Map<String, String> query = new HashMap<>();
		query.put(QUERY, searchQuery);
		addQueryNumber(query, QUERY_LIMIT, limit, 25L);
		addQueryNumber(query, QUERY_OFFSET, offset, 0L);
		addQueryBoolean(query, QUERY_DISMAX, dismax, false);
		return musicBrainzAPIClient.get(LABEL_ENDPOINT, LabelSearchResultsSchema.class, query);
	}

}
