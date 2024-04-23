package amarek.myProject.breathe;

public class HealthInfo {

    String mHealthInfo;
    int timeHasToPass;

    public String getmHealthInfo() {
        return mHealthInfo;
    }

    public void setmHealthInfo(String mHealthInfo) {
        this.mHealthInfo = mHealthInfo;
    }

    public int getTimeHasToPass() {
        return timeHasToPass;
    }

    public void setTimeHasToPass(int timeHasToPass) {
        this.timeHasToPass = timeHasToPass;
    }

    public HealthInfo() {
    }

    public HealthInfo(String mHealthInfo, int timeHasToPass) {
        this.mHealthInfo = mHealthInfo;
        this.timeHasToPass = timeHasToPass;
    }

}
