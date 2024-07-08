package es.bcnc.albums.repository

import es.bcnc.albums.dto.AlbumDto

interface IAlbumRepository {

    fun getAlbums(): List<AlbumDto>
    fun getAlbum(id: Long): AlbumDto
}