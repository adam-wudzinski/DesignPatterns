package structural.composite;


import java.util.ArrayList;
import java.util.List;

public class Party implements Composite{
    List<Composite> members = new ArrayList<>();

    public void addMember(Composite member) {
        members.add(member);
    }

    @Override
    public long getTotalGold() {
        long totalGold = 0;
        for (Composite comp : members) {
            totalGold += comp.getTotalGold();
        }
        return totalGold;
    }
}
