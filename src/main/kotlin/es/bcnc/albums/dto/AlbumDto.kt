package es.bcnc.albums.dto

import es.bcnc.albums.dto.PhotoDto
import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "Album data transfer object")
data class AlbumDto(val id: Long, val title: String, val userId: Long)
