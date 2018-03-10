package edu.knoldus;

import edu.knoldus.operation.Operation;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class Application {

    public static void main(String[] args) {
        Operation operationObj = new Operation();
        LocalDate dateOfBirth = LocalDate.of(1994, 06, 18);
        System.out.println(operationObj.getDayOfBirth(dateOfBirth));
        ZoneId zone = ZoneId.of("America/New_York");
        System.out.println(operationObj.getTimeOfZone(zone));
        LocalDate year = LocalDate.of(1900, 01, 01);
        System.out.println(operationObj.getLeapYear(year));
        LocalDate gandhiDob = LocalDate.of(1869, 10, 02);
        LocalDate gandhiDeath = LocalDate.of( 1948, 01, 30);
        System.out.println(operationObj.getTimeLived(gandhiDob, gandhiDeath));
    }
}
