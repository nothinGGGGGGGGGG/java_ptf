package learnJava;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquateTests {

  @Test
  public void testArea () {
    Dogs s = new Dogs (1990);
    Assert.assertEquals(s.animals(), 1990);
  }
}
