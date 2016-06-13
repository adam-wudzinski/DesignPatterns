package structural.composite;


import java.util.ArrayList;
import java.util.List;

public class Party implements Component {
    List<Component> members = new ArrayList<>();

    public void addMember(Component member) {
        members.add(member);
    }

    @Override
    public long getTotalGold() {
        long totalGold = 0;
        for (Component comp : members) {
            totalGold += comp.getTotalGold();
        }
        return totalGold;
    }
}
