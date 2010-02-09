package com.hirn;

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;


public class DbUnitRunner {

  public static void main(final String[] args) {
    System.out.println("\nDrivers Loaded\n\n");
    for (Enumeration e = DriverManager.getDrivers();e.hasMoreElements();){
      Driver d = (Driver) e.nextElement();
      System.out.println(d);
    }
    System.out.println("\n\n");
  }
}