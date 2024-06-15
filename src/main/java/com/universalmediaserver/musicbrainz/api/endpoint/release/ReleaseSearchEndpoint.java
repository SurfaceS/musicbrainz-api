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
package com.universalmediaserver.musicbrainz.api.endpoint.release;

import com.universalmediaserver.musicbrainz.api.MusicBrainzAPIClient;
import com.universalmediaserver.musicbrainz.api.schema.release.ReleaseSearchResultsSchema;
import java.util.HashMap;
import java.util.Map;

/**
 * Release Search endpoint.
 *
 * @author SurfaceS
 */
public class ReleaseSearchEndpoint extends ReleaseEndpoint {

	private Long limit = 25L;
	private Long offset = 0L;
	private Boolean dismax = false;
	private String unspecified;
	private String alias;
	private String arid;
	private String artist;
	private String artistname;
	private String asin;
	private String barcode;
	private String catno;
	private String comment;
	private String country;
	private String creditname;
	private String date;
	private Long discids;
	private Long discidsmedium;
	private String format;
	private String laid;
	private String label;
	private String lang;
	private Long mediums;
	private String packaging;
	private String primarytype;
	private String quality;
	private String reid;
	private String release;
	private String releaseaccent;
	private String rgid;
	private String script;
	private String secondarytype;
	private String status;
	private String tag;
	private Long tracks;
	private Long tracksmedium;
	private String type;

	public ReleaseSearchEndpoint(MusicBrainzAPIClient musicBrainzAPIClient) {
		super(musicBrainzAPIClient);
	}

	/**
	 * @param value (part of) value searched for in the release field.
	 * @return
	 */
	public ReleaseSearchEndpoint with(String value) {
		this.unspecified = value;
		return this;
	}

	/**
	 * @param value (part of) any alias attached to the release (diacritics are
	 * ignored)
	 * @return
	 */
	public ReleaseSearchEndpoint withAlias(String value) {
		this.alias = value;
		return this;
	}

	/**
	 * @param value the MBID of any of the release artists
	 * @return
	 */
	public ReleaseSearchEndpoint withArtistId(String value) {
		this.arid = value;
		return this;
	}

	/**
	 * @param value (part of) the combined credited artist name for the release,
	 * including join phrases (e.g. "Artist X feat.")
	 * @return
	 */
	public ReleaseSearchEndpoint withArtistCredit(String value) {
		this.artist = value;
		return this;
	}

	/**
	 * @param value (part of) the name of any of the release artists
	 * @return
	 */
	public ReleaseSearchEndpoint withArtistName(String value) {
		this.artistname = value;
		return this;
	}

	/**
	 * @param value an Amazon ASIN for the release
	 * @return
	 */
	public ReleaseSearchEndpoint withASIN(String value) {
		this.asin = value;
		return this;
	}

	/**
	 * @param value the barcode for the release
	 * @return
	 */
	public ReleaseSearchEndpoint withBarcode(String value) {
		this.barcode = value;
		return this;
	}

	/**
	 * @param value any catalog number for this release (insensitive to case,
	 * spaces, and separators)
	 * @return
	 */
	public ReleaseSearchEndpoint withCatalogNumber(String value) {
		this.catno = value;
		return this;
	}

	/**
	 * @param value (part of) the release's disambiguation comment
	 * @return
	 */
	public ReleaseSearchEndpoint withComment(String value) {
		this.comment = value;
		return this;
	}

	/**
	 * @param value the 2-letter code (ISO 3166-1 alpha-2) for any country the
	 * release was released in
	 * @return
	 */
	public ReleaseSearchEndpoint withCountry(String value) {
		this.country = value;
		return this;
	}

	/**
	 * @param value (part of) the credited name of any of the release artists on
	 * this particular release
	 * @return
	 */
	public ReleaseSearchEndpoint withCreditName(String value) {
		this.creditname = value;
		return this;
	}

	/**
	 * @param value a release date for the release (e.g. "1980-01-22")
	 * @return
	 */
	public ReleaseSearchEndpoint withReleaseDate(String value) {
		this.date = value;
		return this;
	}

	/**
	 * @param value the total number of disc IDs attached to all mediums on the
	 * release
	 * @return
	 */
	public ReleaseSearchEndpoint withDiscCount(Long value) {
		this.discids = value;
		return this;
	}

	/**
	 * @param value the number of disc IDs attached to any one medium on the
	 * release
	 * @return
	 */
	public ReleaseSearchEndpoint withMediumDiscCount(Long value) {
		this.discidsmedium = value;
		return this;
	}

	/**
	 * @param value the format of any medium in the release (insensitive to
	 * case, spaces, and separators)
	 * @return
	 */
	public ReleaseSearchEndpoint withFormat(String value) {
		this.format = value;
		return this;
	}

	/**
	 * @param value the MBID of any of the release labels
	 * @return
	 */
	public ReleaseSearchEndpoint withLabelId(String value) {
		this.laid = value;
		return this;
	}

	/**
	 * @param value (part of) the name of any of the release labels
	 * @return
	 */
	public ReleaseSearchEndpoint withLabelName(String value) {
		this.label = value;
		return this;
	}

	/**
	 * @param value the ISO 639-3 code for the release language
	 * @return
	 */
	public ReleaseSearchEndpoint withLanguage(String value) {
		this.lang = value;
		return this;
	}

	/**
	 * @param value the number of mediums on the release
	 * @return
	 */
	public ReleaseSearchEndpoint withMediumCount(Long value) {
		this.mediums = value;
		return this;
	}

	/**
	 * @param value the format of the release (insensitive to case, spaces, and
	 * separators)
	 * @return
	 */
	public ReleaseSearchEndpoint withPackaging(String value) {
		this.packaging = value;
		return this;
	}

	/**
	 * @param value the primary type of the release group for this release
	 * @return
	 */
	public ReleaseSearchEndpoint withPrimaryType(String value) {
		this.primarytype = value;
		return this;
	}

	/**
	 * @param value the listed quality of the data for the release (2 for
	 * “high”, 1 for “normal”; cannot search for “low” at the moment; see the
	 * related bug report)
	 * @return
	 */
	public ReleaseSearchEndpoint withQuality(String value) {
		this.quality = value;
		return this;
	}

	/**
	 * @param value the release's MBID
	 * @return
	 */
	public ReleaseSearchEndpoint withReleaseId(String value) {
		this.reid = value;
		return this;
	}

	/**
	 * @param value (part of) the release's title (diacritics are ignored)
	 * @return
	 */
	public ReleaseSearchEndpoint withTitle(String value) {
		this.release = value;
		return this;
	}

	/**
	 * @param value (part of) the release's title (with the specified
	 * diacritics)
	 * @return
	 */
	public ReleaseSearchEndpoint withAccentedTitle(String value) {
		this.releaseaccent = value;
		return this;
	}

	/**
	 * @param value the MBID of the release group for this release
	 * @return
	 */
	public ReleaseSearchEndpoint withReleaseGroupId(String value) {
		this.rgid = value;
		return this;
	}

	/**
	 * @param value the ISO 15924 code for the release script
	 * @return
	 */
	public ReleaseSearchEndpoint withScript(String value) {
		this.script = value;
		return this;
	}

	/**
	 * @param value any of the secondary types of the release group for this
	 * release
	 * @return
	 */
	public ReleaseSearchEndpoint withSecondaryType(String value) {
		this.secondarytype = value;
		return this;
	}

	/**
	 * @param value the status of the release
	 * @return
	 */
	public ReleaseSearchEndpoint withStatus(String value) {
		this.status = value;
		return this;
	}

	/**
	 * @param value (part of) a tag attached to the release
	 * @return
	 */
	public ReleaseSearchEndpoint withTag(String value) {
		this.tag = value;
		return this;
	}

	/**
	 * @param value	the total number of tracks on the release
	 * @return
	 */
	public ReleaseSearchEndpoint withTrackCount(Long value) {
		this.tracks = value;
		return this;
	}

	/**
	 * @param value	the number of tracks on any one medium on the release
	 * @return
	 */
	public ReleaseSearchEndpoint withMediumTrackCount(Long value) {
		this.tracksmedium = value;
		return this;
	}

	/**
	 * @param value legacy release type field that predates the ability to set
	 * multiple types (see calculation code)
	 * @return
	 */
	public ReleaseSearchEndpoint withType(String value) {
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
	public ReleaseSearchEndpoint setLimit(Long value) {
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
	public ReleaseSearchEndpoint setOffset(Long value) {
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
	public ReleaseSearchEndpoint setdismax(Boolean value) {
		this.dismax = value;
		return this;
	}

	/**
	 * Search for releases.
	 *
	 * @return Release Results
	 */
	public ReleaseSearchResultsSchema getResults() {
		Map<String, String> search = new HashMap<>();
		addQueryLuceneString(search, "", unspecified);
		addQueryLuceneString(search, SEARCH_ALIAS, alias);
		addQueryString(search, SEARCH_ARTIST_ID, arid);
		addQueryLuceneString(search, SEARCH_ARTIST, artist);
		addQueryLuceneString(search, SEARCH_ARTIST_NAME, artistname);
		addQueryLuceneString(search, SEARCH_ASIN, asin);
		addQueryLuceneString(search, SEARCH_BARCODE, barcode);
		addQueryLuceneString(search, SEARCH_CATALOG_NUMBER, catno);
		addQueryLuceneString(search, SEARCH_COMMENT, comment);
		addQueryLuceneString(search, SEARCH_COUNTRY, country);
		addQueryLuceneString(search, SEARCH_CREDIT_NAME, creditname);
		addQueryLuceneString(search, SEARCH_DATE, date);
		addQueryNumber(search, SEARCH_DISC_IDS, discids);
		addQueryNumber(search, SEARCH_DISC_IDS_MEDIUM, discidsmedium);
		addQueryLuceneString(search, SEARCH_FORMAT, format);
		addQueryString(search, SEARCH_LABEL_ID, laid);
		addQueryLuceneString(search, SEARCH_LABEL, label);
		addQueryLuceneString(search, SEARCH_LANGUAGE, lang);
		addQueryNumber(search, SEARCH_MEDIUMS, mediums);
		addQueryLuceneString(search, SEARCH_PACKAGING, packaging);
		addQueryLuceneString(search, SEARCH_PRIMARY_TYPE, primarytype);
		addQueryLuceneString(search, SEARCH_QUALITY, quality);
		addQueryLuceneString(search, SEARCH_RELEASE_ID, reid);
		addQueryString(search, SEARCH_RELEASE_ID, reid);
		addQueryLuceneString(search, SEARCH_RELEASE, release);
		addQueryLuceneString(search, SEARCH_RELEASE_ACCENT, releaseaccent);
		addQueryString(search, SEARCH_RELEASE_GROUP_ID, rgid);
		addQueryLuceneString(search, SEARCH_SCRIPT, script);
		addQueryLuceneString(search, SEARCH_SECONDARY_TYPE, secondarytype);
		addQueryLuceneString(search, SEARCH_STATUS, status);
		addQueryLuceneString(search, SEARCH_TAG, tag);
		addQueryNumber(search, SEARCH_TRACKS, tracks);
		addQueryNumber(search, SEARCH_TRACKS_MEDIUM, tracksmedium);
		addQueryString(search, SEARCH_TYPE, type);
		String searchQuery = getSearchString(search);
		Map<String, String> query = new HashMap<>();
		query.put(QUERY, searchQuery);
		addQueryNumber(query, QUERY_LIMIT, limit, 25L);
		addQueryNumber(query, QUERY_OFFSET, offset, 0L);
		addQueryBoolean(query, QUERY_DISMAX, dismax, false);
		return musicBrainzAPIClient.get(RELEASE_ENDPOINT, ReleaseSearchResultsSchema.class, query);
	}

}
