import org.junit.Before;
import org.junit.Test;

import java.awt.print.Paper;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(500, 200, 100, 50);
    }

    @Test
    public void paperSheetsLeft(){
        assertEquals(500, printer.getPaper());
    }

//    @Test
//    public void numberOfPagesAndCopies(){
//        assertEquals(200,printer.getPagesAndCopies());
//        assertEquals(100,printer.getPagesAndCopies());
//    }

    @Test
    public void volumeOfToner(){
        assertEquals(50, printer.tonerVolume());
    }


}
