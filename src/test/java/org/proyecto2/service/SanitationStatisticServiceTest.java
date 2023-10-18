/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package org.proyecto2.service;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author estebanh
 */
public class SanitationStatisticServiceTest {
    
    public SanitationStatisticServiceTest() {
    }

    @Test
    public void testAverageWaterAccess() {
        System.out.println("averageWaterAccess");
        SanitationStatisticService instance = new SanitationStatisticServiceImpl();
        Double expResult = null;
        Double result = instance.averageWaterAccess();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testCountryGreaterAccessWater() {
        System.out.println("countryGreaterAccessWater");
        SanitationStatisticService instance = new SanitationStatisticServiceImpl();
        String expResult = "";
        String result = instance.countryGreaterAccessWater();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testMedianPopulation() {
        System.out.println("medianPopulation");
        SanitationStatisticService instance = new SanitationStatisticServiceImpl();
        Double expResult = null;
        Double result = instance.medianPopulation();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testAveragePopulationAffectedByDrought() {
        System.out.println("averagePopulationAffectedByDrought");
        SanitationStatisticService instance = new SanitationStatisticServiceImpl();
        Double expResult = null;
        Double result = instance.averagePopulationAffectedByDrought();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testVarianceAffectedPopulationDroughts() {
        System.out.println("varianceAffectedPopulationDroughts");
        Double averagePopulationAffectedByDrought = null;
        SanitationStatisticService instance = new SanitationStatisticServiceImpl();
        Double expResult = null;
        Double result = instance.varianceAffectedPopulationDroughts(averagePopulationAffectedByDrought);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSortData() {
        System.out.println("sortData");
        ArrayList<Integer> list = null;
        SanitationStatisticService instance = new SanitationStatisticServiceImpl();
        ArrayList<Integer> expResult = null;
        ArrayList<Integer> result = instance.sortData(list);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    public class SanitationStatisticServiceImpl implements SanitationStatisticService {

        public Double averageWaterAccess() {
            return null;
        }

        public String countryGreaterAccessWater() {
            return "";
        }

        public Double medianPopulation() {
            return null;
        }

        public Double averagePopulationAffectedByDrought() {
            return null;
        }

        public Double varianceAffectedPopulationDroughts(Double averagePopulationAffectedByDrought) {
            return null;
        }

        public ArrayList<Integer> sortData(ArrayList<Integer> list) {
            return null;
        }
    }
    
}
