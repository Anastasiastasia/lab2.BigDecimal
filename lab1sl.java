import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
//import java.math.RoundingMode;

public class lab1sl {

public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("\nВведите дробное значение x: "); // через точку
        double x = Double.parseDouble(reader.readLine());

        System.out.print("Введите целое значение k: ");
        int k = Integer.parseInt(reader.readLine());
        System.out.println(); // пустая строка

        BigDecimal actualSin = new BigDecimal(Math.sin(x));
        System.out.printf("Фактическое значение по формуле sin(%.3f) = %10.7f\n", x, actualSin);
        System.out.println(); // пустая строка
        BigDecimal sum = TaylorSeries.computeSin(x, k);
        System.out.printf("Приближенное значение по формуле Тейлора sin(%.4f) = %10.7f\n", x, sum);
        System.out.println(); // пустая строка

        reader.close();
    }
}

class TaylorSeries {

    public static BigDecimal computeSin(double x, int k) {
        BigDecimal sum = BigDecimal.ZERO;
       BigDecimal term = BigDecimal.valueOf(x);
        int n=1;
          while(term.abs().compareTo(BigDecimal.valueOf(1).divide(BigDecimal.TEN.pow(k))) >= 0)
          {
            sum = sum.add(term);
            term=term.multiply(BigDecimal.valueOf(-1*x*x/((2*n)*(2*n+1))));
            
            //term = term.multiply(BigDecimal.valueOf(-1).multiply(BigDecimal.valueOf(x*x))).divide(BigDecimal.valueOf((2*n)*(2*n+1)));
            n++;
        }
        return sum;
    }
    
}
