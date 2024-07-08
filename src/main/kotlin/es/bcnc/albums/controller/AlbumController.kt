package es.bcnc.albums.controller

import es.bcnc.albums.dto.AlbumDto
import es.bcnc.albums.dto.PhotoDto
import es.bcnc.albums.service.IAlbumService
import io.swagger.v3.oas.annotations.Operation
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/albums")
class AlbumController(val albumService : IAlbumService) {

    @Operation(summary = "Get all albums")
    @GetMapping
    fun getAlbums(): List<AlbumDto?> {
        return albumService.getAlbums()
    }

    @Operation(summary = "Get album by id")
    @GetMapping("/{id}")
    fun getAlbum(@PathVariable id: Int) : List<PhotoDto?>  {
      return albumService.getAlbum(id)
    }
}