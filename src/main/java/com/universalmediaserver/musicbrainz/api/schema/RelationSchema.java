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
package com.universalmediaserver.musicbrainz.api.schema;

import com.google.gson.annotations.SerializedName;
import com.universalmediaserver.musicbrainz.api.schema.artist.ArtistSchema;
import com.universalmediaserver.musicbrainz.api.schema.place.PlaceSchema;
import com.universalmediaserver.musicbrainz.api.schema.recording.RecordingBaseSchema;
import com.universalmediaserver.musicbrainz.api.schema.release.ReleaseBaseSchema;
import java.util.List;

/**
 * Relation Schema.
 *
 * @author SurfaceS
 */
public class RelationSchema {

	@SerializedName("target-type")
	private String targetType;
	@SerializedName("type")
	private String type;
	@SerializedName("type-id")
	private String typeId;
	@SerializedName("direction")
	private String direction;
	@SerializedName("source-credit")
	private String sourceCredit;
	@SerializedName("target-credit")
	private String targetCredit;
	@SerializedName("begin")
	private Object begin;
	@SerializedName("end")
	private Object end;
	@SerializedName("attributes")
	private List<Object> attributes;
	@SerializedName("attribute-ids")
	private Object attributeIds;
	@SerializedName("attribute-values")
	private Object attributeValues;
	@SerializedName("ended")
	private Boolean ended;
	@SerializedName("artist")
	private ArtistSchema artist;
	@SerializedName("place")
	private PlaceSchema place;
	@SerializedName("release")
	ReleaseBaseSchema release;
	@SerializedName("recording")
	RecordingBaseSchema recording;

	public String getTargetType() {
		return targetType;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getSourceCredit() {
		return sourceCredit;
	}

	public void setSourceCredit(String sourceCredit) {
		this.sourceCredit = sourceCredit;
	}

	public String getTargetCredit() {
		return targetCredit;
	}

	public void setTargetCredit(String targetCredit) {
		this.targetCredit = targetCredit;
	}

	public Object getBegin() {
		return begin;
	}

	public void setBegin(Object begin) {
		this.begin = begin;
	}

	public Object getEnd() {
		return end;
	}

	public void setEnd(Object end) {
		this.end = end;
	}

	public List<Object> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<Object> attributes) {
		this.attributes = attributes;
	}

	public Object getAttributeIds() {
		return attributeIds;
	}

	public void setAttributeIds(Object attributeIds) {
		this.attributeIds = attributeIds;
	}

	public Object getAttributeValues() {
		return attributeValues;
	}

	public void setAttributeValues(Object attributeValues) {
		this.attributeValues = attributeValues;
	}

	public Boolean getEnded() {
		return ended;
	}

	public void setEnded(Boolean ended) {
		this.ended = ended;
	}

	public ArtistSchema getArtist() {
		return artist;
	}

	public void setArtist(ArtistSchema artist) {
		this.artist = artist;
	}

	public PlaceSchema getPlace() {
		return place;
	}

	public void setPlace(PlaceSchema place) {
		this.place = place;
	}

	public ReleaseBaseSchema getRelease() {
		return release;
	}

	public void setRelease(ReleaseBaseSchema release) {
		this.release = release;
	}

	public RecordingBaseSchema getRecording() {
		return recording;
	}

	public void setRecording(RecordingBaseSchema recording) {
		this.recording = recording;
	}

}
