import org.junit.jupiter.api.Test;  // импортируем org.junit.jupiter.api.Test (JUnit 5)
//import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//import static org.junit.jupiter.api.Assertions.assertTrue;
import java.math.BigDecimal;        // импортируем класс BigDecimal для операции с очень большими и очень маленькими числами с плавающей запятой

//import java.math.BigDecimal;
public class lab1sltest{
  @Test                                                       // создаем аннотацию Test из фреймворка JUnit, которая помечает метод как тестовый случай, 
                                                        
    public void testcomputeSin () {                            
        BigDecimal bdfiks = new BigDecimal("0.56663893715854525500211175453049838505279466807759852080"); // задаем правильный результат для сравнения
        assertTrue(bdfiks.compareTo(TaylorSeries.computeSin(2.54, 2)) == 0); 
        System.out.println("Test testcomputeSin - OK!");      
    }
    @Test
void testComputeSinNegativeX() {
    double x = -1.0;
    int k = 5;
    @SuppressWarnings("deprecation")
    BigDecimal expected = new BigDecimal(Math.sin(x)).setScale(k, BigDecimal.ROUND_HALF_UP);
    @SuppressWarnings("deprecation")
    BigDecimal actual = TaylorSeries.computeSin(x, k).setScale(k, BigDecimal.ROUND_HALF_UP);
    assertEquals(expected, actual);
}
@Test
void testComputeSinLargeK() {
    double x = 0.5;
    int k = 10;
    @SuppressWarnings("deprecation")
    BigDecimal expected = new BigDecimal(Math.sin(x)).setScale(k, BigDecimal.ROUND_HALF_UP);
    @SuppressWarnings("deprecation")
    BigDecimal actual = TaylorSeries.computeSin(x, k).setScale(k, BigDecimal.ROUND_HALF_UP);
    assertEquals(expected, actual);
}
@Test
void testComputeSin() {
    double x = 1.0;
    int k = 5;
    @SuppressWarnings("deprecation")
    BigDecimal expected = new BigDecimal(Math.sin(x)).setScale(k, BigDecimal.ROUND_HALF_UP);
    @SuppressWarnings("deprecation")
    BigDecimal actual = TaylorSeries.computeSin(x, k).setScale(k, BigDecimal.ROUND_HALF_UP);

    assertEquals(expected, actual);
}

@Test
void testComputeSinZeroX() {
    double x = 0.0;
    int k = 5;

    @SuppressWarnings("deprecation")
    BigDecimal expected = new BigDecimal(Math.sin(x)).setScale(k, BigDecimal.ROUND_HALF_UP);
    @SuppressWarnings("deprecation")
    BigDecimal actual = TaylorSeries.computeSin(x, k).setScale(k, BigDecimal.ROUND_HALF_UP);

    assertEquals(expected, actual);
}
public void compareTotestcomputeSin2() {                           // создаем тестовый метод compareTotestcomputeSin2, 
          
BigDecimal actSin = new BigDecimal(Math.sin(2.54));          // actSin присваиваем значение, расчитанное Math.sin(2.54)
BigDecimal compSin = (TaylorSeries.computeSin(2.54, 20));  // compSin присваиваем значение, расчитанное TaylorSeries.computeSin(2.54, 20)

String actSinResult = String.format("%.14f", actSin);   
    // 14 знаков после запятой
String compSinResult = String.format("%.14f", compSin); 
    // 14 знаков после запятой
assertTrue(actSinResult.compareTo(compSinResult) == 0);      
    // возвращаем нуль, если объекты равны

System.out.println(actSinResult);                              // выводим резельтат расчета actSinResult в консоль отладки если тест пройден
System.out.println(compSinResult);                             // выводим резельтат расчета actSinResult в консоль отладки если тест пройден
System.out.println("Test2 compareTotestcomputeSin2 - OK!");  
}
}
    
