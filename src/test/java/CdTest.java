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

  
}
