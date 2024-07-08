package es.bcnc.albums.repository

import es.bcnc.albums.dto.AlbumDto
import es.bcnc.albums.dto.PhotoDto

interface IAlbumRepository {

    fun getAlbums(): List<AlbumDto>
    fun getAlbum(id: Int): List<PhotoDto?>
}