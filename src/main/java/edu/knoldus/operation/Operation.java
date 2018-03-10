package edu.knoldus.operation;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Operation {
    /**
     *@param birthDate . from year we have to print days
     * @return listOfDay . list of day on which birthday fall
     */
    public List<DayOfWeek> getDayOfBirth(LocalDate birthDate) {
        LocalDate today = LocalDate.now();
        List<DayOfWeek> listOfDay = new ArrayList<DayOfWeek>();
        LocalDate nextYear = birthDate;
        Integer year = today.getYear() + 1;
        while(!year.equals(nextYear.getYear())){
            listOfDay.add(nextYear.getDayOfWeek());
            nextYear = nextYear.plus(1, ChronoUnit.YEARS);

        }
        return listOfDay;
    }

    /**
     * @param zone . get the zoneID whose current time to print
     * @return dateAndTimeInNewYork . return the current time of the zone
     */
    public ZonedDateTime getTimeOfZone(ZoneId zone) {
        LocalDateTime localtDateAndTime = LocalDateTime.now();
        return ZonedDateTime.of(localtDateAndTime, zone );
    }

    /**
     * @param startYear . date from which to leap year to calculate
     * @return listOfLeapYear . list of leap year
     */
    public List<Integer> getLeapYear(LocalDate startYear) {
        LocalDate today = LocalDate.now();
        List<Integer> listOfLeapYear = new ArrayList<Integer>();
        LocalDate nextYear = startYear;
        Integer year = today.getYear();
        while(!year.equals(nextYear.getYear())){
            if(nextYear.isLeapYear()) {
                listOfLeapYear.add(nextYear.getYear());
            }
            nextYear = nextYear.plus(1, ChronoUnit.YEARS);
        }
        return listOfLeapYear;
    }

    /**
     * @param gandhiDob . starting date from which to calculate second
     * @param gandhiDeath . date till which second to be calculated
     * @return number of second between the date
     */

    public Long getTimeLived(LocalDate gandhiDob, LocalDate gandhiDeath) {
        Long leapYear = 366L;
        Long oddYear = 365L;
        Duration oneDay = Duration.ofDays(1);
        LocalDate nextYear = gandhiDob;
        Integer year = gandhiDeath.getYear();
        Long secondLived = 0L;
        while(!year.equals(nextYear.getYear())){
            if(nextYear.isLeapYear()) {
                secondLived = leapYear * oneDay.getSeconds();
            }
            else {
                secondLived = oddYear * oneDay.getSeconds();
            }
            nextYear = nextYear.plus(1, ChronoUnit.YEARS);
        }
        return secondLived;
    }
}
