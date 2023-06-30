package Gigasecond;

import java.time.LocalDate;

import java.time.LocalDateTime;

public class Gigasecond {

    private LocalDateTime currentTime;

    public Gigasecond(LocalDate moment) {

        this.currentTime = moment.atStartOfDay();
    }

    public Gigasecond(LocalDateTime moment) {

        this.currentTime = moment;

    }

    public LocalDateTime getDateTime() {

        return this.currentTime.plusSeconds(1000000000);

    }

}
