package structural.composite;

public class Main {

    public static void main(String[] args) {
        Party party1  = new Party();
        Party party2  = new Party();

        Component hero1 = new Hero(10);
        Component hero2 = new Hero(20);
        Component hero3 = new Hero(30);
        Component hero4 = new Hero(40);
        Component hero5 = new Hero(50);

        party1.addMember(hero1);
        party1.addMember(hero2);

        party2.addMember(hero3);
        party2.addMember(hero4);
        party2.addMember(hero5);

        party1.addMember(party2);

        System.out.println(party1.getTotalGold());
    }
}
