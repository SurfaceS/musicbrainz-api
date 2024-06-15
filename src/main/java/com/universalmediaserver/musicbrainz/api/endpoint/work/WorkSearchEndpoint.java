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

import com.universalmediaserver.musicbrainz.api.MusicBrainzAPIClient;
import com.universalmediaserver.musicbrainz.api.schema.work.WorkSearchResultsSchema;
import java.util.HashMap;
import java.util.Map;

/**
 * Work Search endpoint.
 *
 * @author SurfaceS
 */
public class WorkSearchEndpoint extends WorkEndpoint {

	private Long limit = 25L;
	private Long offset = 0L;
	private Boolean dismax = false;
	private String unspecified;
	private String alias;
	private String arid;
	private String artist;
	private String comment;
	private String iswc;
	private String lang;
	private String recording;
	private Long recordingCount;
	private String rid;
	private String tag;
	private String type;
	private String wid;
	private String work;
	private String workaccent;

	public WorkSearchEndpoint(MusicBrainzAPIClient musicBrainzAPIClient) {
		super(musicBrainzAPIClient);
	}

	/**
	 * @param value (part of) value searched for in the alias and work fields.
	 * @return
	 */
	public WorkSearchEndpoint with(String value) {
		this.unspecified = value;
		return this;
	}

	/**
	 * @param value (part of) any alias attached to the work (diacritics are
	 * ignored)
	 * @return
	 */
	public WorkSearchEndpoint withAlias(String value) {
		this.alias = value;
		return this;
	}

	/**
	 * @param value the MBID of an artist related to the work (e.g. a composer
	 * or lyricist)
	 * @return
	 */
	public WorkSearchEndpoint withArtistId(String value) {
		this.arid = value;
		return this;
	}

	/**
	 * @param value (part of) the name of an artist related to the work (e.g. a
	 * composer or lyricist)
	 * @return
	 */
	public WorkSearchEndpoint withArtistName(String value) {
		this.artist = value;
		return this;
	}

	/**
	 * @param value (part of) the work's disambiguation comment
	 * @return
	 */
	public WorkSearchEndpoint withComment(String value) {
		this.comment = value;
		return this;
	}

	/**
	 * @param value any ISWC associated to the work
	 * @return
	 */
	public WorkSearchEndpoint withISWC(String value) {
		this.iswc = value;
		return this;
	}

	/**
	 * @param value the ISO 639-3 code for any of the languages of the work's
	 * lyrics
	 * @return
	 */
	public WorkSearchEndpoint withLanguage(String value) {
		this.lang = value;
		return this;
	}

	/**
	 * @param value (part of) the title of a recording related to the work
	 * @return
	 */
	public WorkSearchEndpoint withRecordingTitle(String value) {
		this.recording = value;
		return this;
	}

	/**
	 * @param value the number of recordings related to the work
	 * @return
	 */
	public WorkSearchEndpoint withRecordingCount(Long value) {
		this.recordingCount = value;
		return this;
	}

	/**
	 * @param value the MBID of a recording related to the work
	 * @return
	 */
	public WorkSearchEndpoint withRecordingId(String value) {
		this.rid = value;
		return this;
	}

	/**
	 * @param value (part of) a tag attached to the work
	 * @return
	 */
	public WorkSearchEndpoint withTag(String value) {
		this.tag = value;
		return this;
	}

	/**
	 * @param value the work's type (e.g. "opera", "song", "symphony")
	 * @return
	 */
	public WorkSearchEndpoint withType(String value) {
		this.type = value;
		return this;
	}

	/**
	 * @param value the work's MBID
	 * @return
	 */
	public WorkSearchEndpoint withWorkId(String value) {
		this.wid = value;
		return this;
	}

	/**
	 * @param value (part of) the work's title (diacritics are ignored)
	 * @return
	 */
	public WorkSearchEndpoint withTitle(String value) {
		this.work = value;
		return this;
	}

	/**
	 * @param value (part of) the work's title (with the specified diacritics)
	 * @return
	 */
	public WorkSearchEndpoint withAccentedTitle(String value) {
		this.workaccent = value;
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
	public WorkSearchEndpoint setLimit(Long value) {
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
	public WorkSearchEndpoint setOffset(Long value) {
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
	public WorkSearchEndpoint setdismax(Boolean value) {
		this.dismax = value;
		return this;
	}

	/**
	 * Search for works.
	 *
	 * @return Work Results
	 */
	public WorkSearchResultsSchema getResults() {
		Map<String, String> search = new HashMap<>();
		addQueryLuceneString(search, "", unspecified);
		addQueryLuceneString(search, SEARCH_ALIAS, alias);
		addQueryLuceneString(search, SEARCH_ARTIST_ID, arid);
		addQueryLuceneString(search, SEARCH_ARTIST, artist);
		addQueryLuceneString(search, SEARCH_COMMENT, comment);
		addQueryLuceneString(search, SEARCH_ISWC, iswc);
		addQueryLuceneString(search, SEARCH_LANGUAGE, lang);
		addQueryLuceneString(search, SEARCH_RECORDING, recording);
		addQueryNumber(search, SEARCH_RECORDING_COUNT, recordingCount);
		addQueryLuceneString(search, SEARCH_RECORDING_ID, rid);
		addQueryLuceneString(search, SEARCH_TAG, tag);
		addQueryString(search, SEARCH_TYPE, type);
		addQueryLuceneString(search, SEARCH_WORK, work);
		addQueryLuceneString(search, SEARCH_WORK_ACCENT, workaccent);
		addQueryString(search, SEARCH_WORK_ID, wid);
		String searchQuery = getSearchString(search);
		Map<String, String> query = new HashMap<>();
		query.put(QUERY, searchQuery);
		addQueryNumber(query, QUERY_LIMIT, limit, 25L);
		addQueryNumber(query, QUERY_OFFSET, offset, 0L);
		addQueryBoolean(query, QUERY_DISMAX, dismax, false);
		return musicBrainzAPIClient.get(WORK_ENDPOINT, WorkSearchResultsSchema.class, query);
	}

}
