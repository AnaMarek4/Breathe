package amarek.myProject.breathe;

import java.util.Comparator;

public class TimeSorter implements Comparator<HealthInfo> {

    @Override
    public int compare(HealthInfo o1, HealthInfo o2) {
        return o1.getTimeHasToPass()-(o2.getTimeHasToPass());
    }
}
