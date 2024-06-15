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

/**
 * The supported data parameters to include for release.
 *
 * @author SurfaceS
 */
public enum ReleaseLookupInclude {

	ARTIST_CREDITS("artist-credits"),
	LABELS("labels"),
	DISCIDS("discids"),
	RECORDING("recordings");

	final String value;

	ReleaseLookupInclude(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}
}
