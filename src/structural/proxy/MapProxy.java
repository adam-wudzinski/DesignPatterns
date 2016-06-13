package structural.proxy;


public class MapProxy extends Map{
    private static final int NUMBER_MONSTERS_ALLOWED = 5;
    private int currentNumberMonsters = 0;

    public void add(Monster monster){
        if (NUMBER_MONSTERS_ALLOWED < 5) {
            super.add(monster);
            currentNumberMonsters++;
        }
        else{
            System.out.println("There are too many monsters!");
        }
    }
}
