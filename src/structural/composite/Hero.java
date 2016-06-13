package structural.composite;


public class Hero implements Composite{
    private long gold;


    public Hero(long gold) {
        this.gold = gold;
    }

    @Override
    public long getTotalGold() {
        return gold;
    }
}
