package es.bcnc.albums.service

import es.bcnc.albums.dto.AlbumDto

interface IAlbumService {
    fun getAlbums(): List<AlbumDto>
    fun getAlbum(id: Long): AlbumDto
}