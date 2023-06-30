package NeedForSpeed;

public class NeedForSpeedMain {
    public static void main(String[] args) {
      RaceTrack raceTrack1 = new RaceTrack(252);

      NeedForSpeed car1 = new NeedForSpeed(5, 2);


      System.out.println(raceTrack1.tryFinishTrack(car1));
    }
}
