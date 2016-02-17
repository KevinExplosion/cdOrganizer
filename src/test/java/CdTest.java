import org.junit.*;
import static org.junit.Assert.*;

public class CdTest {

  @Test
  public void cd_instantiantesCorrectly_true() {
    Cd myCd = new Cd("cd name");
    assertEquals(true, myCd instanceof Cd);
  }
}
