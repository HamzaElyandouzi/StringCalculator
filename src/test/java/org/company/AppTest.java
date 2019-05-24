package org.company;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest
{

   private StringCalculator maths;


   //will test the add method of the StringCalculator
   @Test
   public void addZero(){
      maths =  new StringCalculator();
      assertEquals(36, maths.add("//[**][%%]\n1**2%%33"));
   }

   //will test the getCount method of the StringCalculator
   //may fail the first time because the count may get reset.
   @Test
   public void getCount(){
      maths =  new StringCalculator();
      assertEquals(2,maths.getCalledCount());
   }
}
