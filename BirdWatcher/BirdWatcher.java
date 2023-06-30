package BirdWatcher;

public class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    /*  TASK 1
     * Check what the counts were last week
        For comparison purposes, you always keep a copy of last week's counts nearby,
         which were: 0, 2, 5, 3, 7, 8 and 4. Implement the BirdWatcher.getLastWeek() method 
         that returns last week's counts:

        BirdWatcher.getLastWeek();
        // => [0, 2, 5, 3, 7, 8, 4]
     */
    public int[] getLastWeek() {

        return this.birdsPerDay; 
    }

    /*  TASK 2
     * Check how many birds visited today

        Implement the BirdWatcher.getToday() method to return how many birds visited your
        garden today. The bird counts are ordered by day, with the first element being the
        count of the oldest day, and the last element being today's count.

        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
        birdCount.getToday();
        // => 1

     */
    public int getToday() {
        if (this.getLastWeek().length == 0) {
            return 0;
        } else {
            return this.getLastWeek()[this.getLastElemIndex()];
        }
        
    }

    // this method returns the index of the last element of the array.
    public int getLastElemIndex() {
        return this.getLastWeek().length - 1;
    }

    /*  TASK 3
     * Increment today's count

        Implement the BirdWatcher.incrementTodaysCount() method to increment today's count:

        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
        birdCount.incrementTodaysCount();
        birdCount.getToday();
        // => 2

     */
    public void incrementTodaysCount() {
        this.getLastWeek()[this.getLastElemIndex()] += 1;
    }

    /*  TASK 4
     * Check if there was a day with no visiting birds

        Implement the BirdWatcher.hasDayWithoutBirds() method that returns true if there 
        was a day at which zero birds visited the garden; otherwise, return false:

        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
        birdCount.hasDayWithoutBirds();
        // => true

     */
    public boolean hasDayWithoutBirds() {
        boolean zeroDay = false;

        for (int day : this.getLastWeek()) {
            if (day == 0) {
                zeroDay = true;
                break;
            }
        }

        return zeroDay;
    }

    /*  TASK 5
     * Calculate the number of visiting birds for the first number of days

        Implement the BirdWatcher.getCountForFirstDays() method that returns the number of birds
        that have visited your garden from the start of the week, but limit the 
        count to the specified number of days from the start of the week.

        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
        birdCount.getCountForFirstDays(4);
        // => 14


     */
    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;

        if (numberOfDays > 7) {
            numberOfDays = this.getLastWeek().length;
        }

        for (int i = 0; i < numberOfDays; i++) {
            sum += this.getLastWeek()[i];
        }

        return sum;
    }

    /* TASK 6
     * Calculate the number of busy days

        Some days are busier that others. A busy day is one where five or more birds have
        visited your garden. Implement the BirdWatcher.getBusyDays() method to return 
        the number of busy days:

        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
        birdCount.getBusyDays();
        // => 2

     */
    public int getBusyDays() {
        int counter = 0;
        
        for (int day : birdsPerDay) {
            if (day >= 5) {
                counter++;
            }
        }

        return counter;
    }
}
