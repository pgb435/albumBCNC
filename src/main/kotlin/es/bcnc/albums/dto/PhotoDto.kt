package es.bcnc.albums.dto

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "Photo data transfer object")
data class PhotoDto(val albumId: Long, val id: Long, val title: String, val url: String, val thumbnailUrl: String)
