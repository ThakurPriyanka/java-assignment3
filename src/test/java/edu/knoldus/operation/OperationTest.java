package edu.knoldus.operation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class OperationTest {
    Operation operationObj;
    @Before
    public void setUp() throws Exception {
        operationObj = new Operation();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getDayOfBirth() {
        LocalDate birthDate = LocalDate.of(2017, 01,01);
        List<DayOfWeek> yearList = operationObj.getDayOfBirth(birthDate);
        List<DayOfWeek> expectedOutput =  new ArrayList();
        expectedOutput.add(DayOfWeek.SUNDAY);
        expectedOutput.add(DayOfWeek.MONDAY);
        assertEquals("Days of birthday does not match",expectedOutput,yearList);
    }

//    @Test
//    public void getTimeOfZone() {
//        LocalDateTime localtDateAndTime = LocalDateTime.now();
//        ZoneId zone = ZoneId.of("America/New_York");
//        ZonedDateTime actualOutput = operationObj.getTimeOfZone(zone);
//        ZonedDateTime expectedOutput = ZonedDateTime.of(localtDateAndTime, zone);
//        assertEquals("current time zone is not matching",expectedOutput,actualOutput);
//    }

    @Test
    public void getLeapYear() {
        LocalDate startYear = LocalDate.of(2016, 01,01);
        List<Integer> actualOutput = operationObj.getLeapYear(startYear);
        List<Integer> expectedOutput = new ArrayList<Integer>();
        expectedOutput.add(2016);
        assertEquals("List of lea year is not matching",expectedOutput,actualOutput);

    }

    @Test
    public void getTimeLived() {
        LocalDate gandhiDob = LocalDate.of(2016, 03, 10);
        LocalDate gandhiDeath = LocalDate.of(2018, 03, 10);
        Long actualOutput= operationObj.getTimeLived(gandhiDob, gandhiDeath);
        Long expectedOutput = Duration.ofDays(1).getSeconds() * 365 * 2;

        assertEquals("second passed is not matching",expectedOutput,actualOutput);
    }
}