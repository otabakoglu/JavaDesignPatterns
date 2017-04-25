package com.strategy;

import  java.lang.*;
public class TestJavaClass {

      public static void main(String[] args) {

            Printer multi = new MultiPrinter();
            multi.setFax(new FaxImpl());
            multi.fax();

            Printer laser = new MultiPrinter();
            laser.setFax(new NoFaxImpl());
            laser.fax();

      }


}
