public class Running_Time {
    String runningTime ; // count the running time by seconds an then count the minits and the hours

    String startingTime, endTime,runningDate;

    public Running_Time(String runningTime, String runningDate, String stringTime, String endTime) {
        this.runningTime = runningTime;
        this.runningDate = runningDate;
        this.startingTime = stringTime;
        this.endTime = endTime;
    }

    public String getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(String  runningTime) {
        this.runningTime = runningTime;
    }

    public String getRunningDate() {
        return runningDate;
    }

    public void setRunningDate(String runningDate) {
        this.runningDate = runningDate;
    }

    public String getStartingTime() {
        return startingTime;
    }

    public void setStartingTime(String startingTime) {
        this.startingTime = startingTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
