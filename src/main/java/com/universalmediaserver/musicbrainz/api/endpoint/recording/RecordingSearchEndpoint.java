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
package com.universalmediaserver.musicbrainz.api.endpoint.recording;

import com.universalmediaserver.musicbrainz.api.MusicBrainzAPIClient;
import com.universalmediaserver.musicbrainz.api.schema.recording.RecordingSearchResultsSchema;
import java.util.HashMap;
import java.util.Map;

/**
 * Recording Search endpoint.
 *
 * @author SurfaceS
 */
public class RecordingSearchEndpoint extends RecordingEndpoint {

	private Long limit = 25L;
	private Long offset = 0L;
	private Boolean dismax = false;
	private String unspecified;
	private String alias;
	private String arid;
	private String artist;
	private String artistname;
	private String comment;
	private String country;
	private String creditname;
	private String date;
	private Long dur;
	private String firstreleasedate;
	private String format;
	private String isrc;
	private String number;
	private Long position;
	private String primarytype;
	private Long qdur;
	private String recording;
	private String recordingaccent;
	private String reid;
	private String release;
	private String rgid;
	private String rid;
	private String secondarytype;
	private String status;
	private String tag;
	private String tid;
	private Long tnum;
	private Long tracks;
	private Long tracksrelease;
	private String type;
	private Boolean video;

	public RecordingSearchEndpoint(MusicBrainzAPIClient musicBrainzAPIClient) {
		super(musicBrainzAPIClient);
	}

	/**
	 * @param value (part of) value searched for in the recording field.
	 * @return
	 */
	public RecordingSearchEndpoint with(String value) {
		this.unspecified = value;
		return this;
	}

	/**
	 * @param value (part of) any alias attached to the recording (diacritics
	 * are ignored)
	 * @return
	 */
	public RecordingSearchEndpoint withAlias(String value) {
		this.alias = value;
		return this;
	}

	/**
	 * @param value the MBID of any of the recording artists
	 * @return
	 */
	public RecordingSearchEndpoint withArtistId(String value) {
		this.arid = value;
		return this;
	}

	/**
	 * @param value (part of) the combined credited artist name for the
	 * recording, including join phrases (e.g. "Artist X feat.")
	 * @return
	 */
	public RecordingSearchEndpoint withArtistCredit(String value) {
		this.artist = value;
		return this;
	}

	/**
	 * @param value (part of) the name of any of the recording artists
	 * @return
	 */
	public RecordingSearchEndpoint withArtistName(String value) {
		this.artistname = value;
		return this;
	}

	/**
	 * @param value (part of) the recording's disambiguation comment
	 * @return
	 */
	public RecordingSearchEndpoint withComment(String value) {
		this.comment = value;
		return this;
	}

	/**
	 * @param value the 2-letter code (ISO 3166-1 alpha-2) for the country any
	 * release of this recording was released in
	 * @return
	 */
	public RecordingSearchEndpoint withCountry(String value) {
		this.country = value;
		return this;
	}

	/**
	 * @param value (part of) the credited name of any of the recording artists
	 * on this particular recording
	 * @return
	 */
	public RecordingSearchEndpoint withCreditName(String value) {
		this.creditname = value;
		return this;
	}

	/**
	 * @param value the release date of any release including this recording
	 * (e.g. "1980-01-22")
	 * @return
	 */
	public RecordingSearchEndpoint withReleaseDate(String value) {
		this.date = value;
		return this;
	}

	/**
	 * @param value the recording duration in milliseconds
	 * @return
	 */
	public RecordingSearchEndpoint withDuration(Long value) {
		this.dur = value;
		return this;
	}

	/**
	 * @param value the release date of the earliest release including this
	 * recording (e.g. "1980-01-22")
	 * @return
	 */
	public RecordingSearchEndpoint withFirstReleaseDate(String value) {
		this.firstreleasedate = value;
		return this;
	}

	/**
	 * @param value the format of any medium including this recording
	 * (insensitive to case, spaces, and separators)
	 * @return
	 */
	public RecordingSearchEndpoint withFormat(String value) {
		this.format = value;
		return this;
	}

	/**
	 * @param value any ISRC associated to the recording
	 * @return
	 */
	public RecordingSearchEndpoint withISRC(String value) {
		this.isrc = value;
		return this;
	}

	/**
	 * @param value the free-text number of the track on any medium including
	 * this recording (e.g. "A4")
	 * @return
	 */
	public RecordingSearchEndpoint withNumber(String value) {
		this.number = value;
		return this;
	}

	/**
	 * @param value the position inside its release of any medium including this
	 * recording (starts at 1)
	 * @return
	 */
	public RecordingSearchEndpoint withPosition(Long value) {
		this.position = value;
		return this;
	}

	/**
	 * @param value the primary type of any release group including this
	 * recording
	 * @return
	 */
	public RecordingSearchEndpoint withPrimaryType(String value) {
		this.primarytype = value;
		return this;
	}

	/**
	 * @param value the recording duration, quantized (duration in milliseconds
	 * / 2000)
	 * @return
	 */
	public RecordingSearchEndpoint withQuantizedDuration(Long value) {
		this.qdur = value;
		return this;
	}

	/**
	 * @param value (part of) the recording's title, or the title of a track
	 * connected to this recording (diacritics are ignored)
	 * @return
	 */
	public RecordingSearchEndpoint withTitle(String value) {
		this.recording = value;
		return this;
	}

	/**
	 * @param value (part of) the recording's title, or the title of a track
	 * connected to this recording (with the specified diacritics)
	 * @return
	 */
	public RecordingSearchEndpoint withAccentedTitle(String value) {
		this.recordingaccent = value;
		return this;
	}

	/**
	 * @param value the MBID of any release including this recording
	 * @return
	 */
	public RecordingSearchEndpoint withReleaseId(String value) {
		this.reid = value;
		return this;
	}

	/**
	 * @param value (part of) the title of any release including this recording
	 * @return
	 */
	public RecordingSearchEndpoint withReleaseTitle(String value) {
		this.release = value;
		return this;
	}

	/**
	 * @param value the MBID of any release group including this recording
	 * @return
	 */
	public RecordingSearchEndpoint withReleaseGroupId(String value) {
		this.rgid = value;
		return this;
	}

	/**
	 * @param value the recording's MBID
	 * @return
	 */
	public RecordingSearchEndpoint withRecordingId(String value) {
		this.rid = value;
		return this;
	}

	/**
	 * @param value any of the secondary types of any release group including
	 * this recording
	 * @return
	 */
	public RecordingSearchEndpoint withSecondaryType(String value) {
		this.secondarytype = value;
		return this;
	}

	/**
	 * @param value the status of any release including this recording
	 * @return
	 */
	public RecordingSearchEndpoint withStatus(String value) {
		this.status = value;
		return this;
	}

	/**
	 * @param value (part of) a tag attached to the recording
	 * @return
	 */
	public RecordingSearchEndpoint withTag(String value) {
		this.tag = value;
		return this;
	}

	/**
	 * @param value	the MBID of a track connected to this recording
	 * @return
	 */
	public RecordingSearchEndpoint withTrackId(String value) {
		this.tid = value;
		return this;
	}

	/**
	 * @param value	the position of the track on any medium including this
	 * recording (starts at 1, pre-gaps at 0)
	 * @return
	 */
	public RecordingSearchEndpoint withTrackPosition(Long value) {
		this.tnum = value;
		return this;
	}

	/**
	 * @param value	the number of tracks on any medium including this recording
	 * @return
	 */
	public RecordingSearchEndpoint withTrackCount(Long value) {
		this.tracks = value;
		return this;
	}

	/**
	 * @param value	the number of tracks on any release (as a whole) including
	 * this recording
	 * @return
	 */
	public RecordingSearchEndpoint withReleaseTrackCount(Long value) {
		this.tracksrelease = value;
		return this;
	}

	/**
	 * @param value legacy recording type field that predates the ability to set
	 * multiple types (see calculation code)
	 * @return
	 */
	public RecordingSearchEndpoint withType(String value) {
		this.type = value;
		return this;
	}

	/**
	 * @param value a boolean flag (true/false) indicating whether or not the
	 * recording is a video recording
	 * @return
	 */
	public RecordingSearchEndpoint withVideo(Boolean value) {
		this.video = value;
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
	public RecordingSearchEndpoint setLimit(Long value) {
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
	public RecordingSearchEndpoint setOffset(Long value) {
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
	public RecordingSearchEndpoint setdismax(Boolean value) {
		this.dismax = value;
		return this;
	}

	/**
	 * Search for recordings.
	 *
	 * @return Recording Results
	 */
	public RecordingSearchResultsSchema getResults() {
		Map<String, String> search = new HashMap<>();
		addQueryLuceneString(search, "", unspecified);
		addQueryLuceneString(search, SEARCH_ALIAS, alias);
		addQueryString(search, SEARCH_ARTIST_ID, arid);
		addQueryLuceneString(search, SEARCH_ARTIST, artist);
		addQueryLuceneString(search, SEARCH_ARTIST_NAME, artistname);
		addQueryLuceneString(search, SEARCH_COMMENT, comment);
		addQueryLuceneString(search, SEARCH_COUNTRY, country);
		addQueryLuceneString(search, SEARCH_CREDIT_NAME, creditname);
		addQueryLuceneString(search, SEARCH_DATE, date);
		addQueryNumber(search, SEARCH_DURATION, dur);
		addQueryLuceneString(search, SEARCH_FIRST_RELEASE_DATE, firstreleasedate);
		addQueryLuceneString(search, SEARCH_FORMAT, format);
		addQueryLuceneString(search, SEARCH_ISRC, isrc);
		addQueryLuceneString(search, SEARCH_NUMBER, number);
		addQueryNumber(search, SEARCH_POSITION, position);
		addQueryLuceneString(search, SEARCH_PRIMARY_TYPE, primarytype);
		addQueryNumber(search, SEARCH_QUANTIZED_DURATION, qdur);
		addQueryLuceneString(search, SEARCH_RECORDING, recording);
		addQueryLuceneString(search, SEARCH_RECORDING_ACCENT, recordingaccent);
		addQueryString(search, SEARCH_RELEASE_ID, reid);
		addQueryLuceneString(search, SEARCH_RELEASE, release);
		addQueryString(search, SEARCH_RELEASE_GROUP_ID, rgid);
		addQueryString(search, SEARCH_RECORDING_ID, rid);
		addQueryLuceneString(search, SEARCH_SECONDARY_TYPE, secondarytype);
		addQueryLuceneString(search, SEARCH_STATUS, status);
		addQueryLuceneString(search, SEARCH_TAG, tag);
		addQueryString(search, SEARCH_TRACK_ID, tid);
		addQueryNumber(search, SEARCH_TRACK_NUMBER, tnum);
		addQueryNumber(search, SEARCH_TRACKS, tracks);
		addQueryNumber(search, SEARCH_TRACKS_RELEASE, tracksrelease);
		addQueryString(search, SEARCH_TYPE, type);
		addQueryBoolean(search, SEARCH_VIDEO, video);
		String searchQuery = getSearchString(search);
		Map<String, String> query = new HashMap<>();
		query.put(QUERY, searchQuery);
		addQueryNumber(query, QUERY_LIMIT, limit, 25L);
		addQueryNumber(query, QUERY_OFFSET, offset, 0L);
		addQueryBoolean(query, QUERY_DISMAX, dismax, false);
		return musicBrainzAPIClient.get(RECORDING_ENDPOINT, RecordingSearchResultsSchema.class, query);
	}

}
