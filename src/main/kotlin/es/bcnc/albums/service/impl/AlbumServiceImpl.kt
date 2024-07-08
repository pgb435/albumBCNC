package es.bcnc.albums.service.impl

import es.bcnc.albums.dto.AlbumDto
import es.bcnc.albums.dto.PhotoDto
import es.bcnc.albums.repository.IAlbumRepository
import es.bcnc.albums.repository.impl.AlbumRepositoryImpl
import es.bcnc.albums.service.IAlbumService
import org.springframework.stereotype.Service

@Service
class AlbumServiceImpl(var repository: IAlbumRepository) : IAlbumService {
    override fun getAlbums(): List<AlbumDto?> {
        return repository.getAlbums()
    }

    override fun getAlbum(id: Int): List<PhotoDto?> {
        return repository.getAlbum(id)
    }

}