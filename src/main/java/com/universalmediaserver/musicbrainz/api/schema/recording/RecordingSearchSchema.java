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
import com.universalmediaserver.musicbrainz.api.schema.release.ReleaseBaseSchema;
import java.util.List;

/**
 * Recording Schema.
 *
 * @author SurfaceS
 */
public class RecordingSearchSchema extends RecordingBaseSchema {

	@SerializedName("score")
	private Long score;

	@SerializedName("releases")
	private List<ReleaseBaseSchema> releases;
	@SerializedName("isrcs")
	private List<String> isrcs;

	public Long getScore() {
		return score;
	}

	public void setScore(Long score) {
		this.score = score;
	}

	public List<ReleaseBaseSchema> getReleases() {
		return releases;
	}

	public void setReleases(List<ReleaseBaseSchema> releases) {
		this.releases = releases;
	}

	public List<String> getIsrcs() {
		return isrcs;
	}

	public void setIsrcs(List<String> isrcs) {
		this.isrcs = isrcs;
	}

}
