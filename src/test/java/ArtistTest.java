import org.junit.*;
import static org.junit.Assert.*;

public class ArtistTest {

  @Test
  public void getArtist_instantiatesArtistTitleWithAlbumTitle() {
    Cd testCd = new Cd("album");
    Artist testArtist = new Artist(testCd);
    assertEquals("artist", testArtist.getArtist());
  }
}
