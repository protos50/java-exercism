package BirdWatcher;

public class BirdWatcherMain {
    public static void main(String[] args) {
        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };

        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);

        System.out.println( birdCount.hasDayWithoutBirds() );  // => true

       System.out.println(birdCount.getCountForFirstDays(4));

       System.out.println(birdCount.getBusyDays());
    }
}
