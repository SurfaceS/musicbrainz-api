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
package com.universalmediaserver.musicbrainz.api.endpoint.release_group;

import com.universalmediaserver.musicbrainz.api.MusicBrainzAPIClient;
import com.universalmediaserver.musicbrainz.api.schema.release_group.ReleaseGroupSearchResultsSchema;
import java.util.HashMap;
import java.util.Map;

/**
 * Release Group Search endpoint.
 *
 * @author SurfaceS
 */
public class ReleaseGroupSearchEndpoint extends ReleaseGroupEndpoint {

	private Long limit = 25L;
	private Long offset = 0L;
	private Boolean dismax = false;
	private String unspecified;
	private String alias;
	private String arid;
	private String artist;
	private String artistname;
	private String comment;
	private String creditname;
	private String firstreleasedate;
	private String primarytype;
	private String reid;
	private String release;
	private String releasegroup;
	private String releasegroupaccent;
	private Long releases;
	private String rgid;
	private String secondarytype;
	private String status;
	private String tag;
	private String type;

	public ReleaseGroupSearchEndpoint(MusicBrainzAPIClient musicBrainzAPIClient) {
		super(musicBrainzAPIClient);
	}

	/**
	 * @param value (part of) value searched for in the releasegroup field.
	 * @return
	 */
	public ReleaseGroupSearchEndpoint with(String value) {
		this.unspecified = value;
		return this;
	}

	/**
	 * @param value (part of) any alias attached to the release group
	 * (diacritics are ignored)
	 * @return
	 */
	public ReleaseGroupSearchEndpoint withAlias(String value) {
		this.alias = value;
		return this;
	}

	/**
	 * @param value the MBID of any of the release group artists
	 * @return
	 */
	public ReleaseGroupSearchEndpoint withArtistId(String value) {
		this.arid = value;
		return this;
	}

	/**
	 * @param value (part of) the combined credited artist name for the release
	 * group, including join phrases (e.g. "Artist X feat.")
	 * @return
	 */
	public ReleaseGroupSearchEndpoint withArtistCredit(String value) {
		this.artist = value;
		return this;
	}

	/**
	 * @param value (part of) the name of any of the release group artists
	 * @return
	 */
	public ReleaseGroupSearchEndpoint withArtistName(String value) {
		this.artistname = value;
		return this;
	}

	/**
	 * @param value (part of) the release group's disambiguation comment
	 * @return
	 */
	public ReleaseGroupSearchEndpoint withComment(String value) {
		this.comment = value;
		return this;
	}

	/**
	 * @param value (part of) the credited name of any of the release group
	 * artists on this particular release group
	 * @return
	 */
	public ReleaseGroupSearchEndpoint withCreditName(String value) {
		this.creditname = value;
		return this;
	}

	/**
	 * @param value the release date of the earliest release in this release
	 * group (e.g. "1980-01-22")
	 * @return
	 */
	public ReleaseGroupSearchEndpoint withFirstReleaseDate(String value) {
		this.firstreleasedate = value;
		return this;
	}

	/**
	 * @param value the primary type of the release group
	 * @return
	 */
	public ReleaseGroupSearchEndpoint withPrimaryType(String value) {
		this.primarytype = value;
		return this;
	}

	/**
	 * @param value the MBID of any of the releases in the release group
	 * @return
	 */
	public ReleaseGroupSearchEndpoint withReleaseId(String value) {
		this.reid = value;
		return this;
	}

	/**
	 * @param value(part of) the title of any of the releases in the release
	 * group
	 * @return
	 */
	public ReleaseGroupSearchEndpoint withReleaseTitle(String value) {
		this.release = value;
		return this;
	}

	/**
	 * @param value (part of) the release group's title (diacritics are ignored)
	 * @return
	 */
	public ReleaseGroupSearchEndpoint withTitle(String value) {
		this.releasegroup = value;
		return this;
	}

	/**
	 * @param value (part of) the release group's title (with the specified
	 * diacritics)
	 * @return
	 */
	public ReleaseGroupSearchEndpoint withAccentedTitle(String value) {
		this.releasegroupaccent = value;
		return this;
	}

	/**
	 * @param value the number of releases in the release group
	 * @return
	 */
	public ReleaseGroupSearchEndpoint withReleaseCount(Long value) {
		this.releases = value;
		return this;
	}

	/**
	 * @param value the release group's MBID
	 * @return
	 */
	public ReleaseGroupSearchEndpoint withReleaseGroupId(String value) {
		this.rgid = value;
		return this;
	}

	/**
	 * @param value any of the secondary types of the release group
	 * @return
	 */
	public ReleaseGroupSearchEndpoint withSecondaryType(String value) {
		this.secondarytype = value;
		return this;
	}

	/**
	 * @param value the status of any of the releases in the release group
	 * @return
	 */
	public ReleaseGroupSearchEndpoint withStatus(String value) {
		this.status = value;
		return this;
	}

	/**
	 * @param value (part of) a tag attached to the release group
	 * @return
	 */
	public ReleaseGroupSearchEndpoint withTag(String value) {
		this.tag = value;
		return this;
	}

	/**
	 * @param value legacy release group type field that predates the ability to
	 * set multiple types
	 * @return
	 */
	public ReleaseGroupSearchEndpoint withType(String value) {
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
	public ReleaseGroupSearchEndpoint setLimit(Long value) {
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
	public ReleaseGroupSearchEndpoint setOffset(Long value) {
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
	public ReleaseGroupSearchEndpoint setdismax(Boolean value) {
		this.dismax = value;
		return this;
	}

	/**
	 * Search for release groups.
	 *
	 * @return Release Group Results
	 */
	public ReleaseGroupSearchResultsSchema getResults() {
		Map<String, String> search = new HashMap<>();
		addQueryLuceneString(search, "", unspecified);
		addQueryLuceneString(search, SEARCH_ALIAS, alias);
		addQueryString(search, SEARCH_ARTIST_ID, arid);
		addQueryLuceneString(search, SEARCH_ARTIST, artist);
		addQueryLuceneString(search, SEARCH_ARTIST_NAME, artistname);
		addQueryLuceneString(search, SEARCH_COMMENT, comment);
		addQueryLuceneString(search, SEARCH_CREDIT_NAME, creditname);
		addQueryLuceneString(search, SEARCH_FIRST_RELEASE_DATE, firstreleasedate);
		addQueryLuceneString(search, SEARCH_PRIMARY_TYPE, primarytype);
		addQueryString(search, SEARCH_RELEASE_ID, reid);
		addQueryLuceneString(search, SEARCH_RELEASE, release);
		addQueryLuceneString(search, SEARCH_RELEASE_GROUP, releasegroup);
		addQueryLuceneString(search, SEARCH_RELEASE_GROUP_ACCENT, releasegroupaccent);
		addQueryNumber(search, SEARCH_RELEASES, releases);
		addQueryString(search, SEARCH_RELEASE_GROUP_ID, rgid);
		addQueryLuceneString(search, SEARCH_SECONDARY_TYPE, secondarytype);
		addQueryLuceneString(search, SEARCH_STATUS, status);
		addQueryLuceneString(search, SEARCH_TAG, tag);
		addQueryString(search, SEARCH_TYPE, type);
		String searchQuery = getSearchString(search);
		Map<String, String> query = new HashMap<>();
		query.put(QUERY, searchQuery);
		addQueryNumber(query, QUERY_LIMIT, limit, 25L);
		addQueryNumber(query, QUERY_OFFSET, offset, 0L);
		addQueryBoolean(query, QUERY_DISMAX, dismax, false);
		return musicBrainzAPIClient.get(RELEASE_GROUP_ENDPOINT, ReleaseGroupSearchResultsSchema.class, query);
	}

}
