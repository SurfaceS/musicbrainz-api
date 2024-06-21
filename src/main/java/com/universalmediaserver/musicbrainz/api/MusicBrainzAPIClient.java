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
package com.universalmediaserver.musicbrainz.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.universalmediaserver.musicbrainz.api.endpoint.annotation.AnnotationEndpoint;
import com.universalmediaserver.musicbrainz.api.endpoint.area.AreaEndpoint;
import com.universalmediaserver.musicbrainz.api.endpoint.artist.ArtistEndpoint;
import com.universalmediaserver.musicbrainz.api.endpoint.cdstub.CDStubEndpoint;
import com.universalmediaserver.musicbrainz.api.endpoint.event.EventEndpoint;
import com.universalmediaserver.musicbrainz.api.endpoint.genre.GenreEndpoint;
import com.universalmediaserver.musicbrainz.api.endpoint.instrument.InstrumentEndpoint;
import com.universalmediaserver.musicbrainz.api.endpoint.label.LabelEndpoint;
import com.universalmediaserver.musicbrainz.api.endpoint.place.PlaceEndpoint;
import com.universalmediaserver.musicbrainz.api.endpoint.recording.RecordingEndpoint;
import com.universalmediaserver.musicbrainz.api.endpoint.release.ReleaseEndpoint;
import com.universalmediaserver.musicbrainz.api.endpoint.release_group.ReleaseGroupEndpoint;
import com.universalmediaserver.musicbrainz.api.endpoint.series.SeriesEndpoint;
import com.universalmediaserver.musicbrainz.api.endpoint.tag.TagEndpoint;
import com.universalmediaserver.musicbrainz.api.endpoint.url.UrlEndpoint;
import com.universalmediaserver.musicbrainz.api.endpoint.work.WorkEndpoint;
import com.universalmediaserver.musicbrainz.api.schema.ErrorSchema;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Create a new MusicBrainz API client.
 *
 * @author SurfaceS
 */
public class MusicBrainzAPIClient {

	private static final String DEFAULT_BASE_URL = "https://musicbrainz.org/ws/2/";
	private static final Gson GSON = new GsonBuilder().create();

	private String userAgent;
	private String baseUrl;
	/**
	 * used for testing json members
	 */
	private String lastBody;
	private boolean testing;

	/**
	 * Create a new MusicBrainz API client.
	 */
	public MusicBrainzAPIClient() {
		this(DEFAULT_BASE_URL, null);
	}

	/**
	 * Create a new MusicBrainz API client.
	 *
	 * @param userAgent User-Agent header
	 */
	public MusicBrainzAPIClient(String userAgent) {
		this(DEFAULT_BASE_URL, userAgent);
	}

	/**
	 * Create a new MusicBrainz API client.
	 *
	 * @param baseUrl the base api url
	 * @param userAgent User-Agent header
	 */
	public MusicBrainzAPIClient(String baseUrl, String userAgent) {
		this.baseUrl = baseUrl;
		this.userAgent = userAgent;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public String getBaseUrl() {
		return baseUrl;
	}

	public String getLastBody() {
		return lastBody;
	}

	public void setUserAgent(String value) {
		this.userAgent = value;
	}

	public void setBaseUrl(String value) {
		this.baseUrl = value;
	}

	public void setTesting(boolean value) {
		this.testing = value;
	}

	/**
	 * Get annotation endpoint.
	 *
	 * @return Annotation endpoint.
	 */
	public AnnotationEndpoint annotation() {
		return new AnnotationEndpoint(this);
	}

	/**
	 * Get area endpoint.
	 *
	 * @return Area endpoint.
	 */
	public AreaEndpoint area() {
		return new AreaEndpoint(this);
	}

	/**
	 * Get artist endpoint.
	 *
	 * @return Artist endpoint.
	 */
	public ArtistEndpoint artist() {
		return new ArtistEndpoint(this);
	}

	/**
	 * Get cdstub endpoint.
	 *
	 * @return CD Stub endpoint.
	 */
	public CDStubEndpoint cdstub() {
		return new CDStubEndpoint(this);
	}

	/**
	 * Get event endpoint.
	 *
	 * @return Event endpoint.
	 */
	public EventEndpoint event() {
		return new EventEndpoint(this);
	}

	/**
	 * Get genre endpoint.
	 *
	 * @return Genre endpoint.
	 */
	public GenreEndpoint genre() {
		return new GenreEndpoint(this);
	}

	/**
	 * Get instrument endpoint.
	 *
	 * @return Instrument endpoint.
	 */
	public InstrumentEndpoint instrument() {
		return new InstrumentEndpoint(this);
	}

	/**
	 * Get label endpoint.
	 *
	 * @return Label endpoint.
	 */
	public LabelEndpoint label() {
		return new LabelEndpoint(this);
	}

	/**
	 * Get place endpoint.
	 *
	 * @return Place endpoint.
	 */
	public PlaceEndpoint place() {
		return new PlaceEndpoint(this);
	}

	/**
	 * Get recording endpoint.
	 *
	 * @return Recording endpoint.
	 */
	public RecordingEndpoint recording() {
		return new RecordingEndpoint(this);
	}

	/**
	 * Get release endpoint.
	 *
	 * @return Release endpoint.
	 */
	public ReleaseEndpoint release() {
		return new ReleaseEndpoint(this);
	}

	/**
	 * Get release group endpoint.
	 *
	 * @return Release group endpoint.
	 */
	public ReleaseGroupEndpoint releaseGroup() {
		return new ReleaseGroupEndpoint(this);
	}

	/**
	 * Get series endpoint.
	 *
	 * @return Series endpoint.
	 */
	public SeriesEndpoint series() {
		return new SeriesEndpoint(this);
	}

	/**
	 * Get tag endpoint.
	 *
	 * @return Tag endpoint.
	 */
	public TagEndpoint tag() {
		return new TagEndpoint(this);
	}

	/**
	 * Get url endpoint.
	 *
	 * @return URL endpoint.
	 */
	public UrlEndpoint url() {
		return new UrlEndpoint(this);
	}

	/**
	 * Get work endpoint.
	 *
	 * @return Work endpoint.
	 */
	public WorkEndpoint work() {
		return new WorkEndpoint(this);
	}

	public <T> T get(String endpoint, Class<T> resultClass, Map<String, String> query) {
		try {
			HttpRequest request = getBuilder(endpoint, query).GET().build();
			return getResult(request, resultClass);
		} catch (MusicBrainzAPIException ex) {
			Logger.getLogger(MusicBrainzAPIClient.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
		}
		return null;
	}

	public <T> T post(String endpoint, Class<T> resultClass, Map<String, String> query, String postData) {
		try {
			HttpRequest request = getBuilder(endpoint, query).POST(BodyPublishers.ofString(postData)).build();
			return getResult(request, resultClass);
		} catch (MusicBrainzAPIException ex) {
			Logger.getLogger(MusicBrainzAPIClient.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}

	public <T> T put(String endpoint, Class<T> resultClass, Map<String, String> query, String postData) {
		try {
			HttpRequest request = getBuilder(endpoint, query).PUT(BodyPublishers.ofString(postData)).build();
			return getResult(request, resultClass);
		} catch (MusicBrainzAPIException ex) {
			Logger.getLogger(MusicBrainzAPIClient.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}

	public <T> T delete(String endpoint, Class<T> resultClass, Map<String, String> query) {
		try {
			HttpRequest request = getBuilder(endpoint, query).DELETE().build();
			return getResult(request, resultClass);
		} catch (MusicBrainzAPIException ex) {
			Logger.getLogger(MusicBrainzAPIClient.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}

	private <T> T getResult(HttpRequest request, Class<T> resultClass) throws MusicBrainzAPIException {
		try {
			//wait until rate limiter allow it.
			int requestId = MusicBrainzRateLimiter.getRequestId();
			return getResult(requestId, request, resultClass);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
			return null;
		}
	}

	private <T> T getResult(int requestId, HttpRequest request, Class<T> resultClass) throws InterruptedException, MusicBrainzAPIException {
		try {
			HttpClient client = HttpClient.newBuilder().followRedirects(HttpClient.Redirect.ALWAYS).build();
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
			String body = response.body();
			int statusCode = response.statusCode();
			if (testing) {
				lastBody = body;
			}
			if (statusCode >= 200 && statusCode < 300) {
				return GSON.fromJson(body, resultClass);
			} else {
				ErrorSchema status;
				try {
					status = GSON.fromJson(body, ErrorSchema.class);
				} catch (JsonSyntaxException ex) {
					status = new ErrorSchema();
					status.setError(String.valueOf(statusCode));
					status.setHelp(body);
				}
				throw new MusicBrainzAPIException(statusCode + ": MusicBrainz error" + status.getError() + ": " + status.getHelp());
			}
		} catch (IOException ex) {
			throw new MusicBrainzAPIException("Error while sending the request", ex);
		} finally {
			MusicBrainzRateLimiter.setRequestEnd(requestId);
		}
	}

	private HttpRequest.Builder getBuilder(String endpoint, Map<String, String> query) throws MusicBrainzAPIException {
		StringBuilder urlBuilder = new StringBuilder();
		if (query == null) {
			query = new HashMap<>();
		}
		for (Entry<String, String> param : query.entrySet()) {
			String value = param.getValue();
			if (value != null && value.trim().length() > 0) {
				urlBuilder.append(urlBuilder.isEmpty() ? "?" : "&");
				String key = param.getKey();
				value = URLEncoder.encode(value, StandardCharsets.UTF_8);
				urlBuilder.append(key).append("=").append(value);
			}
		}
		urlBuilder.insert(0, endpoint);
		URI contextURI;
		try {
			contextURI = new URI(baseUrl);
		} catch (URISyntaxException ex) {
			throw new MusicBrainzAPIException("Base url '" + baseUrl + "' malformed", ex);
		}
		URI requestUri;
		try {
			requestUri = contextURI.resolve(urlBuilder.toString());
		} catch (IllegalArgumentException ex) {
			throw new MusicBrainzAPIException("Request url malformed", ex);
		}
		HttpRequest.Builder builder = HttpRequest.newBuilder(requestUri)
				.setHeader("Content-Type", "application/json;charset=utf-8")
				.setHeader("accept", "application/json");

		if (userAgent != null) {
			builder.setHeader("userAgent", userAgent);
		}
		return builder;
	}

}
