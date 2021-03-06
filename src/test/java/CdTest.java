import org.junit.*;
import static org.junit.Assert.*;

public class CdTest {

  @Test
  public void cd_instantiantesCorrectly_true() {
    Cd myCd = new Cd("cd name");
    assertEquals(true, myCd instanceof Cd);
  }

  @Test
  public void cd_instantiantesWithTitle_true() {
    Cd myCd = new Cd("cd name");
    assertEquals("cd name", myCd.getTitle());
  }

  @Test
  public void cd_instantiantesWithArtist_true() {
    Cd myCd = new Cd("cd name");
    myCd.setArtist("artist name");
    assertEquals("artist name" , myCd.getArtist());
  }

  @Test
  public void all_returnsAllInstancesOfCd() {
    Cd firstCd = new Cd ("cd 1");
    Cd secondCd = new Cd ("cd 2");
    assertTrue(Cd.all().contains(firstCd));
    assertTrue(Cd.all().contains(secondCd));
  }

  @Test
  public void getId_taskInstantiateWithAnID_true() {
    Cd myCd = new Cd("cd name");
    assertEquals(Cd.all().size(), myCd.getId());
  }

  @Test
  public void find_retrievesCdTitleByID() {
    Cd firstCd = new Cd("cd name");
    Cd secondCd = new Cd("other cd");
    assertEquals(Cd.find(secondCd.getId()), secondCd);
  }
}
