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
package com.universalmediaserver.musicbrainz.api.schema.recording;

import com.google.gson.annotations.SerializedName;
import com.universalmediaserver.musicbrainz.api.schema.release.ReleaseSchemaExtended;
import java.util.List;

/**
 * Recording Schema.
 *
 * @author SurfaceS
 */
public class RecordingLookupSchema extends RecordingBaseSchema {

	@SerializedName("releases")
	private List<ReleaseSchemaExtended> releases;
	@SerializedName("isrcs")
	private List<String> isrcs;

	public List<ReleaseSchemaExtended> getReleases() {
		return releases;
	}

	public void setReleases(List<ReleaseSchemaExtended> releases) {
		this.releases = releases;
	}

	public List<String> getIsrcs() {
		return isrcs;
	}

	public void setIsrcs(List<String> isrcs) {
		this.isrcs = isrcs;
	}

}
