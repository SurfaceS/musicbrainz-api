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
package com.universalmediaserver.musicbrainz.api.endpoint.artist;

import com.universalmediaserver.musicbrainz.api.MusicBrainzAPIClient;
import com.universalmediaserver.musicbrainz.api.schema.artist.ArstistGender;
import com.universalmediaserver.musicbrainz.api.schema.artist.ArtistSearchResultsSchema;
import java.util.HashMap;
import java.util.Map;

/**
 * Artist Search endpoint.
 *
 * @author SurfaceS
 */
public class ArtistSearchEndpoint extends ArtistEndpoint {

	private Long limit = 25L;
	private Long offset = 0L;
	private Boolean dismax = false;
	private String unspecified;
	private String alias;
	private String primaryAlias;
	private String area;
	private String artist;
	private String artistaccent;
	private String arid;
	private String begin;
	private String beginarea;
	private String comment;
	private String country;
	private String end;
	private String endarea;
	private Boolean ended;
	private ArstistGender gender;
	private String ipi;
	private String isni;
	private String sortname;
	private String tag;
	private String type;

	public ArtistSearchEndpoint(MusicBrainzAPIClient musicBrainzAPIClient) {
		super(musicBrainzAPIClient);
	}

	/**
	 * @param value (part of) terms will be searched for in the alias, artist
	 * and sortname fields.
	 * @return
	 */
	public ArtistSearchEndpoint with(String value) {
		this.unspecified = value;
		return this;
	}

	/**
	 * @param value (part of) any alias attached to the artist (diacritics are
	 * ignored)
	 * @return
	 */
	public ArtistSearchEndpoint withAlias(String value) {
		this.alias = value;
		return this;
	}

	/**
	 * @param value (part of) any primary alias attached to the artist
	 * (diacritics are ignored)
	 * @return
	 */
	public ArtistSearchEndpoint withPrimaryAlias(String value) {
		this.primaryAlias = value;
		return this;
	}

	/**
	 * @param value (part of) the name of the artist's main associated area
	 * @return
	 */
	public ArtistSearchEndpoint withAreaName(String value) {
		this.area = value;
		return this;
	}

	/**
	 * @param value (part of) the artist's name (diacritics are ignored)
	 * @return
	 */
	public ArtistSearchEndpoint withName(String value) {
		this.artist = value;
		return this;
	}

	/**
	 * @param value (part of) the artist's name (with the specified diacritics)
	 * @return
	 */
	public ArtistSearchEndpoint withAccentedName(String value) {
		this.artistaccent = value;
		return this;
	}

	/**
	 * @param value the artist's MBID
	 * @return
	 */
	public ArtistSearchEndpoint withArtistId(String value) {
		this.arid = value;
		return this;
	}

	/**
	 * @param value the artist's begin date (e.g. "1980-01-22")
	 * @return
	 */
	public ArtistSearchEndpoint withBeginDate(String value) {
		this.begin = value;
		return this;
	}

	/**
	 * @param value (part of) the name of the artist's begin area
	 * @return
	 */
	public ArtistSearchEndpoint withBeginAreaName(String value) {
		this.beginarea = value;
		return this;
	}

	/**
	 * @param value (part of) the artist's disambiguation comment
	 * @return
	 */
	public ArtistSearchEndpoint withComment(String value) {
		this.comment = value;
		return this;
	}

	/**
	 * @param value the 2-letter code (ISO 3166-1 alpha-2) for the artist's main
	 * associated country
	 * @return
	 */
	public ArtistSearchEndpoint withCountry(String value) {
		this.country = value;
		return this;
	}

	/**
	 * @param value the artist's end date (e.g. "1980-01-22")
	 * @return
	 */
	public ArtistSearchEndpoint withEndDate(String value) {
		this.end = value;
		return this;
	}

	/**
	 * @param value (part of) the name of the artist's end area
	 * @return
	 */
	public ArtistSearchEndpoint withEndAreaName(String value) {
		this.endarea = value;
		return this;
	}

	/**
	 * @param value a boolean flag (true/false) indicating whether or not the
	 * artist has ended (is dissolved/deceased)
	 * @return
	 */
	public ArtistSearchEndpoint withEnded(Boolean value) {
		this.ended = value;
		return this;
	}

	/**
	 * @param value the artist's gender (“male”, “female”, “other” or “not
	 * applicable”)
	 * @return
	 */
	public ArtistSearchEndpoint withGender(ArstistGender value) {
		this.gender = value;
		return this;
	}

	/**
	 * @param value an IPI code associated with the artist
	 * @return
	 */
	public ArtistSearchEndpoint withIPI(String value) {
		this.ipi = value;
		return this;
	}

	/**
	 * @param value an ISNI code associated with the artist
	 * @return
	 */
	public ArtistSearchEndpoint withISNI(String value) {
		this.isni = value;
		return this;
	}

	/**
	 * @param value (part of) the artist's sort name
	 * @return
	 */
	public ArtistSearchEndpoint withSortName(String value) {
		this.sortname = value;
		return this;
	}

	/**
	 * @param value (part of) a tag attached to the artist
	 * @return
	 */
	public ArtistSearchEndpoint withTag(String value) {
		this.tag = value;
		return this;
	}

	/**
	 * @param value the artist's type (“person”, “group”, etc.)
	 * @return
	 */
	public ArtistSearchEndpoint withType(String value) {
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
	public ArtistSearchEndpoint setLimit(Long value) {
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
	public ArtistSearchEndpoint setOffset(Long value) {
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
	public ArtistSearchEndpoint setdismax(Boolean value) {
		this.dismax = value;
		return this;
	}

	/**
	 * Search for a recording.
	 *
	 * @return recording Results
	 */
	public ArtistSearchResultsSchema getResults() {
		Map<String, String> search = new HashMap<>();
		addQueryLuceneString(search, "", unspecified);
		addQueryLuceneString(search, SEARCH_ALIAS, alias);
		addQueryLuceneString(search, SEARCH_PRIMARY_ALIAS, primaryAlias);
		addQueryLuceneString(search, SEARCH_AREA, area);
		addQueryString(search, SEARCH_ARTIST_ID, arid);
		addQueryLuceneString(search, SEARCH_ARTIST, artist);
		addQueryLuceneString(search, SEARCH_ARTIST_ACCENT, artistaccent);
		addQueryLuceneString(search, SEARCH_BEGIN, begin);
		addQueryLuceneString(search, SEARCH_BEGIN_AREA, beginarea);
		addQueryLuceneString(search, SEARCH_COMMENT, comment);
		addQueryLuceneString(search, SEARCH_COUNTRY, country);
		addQueryLuceneString(search, SEARCH_END, end);
		addQueryLuceneString(search, SEARCH_END_AREA, endarea);
		addQueryBoolean(search, SEARCH_ENDED, ended);
		addQueryEnum(search, SEARCH_GENDER, gender);
		addQueryLuceneString(search, SEARCH_IPI, ipi);
		addQueryLuceneString(search, SEARCH_ISNI, isni);
		addQueryLuceneString(search, SEARCH_SORTNAME, sortname);
		addQueryLuceneString(search, SEARCH_TAG, tag);
		addQueryString(search, SEARCH_TYPE, type);
		String searchQuery = getSearchString(search);
		Map<String, String> query = new HashMap<>();
		query.put(QUERY, searchQuery);
		addQueryNumber(query, QUERY_LIMIT, limit, 25L);
		addQueryNumber(query, QUERY_OFFSET, offset, 0L);
		addQueryBoolean(query, QUERY_DISMAX, dismax, false);
		return musicBrainzAPIClient.get(ARTIST_ENDPOINT, ArtistSearchResultsSchema.class, query);
	}

}
