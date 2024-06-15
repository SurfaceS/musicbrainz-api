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
package com.universalmediaserver.musicbrainz.api.schema.release;

import com.google.gson.annotations.SerializedName;
import com.universalmediaserver.musicbrainz.api.schema.label.LabelInfoSchema;
import com.universalmediaserver.musicbrainz.api.schema.tag.TagExtendedSchema;
import java.util.List;

/**
 * Release Schema.
 *
 * @author SurfaceS
 */
public class ReleaseLookupSchema extends ReleaseBaseSchema {

	@SerializedName("text-representation")
	private TextRepSchema textRepresentation;
	@SerializedName("label-info")
	private List<LabelInfoSchema> labelInfo;
	@SerializedName("packaging-id")
	private String packagingId;
	@SerializedName("packaging")
	private String packaging;
	@SerializedName("barcode")
	private String barcode;
	@SerializedName("asin")
	private String asin;
	@SerializedName("tags")
	private List<TagExtendedSchema> tags;
	@SerializedName("quality")
	private String quality;
	@SerializedName("cover-art-archive")
	private CoverArtArchiveSchema coverArtArchive;

	public TextRepSchema getTextRepresentation() {
		return textRepresentation;
	}

	public void setTextRepresentation(TextRepSchema textRepresentation) {
		this.textRepresentation = textRepresentation;
	}

	public List<LabelInfoSchema> getLabelInfo() {
		return labelInfo;
	}

	public void setLabelInfo(List<LabelInfoSchema> labelInfo) {
		this.labelInfo = labelInfo;
	}

	public String getPackagingId() {
		return packagingId;
	}

	public void setPackagingId(String packagingId) {
		this.packagingId = packagingId;
	}

	public String getPackaging() {
		return packaging;
	}

	public void setPackaging(String packaging) {
		this.packaging = packaging;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getAsin() {
		return asin;
	}

	public void setAsin(String asin) {
		this.asin = asin;
	}

	public List<TagExtendedSchema> getTags() {
		return tags;
	}

	public void setTags(List<TagExtendedSchema> tags) {
		this.tags = tags;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public CoverArtArchiveSchema getCoverArtArchive() {
		return coverArtArchive;
	}

	public void setCoverArtArchive(CoverArtArchiveSchema coverArtArchive) {
		this.coverArtArchive = coverArtArchive;
	}

}
