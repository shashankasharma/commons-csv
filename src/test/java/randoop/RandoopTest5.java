package randoop;

import junit.framework.*;

public class RandoopTest5 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test1");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var3 = var2.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var5 = var2.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVParser var6 = org.apache.commons.csv.CSVParser.parse("", var5);
    long var7 = var6.getCurrentLineNumber();
    long var8 = var6.getCurrentLineNumber();
    java.util.List var9 = var6.getRecords();
    long var10 = var6.getCurrentLineNumber();
    java.util.Map var11 = var6.getHeaderMap();
    var6.close();
    long var13 = var6.getRecordNumber();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var14 = var6.getRecords();
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test2");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withNullString("");
    org.apache.commons.csv.CSVFormat var5 = var1.withIgnoreEmptyLines();
    java.lang.String[] var6 = var5.getHeaderComments();
    org.apache.commons.csv.CSVFormat var8 = var5.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var10 = var8.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.QuoteMode var11 = var8.getQuoteMode();
    org.apache.commons.csv.CSVFormat var13 = var8.withQuote('4');
    org.apache.commons.csv.CSVFormat var15 = var8.withQuote((java.lang.Character)'#');
    java.lang.Character var16 = var8.getEscapeCharacter();
    java.lang.Character var17 = var8.getCommentMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test3");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    boolean var3 = var2.isCommentMarkerSet();
    java.lang.Character var4 = var2.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var6 = var2.withIgnoreEmptyLines(false);
    org.apache.commons.csv.CSVParser var7 = org.apache.commons.csv.CSVParser.parse("Delimiter=< > Escape=<4> EmptyLines:ignored SkipHeaderRecord:false", var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test4");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    boolean var4 = var1.isCommentMarkerSet();
    boolean var5 = var1.getIgnoreHeaderCase();
    java.lang.String[] var7 = new java.lang.String[] { "Delimiter=< > SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var8 = var1.withHeader(var7);
    org.apache.commons.csv.CSVFormat var10 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var11 = var10.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var12 = var10.withSkipHeaderRecord();
    boolean var13 = var10.isCommentMarkerSet();
    boolean var14 = var10.getIgnoreHeaderCase();
    java.lang.String[] var16 = new java.lang.String[] { "Delimiter=< > SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var17 = var10.withHeader(var16);
    org.apache.commons.csv.CSVFormat var18 = var1.withHeader(var16);
    org.apache.commons.csv.CSVFormat var20 = var18.withIgnoreSurroundingSpaces(true);
    java.lang.Character var21 = var18.getCommentMarker();
    org.apache.commons.csv.CSVFormat var22 = var18.withIgnoreEmptyLines();
    java.lang.String[] var23 = var18.getHeader();
    org.apache.commons.csv.CSVFormat var24 = var18.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var26 = var18.withSkipHeaderRecord(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test5");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    char var2 = var1.getDelimiter();
    java.lang.String var3 = var1.getNullString();
    boolean var4 = var1.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var5 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.QuoteMode var6 = var1.getQuoteMode();
    java.lang.Character var7 = var1.getCommentMarker();
    org.apache.commons.csv.CSVFormat var9 = var1.withRecordSeparator('a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == ' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test6");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    char var2 = var1.getDelimiter();
    java.lang.String var3 = var1.getNullString();
    boolean var4 = var1.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var5 = var1.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var7 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var8 = var7.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var9 = var7.withSkipHeaderRecord();
    java.lang.String var10 = var9.toString();
    org.apache.commons.csv.CSVFormat var12 = var9.withNullString("");
    org.apache.commons.csv.CSVFormat var14 = var12.withEscape((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var16 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var17 = var16.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var18 = var16.withSkipHeaderRecord();
    boolean var19 = var16.isCommentMarkerSet();
    boolean var20 = var16.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var22 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var23 = var22.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var25 = var22.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var27 = var22.withNullString("Delimiter=< > SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var28 = var27.withIgnoreSurroundingSpaces();
    java.lang.Object[] var29 = new java.lang.Object[] { var27};
    java.lang.String var30 = var16.format(var29);
    java.lang.String[] var32 = new java.lang.String[] { "Default Excel MySQL RFC4180 TDF"};
    org.apache.commons.csv.CSVFormat var33 = var16.withHeader(var32);
    org.apache.commons.csv.CSVFormat var34 = var12.withHeader(var32);
    org.apache.commons.csv.CSVFormat var35 = var34.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var37 = var34.withIgnoreHeaderCase(false);
    boolean var38 = var5.equals((java.lang.Object)false);
    org.apache.commons.csv.CSVFormat var40 = var5.withDelimiter('4');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == ' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var10.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false"+ "'", var30.equals("Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test7");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    java.lang.String var4 = var3.toString();
    org.apache.commons.csv.CSVFormat var6 = var3.withNullString("");
    org.apache.commons.csv.CSVFormat var8 = var3.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var9 = var8.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var10 = var8.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var12 = var8.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var14 = var12.withQuote((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var16 = var14.withQuote((java.lang.Character)'#');
    org.apache.commons.csv.CSVFormat var18 = var16.withNullString("Delimiter=< > QuoteChar=<#> NullString=<Delimiter=< > SkipHeaderRecord:true> SurroundingSpaces:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var20 = var16.withRecordSeparator("Delimiter=< > QuoteChar=<a> SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var22 = var20.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var24 = var22.withAllowMissingColumnNames(false);
    org.apache.commons.csv.CSVFormat var26 = var24.withQuote('#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var4.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test8");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    char var2 = var1.getDelimiter();
    java.lang.String var3 = var1.getNullString();
    boolean var4 = var1.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var5 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var7 = var1.withEscape((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var9 = var7.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var11 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var12 = var11.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var14 = var11.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var16 = var11.withNullString("Delimiter=< > SkipHeaderRecord:true");
    boolean var17 = var16.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var19 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var20 = var19.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var21 = var19.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var23 = var21.withAllowMissingColumnNames(true);
    java.lang.String var24 = var23.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var26 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var27 = var26.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var29 = var26.withNullString("");
    org.apache.commons.csv.CSVFormat var30 = var26.withIgnoreEmptyLines();
    java.lang.String var31 = var30.toString();
    org.apache.commons.csv.CSVFormat var33 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var34 = var33.withAllowMissingColumnNames();
    boolean var35 = var33.isNullStringSet();
    java.lang.String[] var37 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var38 = var33.withHeader(var37);
    org.apache.commons.csv.CSVFormat var39 = var30.withHeader(var37);
    java.lang.String var40 = var23.format((java.lang.Object[])var37);
    org.apache.commons.csv.CSVFormat var41 = var16.withHeaderComments((java.lang.Object[])var37);
    boolean var42 = var9.equals((java.lang.Object)var16);
    org.apache.commons.csv.CSVFormat var44 = var16.withNullString("ALL MINIMAL NON_NUMERIC NONEDelimiter=< > SkipHeaderRecord:true");
    java.lang.String var45 = var44.getRecordSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == ' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false"+ "'", var31.equals("Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + ""+ "'", var40.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test9");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var3 = var2.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var4 = var2.withSkipHeaderRecord();
    boolean var5 = var2.isCommentMarkerSet();
    boolean var6 = var2.getIgnoreHeaderCase();
    java.lang.String[] var8 = new java.lang.String[] { "Delimiter=< > SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var9 = var2.withHeader(var8);
    org.apache.commons.csv.CSVFormat var11 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var12 = var11.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var13 = var11.withSkipHeaderRecord();
    boolean var14 = var11.isCommentMarkerSet();
    boolean var15 = var11.getIgnoreHeaderCase();
    java.lang.String[] var17 = new java.lang.String[] { "Delimiter=< > SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var18 = var11.withHeader(var17);
    org.apache.commons.csv.CSVFormat var19 = var2.withHeader(var17);
    org.apache.commons.csv.CSVFormat var21 = var19.withDelimiter('4');
    org.apache.commons.csv.CSVFormat var23 = var19.withIgnoreEmptyLines(false);
    org.apache.commons.csv.CSVFormat var25 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var26 = var25.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var27 = var25.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var29 = var27.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var31 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var32 = var31.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var33 = var31.withSkipHeaderRecord();
    java.lang.String var34 = var33.toString();
    org.apache.commons.csv.CSVFormat var36 = var33.withNullString("");
    org.apache.commons.csv.CSVFormat var38 = var33.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var40 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var41 = var40.withAllowMissingColumnNames();
    boolean var42 = var40.isNullStringSet();
    java.lang.String[] var44 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var45 = var40.withHeader(var44);
    java.lang.String var46 = var38.format((java.lang.Object[])var44);
    java.lang.String var47 = var29.format((java.lang.Object[])var44);
    org.apache.commons.csv.CSVFormat var48 = var19.withHeaderComments((java.lang.Object[])var44);
    org.apache.commons.csv.CSVFormat var50 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var51 = var50.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var53 = var50.withNullString("");
    org.apache.commons.csv.CSVFormat var54 = var50.withIgnoreEmptyLines();
    java.lang.String[] var55 = var54.getHeaderComments();
    org.apache.commons.csv.CSVFormat var57 = var54.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var59 = var57.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var61 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var62 = var61.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var63 = var61.withSkipHeaderRecord();
    boolean var64 = var61.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var66 = var61.withCommentMarker((java.lang.Character)'a');
    boolean var67 = var59.equals((java.lang.Object)var66);
    org.apache.commons.csv.CSVFormat var69 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var71 = var69.withRecordSeparator("#");
    org.apache.commons.csv.CSVFormat var73 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var74 = var73.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var76 = var73.withCommentMarker('#');
    java.lang.String[] var77 = var73.getHeaderComments();
    org.apache.commons.csv.CSVFormat var79 = var73.withQuote((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var81 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var82 = var81.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var83 = var81.withSkipHeaderRecord();
    boolean var84 = var81.isCommentMarkerSet();
    boolean var85 = var81.getIgnoreHeaderCase();
    java.lang.String[] var87 = new java.lang.String[] { "Delimiter=< > SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var88 = var81.withHeader(var87);
    org.apache.commons.csv.CSVFormat var89 = var73.withHeader(var87);
    java.lang.String var90 = var71.format((java.lang.Object[])var87);
    org.apache.commons.csv.CSVFormat var91 = var66.withHeaderComments((java.lang.Object[])var87);
    org.apache.commons.csv.CSVFormat var92 = var48.withHeader(var87);
    org.apache.commons.csv.CSVFormat var94 = var48.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var96 = var48.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVParser var97 = org.apache.commons.csv.CSVParser.parse("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:true Header:[]", var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var34.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + ""+ "'", var46.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + ""+ "'", var47.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var90 + "' != '" + "Delimiter=< > SkipHeaderRecord:true#"+ "'", var90.equals("Delimiter=< > SkipHeaderRecord:true#"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test10");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    boolean var4 = var1.isCommentMarkerSet();
    java.lang.Character var5 = var1.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var6 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var8 = var1.withRecordSeparator("");
    boolean var9 = var1.getSkipHeaderRecord();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test11");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var6 = var1.withNullString("Delimiter=< > SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var7 = var6.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var9 = var7.withIgnoreSurroundingSpaces(false);
    java.lang.String var10 = var9.toString();
    org.apache.commons.csv.CSVFormat var11 = var9.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var13 = var11.withRecordSeparator('a');
    boolean var14 = var11.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var16 = var11.withIgnoreHeaderCase(false);
    java.lang.Character var17 = var16.getQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false"+ "'", var10.equals("Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test12");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    boolean var3 = var1.isNullStringSet();
    java.lang.String[] var5 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var6 = var1.withHeader(var5);
    org.apache.commons.csv.CSVFormat var8 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var9 = var8.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var10 = var8.withSkipHeaderRecord();
    boolean var11 = var8.isCommentMarkerSet();
    boolean var12 = var8.getIgnoreHeaderCase();
    java.lang.String[] var14 = new java.lang.String[] { "Delimiter=< > SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var15 = var8.withHeader(var14);
    org.apache.commons.csv.CSVFormat var17 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var18 = var17.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var19 = var17.withSkipHeaderRecord();
    boolean var20 = var17.isCommentMarkerSet();
    boolean var21 = var17.getIgnoreHeaderCase();
    java.lang.String[] var23 = new java.lang.String[] { "Delimiter=< > SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var24 = var17.withHeader(var23);
    org.apache.commons.csv.CSVFormat var25 = var8.withHeader(var23);
    java.lang.String var26 = var6.format((java.lang.Object[])var23);
    org.apache.commons.csv.CSVFormat var28 = var6.withQuote('4');
    org.apache.commons.csv.CSVFormat var30 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var31 = var30.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var33 = var30.withNullString("");
    org.apache.commons.csv.CSVFormat var34 = var30.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var36 = var34.withDelimiter('4');
    org.apache.commons.csv.CSVFormat var38 = var36.withQuote(' ');
    boolean var39 = var38.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var40 = var38.withAllowMissingColumnNames();
    boolean var41 = var6.equals((java.lang.Object)var38);
    org.apache.commons.csv.CSVFormat var43 = var38.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var44 = var43.withIgnoreSurroundingSpaces();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var26.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test13");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var3 = var2.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var5 = var2.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var7 = var2.withNullString("Delimiter=< > SkipHeaderRecord:true");
    java.lang.Character var8 = var7.getCommentMarker();
    org.apache.commons.csv.CSVParser var9 = org.apache.commons.csv.CSVParser.parse("", var7);
    org.apache.commons.csv.CSVFormat var11 = var7.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var13 = var7.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var15 = var7.withIgnoreEmptyLines(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test14");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    boolean var3 = var2.isCommentMarkerSet();
    boolean var4 = var2.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVParser var5 = org.apache.commons.csv.CSVParser.parse("", var2);
    boolean var6 = var5.isClosed();
    java.util.Map var7 = var5.getHeaderMap();
    long var8 = var5.getRecordNumber();
    var5.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test15");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    boolean var3 = var1.isNullStringSet();
    java.lang.String[] var5 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var6 = var1.withHeader(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat var8 = var6.withQuote(' ');
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test16");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var3 = var2.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var5 = var2.withRecordSeparator("hi!");
    boolean var6 = var5.isCommentMarkerSet();
    java.lang.Character var7 = var5.getEscapeCharacter();
    org.apache.commons.csv.CSVFormat var9 = var5.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var11 = var9.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVParser var12 = org.apache.commons.csv.CSVParser.parse("Delimiter=< > SkipHeaderRecord:trueDelimiter=< > RecordSeparator=<4> EmptyLines:ignored SkipHeaderRecord:false Header:[]", var9);
    boolean var13 = var9.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var15 = var9.withNullString("aa");
    org.apache.commons.csv.CSVFormat var16 = var15.withSkipHeaderRecord();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test17");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withNullString("");
    org.apache.commons.csv.CSVFormat var5 = var1.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var7 = var5.withRecordSeparator('#');
    org.apache.commons.csv.CSVFormat var9 = var7.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var11 = var7.withQuote('4');
    org.apache.commons.csv.CSVFormat var13 = var7.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var15 = var7.withEscape('4');
    org.apache.commons.csv.CSVFormat var17 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var18 = var17.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var20 = var17.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var22 = var17.withNullString("Delimiter=< > SkipHeaderRecord:true");
    boolean var23 = var22.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var25 = var22.withIgnoreEmptyLines(false);
    boolean var26 = var15.equals((java.lang.Object)var22);
    java.lang.String[] var27 = var22.getHeaderComments();
    boolean var28 = var22.isQuoteCharacterSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test18");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    boolean var4 = var1.isCommentMarkerSet();
    java.lang.Character var5 = var1.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var6 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreEmptyLines(true);
    boolean var9 = var8.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var10 = var8.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var12 = var10.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var14 = var12.withIgnoreEmptyLines(true);
    boolean var15 = var14.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var17 = var14.withQuote((java.lang.Character)'4');
    java.lang.Character var18 = var17.getEscapeCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test19");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var3 = var2.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var5 = var2.withNullString("");
    org.apache.commons.csv.CSVFormat var6 = var2.withIgnoreEmptyLines();
    java.lang.String[] var7 = var6.getHeaderComments();
    org.apache.commons.csv.CSVFormat var9 = var6.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var11 = var6.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat var13 = var11.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVParser var14 = org.apache.commons.csv.CSVParser.parse("", var13);
    boolean var15 = var13.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var17 = var13.withCommentMarker('4');
    char var18 = var17.getDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == ' ');

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test20");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    boolean var2 = var1.isCommentMarkerSet();
    java.lang.Character var3 = var1.getQuoteCharacter();
    char var4 = var1.getDelimiter();
    java.lang.Character var5 = var1.getEscapeCharacter();
    org.apache.commons.csv.CSVFormat var7 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var8 = var7.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var10 = var7.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var12 = var7.withNullString("Delimiter=< > SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var14 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var15 = var14.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var16 = var14.withSkipHeaderRecord();
    java.lang.String var17 = var16.toString();
    org.apache.commons.csv.CSVFormat var19 = var16.withNullString("");
    org.apache.commons.csv.CSVFormat var21 = var16.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var23 = var16.withNullString("Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var25 = var16.withRecordSeparator(' ');
    java.lang.String var26 = var25.toString();
    org.apache.commons.csv.CSVFormat var28 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var29 = var28.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var31 = var28.withRecordSeparator("hi!");
    boolean var32 = var31.isCommentMarkerSet();
    java.lang.Character var33 = var31.getEscapeCharacter();
    org.apache.commons.csv.CSVFormat var35 = var31.withAllowMissingColumnNames(true);
    boolean var36 = var35.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var38 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var39 = var38.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var40 = var38.withSkipHeaderRecord();
    java.lang.String var41 = var40.toString();
    org.apache.commons.csv.CSVFormat var43 = var40.withNullString("");
    org.apache.commons.csv.CSVFormat var45 = var43.withEscape((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var47 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var48 = var47.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var49 = var47.withSkipHeaderRecord();
    boolean var50 = var47.isCommentMarkerSet();
    boolean var51 = var47.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var53 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var54 = var53.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var56 = var53.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var58 = var53.withNullString("Delimiter=< > SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var59 = var58.withIgnoreSurroundingSpaces();
    java.lang.Object[] var60 = new java.lang.Object[] { var58};
    java.lang.String var61 = var47.format(var60);
    java.lang.String[] var63 = new java.lang.String[] { "Default Excel MySQL RFC4180 TDF"};
    org.apache.commons.csv.CSVFormat var64 = var47.withHeader(var63);
    org.apache.commons.csv.CSVFormat var65 = var43.withHeader(var63);
    java.lang.String var66 = var35.format((java.lang.Object[])var63);
    java.lang.String var67 = var25.format((java.lang.Object[])var63);
    org.apache.commons.csv.CSVFormat var68 = var12.withHeader(var63);
    java.lang.String var69 = var1.format((java.lang.Object[])var63);
    boolean var70 = var1.getIgnoreHeaderCase();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == ' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var17.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Delimiter=< > RecordSeparator=< > SkipHeaderRecord:true"+ "'", var26.equals("Delimiter=< > RecordSeparator=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var41.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false"+ "'", var61.equals("Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "Default Excel MySQL RFC4180 TDFhi!"+ "'", var66.equals("Default Excel MySQL RFC4180 TDFhi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "Default Excel MySQL RFC4180 TDF"+ "'", var67.equals("Default Excel MySQL RFC4180 TDF"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "Default Excel MySQL RFC4180 TDF"+ "'", var69.equals("Default Excel MySQL RFC4180 TDF"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test21");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    boolean var4 = var1.isCommentMarkerSet();
    boolean var5 = var1.getIgnoreHeaderCase();
    java.lang.String[] var7 = new java.lang.String[] { "Delimiter=< > SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var8 = var1.withHeader(var7);
    org.apache.commons.csv.CSVFormat var10 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var11 = var10.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var12 = var10.withSkipHeaderRecord();
    boolean var13 = var10.isCommentMarkerSet();
    boolean var14 = var10.getIgnoreHeaderCase();
    java.lang.String[] var16 = new java.lang.String[] { "Delimiter=< > SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var17 = var10.withHeader(var16);
    org.apache.commons.csv.CSVFormat var18 = var1.withHeader(var16);
    org.apache.commons.csv.CSVFormat var20 = var18.withIgnoreSurroundingSpaces(true);
    java.lang.Character var21 = var18.getCommentMarker();
    org.apache.commons.csv.CSVFormat var22 = var18.withIgnoreEmptyLines();
    java.lang.String[] var23 = var18.getHeader();
    org.apache.commons.csv.CSVFormat var24 = var18.withAllowMissingColumnNames();
    java.lang.Character var25 = var18.getQuoteCharacter();
    boolean var26 = var18.getIgnoreSurroundingSpaces();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test22");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var6 = var1.withNullString("Delimiter=< > SkipHeaderRecord:true");
    java.lang.Character var7 = var6.getCommentMarker();
    org.apache.commons.csv.QuoteMode var8 = var6.getQuoteMode();
    org.apache.commons.csv.CSVFormat var10 = var6.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var12 = var10.withQuote((java.lang.Character)'a');
    boolean var13 = var12.isEscapeCharacterSet();
    java.lang.String var14 = var12.getRecordSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test23");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var3 = var2.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var4 = var2.withSkipHeaderRecord();
    boolean var5 = var2.isCommentMarkerSet();
    java.lang.Character var6 = var2.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var7 = var2.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var9 = var2.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var11 = var2.withIgnoreEmptyLines(true);
    boolean var12 = var2.getIgnoreHeaderCase();
    boolean var13 = var2.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var15 = var2.withQuote((java.lang.Character)'a');
    boolean var16 = var2.isCommentMarkerSet();
    org.apache.commons.csv.CSVParser var17 = org.apache.commons.csv.CSVParser.parse("4444", var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test24");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var3 = var2.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var5 = var2.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVParser var6 = org.apache.commons.csv.CSVParser.parse("", var5);
    long var7 = var6.getRecordNumber();
    long var8 = var6.getRecordNumber();
    var6.close();
    boolean var10 = var6.isClosed();
    long var11 = var6.getRecordNumber();
    var6.close();
    long var13 = var6.getRecordNumber();
    long var14 = var6.getRecordNumber();
    var6.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test25");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    boolean var4 = var1.isCommentMarkerSet();
    boolean var5 = var1.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var7 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var8 = var7.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var10 = var7.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var12 = var7.withNullString("Delimiter=< > SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var13 = var12.withIgnoreSurroundingSpaces();
    java.lang.Object[] var14 = new java.lang.Object[] { var12};
    java.lang.String var15 = var1.format(var14);
    java.lang.String[] var17 = new java.lang.String[] { "Default Excel MySQL RFC4180 TDF"};
    org.apache.commons.csv.CSVFormat var18 = var1.withHeader(var17);
    boolean var19 = var18.isNullStringSet();
    char var20 = var18.getDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false"+ "'", var15.equals("Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == ' ');

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test26");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    boolean var4 = var1.isCommentMarkerSet();
    java.lang.Character var5 = var1.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var6 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var8 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var9 = var8.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var10 = var8.withSkipHeaderRecord();
    java.lang.String var11 = var10.toString();
    org.apache.commons.csv.CSVFormat var13 = var10.withNullString("");
    org.apache.commons.csv.CSVFormat var15 = var10.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var17 = var10.withNullString("Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false");
    boolean var18 = var6.equals((java.lang.Object)var17);
    org.apache.commons.csv.CSVFormat var19 = var17.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var21 = var17.withNullString("Delimiter=< > SkipHeaderRecord:trueDelimiter=< > SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var23 = var21.withIgnoreHeaderCase(false);
    org.apache.commons.csv.QuoteMode var24 = var23.getQuoteMode();
    boolean var25 = var23.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var27 = var23.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var29 = var27.withRecordSeparator("Delimiter=< > Escape=<4> SkipHeaderRecord:true");
    java.lang.Character var30 = var29.getCommentMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var11.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + '#'+ "'", var30.equals('#'));

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test27");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    char var2 = var1.getDelimiter();
    org.apache.commons.csv.CSVFormat var4 = var1.withDelimiter(' ');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var8 = var4.withQuote((java.lang.Character)'#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == ' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test28");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    boolean var3 = var1.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var4 = var1.withIgnoreEmptyLines();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test29");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var3 = var2.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var4 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var6 = var4.withAllowMissingColumnNames(true);
    boolean var7 = var4.isNullStringSet();
    java.lang.Character var8 = var4.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var9 = var4.withAllowMissingColumnNames();
    java.lang.String var10 = var4.toString();
    org.apache.commons.csv.CSVParser var11 = org.apache.commons.csv.CSVParser.parse("Default Excel MySQL RFC4180 TDFhi!", var4);
    long var12 = var11.getRecordNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var10.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test30");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var3 = var2.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var5 = var2.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVParser var6 = org.apache.commons.csv.CSVParser.parse("", var5);
    long var7 = var6.getCurrentLineNumber();
    long var8 = var6.getCurrentLineNumber();
    java.util.Map var9 = var6.getHeaderMap();
    long var10 = var6.getRecordNumber();
    java.util.Map var11 = var6.getHeaderMap();
    java.util.Iterator var12 = var6.iterator();
    java.util.Map var13 = var6.getHeaderMap();
    var6.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test31");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    boolean var4 = var1.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var6 = var1.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var8 = var1.withQuote((java.lang.Character)'4');
    boolean var9 = var8.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var11 = var8.withDelimiter('#');
    java.lang.String var12 = var8.getNullString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test32");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var6 = var1.withNullString("Delimiter=< > SkipHeaderRecord:true");
    boolean var7 = var6.isQuoteCharacterSet();
    java.lang.String[] var8 = var6.getHeader();
    java.lang.String var9 = var6.getNullString();
    boolean var10 = var6.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var12 = var6.withRecordSeparator("Delimiter=< > SkipHeaderRecord:false Header:[]");
    org.apache.commons.csv.CSVFormat var13 = var6.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var15 = var6.withRecordSeparator('a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var9.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test33");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withNullString("");
    org.apache.commons.csv.CSVFormat var5 = var1.withIgnoreEmptyLines();
    java.lang.String var6 = var5.toString();
    org.apache.commons.csv.CSVFormat var7 = var5.withIgnoreSurroundingSpaces();
    java.lang.Character var8 = var5.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var10 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var11 = var10.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var13 = var10.withNullString("");
    org.apache.commons.csv.CSVFormat var14 = var10.withIgnoreEmptyLines();
    java.lang.String[] var15 = var14.getHeaderComments();
    org.apache.commons.csv.CSVFormat var17 = var14.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var19 = var14.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat.Predefined[] var20 = org.apache.commons.csv.CSVFormat.Predefined.values();
    org.apache.commons.csv.CSVFormat var21 = var19.withHeaderComments((java.lang.Object[])var20);
    java.lang.String var22 = var5.format((java.lang.Object[])var20);
    org.apache.commons.csv.QuoteMode var23 = var5.getQuoteMode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false"+ "'", var6.equals("Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Default Excel MySQL RFC4180 TDF"+ "'", var22.equals("Default Excel MySQL RFC4180 TDF"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test34");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var3 = var2.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var5 = var2.withNullString("");
    org.apache.commons.csv.CSVFormat var6 = var2.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var8 = var6.withDelimiter('4');
    java.lang.String[] var9 = var6.getHeaderComments();
    char var10 = var6.getDelimiter();
    org.apache.commons.csv.CSVParser var11 = org.apache.commons.csv.CSVParser.parse("Delimiter=< > EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", var6);
    java.util.List var12 = var11.getRecords();
    var11.close();
    var11.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == ' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test35");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var3 = var2.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var5 = var2.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var7 = var2.withNullString("Delimiter=< > SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var8 = var7.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var10 = var8.withQuote((java.lang.Character)'#');
    org.apache.commons.csv.CSVFormat var12 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var13 = var12.withAllowMissingColumnNames();
    boolean var14 = var12.isNullStringSet();
    java.lang.String[] var16 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var17 = var12.withHeader(var16);
    org.apache.commons.csv.CSVFormat var19 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var20 = var19.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var21 = var19.withSkipHeaderRecord();
    boolean var22 = var19.isCommentMarkerSet();
    boolean var23 = var19.getIgnoreHeaderCase();
    java.lang.String[] var25 = new java.lang.String[] { "Delimiter=< > SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var26 = var19.withHeader(var25);
    org.apache.commons.csv.CSVFormat var28 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var29 = var28.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var30 = var28.withSkipHeaderRecord();
    boolean var31 = var28.isCommentMarkerSet();
    boolean var32 = var28.getIgnoreHeaderCase();
    java.lang.String[] var34 = new java.lang.String[] { "Delimiter=< > SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var35 = var28.withHeader(var34);
    org.apache.commons.csv.CSVFormat var36 = var19.withHeader(var34);
    java.lang.String var37 = var17.format((java.lang.Object[])var34);
    org.apache.commons.csv.CSVFormat var38 = var10.withHeader(var34);
    java.lang.String var39 = var10.getRecordSeparator();
    org.apache.commons.csv.CSVParser var40 = org.apache.commons.csv.CSVParser.parse("Delimiter=<a> EmptyLines:ignored SkipHeaderRecord:false", var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var37.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test36");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    boolean var4 = var1.isCommentMarkerSet();
    java.lang.Character var5 = var1.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var6 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var8 = var1.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var9 = var8.withSkipHeaderRecord();
    java.lang.String[] var10 = var9.getHeader();
    char var11 = var9.getDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == ' ');

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test37");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    boolean var3 = var1.isNullStringSet();
    boolean var4 = var1.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var6 = var1.withCommentMarker((java.lang.Character)'4');
    boolean var7 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var9 = var1.withIgnoreHeaderCase(false);
    boolean var10 = var9.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var11 = var9.withSkipHeaderRecord();
    java.lang.String var12 = var9.getRecordSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test38");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var3 = var2.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var5 = var2.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVParser var6 = org.apache.commons.csv.CSVParser.parse("", var5);
    java.util.Iterator var7 = var6.iterator();
    java.util.Iterator var8 = var6.iterator();
    boolean var9 = var6.isClosed();
    java.util.Map var10 = var6.getHeaderMap();
    long var11 = var6.getRecordNumber();
    java.util.Map var12 = var6.getHeaderMap();
    long var13 = var6.getCurrentLineNumber();
    java.util.Map var14 = var6.getHeaderMap();
    long var15 = var6.getRecordNumber();
    long var16 = var6.getRecordNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0L);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test39");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    boolean var2 = var1.isCommentMarkerSet();
    java.lang.Character var3 = var1.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var5 = var1.withIgnoreEmptyLines(false);
    org.apache.commons.csv.CSVFormat var7 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var8 = var7.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var9 = var7.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var11 = var9.withAllowMissingColumnNames(true);
    boolean var12 = var9.getAllowMissingColumnNames();
    boolean var13 = var5.equals((java.lang.Object)var9);
    org.apache.commons.csv.QuoteMode var14 = var5.getQuoteMode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test40");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withNullString("");
    org.apache.commons.csv.CSVFormat var5 = var1.withIgnoreEmptyLines();
    java.lang.String[] var6 = var5.getHeaderComments();
    org.apache.commons.csv.CSVFormat var8 = var5.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var10 = var5.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat var12 = var10.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var14 = var10.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var15 = var10.withSkipHeaderRecord();
    java.lang.String[] var16 = var10.getHeaderComments();
    boolean var17 = var10.getSkipHeaderRecord();
    boolean var18 = var10.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var20 = var10.withAllowMissingColumnNames(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test41");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var6 = var1.withNullString("Delimiter=< > SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var7 = var6.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var9 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    char var10 = var9.getDelimiter();
    java.lang.String var11 = var9.getNullString();
    boolean var12 = var9.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var13 = var9.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var15 = var9.withEscape((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var17 = var15.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var19 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var20 = var19.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var22 = var19.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var24 = var19.withNullString("Delimiter=< > SkipHeaderRecord:true");
    boolean var25 = var24.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var27 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var28 = var27.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var29 = var27.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var31 = var29.withAllowMissingColumnNames(true);
    java.lang.String var32 = var31.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var34 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var35 = var34.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var37 = var34.withNullString("");
    org.apache.commons.csv.CSVFormat var38 = var34.withIgnoreEmptyLines();
    java.lang.String var39 = var38.toString();
    org.apache.commons.csv.CSVFormat var41 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var42 = var41.withAllowMissingColumnNames();
    boolean var43 = var41.isNullStringSet();
    java.lang.String[] var45 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var46 = var41.withHeader(var45);
    org.apache.commons.csv.CSVFormat var47 = var38.withHeader(var45);
    java.lang.String var48 = var31.format((java.lang.Object[])var45);
    org.apache.commons.csv.CSVFormat var49 = var24.withHeaderComments((java.lang.Object[])var45);
    boolean var50 = var17.equals((java.lang.Object)var24);
    org.apache.commons.csv.CSVFormat var52 = var24.withNullString("ALL MINIMAL NON_NUMERIC NONEDelimiter=< > SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var54 = var52.withCommentMarker('a');
    boolean var55 = var6.equals((java.lang.Object)var52);
    org.apache.commons.csv.CSVFormat var56 = var6.withIgnoreSurroundingSpaces();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == ' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false"+ "'", var39.equals("Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + ""+ "'", var48.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test42");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    char var2 = var1.getDelimiter();
    java.lang.String var3 = var1.getNullString();
    boolean var4 = var1.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var5 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var7 = var1.withNullString("");
    org.apache.commons.csv.CSVFormat var9 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var10 = var9.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var11 = var9.withSkipHeaderRecord();
    boolean var12 = var9.isCommentMarkerSet();
    boolean var13 = var9.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var15 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var16 = var15.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var18 = var15.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var20 = var15.withNullString("Delimiter=< > SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var21 = var20.withIgnoreSurroundingSpaces();
    java.lang.Object[] var22 = new java.lang.Object[] { var20};
    java.lang.String var23 = var9.format(var22);
    java.lang.String[] var25 = new java.lang.String[] { "Default Excel MySQL RFC4180 TDF"};
    org.apache.commons.csv.CSVFormat var26 = var9.withHeader(var25);
    org.apache.commons.csv.CSVFormat var27 = var1.withHeaderComments((java.lang.Object[])var25);
    org.apache.commons.csv.CSVFormat var29 = var1.withEscape('a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == ' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false"+ "'", var23.equals("Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test43");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withNullString("");
    org.apache.commons.csv.CSVFormat var5 = var1.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var7 = var1.withQuote((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var8 = var7.withIgnoreEmptyLines();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat var10 = var8.withCommentMarker((java.lang.Character)'a');
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test44");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var6 = var1.withNullString("Delimiter=< > SkipHeaderRecord:true");
    java.lang.String[] var7 = var1.getHeader();
    java.lang.String var8 = var1.toString();
    boolean var9 = var1.getSkipHeaderRecord();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Delimiter=< > SkipHeaderRecord:false"+ "'", var8.equals("Delimiter=< > SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test45");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    boolean var4 = var1.isCommentMarkerSet();
    java.lang.Character var5 = var1.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var6 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var8 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var9 = var8.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var10 = var8.withSkipHeaderRecord();
    java.lang.String var11 = var10.toString();
    org.apache.commons.csv.CSVFormat var13 = var10.withNullString("");
    org.apache.commons.csv.CSVFormat var15 = var10.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var17 = var10.withNullString("Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false");
    boolean var18 = var6.equals((java.lang.Object)var17);
    org.apache.commons.csv.CSVFormat var20 = var6.withDelimiter('4');
    org.apache.commons.csv.CSVFormat var22 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var23 = var22.withIgnoreSurroundingSpaces();
    java.lang.Character var24 = var22.getCommentMarker();
    java.lang.String var25 = var22.getNullString();
    org.apache.commons.csv.CSVFormat var26 = var22.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var28 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var29 = var28.withAllowMissingColumnNames();
    boolean var30 = var28.isNullStringSet();
    java.lang.String[] var32 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var33 = var28.withHeader(var32);
    org.apache.commons.csv.CSVFormat var35 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var36 = var35.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var37 = var35.withSkipHeaderRecord();
    boolean var38 = var35.isCommentMarkerSet();
    boolean var39 = var35.getIgnoreHeaderCase();
    java.lang.String[] var41 = new java.lang.String[] { "Delimiter=< > SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var42 = var35.withHeader(var41);
    org.apache.commons.csv.CSVFormat var44 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var45 = var44.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var46 = var44.withSkipHeaderRecord();
    boolean var47 = var44.isCommentMarkerSet();
    boolean var48 = var44.getIgnoreHeaderCase();
    java.lang.String[] var50 = new java.lang.String[] { "Delimiter=< > SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var51 = var44.withHeader(var50);
    org.apache.commons.csv.CSVFormat var52 = var35.withHeader(var50);
    java.lang.String var53 = var33.format((java.lang.Object[])var50);
    org.apache.commons.csv.CSVFormat var54 = var26.withHeader(var50);
    java.lang.String var55 = var6.format((java.lang.Object[])var50);
    org.apache.commons.csv.CSVFormat var57 = var6.withRecordSeparator("ALL MINIMAL NON_NUMERIC NONEDelimiter=< > SkipHeaderRecord:true");
    boolean var58 = var6.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var60 = var6.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var62 = var6.withEscape((java.lang.Character)'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var11.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var53.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var55.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test46");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    boolean var3 = var2.isCommentMarkerSet();
    java.lang.Character var4 = var2.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var6 = var2.withIgnoreEmptyLines(false);
    org.apache.commons.csv.CSVFormat var8 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var9 = var8.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var10 = var8.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var12 = var10.withAllowMissingColumnNames(true);
    boolean var13 = var10.getAllowMissingColumnNames();
    boolean var14 = var6.equals((java.lang.Object)var10);
    org.apache.commons.csv.CSVParser var15 = org.apache.commons.csv.CSVParser.parse("Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false", var6);
    org.apache.commons.csv.CSVFormat var17 = var6.withRecordSeparator("Delimiter=< > SkipHeaderRecord:false Header:[]");
    org.apache.commons.csv.CSVFormat var19 = var17.withSkipHeaderRecord(false);
    boolean var20 = var19.isCommentMarkerSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test47");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var6 = var1.withNullString("Delimiter=< > SkipHeaderRecord:true");
    java.lang.String[] var7 = var1.getHeader();
    org.apache.commons.csv.CSVFormat var9 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var10 = var9.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var11 = var9.withSkipHeaderRecord();
    boolean var12 = var9.isCommentMarkerSet();
    boolean var13 = var9.getIgnoreHeaderCase();
    java.lang.String[] var15 = new java.lang.String[] { "Delimiter=< > SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var16 = var9.withHeader(var15);
    org.apache.commons.csv.CSVFormat var17 = var1.withHeader(var15);
    org.apache.commons.csv.CSVFormat var19 = var17.withQuote((java.lang.Character)'#');
    boolean var20 = var17.isEscapeCharacterSet();
    boolean var21 = var17.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var23 = var17.withRecordSeparator("DefaultaExcelaMySQLaRFC4180aTDF");
    java.lang.String var24 = var23.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Delimiter=< > RecordSeparator=<DefaultaExcelaMySQLaRFC4180aTDF> SkipHeaderRecord:false Header:[Delimiter=< > SkipHeaderRecord:true]"+ "'", var24.equals("Delimiter=< > RecordSeparator=<DefaultaExcelaMySQLaRFC4180aTDF> SkipHeaderRecord:false Header:[Delimiter=< > SkipHeaderRecord:true]"));

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test48");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    java.lang.String var4 = var3.toString();
    org.apache.commons.csv.CSVFormat var6 = var3.withNullString("");
    org.apache.commons.csv.CSVFormat var8 = var3.withIgnoreSurroundingSpaces(true);
    boolean var9 = var3.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var11 = var3.withQuote('a');
    org.apache.commons.csv.CSVFormat var13 = var11.withNullString("Delimiter=< > RecordSeparator=< > SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var15 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var16 = var15.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var18 = var15.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var20 = var15.withNullString("Delimiter=< > SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var22 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var23 = var22.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var25 = var22.withNullString("");
    org.apache.commons.csv.CSVFormat var26 = var22.withIgnoreEmptyLines();
    java.lang.String var27 = var26.toString();
    org.apache.commons.csv.CSVFormat var29 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var30 = var29.withAllowMissingColumnNames();
    boolean var31 = var29.isNullStringSet();
    java.lang.String[] var33 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var34 = var29.withHeader(var33);
    org.apache.commons.csv.CSVFormat var35 = var26.withHeader(var33);
    org.apache.commons.csv.CSVFormat var36 = var15.withHeader(var33);
    java.lang.String var37 = var36.toString();
    org.apache.commons.csv.CSVFormat var39 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var40 = var39.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var42 = var39.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var44 = var39.withNullString("Delimiter=< > SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var46 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var47 = var46.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var49 = var46.withNullString("");
    org.apache.commons.csv.CSVFormat var50 = var46.withIgnoreEmptyLines();
    java.lang.String var51 = var50.toString();
    org.apache.commons.csv.CSVFormat var53 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var54 = var53.withAllowMissingColumnNames();
    boolean var55 = var53.isNullStringSet();
    java.lang.String[] var57 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var58 = var53.withHeader(var57);
    org.apache.commons.csv.CSVFormat var59 = var50.withHeader(var57);
    org.apache.commons.csv.CSVFormat var60 = var39.withHeader(var57);
    java.lang.String var61 = var36.format((java.lang.Object[])var57);
    org.apache.commons.csv.CSVFormat var62 = var11.withHeader(var57);
    boolean var63 = var62.getIgnoreSurroundingSpaces();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var4.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false"+ "'", var27.equals("Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "Delimiter=< > SkipHeaderRecord:false Header:[]"+ "'", var37.equals("Delimiter=< > SkipHeaderRecord:false Header:[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false"+ "'", var51.equals("Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + ""+ "'", var61.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test49");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    java.lang.String var4 = var3.toString();
    org.apache.commons.csv.CSVFormat var6 = var3.withNullString("");
    org.apache.commons.csv.CSVFormat var8 = var6.withEscape((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var10 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var11 = var10.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var12 = var10.withSkipHeaderRecord();
    boolean var13 = var10.isCommentMarkerSet();
    boolean var14 = var10.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var16 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var17 = var16.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var19 = var16.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var21 = var16.withNullString("Delimiter=< > SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var22 = var21.withIgnoreSurroundingSpaces();
    java.lang.Object[] var23 = new java.lang.Object[] { var21};
    java.lang.String var24 = var10.format(var23);
    java.lang.String[] var26 = new java.lang.String[] { "Default Excel MySQL RFC4180 TDF"};
    org.apache.commons.csv.CSVFormat var27 = var10.withHeader(var26);
    org.apache.commons.csv.CSVFormat var28 = var6.withHeader(var26);
    java.lang.String var29 = var6.toString();
    java.lang.String[] var30 = var6.getHeader();
    java.lang.Character var31 = var6.getCommentMarker();
    java.lang.Character var32 = var6.getQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var4.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false"+ "'", var24.equals("Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "Delimiter=< > NullString=<> SkipHeaderRecord:true"+ "'", var29.equals("Delimiter=< > NullString=<> SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test50");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var3 = var2.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var5 = var2.withCommentMarker('#');
    java.lang.String var6 = var2.getRecordSeparator();
    java.lang.String var7 = var2.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var9 = var2.withCommentMarker('a');
    org.apache.commons.csv.CSVParser var10 = org.apache.commons.csv.CSVParser.parse("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:true", var2);
    java.util.List var11 = var10.getRecords();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test51");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withNullString("");
    org.apache.commons.csv.CSVFormat var5 = var1.withIgnoreEmptyLines();
    java.lang.String[] var6 = var5.getHeaderComments();
    org.apache.commons.csv.CSVFormat var8 = var5.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var10 = var5.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat var12 = var10.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var14 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var15 = var14.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var16 = var14.withSkipHeaderRecord();
    boolean var17 = var14.isCommentMarkerSet();
    boolean var18 = var14.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var20 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var21 = var20.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var23 = var20.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var25 = var20.withNullString("Delimiter=< > SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var26 = var25.withIgnoreSurroundingSpaces();
    java.lang.Object[] var27 = new java.lang.Object[] { var25};
    java.lang.String var28 = var14.format(var27);
    java.lang.String[] var30 = new java.lang.String[] { "Default Excel MySQL RFC4180 TDF"};
    org.apache.commons.csv.CSVFormat var31 = var14.withHeader(var30);
    org.apache.commons.csv.CSVFormat var32 = var10.withHeader(var30);
    org.apache.commons.csv.CSVFormat var34 = var32.withEscape('4');
    org.apache.commons.csv.CSVFormat var35 = var32.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var36 = var35.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var38 = var36.withSkipHeaderRecord(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false"+ "'", var28.equals("Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

}
