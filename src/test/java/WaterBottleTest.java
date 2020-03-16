
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before(){
        waterbottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume(){
      assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void canSubtractTenFromVolume(){
        waterbottle.subtractVolume(10);
        assertEquals(90, waterbottle.getVolume());
    }

    @Test
    public void canEmptyTheWaterBottle(){
        waterbottle.subtractAll(100);
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void canFillBottleFull(){
    waterbottle.emptyAll();
    assertEquals(100, waterbottle.fillAll());
    }

}
