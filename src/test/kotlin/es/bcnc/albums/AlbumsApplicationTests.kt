package es.bcnc.albums

import com.nhaarman.mockito_kotlin.whenever
import es.bcnc.albums.dto.AlbumDto
import es.bcnc.albums.dto.PhotoDto
import es.bcnc.albums.service.IAlbumService
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class AlbumsApplicationTests {

	@Test
	fun contextLoads() {
	}

	@Test
	fun testGetAlbums() {
		val mockAlbumService = mock<IAlbumService>()

		whenever(mockAlbumService.getAlbums()).thenReturn(listOf(AlbumDto(1,  "quidem molestiae enim", 1)))

		val albums = mockAlbumService.getAlbums()

		assertEquals(1, albums.size)
	}

	@Test
	fun testGetAlbum() {
		val mockAlbumService = mock<IAlbumService>()

		whenever(mockAlbumService.getAlbum(1)).thenReturn(listOf(PhotoDto(1, 1, "accusamus beatae ad facilis cum similique qui sunt", "https://via.placeholder.com/600/92c952", "https://via.placeholder.com/600/92c952")))

		val photos = mockAlbumService.getAlbum(1)

		assertEquals(1, photos.size)
	}
}
