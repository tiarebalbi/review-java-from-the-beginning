package ch01.sec04;

import java.math.BigDecimal;


public class BigNumbers {

  public static void main(String[] args) {

    // Result: 0.89999...
    System.out.println(2.0 - 1.1);

    // Result: 0.9
    BigDecimal result = BigDecimal.valueOf(2,0).subtract(BigDecimal.valueOf(11,1));
    System.out.println(result);

  }

}
