package es.bcnc.albums.repository.impl

import es.bcnc.albums.dto.AlbumDto
import es.bcnc.albums.dto.PhotoDto
import es.bcnc.albums.repository.IAlbumRepository
import org.springframework.stereotype.Repository
import org.springframework.web.client.RestTemplate

@Repository
class AlbumRepositoryImpl: IAlbumRepository {

    private val restTemplate = RestTemplate()

    override fun getAlbums(): List<AlbumDto> {
        //We do a request to JSON Placeholder API to get all albums
        val albums = restTemplate.getForObject("https://jsonplaceholder.typicode.com/albums", Array<AlbumDto>::class.java)
        if (albums != null) {
            return albums.toList()
        }
        return emptyList()
    }

    override fun getAlbum(id: Int): List<PhotoDto?> {
        //We do a request to JSON Placeholder API to get an album by id
        val photos = restTemplate.getForObject("https://jsonplaceholder.typicode.com/albums/$id/photos", Array<PhotoDto?>::class.java)
        if (photos != null) {
            return photos.toList()
        }
        return emptyList()
    }
}