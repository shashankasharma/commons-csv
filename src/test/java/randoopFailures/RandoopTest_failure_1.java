package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_1.test1");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withNullString("");
    org.apache.commons.csv.CSVFormat var5 = var1.withIgnoreHeaderCase();
    
    // Checks the contract:  equals-hashcode on var1 and var5
    assertTrue("Contract failed: equals-hashcode on var1 and var5", var1.equals(var5) ? var1.hashCode() == var5.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var5 and var1
    assertTrue("Contract failed: equals-hashcode on var5 and var1", var5.equals(var1) ? var5.hashCode() == var1.hashCode() : true);

  }

}
