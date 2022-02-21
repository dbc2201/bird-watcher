class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        throw new UnsupportedOperationException("Please implement the BirdCount.getToday() method");
    }

    public void incrementTodaysCount() {
        throw new UnsupportedOperationException("Please implement the BirdCount.incrementTodaysCount() method");
    }

    public boolean hasDayWithoutBirds() {
        throw new UnsupportedOperationException("Please implement the BirdCount.hasDayWithoutBirds() method");
    }

    public int getCountForFirstDays(int numberOfDays) {
        throw new UnsupportedOperationException("Please implement the BirdCount.getCountForFirstDays() method");
    }

    public int getBusyDays() {
        throw new UnsupportedOperationException("Please implement the BirdCount.getBusyDays() method");
    }
}
