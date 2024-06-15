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
package com.universalmediaserver.musicbrainz.api.schema.event;

import com.google.gson.annotations.SerializedName;
import com.universalmediaserver.musicbrainz.api.schema.SearchResultsSchema;
import java.util.List;

/**
 * Event Search Results Schema.
 *
 * @author SurfaceS
 */
public class EventSearchResultsSchema extends SearchResultsSchema {

	@SerializedName("events")
	private List<EventSearchSchema> events;

	public List<EventSearchSchema> getEvents() {
		return events;
	}

	public void setEvents(List<EventSearchSchema> events) {
		this.events = events;
	}

}
