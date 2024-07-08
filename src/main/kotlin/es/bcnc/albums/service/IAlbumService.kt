package es.bcnc.albums.service

import es.bcnc.albums.dto.AlbumDto
import es.bcnc.albums.dto.PhotoDto

interface IAlbumService {
    fun getAlbums(): List<AlbumDto?>
    fun getAlbum(id: Int): List<PhotoDto?>
}