package es.bcnc.albums.dto

import es.bcnc.albums.dto.PhotoDto

data class AlbumDto(val id: Long, val title: String, val photos: List<PhotoDto>)
