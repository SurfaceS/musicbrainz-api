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
package com.universalmediaserver.musicbrainz.api.endpoint;

import com.google.gson.JsonObject;
import com.universalmediaserver.musicbrainz.api.MusicBrainzAPIClient;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

/**
 * Endpoint.
 *
 * @author SurfaceS
 */
public class Endpoint {

	protected static final String QUERY = "query";
	protected static final String QUERY_INCLUDE = "inc";
	protected static final String QUERY_LIMIT = "limit";
	protected static final String QUERY_OFFSET = "offset";
	protected static final String QUERY_DISMAX = "dismax";

	protected static final String SEARCH_ADDED = "added";
	protected static final String SEARCH_ADDRESS = "address";
	protected static final String SEARCH_ALIAS = "alias";
	protected static final String SEARCH_AREA = "area";
	protected static final String SEARCH_AREA_ACCENT = "areaaccent";
	protected static final String SEARCH_AREA_ID = "aid";
	protected static final String SEARCH_ARTIST = "artist";
	protected static final String SEARCH_ARTIST_ACCENT = "artistaccent";
	protected static final String SEARCH_ARTIST_ID = "arid";
	protected static final String SEARCH_ARTIST_NAME = "artistname";
	protected static final String SEARCH_ASIN = "asin";
	protected static final String SEARCH_BARCODE = "barcode";
	protected static final String SEARCH_BEGIN = "begin";
	protected static final String SEARCH_BEGIN_AREA = "beginarea";
	protected static final String SEARCH_CATALOG_NUMBER = "catno";
	protected static final String SEARCH_CODE = "code";
	protected static final String SEARCH_COMMENT = "comment";
	protected static final String SEARCH_COUNTRY = "country";
	protected static final String SEARCH_CREDIT_NAME = "creditname";
	protected static final String SEARCH_DATE = "date";
	protected static final String SEARCH_DESCRIPTION = "description";
	protected static final String SEARCH_DISC_ID = "discid";
	protected static final String SEARCH_DISC_IDS = "discids";
	protected static final String SEARCH_DISC_IDS_MEDIUM = "discidsmedium";
	protected static final String SEARCH_DURATION = "dur";
	protected static final String SEARCH_END = "end";
	protected static final String SEARCH_END_AREA = "endarea";
	protected static final String SEARCH_ENDED = "ended";
	protected static final String SEARCH_ENTITY = "entity";
	protected static final String SEARCH_EVENT = "event";
	protected static final String SEARCH_EVENT_ACCENT = "eventaccent";
	protected static final String SEARCH_EVENT_ID = "eid";
	protected static final String SEARCH_FIRST_RELEASE_DATE = "firstreleasedate";
	protected static final String SEARCH_FORMAT = "format";
	protected static final String SEARCH_GENDER = "gender";
	protected static final String SEARCH_ID = "id";
	protected static final String SEARCH_INSTRUMENT = "instrument";
	protected static final String SEARCH_INSTRUMENT_ACCENT = "instrumentaccent";
	protected static final String SEARCH_INSTRUMENT_ID = "iid";
	protected static final String SEARCH_IPI = "ipi";
	protected static final String SEARCH_ISNI = "isni";
	protected static final String SEARCH_ISO = "iso";
	protected static final String SEARCH_ISO1 = "iso1";
	protected static final String SEARCH_ISO2 = "iso2";
	protected static final String SEARCH_ISO3 = "iso3";
	protected static final String SEARCH_ISRC = "isrc";
	protected static final String SEARCH_ISWC = "iswc";
	protected static final String SEARCH_LABEL = "label";
	protected static final String SEARCH_LABEL_ACCENT = "labelaccent";
	protected static final String SEARCH_LABEL_ID = "laid";
	protected static final String SEARCH_LANGUAGE = "lang";
	protected static final String SEARCH_LATITUDE = "lat";
	protected static final String SEARCH_LONGITUDE = "long";
	protected static final String SEARCH_MEDIUMS = "mediums";
	protected static final String SEARCH_NAME = "name";
	protected static final String SEARCH_NUMBER = "number";
	protected static final String SEARCH_PACKAGING = "packaging";
	protected static final String SEARCH_PLACE = "place";
	protected static final String SEARCH_PLACE_ACCENT = "placeaccent";
	protected static final String SEARCH_PLACE_ID = "pid";
	protected static final String SEARCH_POSITION = "position";
	protected static final String SEARCH_PRIMARY_ALIAS = "primary_alias";
	protected static final String SEARCH_PRIMARY_TYPE = "primarytype";
	protected static final String SEARCH_QUALITY = "quality";
	protected static final String SEARCH_QUANTIZED_DURATION = "qdur";
	protected static final String SEARCH_RECORDING = "recording";
	protected static final String SEARCH_RECORDING_ACCENT = "recordingaccent";
	protected static final String SEARCH_RECORDING_COUNT = "recording_count";
	protected static final String SEARCH_RECORDING_ID = "rid";
	protected static final String SEARCH_RELATION_TYPE = "relationtype";
	protected static final String SEARCH_RELEASE = "release";
	protected static final String SEARCH_RELEASE_ACCENT = "releaseaccent";
	protected static final String SEARCH_RELEASE_COUNT = "release_count";
	protected static final String SEARCH_RELEASE_ID = "reid";
	protected static final String SEARCH_RELEASE_GROUP = "releasegroup";
	protected static final String SEARCH_RELEASE_GROUP_ACCENT = "releasegroupaccent";
	protected static final String SEARCH_RELEASE_GROUP_ID = "rgid";
	protected static final String SEARCH_RELEASES = "releases";
	protected static final String SEARCH_SCRIPT = "script";
	protected static final String SEARCH_SECONDARY_TYPE = "secondarytype";
	protected static final String SEARCH_SERIES = "series";
	protected static final String SEARCH_SERIES_ACCENT = "seriesaccent";
	protected static final String SEARCH_SERIES_ID = "sid";
	protected static final String SEARCH_SORTNAME = "sortname";
	protected static final String SEARCH_STATUS = "status";
	protected static final String SEARCH_TAG = "tag";
	protected static final String SEARCH_TARGET_ID = "targetid";
	protected static final String SEARCH_TARGET_TYPE = "targettype";
	protected static final String SEARCH_TEXT = "text";
	protected static final String SEARCH_TITLE = "title";
	protected static final String SEARCH_TRACK_ID = "tid";
	protected static final String SEARCH_TRACK_NUMBER = "tnum";
	protected static final String SEARCH_TRACKS = "tracks";
	protected static final String SEARCH_TRACKS_MEDIUM = "tracksmedium";
	protected static final String SEARCH_TRACKS_RELEASE = "tracksrelease";
	protected static final String SEARCH_TYPE = "type";
	protected static final String SEARCH_URL = "url";
	protected static final String SEARCH_URL_ANCESTOR = "url_ancestor";
	protected static final String SEARCH_URL_DESCENDENT = "url_descendent";
	protected static final String SEARCH_URL_ID = "uid";
	protected static final String SEARCH_VIDEO = "video";
	protected static final String SEARCH_WORK = "work";
	protected static final String SEARCH_WORK_ACCENT = "workaccent";
	protected static final String SEARCH_WORK_ID = "wid";

	protected Endpoint(MusicBrainzAPIClient musicBrainzAPIClient) {
		this.musicBrainzAPIClient = musicBrainzAPIClient;
	}

	protected final MusicBrainzAPIClient musicBrainzAPIClient;

	protected static void addQueryBoolean(Map<String, String> query, String parameter, Boolean value) {
		if (value != null) {
			query.put(parameter, String.valueOf(value));
		}
	}

	protected static void addQueryBoolean(Map<String, String> query, String parameter, Boolean value, boolean defaultValue) {
		if (value != null && value != defaultValue) {
			query.put(parameter, String.valueOf(value));
		}
	}

	protected static void addQueryEnum(Map<String, String> query, String parameter, Enum<? extends Enum> value) {
		if (value != null) {
			query.put(parameter, value.toString());
		}
	}

	protected static void addQueryEnums(Map<String, String> query, String parameter, List<? extends Enum> values) {
		if (values != null && !values.isEmpty()) {
			StringBuilder valueBuilder = new StringBuilder();
			for (Object value : values) {
				if (!valueBuilder.isEmpty()) {
					valueBuilder.append("+");
				}
				valueBuilder.append(value.toString());
			}
			query.put(parameter, valueBuilder.toString());
		}
	}

	protected static void addQueryNumber(Map<String, String> query, String parameter, Long value) {
		if (value != null) {
			query.put(parameter, Long.toString(value));
		}
	}

	protected static void addQueryNumber(Map<String, String> query, String parameter, Long value, Long defaultValue) {
		if (value != null && !Objects.equals(value, defaultValue)) {
			query.put(parameter, Long.toString(value));
		}
	}

	protected static void addQueryLuceneString(Map<String, String> query, String parameter, String value) {
		addQueryString(query, parameter, value, null);
	}

	protected static void addQueryLuceneString(Map<String, String> query, String parameter, String value, String defaultValue) {
		if (value != null) {
			query.put(parameter, escapeToLucene(value));
		} else if (defaultValue != null) {
			query.put(parameter, escapeToLucene(defaultValue));
		}
	}

	protected static void addQueryString(Map<String, String> query, String parameter, String value) {
		addQueryString(query, parameter, value, null);
	}

	protected static void addQueryString(Map<String, String> query, String parameter, String value, String defaultValue) {
		if (value != null) {
			query.put(parameter, value);
		} else if (defaultValue != null) {
			query.put(parameter, defaultValue);
		}
	}

	protected static void addQueryStrings(Map<String, String> query, String parameter, List<String> values) {
		if (values != null && !values.isEmpty()) {
			StringBuilder valueBuilder = new StringBuilder();
			for (String imageLanguage : values) {
				if (!valueBuilder.isEmpty()) {
					valueBuilder.append(",");
				}
				valueBuilder.append(imageLanguage);
			}
			query.put(parameter, valueBuilder.toString());
		}
	}

	protected static void addPostString(JsonObject postObject, String parameter, String value) {
		addPostString(postObject, parameter, value, null);
	}

	protected static void addPostString(JsonObject postObject, String parameter, String value, String defaultValue) {
		if (value != null) {
			postObject.addProperty(parameter, value);
		} else if (defaultValue != null) {
			postObject.addProperty(parameter, defaultValue);
		}
	}

	protected static void addPostBoolean(JsonObject postObject, String parameter, Boolean value) {
		addPostBoolean(postObject, parameter, value, null);
	}

	protected static void addPostBoolean(JsonObject postObject, String parameter, Boolean value, Boolean defaultValue) {
		if (value != null && (defaultValue == null || !value.equals(defaultValue))) {
			postObject.addProperty(parameter, value);
		}
	}

	/**
	 * To literal search, you'll need to escape characters special to Lucene
	 */
	public static String escapeToLucene(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			// These characters are part of the query syntax and must be escaped
			if (c == '\\' || c == '+' || c == '-' || c == '!' || c == '(' || c == ')' || c == ':' ||
					c == '^' || c == '[' || c == ']' || c == '\"' || c == '{' || c == '}' || c == '~' ||
					c == '*' || c == '?' || c == '|' || c == '&' || c == '/') {
				sb.append('\\');
			}
			sb.append(c);
		}
		return sb.toString();
	}

	public static String getSearchString(Map<String, String> search) {
		if (search == null || search.isEmpty()) {
			return null;
		}
		StringBuilder searchBuilder = new StringBuilder();
		for (Entry<String, String> param : search.entrySet()) {
			String value = param.getValue();
			if (value != null && value.trim().length() > 0) {
				if (!searchBuilder.isEmpty()) {
					searchBuilder.append(" AND ");
				}
				String key = param.getKey();
				if (key != null && key.trim().length() > 0) {
					searchBuilder.append(key).append(":");
				}
				searchBuilder.append(value);
			}
		}
		return searchBuilder.toString();
	}

}
