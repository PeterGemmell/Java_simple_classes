public class WaterBottle {
    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public void subtractVolume(int i){
         this.volume = this.volume - i;
    }

    public void subtractAll(int i){
        this.volume = this.volume -i;
    }

    public int emptyAll(){
       this.volume = 0;
       return this.volume;
    }

    public int fillAll(){
        this.volume = 100;
        return this.volume;
    }
}
