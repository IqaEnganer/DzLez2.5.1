package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

  @Test
  void findMax() {
    StatisticsService service = new StatisticsService();

    long[] incomesInBillions = {2,9, 5, 8, 4, 5, 3, 8, 7, 11, 10, 12,16};
    long expected = 16;

    long actual = service.findMax(incomesInBillions);

    assertEquals(expected, actual);
  }
}