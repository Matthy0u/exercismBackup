
class BirdWatcher {
    private final int[] birdsPerDay;
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1] +=1;
    }

    public boolean hasDayWithoutBirds() {
        for (int birdPerDay: birdsPerDay){
            if(birdPerDay == 0)
                return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int nbrBirds = 0;
        for (int i = 0; i < numberOfDays; i++){
            if(i < birdsPerDay.length)
                nbrBirds += birdsPerDay[i];
        }
        return nbrBirds;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int birdPerDay: birdsPerDay){
            if(birdPerDay >= 5)
                busyDays+=1;
        }
        return busyDays;
    }
}
