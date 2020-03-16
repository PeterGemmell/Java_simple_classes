import java.awt.print.Paper;

public class Printer {
    private int paper;
    private int pages;
    private int copies;
    private int volume;

    public Printer(int paper, int pages, int copies, int volume){
    this.paper = paper;
//    this.pages = pages;
//    this.copies = copies;
    this.volume = volume;
    }

    public int getPaper() {
        return this.paper;
    }

//    public int getPagesAndCopies(){
//        return this.copies + this.pages;
//    }

    public int tonerVolume(){
        return this.volume;
    }
}