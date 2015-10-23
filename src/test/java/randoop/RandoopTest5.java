package randoop;

import junit.framework.*;

public class RandoopTest5 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test1");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var4 = var1.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var6 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var7 = var6.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var9 = var6.withNullString("");
    org.apache.commons.csv.CSVFormat var10 = var6.withIgnoreEmptyLines();
    java.lang.String[] var11 = var10.getHeaderComments();
    org.apache.commons.csv.CSVFormat var13 = var10.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var15 = var10.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat.Predefined[] var16 = org.apache.commons.csv.CSVFormat.Predefined.values();
    org.apache.commons.csv.CSVFormat var17 = var15.withHeaderComments((java.lang.Object[])var16);
    org.apache.commons.csv.CSVFormat var18 = var1.withHeaderComments((java.lang.Object[])var16);
    java.lang.String[] var19 = var1.getHeaderComments();
    boolean var20 = var1.isNullStringSet();
    boolean var21 = var1.isQuoteCharacterSet();
    boolean var22 = var1.getIgnoreEmptyLines();
    boolean var23 = var1.getAllowMissingColumnNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test2");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    java.lang.String var4 = var3.toString();
    org.apache.commons.csv.CSVFormat var6 = var3.withNullString("");
    org.apache.commons.csv.CSVFormat var8 = var3.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var9 = var8.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var10 = var8.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var12 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var13 = var12.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var15 = var12.withNullString("");
    org.apache.commons.csv.CSVFormat var16 = var12.withIgnoreEmptyLines();
    java.lang.String[] var17 = var16.getHeaderComments();
    org.apache.commons.csv.CSVFormat var19 = var16.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var21 = var19.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var22 = var21.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var24 = var22.withRecordSeparator("Default Excel MySQL RFC4180 TDF");
    org.apache.commons.csv.CSVFormat var26 = var24.withCommentMarker((java.lang.Character)'4');
    java.lang.Character var27 = var26.getQuoteCharacter();
    boolean var28 = var26.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var30 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var31 = var30.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var32 = var30.withSkipHeaderRecord();
    boolean var33 = var30.isCommentMarkerSet();
    java.lang.Character var34 = var30.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var35 = var30.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var37 = var30.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var39 = var30.withDelimiter(' ');
    java.lang.String var40 = var30.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var42 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var43 = var42.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var45 = var42.withRecordSeparator("hi!");
    boolean var46 = var45.isCommentMarkerSet();
    boolean var47 = var45.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var49 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var50 = var49.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var52 = var49.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var54 = var49.withNullString("Delimiter=< > SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var56 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var57 = var56.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var59 = var56.withNullString("");
    org.apache.commons.csv.CSVFormat var60 = var56.withIgnoreEmptyLines();
    java.lang.String var61 = var60.toString();
    org.apache.commons.csv.CSVFormat var63 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var64 = var63.withAllowMissingColumnNames();
    boolean var65 = var63.isNullStringSet();
    java.lang.String[] var67 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var68 = var63.withHeader(var67);
    org.apache.commons.csv.CSVFormat var69 = var60.withHeader(var67);
    org.apache.commons.csv.CSVFormat var70 = var49.withHeader(var67);
    org.apache.commons.csv.CSVFormat var71 = var45.withHeaderComments((java.lang.Object[])var67);
    org.apache.commons.csv.CSVFormat var72 = var30.withHeaderComments((java.lang.Object[])var67);
    org.apache.commons.csv.CSVFormat var73 = var26.withHeaderComments((java.lang.Object[])var67);
    org.apache.commons.csv.CSVFormat var74 = var8.withHeader(var67);
    java.lang.String var75 = var74.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var76 = var74.withSkipHeaderRecord();
    
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
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
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
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false"+ "'", var61.equals("Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test3");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('4');
    boolean var2 = var1.isEscapeCharacterSet();
    java.lang.String var3 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Delimiter=<4> SkipHeaderRecord:false"+ "'", var3.equals("Delimiter=<4> SkipHeaderRecord:false"));

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test4");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var4 = var1.withSkipHeaderRecord(true);
    boolean var5 = var1.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var8 = var1.withAllowMissingColumnNames();
    boolean var9 = var1.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var10 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var12 = var1.withAllowMissingColumnNames(false);
    org.apache.commons.csv.CSVFormat var15 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    boolean var16 = var15.isCommentMarkerSet();
    boolean var17 = var15.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVParser var18 = org.apache.commons.csv.CSVParser.parse("", var15);
    boolean var19 = var15.getSkipHeaderRecord();
    java.lang.Character var20 = var15.getEscapeCharacter();
    char var21 = var15.getDelimiter();
    boolean var22 = var12.equals((java.lang.Object)var15);
    org.apache.commons.csv.CSVFormat var24 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var25 = var24.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var27 = var24.withNullString("");
    org.apache.commons.csv.CSVFormat var28 = var24.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var30 = var28.withRecordSeparator('#');
    org.apache.commons.csv.CSVFormat var32 = var30.withSkipHeaderRecord(false);
    char var33 = var30.getDelimiter();
    org.apache.commons.csv.CSVFormat var35 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var36 = var35.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var38 = var35.withRecordSeparator("hi!");
    boolean var39 = var38.isCommentMarkerSet();
    java.lang.Character var40 = var38.getEscapeCharacter();
    org.apache.commons.csv.CSVFormat var42 = var38.withAllowMissingColumnNames(true);
    boolean var43 = var42.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var45 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var46 = var45.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var47 = var45.withSkipHeaderRecord();
    java.lang.String var48 = var47.toString();
    org.apache.commons.csv.CSVFormat var50 = var47.withNullString("");
    org.apache.commons.csv.CSVFormat var52 = var50.withEscape((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var54 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var55 = var54.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var56 = var54.withSkipHeaderRecord();
    boolean var57 = var54.isCommentMarkerSet();
    boolean var58 = var54.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var60 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var61 = var60.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var63 = var60.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var65 = var60.withNullString("Delimiter=< > SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var66 = var65.withIgnoreSurroundingSpaces();
    java.lang.Object[] var67 = new java.lang.Object[] { var65};
    java.lang.String var68 = var54.format(var67);
    java.lang.String[] var70 = new java.lang.String[] { "Default Excel MySQL RFC4180 TDF"};
    org.apache.commons.csv.CSVFormat var71 = var54.withHeader(var70);
    org.apache.commons.csv.CSVFormat var72 = var50.withHeader(var70);
    java.lang.String var73 = var42.format((java.lang.Object[])var70);
    java.lang.String var74 = var30.format((java.lang.Object[])var70);
    org.apache.commons.csv.CSVFormat var75 = var12.withHeader(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == ' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == ' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
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
    assertTrue("'" + var48 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var48.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false"+ "'", var68.equals("Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "Default Excel MySQL RFC4180 TDFhi!"+ "'", var73.equals("Default Excel MySQL RFC4180 TDFhi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "Default Excel MySQL RFC4180 TDF#"+ "'", var74.equals("Default Excel MySQL RFC4180 TDF#"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test5");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var4 = var1.withCommentMarker('a');
    boolean var5 = var1.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var7 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var8 = var7.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var9 = var7.withSkipHeaderRecord();
    boolean var10 = var7.isCommentMarkerSet();
    boolean var11 = var7.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var13 = var7.withAllowMissingColumnNames(false);
    org.apache.commons.csv.CSVFormat var15 = var13.withNullString("ALL MINIMAL NON_NUMERIC NONE");
    org.apache.commons.csv.CSVFormat var17 = var15.withRecordSeparator("Delimiter=< > SkipHeaderRecord:true");
    org.apache.commons.csv.QuoteMode[] var18 = org.apache.commons.csv.QuoteMode.values();
    java.lang.String var19 = var17.format((java.lang.Object[])var18);
    org.apache.commons.csv.CSVFormat var20 = var1.withHeaderComments((java.lang.Object[])var18);
    boolean var21 = var1.isEscapeCharacterSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "ALL MINIMAL NON_NUMERIC NONEDelimiter=< > SkipHeaderRecord:true"+ "'", var19.equals("ALL MINIMAL NON_NUMERIC NONEDelimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test6");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var3 = var2.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var5 = var2.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var7 = var2.withNullString("Delimiter=< > SkipHeaderRecord:true");
    java.lang.Character var8 = var7.getCommentMarker();
    org.apache.commons.csv.CSVParser var9 = org.apache.commons.csv.CSVParser.parse("", var7);
    org.apache.commons.csv.CSVFormat var11 = var7.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var13 = var11.withRecordSeparator("Delimiter=<a> SkipHeaderRecord:false");
    boolean var14 = var13.isCommentMarkerSet();
    
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
    assertTrue(var14 == true);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test7");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var6 = var4.withCommentMarker((java.lang.Character)'4');
    boolean var7 = var6.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var9 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var10 = var9.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var11 = var9.withSkipHeaderRecord();
    java.lang.String var12 = var11.toString();
    org.apache.commons.csv.CSVFormat var14 = var11.withNullString("");
    org.apache.commons.csv.CSVFormat var16 = var11.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var18 = var11.withNullString("Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var20 = var11.withIgnoreSurroundingSpaces(false);
    java.lang.Character var21 = var20.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var23 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var24 = var23.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var25 = var23.withSkipHeaderRecord();
    java.lang.String var26 = var25.toString();
    java.lang.String[] var27 = var25.getHeader();
    org.apache.commons.csv.CSVFormat var28 = var25.withAllowMissingColumnNames();
    java.lang.String[] var29 = var28.getHeaderComments();
    org.apache.commons.csv.CSVFormat var31 = var28.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var33 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var34 = var33.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var35 = var33.withSkipHeaderRecord();
    java.lang.String var36 = var35.toString();
    org.apache.commons.csv.CSVFormat var38 = var35.withNullString("");
    org.apache.commons.csv.CSVFormat var40 = var38.withEscape((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var42 = var40.withQuote('#');
    org.apache.commons.csv.CSVFormat var44 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var45 = var44.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var46 = var44.withSkipHeaderRecord();
    boolean var47 = var44.isCommentMarkerSet();
    boolean var48 = var44.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var50 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var51 = var50.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var53 = var50.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var55 = var50.withNullString("Delimiter=< > SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var56 = var55.withIgnoreSurroundingSpaces();
    java.lang.Object[] var57 = new java.lang.Object[] { var55};
    java.lang.String var58 = var44.format(var57);
    java.lang.String var59 = var40.format(var57);
    org.apache.commons.csv.CSVFormat var60 = var31.withHeaderComments(var57);
    java.lang.String var61 = var20.format(var57);
    org.apache.commons.csv.CSVFormat var62 = var6.withHeaderComments(var57);
    org.apache.commons.csv.CSVFormat var64 = var62.withEscape((java.lang.Character)'#');
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var12.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var26.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var36.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
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
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false"+ "'", var58.equals("Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "Delimiter=<4 >4 NullString=<Delimiter=<4 >4 SkipHeaderRecord:true>4 SkipHeaderRecord:false"+ "'", var59.equals("Delimiter=<4 >4 NullString=<Delimiter=<4 >4 SkipHeaderRecord:true>4 SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false"+ "'", var61.equals("Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test8");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    boolean var3 = var1.isNullStringSet();
    java.lang.String[] var5 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var6 = var1.withHeader(var5);
    org.apache.commons.csv.CSVFormat var7 = var1.withSkipHeaderRecord();
    boolean var8 = var1.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var10 = var1.withQuote((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var11 = var1.withIgnoreEmptyLines();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat var13 = var1.withCommentMarker((java.lang.Character)' ');
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test9");


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
    org.apache.commons.csv.CSVFormat var24 = var5.withQuote((java.lang.Character)'#');
    org.apache.commons.csv.CSVFormat var26 = var24.withNullString("hi!");
    
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
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test10");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withAllowMissingColumnNames(true);
    java.lang.String var6 = var5.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var8 = var5.withIgnoreEmptyLines(false);
    boolean var9 = var5.isNullStringSet();
    boolean var10 = var5.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var12 = var5.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var13 = var5.withIgnoreEmptyLines();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test11");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var4 = var1.withCommentMarker((java.lang.Character)'a');
    boolean var5 = var4.getIgnoreEmptyLines();
    java.lang.String[] var6 = var4.getHeaderComments();
    java.lang.String var7 = var4.toString();
    org.apache.commons.csv.CSVFormat var9 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var10 = var9.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var11 = var9.withSkipHeaderRecord();
    boolean var12 = var9.isCommentMarkerSet();
    java.lang.Character var13 = var9.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var14 = var9.withSkipHeaderRecord();
    java.lang.Character var15 = var14.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var17 = var14.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var19 = var17.withEscape('4');
    boolean var20 = var17.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var22 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var23 = var22.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var24 = var22.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var26 = var24.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var28 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var29 = var28.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var30 = var28.withSkipHeaderRecord();
    java.lang.String var31 = var30.toString();
    org.apache.commons.csv.CSVFormat var33 = var30.withNullString("");
    org.apache.commons.csv.CSVFormat var35 = var30.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var37 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var38 = var37.withAllowMissingColumnNames();
    boolean var39 = var37.isNullStringSet();
    java.lang.String[] var41 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var42 = var37.withHeader(var41);
    java.lang.String var43 = var35.format((java.lang.Object[])var41);
    java.lang.String var44 = var26.format((java.lang.Object[])var41);
    java.lang.String var45 = var17.format((java.lang.Object[])var41);
    org.apache.commons.csv.CSVFormat var46 = var4.withHeader(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Delimiter=< > CommentStart=<a> SkipHeaderRecord:false"+ "'", var7.equals("Delimiter=< > CommentStart=<a> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var31.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + ""+ "'", var43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + ""+ "'", var44.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + ""+ "'", var45.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test12");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withAllowMissingColumnNames(true);
    boolean var6 = var3.getIgnoreEmptyLines();
    java.lang.String[] var7 = var3.getHeaderComments();
    boolean var8 = var3.getIgnoreEmptyLines();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test13");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    boolean var3 = var1.isNullStringSet();
    java.lang.String[] var5 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var6 = var1.withHeader(var5);
    org.apache.commons.csv.QuoteMode var7 = var6.getQuoteMode();
    org.apache.commons.csv.CSVFormat var9 = var6.withIgnoreEmptyLines(false);
    java.lang.String var10 = var9.toString();
    java.lang.Character var11 = var9.getEscapeCharacter();
    org.apache.commons.csv.CSVFormat var13 = var9.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat var15 = var9.withEscape('#');
    java.lang.String var16 = var15.getRecordSeparator();
    
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
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Delimiter=< > SkipHeaderRecord:false Header:[]"+ "'", var10.equals("Delimiter=< > SkipHeaderRecord:false Header:[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test14");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var6 = var1.withNullString("Delimiter=< > SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var7 = var6.withIgnoreSurroundingSpaces();
    boolean var8 = var7.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var10 = var7.withQuote((java.lang.Character)'#');
    org.apache.commons.csv.CSVFormat var12 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var13 = var12.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var14 = var12.withSkipHeaderRecord();
    java.lang.String var15 = var14.toString();
    org.apache.commons.csv.CSVFormat var17 = var14.withNullString("");
    org.apache.commons.csv.CSVFormat var19 = var17.withEscape((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var21 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var22 = var21.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var23 = var21.withSkipHeaderRecord();
    boolean var24 = var21.isCommentMarkerSet();
    boolean var25 = var21.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var27 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var28 = var27.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var30 = var27.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var32 = var27.withNullString("Delimiter=< > SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var33 = var32.withIgnoreSurroundingSpaces();
    java.lang.Object[] var34 = new java.lang.Object[] { var32};
    java.lang.String var35 = var21.format(var34);
    java.lang.String[] var37 = new java.lang.String[] { "Default Excel MySQL RFC4180 TDF"};
    org.apache.commons.csv.CSVFormat var38 = var21.withHeader(var37);
    org.apache.commons.csv.CSVFormat var39 = var17.withHeader(var37);
    org.apache.commons.csv.CSVFormat var40 = var7.withHeader(var37);
    boolean var41 = var40.getAllowMissingColumnNames();
    
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var15.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false"+ "'", var35.equals("Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test15");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    java.lang.String var4 = var3.toString();
    org.apache.commons.csv.CSVFormat var6 = var3.withNullString("");
    org.apache.commons.csv.CSVFormat var8 = var3.withIgnoreSurroundingSpaces(true);
    boolean var9 = var3.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var11 = var3.withQuote('a');
    char var12 = var3.getDelimiter();
    org.apache.commons.csv.CSVFormat var13 = var3.withSkipHeaderRecord();
    
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
    assertTrue(var12 == ' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test16");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var3 = var2.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var5 = var2.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVParser var6 = org.apache.commons.csv.CSVParser.parse("", var5);
    long var7 = var6.getCurrentLineNumber();
    long var8 = var6.getCurrentLineNumber();
    java.util.Map var9 = var6.getHeaderMap();
    long var10 = var6.getRecordNumber();
    long var11 = var6.getRecordNumber();
    java.util.Map var12 = var6.getHeaderMap();
    java.util.List var13 = var6.getRecords();
    
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
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test17");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    boolean var4 = var1.isCommentMarkerSet();
    java.lang.Character var5 = var1.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var6 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var8 = var6.withQuote((java.lang.Character)'a');
    java.lang.Character var9 = var8.getQuoteCharacter();
    boolean var10 = var8.getIgnoreEmptyLines();
    boolean var11 = var8.getIgnoreEmptyLines();
    
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
    assertTrue("'" + var9 + "' != '" + 'a'+ "'", var9.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test18");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var3 = var2.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var5 = var2.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVParser var6 = org.apache.commons.csv.CSVParser.parse("", var5);
    long var7 = var6.getRecordNumber();
    long var8 = var6.getCurrentLineNumber();
    java.util.Map var9 = var6.getHeaderMap();
    long var10 = var6.getCurrentLineNumber();
    
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

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test19");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    boolean var4 = var1.isCommentMarkerSet();
    java.lang.Character var5 = var1.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var6 = var1.withAllowMissingColumnNames();
    java.lang.String[] var7 = var1.getHeaderComments();
    org.apache.commons.csv.CSVFormat var9 = var1.withAllowMissingColumnNames(false);
    java.lang.String var10 = var9.getRecordSeparator();
    boolean var11 = var9.isCommentMarkerSet();
    
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
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test20");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var3 = var2.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var5 = var2.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVParser var6 = org.apache.commons.csv.CSVParser.parse("", var5);
    long var7 = var6.getRecordNumber();
    java.util.List var8 = var6.getRecords();
    java.util.Map var9 = var6.getHeaderMap();
    boolean var10 = var6.isClosed();
    java.util.List var11 = var6.getRecords();
    long var12 = var6.getCurrentLineNumber();
    long var13 = var6.getCurrentLineNumber();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test21");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withNullString("");
    org.apache.commons.csv.CSVFormat var5 = var1.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var7 = var1.withQuote((java.lang.Character)'a');
    boolean var8 = var1.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var10 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var11 = var10.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var12 = var10.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var14 = var12.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var15 = var12.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var17 = var15.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var19 = var17.withRecordSeparator('#');
    org.apache.commons.csv.CSVFormat var21 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var22 = var21.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var23 = var21.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var25 = var23.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var27 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var28 = var27.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var29 = var27.withSkipHeaderRecord();
    java.lang.String var30 = var29.toString();
    org.apache.commons.csv.CSVFormat var32 = var29.withNullString("");
    org.apache.commons.csv.CSVFormat var34 = var29.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var36 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var37 = var36.withAllowMissingColumnNames();
    boolean var38 = var36.isNullStringSet();
    java.lang.String[] var40 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var41 = var36.withHeader(var40);
    java.lang.String var42 = var34.format((java.lang.Object[])var40);
    java.lang.String var43 = var25.format((java.lang.Object[])var40);
    java.lang.String var44 = var19.format((java.lang.Object[])var40);
    java.lang.String var45 = var1.format((java.lang.Object[])var40);
    org.apache.commons.csv.CSVFormat var46 = var1.withIgnoreEmptyLines();
    java.lang.Character var47 = var46.getCommentMarker();
    
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var30.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + ""+ "'", var42.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + ""+ "'", var43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "#"+ "'", var44.equals("#"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + ""+ "'", var45.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test22");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    boolean var4 = var1.isCommentMarkerSet();
    java.lang.Character var5 = var1.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var6 = var1.withSkipHeaderRecord();
    java.lang.Character var7 = var6.getQuoteCharacter();
    boolean var8 = var6.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var10 = var6.withSkipHeaderRecord(false);
    boolean var11 = var10.isNullStringSet();
    
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
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test23");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    char var2 = var1.getDelimiter();
    org.apache.commons.csv.CSVFormat var4 = var1.withDelimiter(' ');
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var8 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var9 = var8.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var10 = var8.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var12 = var10.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var13 = var10.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var15 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var16 = var15.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var18 = var15.withNullString("");
    org.apache.commons.csv.CSVFormat var19 = var15.withIgnoreEmptyLines();
    java.lang.String[] var20 = var19.getHeaderComments();
    org.apache.commons.csv.CSVFormat var22 = var19.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var24 = var19.withRecordSeparator('4');
    org.apache.commons.csv.QuoteMode var25 = var24.getQuoteMode();
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
    org.apache.commons.csv.CSVFormat var49 = var24.withHeader(var45);
    java.lang.String var50 = var10.format((java.lang.Object[])var45);
    org.apache.commons.csv.CSVFormat var51 = var6.withHeader(var45);
    java.lang.Character var52 = var51.getEscapeCharacter();
    org.apache.commons.csv.CSVFormat var54 = var51.withNullString("Delimiter=<4 >4 NullString=<Delimiter=<4 >4 SkipHeaderRecord:true>4 SkipHeaderRecord:false");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
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
    assertTrue("'" + var50 + "' != '" + ""+ "'", var50.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + '4'+ "'", var52.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test24");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    boolean var4 = var1.isCommentMarkerSet();
    boolean var5 = var1.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var7 = var1.withAllowMissingColumnNames(false);
    org.apache.commons.csv.CSVFormat var9 = var7.withIgnoreEmptyLines(true);
    java.lang.String[] var10 = var7.getHeaderComments();
    org.apache.commons.csv.CSVFormat var13 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var14 = var13.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var15 = var13.withSkipHeaderRecord();
    java.lang.String var16 = var15.toString();
    org.apache.commons.csv.CSVFormat var18 = var15.withNullString("");
    org.apache.commons.csv.CSVFormat var20 = var15.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var21 = var20.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var22 = var21.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVParser var23 = org.apache.commons.csv.CSVParser.parse("DefaultaExcelaMySQLaRFC4180aTDF", var21);
    org.apache.commons.csv.CSVFormat var25 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var26 = var25.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var28 = var25.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var30 = var25.withNullString("Delimiter=< > SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var32 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var33 = var32.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var35 = var32.withNullString("");
    org.apache.commons.csv.CSVFormat var36 = var32.withIgnoreEmptyLines();
    java.lang.String var37 = var36.toString();
    org.apache.commons.csv.CSVFormat var39 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var40 = var39.withAllowMissingColumnNames();
    boolean var41 = var39.isNullStringSet();
    java.lang.String[] var43 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var44 = var39.withHeader(var43);
    org.apache.commons.csv.CSVFormat var45 = var36.withHeader(var43);
    org.apache.commons.csv.CSVFormat var46 = var25.withHeader(var43);
    org.apache.commons.csv.CSVFormat var47 = var46.withIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode var48 = var47.getQuoteMode();
    org.apache.commons.csv.CSVFormat var50 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var51 = var50.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var52 = var50.withSkipHeaderRecord();
    java.lang.String var53 = var52.toString();
    org.apache.commons.csv.CSVFormat var55 = var52.withNullString("");
    org.apache.commons.csv.CSVFormat var57 = var52.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var59 = var52.withNullString("Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var61 = var52.withRecordSeparator(' ');
    java.lang.String var62 = var61.toString();
    org.apache.commons.csv.CSVFormat var64 = var61.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var66 = var64.withEscape('4');
    org.apache.commons.csv.CSVFormat var68 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var69 = var68.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var70 = var68.withSkipHeaderRecord();
    java.lang.String var71 = var70.toString();
    org.apache.commons.csv.CSVFormat var73 = var70.withNullString("");
    org.apache.commons.csv.CSVFormat var75 = var70.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var77 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var78 = var77.withAllowMissingColumnNames();
    boolean var79 = var77.isNullStringSet();
    java.lang.String[] var81 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var82 = var77.withHeader(var81);
    java.lang.String var83 = var75.format((java.lang.Object[])var81);
    java.lang.String var84 = var66.format((java.lang.Object[])var81);
    org.apache.commons.csv.CSVFormat var85 = var47.withHeaderComments((java.lang.Object[])var81);
    java.lang.String var86 = var21.format((java.lang.Object[])var81);
    java.lang.String var87 = var7.format((java.lang.Object[])var81);
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var16.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false"+ "'", var37.equals("Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var53.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "Delimiter=< > RecordSeparator=< > SkipHeaderRecord:true"+ "'", var62.equals("Delimiter=< > RecordSeparator=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var71.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var83 + "' != '" + ""+ "'", var83.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var84 + "' != '" + ""+ "'", var84.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var86 + "' != '" + ""+ "'", var86.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var87 + "' != '" + ""+ "'", var87.equals(""));

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test25");


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
    org.apache.commons.csv.CSVFormat var29 = var28.withIgnoreSurroundingSpaces();
    char var30 = var28.getDelimiter();
    org.apache.commons.csv.CSVFormat var31 = var28.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var33 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var34 = var33.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var35 = var33.withSkipHeaderRecord();
    java.lang.String var36 = var35.toString();
    org.apache.commons.csv.CSVFormat var38 = var35.withNullString("");
    org.apache.commons.csv.CSVFormat var40 = var35.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var41 = var40.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var42 = var40.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var44 = var40.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var46 = var44.withQuote((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var48 = var46.withQuote((java.lang.Character)'#');
    org.apache.commons.csv.CSVFormat var50 = var46.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var52 = var46.withEscape((java.lang.Character)'a');
    boolean var53 = var28.equals((java.lang.Object)'a');
    
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
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == ' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var36.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test26");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    boolean var4 = var1.isCommentMarkerSet();
    boolean var5 = var1.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var7 = var1.withQuote((java.lang.Character)'4');
    char var8 = var7.getDelimiter();
    java.lang.String var9 = var7.getRecordSeparator();
    java.lang.Character var10 = var7.getQuoteCharacter();
    java.lang.Character var11 = var7.getQuoteCharacter();
    
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
    assertTrue(var8 == ' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + '4'+ "'", var10.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + '4'+ "'", var11.equals('4'));

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test27");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    boolean var2 = var1.isCommentMarkerSet();
    boolean var3 = var1.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var5 = var1.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var7 = var5.withDelimiter('a');
    boolean var8 = var7.isNullStringSet();
    org.apache.commons.csv.CSVFormat var10 = var7.withNullString("Delimiter=< > RecordSeparator=<4> SkipHeaderRecord:false");
    boolean var11 = var10.isQuoteCharacterSet();
    boolean var12 = var10.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var13 = var10.withIgnoreEmptyLines();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test28");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    java.lang.String var4 = var3.toString();
    org.apache.commons.csv.CSVFormat var6 = var3.withNullString("");
    org.apache.commons.csv.CSVFormat var8 = var3.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var9 = var8.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var11 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var12 = var11.withIgnoreSurroundingSpaces();
    java.lang.Character var13 = var11.getCommentMarker();
    java.lang.String var14 = var11.getNullString();
    org.apache.commons.csv.CSVFormat var15 = var11.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var17 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var18 = var17.withAllowMissingColumnNames();
    boolean var19 = var17.isNullStringSet();
    java.lang.String[] var21 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var22 = var17.withHeader(var21);
    org.apache.commons.csv.CSVFormat var24 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var25 = var24.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var26 = var24.withSkipHeaderRecord();
    boolean var27 = var24.isCommentMarkerSet();
    boolean var28 = var24.getIgnoreHeaderCase();
    java.lang.String[] var30 = new java.lang.String[] { "Delimiter=< > SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var31 = var24.withHeader(var30);
    org.apache.commons.csv.CSVFormat var33 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var34 = var33.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var35 = var33.withSkipHeaderRecord();
    boolean var36 = var33.isCommentMarkerSet();
    boolean var37 = var33.getIgnoreHeaderCase();
    java.lang.String[] var39 = new java.lang.String[] { "Delimiter=< > SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var40 = var33.withHeader(var39);
    org.apache.commons.csv.CSVFormat var41 = var24.withHeader(var39);
    java.lang.String var42 = var22.format((java.lang.Object[])var39);
    org.apache.commons.csv.CSVFormat var43 = var15.withHeader(var39);
    java.lang.String var44 = var8.format((java.lang.Object[])var39);
    org.apache.commons.csv.CSVFormat var46 = var8.withRecordSeparator("Delimiter=<4 >4 NullString=<Delimiter=<4 >4 SkipHeaderRecord:true>4 SkipHeaderRecord:false");
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var42.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var44.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test29");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var3 = var2.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var5 = var2.withNullString("");
    org.apache.commons.csv.CSVFormat var6 = var2.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var8 = var6.withDelimiter('4');
    java.lang.String[] var9 = var6.getHeaderComments();
    char var10 = var6.getDelimiter();
    org.apache.commons.csv.CSVParser var11 = org.apache.commons.csv.CSVParser.parse("Delimiter=< > EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", var6);
    java.util.List var12 = var11.getRecords();
    long var13 = var11.getCurrentLineNumber();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test30");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withNullString("");
    org.apache.commons.csv.CSVFormat var5 = var1.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var7 = var5.withDelimiter('4');
    boolean var8 = var7.getAllowMissingColumnNames();
    java.lang.String var9 = var7.getRecordSeparator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat var11 = var7.withEscape((java.lang.Character)'4');
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test31");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withRecordSeparator("hi!");
    boolean var5 = var4.isNullStringSet();
    boolean var6 = var4.getAllowMissingColumnNames();
    org.apache.commons.csv.QuoteMode var7 = var4.getQuoteMode();
    java.lang.String[] var8 = var4.getHeader();
    java.lang.String var9 = var4.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var11 = var4.withNullString("Delimiter=< > RecordSeparator=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:true");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test32");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.QuoteMode var1 = org.apache.commons.csv.QuoteMode.valueOf(" ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test33");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var6 = var1.withNullString("Delimiter=< > SkipHeaderRecord:true");
    boolean var7 = var6.isQuoteCharacterSet();
    java.lang.String[] var8 = var6.getHeader();
    org.apache.commons.csv.CSVFormat var10 = var6.withAllowMissingColumnNames(true);
    boolean var11 = var10.getSkipHeaderRecord();
    boolean var12 = var10.isNullStringSet();
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test34");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withRecordSeparator("hi!");
    org.apache.commons.csv.CSVFormat var6 = var4.withIgnoreEmptyLines(true);
    java.lang.Character var7 = var6.getCommentMarker();
    org.apache.commons.csv.CSVFormat var9 = var6.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var11 = var9.withNullString("Delimiter=< > CommentStart=<4> RecordSeparator=<Default Excel MySQL RFC4180 TDF> EmptyLines:ignored SkipHeaderRecord:true");
    
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
    assertNotNull(var11);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test35");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat.Predefined var1 = org.apache.commons.csv.CSVFormat.Predefined.valueOf("Delimiter=< > SkipHeaderRecord:trueDelimiter=< > RecordSeparator=<4> EmptyLines:ignored SkipHeaderRecord:false Header:[]");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test36");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    boolean var3 = var1.isNullStringSet();
    java.lang.String[] var5 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var6 = var1.withHeader(var5);
    org.apache.commons.csv.CSVFormat var7 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var9 = var7.withIgnoreSurroundingSpaces(true);
    java.lang.String var10 = var7.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var12 = var7.withSkipHeaderRecord(false);
    boolean var13 = var12.isEscapeCharacterSet();
    
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test37");


    org.apache.commons.csv.CSVFormat var3 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    boolean var4 = var3.isCommentMarkerSet();
    boolean var5 = var3.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVParser var6 = org.apache.commons.csv.CSVParser.parse("", var3);
    boolean var7 = var3.getSkipHeaderRecord();
    org.apache.commons.csv.CSVParser var8 = org.apache.commons.csv.CSVParser.parse("Delimiter=< > CommentStart=<4> RecordSeparator=<Default Excel MySQL RFC4180 TDF> EmptyLines:ignored SkipHeaderRecord:true", var3);
    boolean var9 = var8.isClosed();
    long var10 = var8.getCurrentLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test38");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    boolean var4 = var1.isCommentMarkerSet();
    java.lang.Character var5 = var1.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var6 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var8 = var6.withQuote((java.lang.Character)'a');
    boolean var9 = var8.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var10 = var8.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var11 = var10.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var13 = var11.withCommentMarker('#');
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test39");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var6 = var1.withNullString("Delimiter=< > SkipHeaderRecord:true");
    java.lang.Character var7 = var6.getCommentMarker();
    org.apache.commons.csv.QuoteMode var8 = var6.getQuoteMode();
    org.apache.commons.csv.CSVFormat var10 = var6.withEscape((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var11 = var10.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var13 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var14 = var13.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var15 = var13.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var17 = var15.withAllowMissingColumnNames(true);
    java.lang.String var18 = var17.getRecordSeparator();
    java.lang.Character var19 = var17.getCommentMarker();
    org.apache.commons.csv.CSVFormat var20 = var17.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var22 = var17.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var24 = var17.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var26 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var27 = var26.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var29 = var26.withRecordSeparator("hi!");
    boolean var30 = var29.isCommentMarkerSet();
    java.lang.Character var31 = var29.getEscapeCharacter();
    org.apache.commons.csv.CSVFormat var33 = var29.withAllowMissingColumnNames(true);
    boolean var34 = var33.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var36 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var37 = var36.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var39 = var36.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var41 = var36.withNullString("Delimiter=< > SkipHeaderRecord:true");
    boolean var42 = var41.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var44 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var45 = var44.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var46 = var44.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var48 = var46.withAllowMissingColumnNames(true);
    java.lang.String var49 = var48.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var51 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var52 = var51.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var54 = var51.withNullString("");
    org.apache.commons.csv.CSVFormat var55 = var51.withIgnoreEmptyLines();
    java.lang.String var56 = var55.toString();
    org.apache.commons.csv.CSVFormat var58 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var59 = var58.withAllowMissingColumnNames();
    boolean var60 = var58.isNullStringSet();
    java.lang.String[] var62 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var63 = var58.withHeader(var62);
    org.apache.commons.csv.CSVFormat var64 = var55.withHeader(var62);
    java.lang.String var65 = var48.format((java.lang.Object[])var62);
    org.apache.commons.csv.CSVFormat var66 = var41.withHeaderComments((java.lang.Object[])var62);
    org.apache.commons.csv.CSVFormat var67 = var33.withHeader(var62);
    java.lang.String var68 = var24.format((java.lang.Object[])var62);
    boolean var69 = var10.equals((java.lang.Object)var62);
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false"+ "'", var56.equals("Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + ""+ "'", var65.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + ""+ "'", var68.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test40");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withNullString("");
    org.apache.commons.csv.CSVFormat var5 = var1.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var7 = var5.withRecordSeparator('#');
    boolean var9 = var5.equals((java.lang.Object)10.0f);
    java.lang.Character var10 = var5.getEscapeCharacter();
    java.lang.String var11 = var5.toString();
    java.lang.String[] var12 = var5.getHeader();
    
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false"+ "'", var11.equals("Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test41");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var3 = var2.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var5 = var2.withRecordSeparator("hi!");
    boolean var6 = var5.isCommentMarkerSet();
    java.lang.String[] var7 = var5.getHeader();
    org.apache.commons.csv.CSVParser var8 = org.apache.commons.csv.CSVParser.parse("Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false", var5);
    java.util.Map var9 = var8.getHeaderMap();
    long var10 = var8.getRecordNumber();
    java.util.Map var11 = var8.getHeaderMap();
    long var12 = var8.getCurrentLineNumber();
    java.util.Map var13 = var8.getHeaderMap();
    long var14 = var8.getCurrentLineNumber();
    java.util.Map var15 = var8.getHeaderMap();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test42");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var4 = var1.withCommentMarker((java.lang.Character)'a');
    boolean var5 = var4.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var7 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var8 = var7.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var9 = var7.withSkipHeaderRecord();
    boolean var10 = var7.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var12 = var7.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var14 = var7.withQuote((java.lang.Character)'4');
    boolean var15 = var14.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var17 = var14.withDelimiter('#');
    boolean var18 = var4.equals((java.lang.Object)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat var20 = var14.withEscape(' ');
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test43");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    boolean var3 = var1.isNullStringSet();
    java.lang.String[] var5 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var6 = var1.withHeader(var5);
    org.apache.commons.csv.CSVFormat var7 = var1.withSkipHeaderRecord();
    boolean var8 = var7.getSkipHeaderRecord();
    
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test44");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var3 = var2.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var5 = var2.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVParser var6 = org.apache.commons.csv.CSVParser.parse("", var5);
    java.util.Iterator var7 = var6.iterator();
    java.util.Iterator var8 = var6.iterator();
    java.util.Map var9 = var6.getHeaderMap();
    java.util.List var10 = var6.getRecords();
    boolean var11 = var6.isClosed();
    java.util.Iterator var12 = var6.iterator();
    long var13 = var6.getCurrentLineNumber();
    long var14 = var6.getCurrentLineNumber();
    
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
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test45");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withRecordSeparator("#");
    org.apache.commons.csv.CSVFormat var5 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var6 = var5.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var8 = var5.withNullString("");
    boolean var9 = var5.isNullStringSet();
    boolean var10 = var5.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var12 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var13 = var12.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var14 = var12.withSkipHeaderRecord();
    boolean var15 = var12.isCommentMarkerSet();
    java.lang.Character var16 = var12.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var17 = var12.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var19 = var12.withIgnoreEmptyLines(true);
    boolean var20 = var5.equals((java.lang.Object)var12);
    boolean var21 = var1.equals((java.lang.Object)var5);
    boolean var22 = var5.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var24 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var25 = var24.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var26 = var24.withSkipHeaderRecord();
    java.lang.String var27 = var26.toString();
    org.apache.commons.csv.CSVFormat var29 = var26.withNullString("");
    org.apache.commons.csv.CSVFormat var31 = var26.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var33 = var26.withNullString("Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var35 = var26.withRecordSeparator(' ');
    java.lang.String var36 = var35.toString();
    org.apache.commons.csv.CSVFormat var38 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var39 = var38.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var41 = var38.withRecordSeparator("hi!");
    boolean var42 = var41.isCommentMarkerSet();
    java.lang.Character var43 = var41.getEscapeCharacter();
    org.apache.commons.csv.CSVFormat var45 = var41.withAllowMissingColumnNames(true);
    boolean var46 = var45.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var48 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var49 = var48.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var50 = var48.withSkipHeaderRecord();
    java.lang.String var51 = var50.toString();
    org.apache.commons.csv.CSVFormat var53 = var50.withNullString("");
    org.apache.commons.csv.CSVFormat var55 = var53.withEscape((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var57 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var58 = var57.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var59 = var57.withSkipHeaderRecord();
    boolean var60 = var57.isCommentMarkerSet();
    boolean var61 = var57.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var63 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var64 = var63.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var66 = var63.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var68 = var63.withNullString("Delimiter=< > SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var69 = var68.withIgnoreSurroundingSpaces();
    java.lang.Object[] var70 = new java.lang.Object[] { var68};
    java.lang.String var71 = var57.format(var70);
    java.lang.String[] var73 = new java.lang.String[] { "Default Excel MySQL RFC4180 TDF"};
    org.apache.commons.csv.CSVFormat var74 = var57.withHeader(var73);
    org.apache.commons.csv.CSVFormat var75 = var53.withHeader(var73);
    java.lang.String var76 = var45.format((java.lang.Object[])var73);
    java.lang.String var77 = var35.format((java.lang.Object[])var73);
    org.apache.commons.csv.CSVFormat var78 = var5.withHeaderComments((java.lang.Object[])var73);
    org.apache.commons.csv.CSVFormat var80 = var78.withEscape((java.lang.Character)'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var27.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "Delimiter=< > RecordSeparator=< > SkipHeaderRecord:true"+ "'", var36.equals("Delimiter=< > RecordSeparator=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var51.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false"+ "'", var71.equals("Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "Default Excel MySQL RFC4180 TDFhi!"+ "'", var76.equals("Default Excel MySQL RFC4180 TDFhi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + "Default Excel MySQL RFC4180 TDF"+ "'", var77.equals("Default Excel MySQL RFC4180 TDF"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test46");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat.Predefined var1 = org.apache.commons.csv.CSVFormat.Predefined.valueOf("Delimiter=< > QuoteChar=<#> EmptyLines:ignored SkipHeaderRecord:false HeaderComments:[] Header:[]");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test47");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withNullString("");
    org.apache.commons.csv.CSVFormat var5 = var1.withIgnoreEmptyLines();
    java.lang.String var6 = var5.toString();
    org.apache.commons.csv.CSVFormat var7 = var5.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var8 = var5.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var10 = var5.withDelimiter('4');
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test48");


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
    org.apache.commons.csv.CSVFormat var38 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var39 = var38.withAllowMissingColumnNames();
    boolean var40 = var38.isNullStringSet();
    java.lang.String[] var42 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var43 = var38.withHeader(var42);
    org.apache.commons.csv.CSVFormat var45 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var46 = var45.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var47 = var45.withSkipHeaderRecord();
    boolean var48 = var45.isCommentMarkerSet();
    boolean var49 = var45.getIgnoreHeaderCase();
    java.lang.String[] var51 = new java.lang.String[] { "Delimiter=< > SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var52 = var45.withHeader(var51);
    org.apache.commons.csv.CSVFormat var54 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var55 = var54.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var56 = var54.withSkipHeaderRecord();
    boolean var57 = var54.isCommentMarkerSet();
    boolean var58 = var54.getIgnoreHeaderCase();
    java.lang.String[] var60 = new java.lang.String[] { "Delimiter=< > SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var61 = var54.withHeader(var60);
    org.apache.commons.csv.CSVFormat var62 = var45.withHeader(var60);
    java.lang.String var63 = var43.format((java.lang.Object[])var60);
    org.apache.commons.csv.CSVFormat var64 = var35.withHeader(var60);
    org.apache.commons.csv.CSVFormat var66 = var64.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var68 = var66.withCommentMarker((java.lang.Character)'4');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat var70 = var68.withEscape('4');
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var63.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test49");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var3 = var2.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var4 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var6 = var4.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var7 = var4.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var8 = var4.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVParser var9 = org.apache.commons.csv.CSVParser.parse("Default Excel MySQL RFC4180 TDF", var8);
    java.util.List var10 = var9.getRecords();
    java.util.List var11 = var9.getRecords();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test50");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var3 = var2.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var5 = var2.withNullString("");
    org.apache.commons.csv.CSVFormat var6 = var2.withIgnoreEmptyLines();
    java.lang.String[] var7 = var6.getHeaderComments();
    org.apache.commons.csv.CSVFormat var9 = var6.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var11 = var9.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var13 = var11.withRecordSeparator("Default Excel MySQL RFC4180 TDF");
    org.apache.commons.csv.CSVFormat var14 = var13.withIgnoreSurroundingSpaces();
    boolean var15 = var14.isNullStringSet();
    java.lang.String var16 = var14.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var18 = var14.withQuote((java.lang.Character)'#');
    org.apache.commons.csv.CSVParser var19 = org.apache.commons.csv.CSVParser.parse("Default Excel MySQL RFC4180 TDF#", var14);
    org.apache.commons.csv.CSVFormat var21 = var14.withRecordSeparator("Delimiter=< > Escape=<a> RecordSeparator=<4> EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var23 = var14.withNullString("Delimiter=<4> Escape=<a> SkipHeaderRecord:false Header:[Delimiter=< > SkipHeaderRecord:true]");
    
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
    assertTrue("'" + var16 + "' != '" + "Default Excel MySQL RFC4180 TDF"+ "'", var16.equals("Default Excel MySQL RFC4180 TDF"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test51");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withNullString("");
    boolean var5 = var1.isNullStringSet();
    boolean var6 = var1.getAllowMissingColumnNames();
    java.lang.String var7 = var1.getRecordSeparator();
    java.lang.Character var8 = var1.getCommentMarker();
    org.apache.commons.csv.CSVFormat var10 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var11 = var10.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var13 = var10.withNullString("");
    org.apache.commons.csv.CSVFormat var14 = var10.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var16 = var14.withRecordSeparator('#');
    org.apache.commons.csv.CSVFormat var18 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var19 = var18.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var20 = var18.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var22 = var20.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var24 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var25 = var24.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var26 = var24.withSkipHeaderRecord();
    java.lang.String var27 = var26.toString();
    org.apache.commons.csv.CSVFormat var29 = var26.withNullString("");
    org.apache.commons.csv.CSVFormat var31 = var26.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var33 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var34 = var33.withAllowMissingColumnNames();
    boolean var35 = var33.isNullStringSet();
    java.lang.String[] var37 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var38 = var33.withHeader(var37);
    java.lang.String var39 = var31.format((java.lang.Object[])var37);
    java.lang.String var40 = var22.format((java.lang.Object[])var37);
    org.apache.commons.csv.CSVFormat var41 = var14.withHeader(var37);
    org.apache.commons.csv.CSVFormat var42 = var1.withHeaderComments((java.lang.Object[])var37);
    org.apache.commons.csv.CSVFormat var43 = var1.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var45 = var1.withNullString("Delimiter=< > RecordSeparator=<#> EmptyLines:ignored SkipHeaderRecord:false");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var27.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
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
    assertTrue("'" + var39 + "' != '" + ""+ "'", var39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + ""+ "'", var40.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test52");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    boolean var3 = var2.isCommentMarkerSet();
    boolean var4 = var2.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVParser var5 = org.apache.commons.csv.CSVParser.parse("", var2);
    boolean var6 = var5.isClosed();
    var5.close();
    var5.close();
    long var9 = var5.getCurrentLineNumber();
    boolean var10 = var5.isClosed();
    long var11 = var5.getCurrentLineNumber();
    
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
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test53");


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
    java.lang.String var18 = var17.getNullString();
    
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

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test54");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var3 = var2.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var5 = var2.withNullString("");
    org.apache.commons.csv.CSVFormat var6 = var2.withIgnoreEmptyLines();
    java.lang.String[] var7 = var6.getHeaderComments();
    org.apache.commons.csv.CSVFormat var9 = var6.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var11 = var6.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat var13 = var11.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var15 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var16 = var15.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var17 = var15.withSkipHeaderRecord();
    boolean var18 = var15.isCommentMarkerSet();
    boolean var19 = var15.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var21 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var22 = var21.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var24 = var21.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var26 = var21.withNullString("Delimiter=< > SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var27 = var26.withIgnoreSurroundingSpaces();
    java.lang.Object[] var28 = new java.lang.Object[] { var26};
    java.lang.String var29 = var15.format(var28);
    java.lang.String[] var31 = new java.lang.String[] { "Default Excel MySQL RFC4180 TDF"};
    org.apache.commons.csv.CSVFormat var32 = var15.withHeader(var31);
    org.apache.commons.csv.CSVFormat var33 = var11.withHeader(var31);
    org.apache.commons.csv.CSVParser var34 = org.apache.commons.csv.CSVParser.parse("Delimiter=< > SkipHeaderRecord:false Header:[]", var33);
    org.apache.commons.csv.CSVFormat var35 = var33.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var37 = var35.withQuote('a');
    java.lang.Character var38 = var35.getCommentMarker();
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false"+ "'", var29.equals("Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
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
    assertNull(var38);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test55");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var3 = var2.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var5 = var2.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var7 = var2.withNullString("Delimiter=< > SkipHeaderRecord:true");
    java.lang.Character var8 = var7.getCommentMarker();
    org.apache.commons.csv.CSVParser var9 = org.apache.commons.csv.CSVParser.parse("", var7);
    org.apache.commons.csv.CSVFormat var11 = var7.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var13 = var7.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var14 = var7.withAllowMissingColumnNames();
    boolean var15 = var14.getAllowMissingColumnNames();
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test56");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var3 = var2.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var4 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var6 = var4.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var7 = var4.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var8 = var4.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVParser var9 = org.apache.commons.csv.CSVParser.parse("DefaultaExcelaMySQLaRFC4180aTDF", var4);
    java.util.Iterator var10 = var9.iterator();
    java.util.Iterator var11 = var9.iterator();
    var9.close();
    var9.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test57");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    char var2 = var1.getDelimiter();
    org.apache.commons.csv.CSVFormat var3 = var1.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator("#");
    org.apache.commons.csv.CSVFormat var7 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var8 = var7.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var9 = var7.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var11 = var9.withAllowMissingColumnNames(true);
    java.lang.String var12 = var11.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var14 = var11.withIgnoreEmptyLines(false);
    java.lang.String[] var15 = var11.getHeader();
    char var16 = var11.getDelimiter();
    org.apache.commons.csv.CSVFormat var18 = var11.withQuote('#');
    org.apache.commons.csv.CSVFormat var20 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var21 = var20.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var23 = var20.withNullString("");
    org.apache.commons.csv.CSVFormat var24 = var20.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var26 = var24.withRecordSeparator('#');
    org.apache.commons.csv.CSVFormat var28 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var29 = var28.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var30 = var28.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var32 = var30.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var34 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var35 = var34.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var36 = var34.withSkipHeaderRecord();
    java.lang.String var37 = var36.toString();
    org.apache.commons.csv.CSVFormat var39 = var36.withNullString("");
    org.apache.commons.csv.CSVFormat var41 = var36.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var43 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var44 = var43.withAllowMissingColumnNames();
    boolean var45 = var43.isNullStringSet();
    java.lang.String[] var47 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var48 = var43.withHeader(var47);
    java.lang.String var49 = var41.format((java.lang.Object[])var47);
    java.lang.String var50 = var32.format((java.lang.Object[])var47);
    org.apache.commons.csv.CSVFormat var51 = var24.withHeader(var47);
    org.apache.commons.csv.CSVFormat var52 = var18.withHeader(var47);
    org.apache.commons.csv.CSVFormat var53 = var3.withHeader(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == ' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == ' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var37.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + ""+ "'", var49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + ""+ "'", var50.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test58");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var4 = var2.withRecordSeparator("#");
    org.apache.commons.csv.CSVParser var5 = org.apache.commons.csv.CSVParser.parse("#", var2);
    java.util.Map var6 = var5.getHeaderMap();
    boolean var7 = var5.isClosed();
    boolean var8 = var5.isClosed();
    java.util.Iterator var9 = var5.iterator();
    boolean var10 = var5.isClosed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test59");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    boolean var2 = var1.isCommentMarkerSet();
    java.lang.Character var3 = var1.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var5 = var1.withIgnoreEmptyLines(false);
    org.apache.commons.csv.CSVFormat var7 = var1.withEscape('a');
    org.apache.commons.csv.CSVFormat var9 = var7.withQuote((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var11 = var9.withEscape('a');
    boolean var12 = var11.getIgnoreHeaderCase();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test60");


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
    org.apache.commons.csv.CSVFormat var16 = var14.withRecordSeparator('4');
    boolean var17 = var16.getIgnoreHeaderCase();
    
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
    assertTrue(var17 == false);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test61");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var6 = var3.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var8 = var6.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var10 = var8.withRecordSeparator("Delimiter=< > QuoteChar=<a> SkipHeaderRecord:false");
    java.lang.Character var11 = var8.getQuoteCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test62");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withNullString("");
    org.apache.commons.csv.CSVFormat var6 = var1.withIgnoreEmptyLines(false);
    java.lang.String var7 = var6.getNullString();
    org.apache.commons.csv.CSVFormat var9 = var6.withQuote('4');
    boolean var10 = var6.isCommentMarkerSet();
    
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
    assertTrue(var10 == false);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test63");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var3 = var2.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var5 = var2.withNullString("");
    org.apache.commons.csv.CSVFormat var6 = var2.withIgnoreEmptyLines();
    java.lang.String[] var7 = var6.getHeaderComments();
    org.apache.commons.csv.CSVFormat var9 = var6.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var11 = var6.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat var13 = var11.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVParser var14 = org.apache.commons.csv.CSVParser.parse("", var13);
    java.lang.String[] var15 = var13.getHeaderComments();
    java.lang.Character var16 = var13.getCommentMarker();
    
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
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test64");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withNullString("");
    org.apache.commons.csv.CSVFormat var5 = var1.withIgnoreEmptyLines();
    java.lang.String[] var6 = var5.getHeaderComments();
    org.apache.commons.csv.CSVFormat var8 = var5.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var10 = var8.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var11 = var8.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var13 = var8.withIgnoreHeaderCase(false);
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test65");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var7 = var5.withQuote((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var8 = var7.withAllowMissingColumnNames();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat var10 = var7.withCommentMarker(' ');
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test66");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    boolean var2 = var1.isCommentMarkerSet();
    boolean var3 = var1.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var5 = var1.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var7 = var5.withDelimiter('a');
    java.lang.String var8 = var7.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var9 = var7.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var10 = var9.withSkipHeaderRecord();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test67");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withNullString("");
    org.apache.commons.csv.CSVFormat var5 = var1.withIgnoreEmptyLines();
    java.lang.String[] var6 = var5.getHeaderComments();
    org.apache.commons.csv.CSVFormat var8 = var5.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var10 = var8.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var12 = var10.withRecordSeparator("Default Excel MySQL RFC4180 TDF");
    org.apache.commons.csv.CSVFormat var14 = var10.withDelimiter('4');
    org.apache.commons.csv.CSVFormat var16 = var14.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var18 = var16.withEscape((java.lang.Character)' ');
    boolean var19 = var18.isCommentMarkerSet();
    org.apache.commons.csv.QuoteMode var20 = var18.getQuoteMode();
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test68");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var3 = var2.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var5 = var2.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVParser var6 = org.apache.commons.csv.CSVParser.parse("", var5);
    java.util.Iterator var7 = var6.iterator();
    java.util.Iterator var8 = var6.iterator();
    java.util.Map var9 = var6.getHeaderMap();
    long var10 = var6.getRecordNumber();
    long var11 = var6.getCurrentLineNumber();
    java.util.Map var12 = var6.getHeaderMap();
    long var13 = var6.getCurrentLineNumber();
    
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
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test69");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    boolean var4 = var1.isCommentMarkerSet();
    java.lang.Character var5 = var1.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var6 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var8 = var6.withCommentMarker((java.lang.Character)'a');
    java.lang.String[] var9 = var6.getHeader();
    boolean var10 = var6.isQuoteCharacterSet();
    
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
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test70");


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
    java.lang.String var44 = var43.toString();
    
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
    assertTrue("'" + var44 + "' != '" + "Delimiter=<4> QuoteChar=< > EmptyLines:ignored SkipHeaderRecord:true"+ "'", var44.equals("Delimiter=<4> QuoteChar=< > EmptyLines:ignored SkipHeaderRecord:true"));

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test71");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var4 = var1.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var6 = var1.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var8 = var6.withQuote('#');
    org.apache.commons.csv.CSVFormat var9 = var6.withSkipHeaderRecord();
    java.lang.Character var10 = var6.getEscapeCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test72");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    char var3 = var2.getDelimiter();
    org.apache.commons.csv.CSVFormat var5 = var2.withDelimiter(' ');
    org.apache.commons.csv.CSVFormat var7 = var5.withEscape((java.lang.Character)'4');
    org.apache.commons.csv.CSVParser var8 = org.apache.commons.csv.CSVParser.parse("Delimiter=< > CommentStart=<4> RecordSeparator=<Default Excel MySQL RFC4180 TDF> EmptyLines:ignored SkipHeaderRecord:true", var7);
    boolean var9 = var8.isClosed();
    java.util.Map var10 = var8.getHeaderMap();
    long var11 = var8.getRecordNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == ' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
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

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test73");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var4 = var1.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var6 = var4.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var8 = var6.withQuote('a');
    boolean var9 = var6.isCommentMarkerSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test74");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var3 = var2.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var4 = var2.withSkipHeaderRecord();
    boolean var5 = var2.isCommentMarkerSet();
    boolean var6 = var2.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var8 = var2.withAllowMissingColumnNames(false);
    java.lang.String[] var9 = var2.getHeader();
    org.apache.commons.csv.CSVParser var10 = org.apache.commons.csv.CSVParser.parse("Delimiter=< > SkipHeaderRecord:trueDelimiter=< > SkipHeaderRecord:true", var2);
    org.apache.commons.csv.CSVFormat var12 = var2.withIgnoreHeaderCase(false);
    
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
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test75");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    boolean var4 = var1.isCommentMarkerSet();
    java.lang.Character var5 = var1.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var6 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var8 = var6.withRecordSeparator('4');
    boolean var9 = var8.isQuoteCharacterSet();
    java.lang.String var10 = var8.toString();
    boolean var11 = var8.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var13 = var8.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var14 = var13.withIgnoreEmptyLines();
    java.lang.String var15 = var13.getNullString();
    org.apache.commons.csv.CSVFormat var17 = var13.withIgnoreSurroundingSpaces(false);
    boolean var18 = var13.getIgnoreHeaderCase();
    
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
    assertTrue("'" + var10 + "' != '" + "Delimiter=< > RecordSeparator=<4> SkipHeaderRecord:false"+ "'", var10.equals("Delimiter=< > RecordSeparator=<4> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test76");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withRecordSeparator("#");
    org.apache.commons.csv.CSVFormat var5 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var6 = var5.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var8 = var5.withNullString("");
    boolean var9 = var5.isNullStringSet();
    boolean var10 = var5.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var12 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var13 = var12.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var14 = var12.withSkipHeaderRecord();
    boolean var15 = var12.isCommentMarkerSet();
    java.lang.Character var16 = var12.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var17 = var12.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var19 = var12.withIgnoreEmptyLines(true);
    boolean var20 = var5.equals((java.lang.Object)var12);
    boolean var21 = var1.equals((java.lang.Object)var5);
    boolean var22 = var5.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var24 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var25 = var24.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var26 = var24.withSkipHeaderRecord();
    java.lang.String var27 = var26.toString();
    org.apache.commons.csv.CSVFormat var29 = var26.withNullString("");
    org.apache.commons.csv.CSVFormat var31 = var26.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var33 = var26.withNullString("Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var35 = var26.withRecordSeparator(' ');
    java.lang.String var36 = var35.toString();
    org.apache.commons.csv.CSVFormat var38 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var39 = var38.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var41 = var38.withRecordSeparator("hi!");
    boolean var42 = var41.isCommentMarkerSet();
    java.lang.Character var43 = var41.getEscapeCharacter();
    org.apache.commons.csv.CSVFormat var45 = var41.withAllowMissingColumnNames(true);
    boolean var46 = var45.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var48 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var49 = var48.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var50 = var48.withSkipHeaderRecord();
    java.lang.String var51 = var50.toString();
    org.apache.commons.csv.CSVFormat var53 = var50.withNullString("");
    org.apache.commons.csv.CSVFormat var55 = var53.withEscape((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var57 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var58 = var57.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var59 = var57.withSkipHeaderRecord();
    boolean var60 = var57.isCommentMarkerSet();
    boolean var61 = var57.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var63 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var64 = var63.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var66 = var63.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var68 = var63.withNullString("Delimiter=< > SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var69 = var68.withIgnoreSurroundingSpaces();
    java.lang.Object[] var70 = new java.lang.Object[] { var68};
    java.lang.String var71 = var57.format(var70);
    java.lang.String[] var73 = new java.lang.String[] { "Default Excel MySQL RFC4180 TDF"};
    org.apache.commons.csv.CSVFormat var74 = var57.withHeader(var73);
    org.apache.commons.csv.CSVFormat var75 = var53.withHeader(var73);
    java.lang.String var76 = var45.format((java.lang.Object[])var73);
    java.lang.String var77 = var35.format((java.lang.Object[])var73);
    org.apache.commons.csv.CSVFormat var78 = var5.withHeaderComments((java.lang.Object[])var73);
    org.apache.commons.csv.CSVFormat var80 = var78.withSkipHeaderRecord(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var27.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "Delimiter=< > RecordSeparator=< > SkipHeaderRecord:true"+ "'", var36.equals("Delimiter=< > RecordSeparator=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var51.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false"+ "'", var71.equals("Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "Default Excel MySQL RFC4180 TDFhi!"+ "'", var76.equals("Default Excel MySQL RFC4180 TDFhi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + "Default Excel MySQL RFC4180 TDF"+ "'", var77.equals("Default Excel MySQL RFC4180 TDF"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test77");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var6 = var1.withNullString("Delimiter=< > SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var7 = var6.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var9 = var7.withQuote((java.lang.Character)'#');
    org.apache.commons.csv.CSVFormat var10 = var7.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var12 = var7.withDelimiter('#');
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test78");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    boolean var3 = var1.isNullStringSet();
    boolean var4 = var1.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var6 = var1.withCommentMarker((java.lang.Character)'4');
    java.lang.String var7 = var6.toString();
    java.lang.String var8 = var6.toString();
    org.apache.commons.csv.CSVFormat var10 = var6.withIgnoreSurroundingSpaces(true);
    
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
    assertTrue("'" + var7 + "' != '" + "Delimiter=< > CommentStart=<4> SkipHeaderRecord:false"+ "'", var7.equals("Delimiter=< > CommentStart=<4> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Delimiter=< > CommentStart=<4> SkipHeaderRecord:false"+ "'", var8.equals("Delimiter=< > CommentStart=<4> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test79");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withNullString("");
    org.apache.commons.csv.CSVFormat var5 = var1.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var7 = var1.withQuote((java.lang.Character)'a');
    java.lang.String var8 = var7.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var10 = var7.withIgnoreEmptyLines(true);
    boolean var11 = var7.getIgnoreHeaderCase();
    java.lang.String var12 = var7.getRecordSeparator();
    
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
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test80");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.QuoteMode var1 = org.apache.commons.csv.QuoteMode.valueOf("Delimiter=<4> QuoteChar=< > EmptyLines:ignored SkipHeaderRecord:true");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test81");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    boolean var2 = var1.isCommentMarkerSet();
    java.lang.String[] var3 = var1.getHeaderComments();
    org.apache.commons.csv.CSVFormat var5 = var1.withRecordSeparator('4');
    java.lang.Character var6 = var5.getEscapeCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test82");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withRecordSeparator("hi!");
    boolean var5 = var4.isCommentMarkerSet();
    java.lang.Character var6 = var4.getEscapeCharacter();
    org.apache.commons.csv.CSVFormat var8 = var4.withAllowMissingColumnNames(true);
    boolean var9 = var4.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var11 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var12 = var11.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var13 = var11.withSkipHeaderRecord();
    boolean var14 = var11.isCommentMarkerSet();
    java.lang.Character var15 = var11.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var16 = var11.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var18 = var11.withIgnoreEmptyLines(true);
    boolean var19 = var18.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var20 = var18.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var22 = var20.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var24 = var20.withAllowMissingColumnNames(false);
    org.apache.commons.csv.CSVFormat var26 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var27 = var26.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var29 = var26.withNullString("");
    org.apache.commons.csv.CSVFormat var30 = var26.withIgnoreEmptyLines();
    java.lang.String[] var31 = var30.getHeaderComments();
    org.apache.commons.csv.CSVFormat var33 = var30.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var35 = var30.withRecordSeparator('4');
    org.apache.commons.csv.QuoteMode var36 = var35.getQuoteMode();
    org.apache.commons.csv.CSVFormat var38 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var39 = var38.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var40 = var38.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var42 = var40.withAllowMissingColumnNames(true);
    java.lang.String var43 = var42.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var45 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var46 = var45.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var48 = var45.withNullString("");
    org.apache.commons.csv.CSVFormat var49 = var45.withIgnoreEmptyLines();
    java.lang.String var50 = var49.toString();
    org.apache.commons.csv.CSVFormat var52 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var53 = var52.withAllowMissingColumnNames();
    boolean var54 = var52.isNullStringSet();
    java.lang.String[] var56 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var57 = var52.withHeader(var56);
    org.apache.commons.csv.CSVFormat var58 = var49.withHeader(var56);
    java.lang.String var59 = var42.format((java.lang.Object[])var56);
    org.apache.commons.csv.CSVFormat var60 = var35.withHeader(var56);
    org.apache.commons.csv.CSVFormat var61 = var24.withHeader(var56);
    org.apache.commons.csv.CSVFormat var62 = var4.withHeaderComments((java.lang.Object[])var56);
    org.apache.commons.csv.CSVFormat var64 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var65 = var64.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var66 = var64.withSkipHeaderRecord();
    java.lang.String var67 = var66.toString();
    org.apache.commons.csv.CSVFormat var69 = var66.withNullString("");
    org.apache.commons.csv.CSVFormat var71 = var66.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var73 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var74 = var73.withAllowMissingColumnNames();
    boolean var75 = var73.isNullStringSet();
    java.lang.String[] var77 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var78 = var73.withHeader(var77);
    java.lang.String var79 = var71.format((java.lang.Object[])var77);
    org.apache.commons.csv.CSVFormat var80 = var62.withHeader(var77);
    java.lang.String[] var81 = var62.getHeader();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false"+ "'", var50.equals("Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + ""+ "'", var59.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var67.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + ""+ "'", var79.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var81);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test83");


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
    org.apache.commons.csv.CSVFormat var23 = var18.withSkipHeaderRecord(false);
    java.lang.String var24 = var18.getRecordSeparator();
    
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
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test84");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    java.lang.String var4 = var3.toString();
    org.apache.commons.csv.CSVFormat var6 = var3.withNullString("");
    org.apache.commons.csv.CSVFormat var8 = var3.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var10 = var3.withNullString("Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var12 = var3.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var14 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var15 = var14.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var17 = var14.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var19 = var14.withNullString("Delimiter=< > SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var21 = var19.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var23 = var19.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var25 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var26 = var25.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var28 = var25.withNullString("");
    org.apache.commons.csv.CSVFormat var29 = var25.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var31 = var25.withQuote((java.lang.Character)'a');
    boolean var32 = var25.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var34 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var35 = var34.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var36 = var34.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var38 = var36.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var39 = var36.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var41 = var39.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var43 = var41.withRecordSeparator('#');
    org.apache.commons.csv.CSVFormat var45 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var46 = var45.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var47 = var45.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var49 = var47.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var51 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var52 = var51.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var53 = var51.withSkipHeaderRecord();
    java.lang.String var54 = var53.toString();
    org.apache.commons.csv.CSVFormat var56 = var53.withNullString("");
    org.apache.commons.csv.CSVFormat var58 = var53.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var60 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var61 = var60.withAllowMissingColumnNames();
    boolean var62 = var60.isNullStringSet();
    java.lang.String[] var64 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var65 = var60.withHeader(var64);
    java.lang.String var66 = var58.format((java.lang.Object[])var64);
    java.lang.String var67 = var49.format((java.lang.Object[])var64);
    java.lang.String var68 = var43.format((java.lang.Object[])var64);
    java.lang.String var69 = var25.format((java.lang.Object[])var64);
    org.apache.commons.csv.CSVFormat var70 = var23.withHeader(var64);
    org.apache.commons.csv.CSVFormat var71 = var3.withHeaderComments((java.lang.Object[])var64);
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var54.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + ""+ "'", var66.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + ""+ "'", var67.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "#"+ "'", var68.equals("#"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + ""+ "'", var69.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test85");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    boolean var3 = var1.isNullStringSet();
    boolean var4 = var1.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var6 = var1.withCommentMarker((java.lang.Character)'4');
    boolean var7 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var9 = var1.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var11 = var9.withEscape((java.lang.Character)'#');
    org.apache.commons.csv.CSVFormat var13 = var9.withRecordSeparator("ALL MINIMAL NON_NUMERIC NONE");
    org.apache.commons.csv.CSVFormat var15 = var13.withRecordSeparator('a');
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test86");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withNullString("");
    org.apache.commons.csv.CSVFormat var5 = var1.withIgnoreEmptyLines();
    java.lang.String[] var6 = var5.getHeaderComments();
    org.apache.commons.csv.CSVFormat var8 = var5.withIgnoreSurroundingSpaces(false);
    boolean var9 = var5.isQuoteCharacterSet();
    java.lang.Character var10 = var5.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var11 = var5.withIgnoreEmptyLines();
    
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test87");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withRecordSeparator("hi!");
    boolean var5 = var4.isCommentMarkerSet();
    java.lang.Character var6 = var4.getEscapeCharacter();
    org.apache.commons.csv.CSVFormat var8 = var4.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var10 = var8.withAllowMissingColumnNames(true);
    java.lang.String[] var11 = var8.getHeaderComments();
    org.apache.commons.csv.CSVFormat var13 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var14 = var13.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var16 = var13.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var18 = var13.withNullString("Delimiter=< > SkipHeaderRecord:true");
    java.lang.Character var19 = var18.getCommentMarker();
    org.apache.commons.csv.CSVFormat var21 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var22 = var21.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var24 = var21.withCommentMarker('#');
    java.lang.String[] var25 = var21.getHeaderComments();
    org.apache.commons.csv.CSVFormat var27 = var21.withQuote((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var29 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var30 = var29.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var31 = var29.withSkipHeaderRecord();
    boolean var32 = var29.isCommentMarkerSet();
    boolean var33 = var29.getIgnoreHeaderCase();
    java.lang.String[] var35 = new java.lang.String[] { "Delimiter=< > SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var36 = var29.withHeader(var35);
    org.apache.commons.csv.CSVFormat var37 = var21.withHeader(var35);
    java.lang.String[] var38 = var21.getHeaderComments();
    org.apache.commons.csv.CSVFormat var40 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var41 = var40.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var42 = var40.withSkipHeaderRecord();
    java.lang.String var43 = var42.toString();
    java.lang.String[] var44 = var42.getHeader();
    org.apache.commons.csv.CSVFormat var45 = var42.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var47 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var48 = var47.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var49 = var47.withSkipHeaderRecord();
    java.lang.String var50 = var49.toString();
    org.apache.commons.csv.CSVFormat var52 = var49.withNullString("");
    org.apache.commons.csv.CSVFormat var54 = var52.withEscape((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var56 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var57 = var56.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var58 = var56.withSkipHeaderRecord();
    boolean var59 = var56.isCommentMarkerSet();
    boolean var60 = var56.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var62 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var63 = var62.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var65 = var62.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var67 = var62.withNullString("Delimiter=< > SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var68 = var67.withIgnoreSurroundingSpaces();
    java.lang.Object[] var69 = new java.lang.Object[] { var67};
    java.lang.String var70 = var56.format(var69);
    java.lang.String[] var72 = new java.lang.String[] { "Default Excel MySQL RFC4180 TDF"};
    org.apache.commons.csv.CSVFormat var73 = var56.withHeader(var72);
    org.apache.commons.csv.CSVFormat var74 = var52.withHeader(var72);
    java.lang.String var75 = var45.format((java.lang.Object[])var72);
    org.apache.commons.csv.CSVFormat var76 = var21.withHeader(var72);
    org.apache.commons.csv.CSVFormat var77 = var18.withHeaderComments((java.lang.Object[])var72);
    java.lang.String var78 = var8.format((java.lang.Object[])var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
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
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var43.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var50.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false"+ "'", var70.equals("Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + "Default Excel MySQL RFC4180 TDF"+ "'", var75.equals("Default Excel MySQL RFC4180 TDF"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var78 + "' != '" + "Default Excel MySQL RFC4180 TDFhi!"+ "'", var78.equals("Default Excel MySQL RFC4180 TDFhi!"));

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test88");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var3 = var2.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var4 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var6 = var4.withAllowMissingColumnNames(true);
    boolean var7 = var4.isNullStringSet();
    java.lang.Character var8 = var4.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var9 = var4.withAllowMissingColumnNames();
    java.lang.String var10 = var4.toString();
    org.apache.commons.csv.CSVParser var11 = org.apache.commons.csv.CSVParser.parse("Default Excel MySQL RFC4180 TDFhi!", var4);
    org.apache.commons.csv.CSVFormat var13 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var14 = var13.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var15 = var13.withSkipHeaderRecord();
    boolean var16 = var13.isCommentMarkerSet();
    java.lang.Character var17 = var13.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var18 = var13.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var20 = var18.withQuote((java.lang.Character)'a');
    java.lang.Character var21 = var20.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var24 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var25 = var24.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var27 = var24.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVParser var28 = org.apache.commons.csv.CSVParser.parse("", var27);
    long var29 = var28.getCurrentLineNumber();
    var28.close();
    boolean var31 = var20.equals((java.lang.Object)var28);
    long var32 = var28.getCurrentLineNumber();
    java.util.Iterator var33 = var28.iterator();
    boolean var34 = var4.equals((java.lang.Object)var33);
    org.apache.commons.csv.CSVFormat var36 = var4.withEscape((java.lang.Character)'#');
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + 'a'+ "'", var21.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test89");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var6 = var1.withNullString("Delimiter=< > SkipHeaderRecord:true");
    boolean var7 = var6.isQuoteCharacterSet();
    java.lang.String[] var8 = var6.getHeader();
    boolean var9 = var6.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var11 = var6.withIgnoreEmptyLines(false);
    org.apache.commons.csv.CSVFormat var13 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var15 = var13.withRecordSeparator("#");
    org.apache.commons.csv.CSVFormat var17 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var18 = var17.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var20 = var17.withCommentMarker('#');
    java.lang.String[] var21 = var17.getHeaderComments();
    org.apache.commons.csv.CSVFormat var23 = var17.withQuote((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var25 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var26 = var25.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var27 = var25.withSkipHeaderRecord();
    boolean var28 = var25.isCommentMarkerSet();
    boolean var29 = var25.getIgnoreHeaderCase();
    java.lang.String[] var31 = new java.lang.String[] { "Delimiter=< > SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var32 = var25.withHeader(var31);
    org.apache.commons.csv.CSVFormat var33 = var17.withHeader(var31);
    java.lang.String var34 = var15.format((java.lang.Object[])var31);
    org.apache.commons.csv.CSVFormat var35 = var11.withHeaderComments((java.lang.Object[])var31);
    
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
    assertTrue(var9 == false);
    
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
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "Delimiter=< > SkipHeaderRecord:true#"+ "'", var34.equals("Delimiter=< > SkipHeaderRecord:true#"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test90");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withNullString("");
    org.apache.commons.csv.CSVFormat var5 = var1.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var7 = var5.withRecordSeparator('#');
    boolean var8 = var5.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var10 = var5.withDelimiter('a');
    boolean var11 = var10.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var12 = var10.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var14 = var12.withRecordSeparator('4');
    
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test91");


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
    long var16 = var15.getCurrentLineNumber();
    boolean var17 = var15.isClosed();
    
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
    assertTrue(var16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test92");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withAllowMissingColumnNames(true);
    boolean var6 = var3.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var8 = var3.withEscape('#');
    org.apache.commons.csv.CSVFormat var10 = var3.withIgnoreEmptyLines(false);
    org.apache.commons.csv.CSVFormat var12 = var10.withCommentMarker('a');
    org.apache.commons.csv.QuoteMode var13 = var10.getQuoteMode();
    boolean var14 = var10.isQuoteCharacterSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test93");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withNullString("");
    org.apache.commons.csv.CSVFormat var5 = var1.withIgnoreEmptyLines();
    java.lang.String[] var6 = var5.getHeaderComments();
    org.apache.commons.csv.CSVFormat var8 = var5.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var10 = var5.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat var12 = var10.withIgnoreSurroundingSpaces(false);
    java.lang.String var13 = var12.getNullString();
    boolean var14 = var12.isCommentMarkerSet();
    
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
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test94");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withAllowMissingColumnNames(true);
    boolean var6 = var3.isNullStringSet();
    java.lang.Character var7 = var3.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var8 = var3.withAllowMissingColumnNames();
    boolean var9 = var3.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var11 = var3.withRecordSeparator("ALL MINIMAL NON_NUMERIC NONEDelimiter=< > SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var13 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    boolean var14 = var13.isCommentMarkerSet();
    boolean var15 = var13.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var17 = var13.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var19 = var17.withDelimiter('a');
    org.apache.commons.csv.CSVFormat var21 = var19.withNullString("#");
    boolean var22 = var11.equals((java.lang.Object)var21);
    org.apache.commons.csv.CSVFormat var23 = var11.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var24 = var23.withIgnoreSurroundingSpaces();
    boolean var25 = var24.isCommentMarkerSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test95");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var3 = var2.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var5 = var2.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVParser var6 = org.apache.commons.csv.CSVParser.parse("", var5);
    long var7 = var6.getRecordNumber();
    java.util.List var8 = var6.getRecords();
    java.util.Map var9 = var6.getHeaderMap();
    var6.close();
    java.util.Iterator var11 = var6.iterator();
    java.util.Iterator var12 = var6.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var13 = var6.getRecords();
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test96");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var3 = var2.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var5 = var2.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVParser var6 = org.apache.commons.csv.CSVParser.parse("", var5);
    long var7 = var6.getRecordNumber();
    java.util.List var8 = var6.getRecords();
    java.util.Map var9 = var6.getHeaderMap();
    boolean var10 = var6.isClosed();
    long var11 = var6.getRecordNumber();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test97");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    boolean var4 = var1.isCommentMarkerSet();
    boolean var5 = var1.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var7 = var1.withAllowMissingColumnNames(false);
    org.apache.commons.csv.CSVFormat var9 = var7.withIgnoreEmptyLines(true);
    char var10 = var7.getDelimiter();
    org.apache.commons.csv.CSVFormat var12 = var7.withSkipHeaderRecord(true);
    java.lang.String[] var13 = var7.getHeader();
    org.apache.commons.csv.CSVFormat var15 = var7.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var17 = var7.withQuote((java.lang.Character)'#');
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == ' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test98");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withNullString("");
    org.apache.commons.csv.CSVFormat var5 = var1.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var7 = var5.withRecordSeparator('#');
    org.apache.commons.csv.CSVFormat var9 = var7.withSkipHeaderRecord(false);
    java.lang.String var10 = var7.getRecordSeparator();
    boolean var11 = var7.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var13 = var7.withRecordSeparator(' ');
    boolean var14 = var13.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var15 = var13.withAllowMissingColumnNames();
    boolean var16 = var13.isCommentMarkerSet();
    
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
    assertTrue("'" + var10 + "' != '" + "#"+ "'", var10.equals("#"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test99");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('a');
    org.apache.commons.csv.CSVFormat var3 = var1.withIgnoreHeaderCase(false);
    java.lang.Character var4 = var1.getCommentMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test100");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var4 = var1.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var6 = var1.withAllowMissingColumnNames(false);
    java.lang.Character var7 = var1.getEscapeCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test101");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    boolean var4 = var1.isCommentMarkerSet();
    java.lang.Character var5 = var1.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var6 = var1.withAllowMissingColumnNames();
    java.lang.String[] var7 = var1.getHeaderComments();
    org.apache.commons.csv.CSVFormat var9 = var1.withAllowMissingColumnNames(false);
    java.lang.String var10 = var1.toString();
    
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
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Delimiter=< > SkipHeaderRecord:false"+ "'", var10.equals("Delimiter=< > SkipHeaderRecord:false"));

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test102");


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
    java.util.Map var15 = var6.getHeaderMap();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test103");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withRecordSeparator("hi!");
    boolean var5 = var4.isCommentMarkerSet();
    java.lang.Character var6 = var4.getEscapeCharacter();
    org.apache.commons.csv.CSVFormat var8 = var4.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var10 = var8.withAllowMissingColumnNames(true);
    java.lang.String[] var11 = var8.getHeaderComments();
    org.apache.commons.csv.CSVFormat var13 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var14 = var13.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var15 = var13.withSkipHeaderRecord();
    java.lang.String var16 = var15.toString();
    org.apache.commons.csv.CSVFormat var18 = var15.withNullString("");
    org.apache.commons.csv.CSVFormat var20 = var15.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var21 = var20.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var22 = var20.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var24 = var20.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var26 = var24.withQuote((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var28 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var29 = var28.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var31 = var28.withCommentMarker('#');
    boolean var32 = var31.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var34 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var35 = var34.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var36 = var34.withSkipHeaderRecord();
    boolean var37 = var34.isCommentMarkerSet();
    boolean var38 = var34.getIgnoreHeaderCase();
    java.lang.String[] var40 = new java.lang.String[] { "Delimiter=< > SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var41 = var34.withHeader(var40);
    org.apache.commons.csv.CSVFormat var42 = var31.withHeaderComments((java.lang.Object[])var40);
    org.apache.commons.csv.CSVFormat var44 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var45 = var44.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var47 = var44.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var49 = var44.withNullString("Delimiter=< > SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var51 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var52 = var51.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var54 = var51.withNullString("");
    org.apache.commons.csv.CSVFormat var55 = var51.withIgnoreEmptyLines();
    java.lang.String var56 = var55.toString();
    org.apache.commons.csv.CSVFormat var58 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var59 = var58.withAllowMissingColumnNames();
    boolean var60 = var58.isNullStringSet();
    java.lang.String[] var62 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var63 = var58.withHeader(var62);
    org.apache.commons.csv.CSVFormat var64 = var55.withHeader(var62);
    org.apache.commons.csv.CSVFormat var65 = var44.withHeader(var62);
    java.lang.String var66 = var65.toString();
    java.lang.String[] var67 = var65.getHeader();
    org.apache.commons.csv.CSVFormat var68 = var42.withHeader(var67);
    org.apache.commons.csv.CSVFormat var69 = var26.withHeader(var67);
    org.apache.commons.csv.CSVFormat var70 = var8.withHeader(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var16.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false"+ "'", var56.equals("Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "Delimiter=< > SkipHeaderRecord:false Header:[]"+ "'", var66.equals("Delimiter=< > SkipHeaderRecord:false Header:[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test104");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var3 = var2.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var4 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var6 = var4.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var7 = var4.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var8 = var4.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVParser var9 = org.apache.commons.csv.CSVParser.parse("DefaultaExcelaMySQLaRFC4180aTDF", var4);
    java.util.Iterator var10 = var9.iterator();
    java.util.Iterator var11 = var9.iterator();
    var9.close();
    long var13 = var9.getCurrentLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test105");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withNullString("");
    org.apache.commons.csv.CSVFormat var5 = var1.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var7 = var5.withRecordSeparator('#');
    org.apache.commons.csv.CSVFormat var9 = var7.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var11 = var7.withQuote('4');
    boolean var12 = var7.getIgnoreSurroundingSpaces();
    boolean var13 = var7.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var14 = var7.withSkipHeaderRecord();
    
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
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test106");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    boolean var2 = var1.isCommentMarkerSet();
    java.lang.Character var3 = var1.getQuoteCharacter();
    char var4 = var1.getDelimiter();
    org.apache.commons.csv.CSVFormat var6 = var1.withRecordSeparator("Default Excel MySQL RFC4180 TDF");
    org.apache.commons.csv.CSVFormat var8 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var9 = var8.withIgnoreSurroundingSpaces();
    java.lang.Character var10 = var8.getCommentMarker();
    java.lang.String var11 = var8.getNullString();
    org.apache.commons.csv.CSVFormat var12 = var8.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var14 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var15 = var14.withAllowMissingColumnNames();
    boolean var16 = var14.isNullStringSet();
    java.lang.String[] var18 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var19 = var14.withHeader(var18);
    org.apache.commons.csv.CSVFormat var21 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var22 = var21.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var23 = var21.withSkipHeaderRecord();
    boolean var24 = var21.isCommentMarkerSet();
    boolean var25 = var21.getIgnoreHeaderCase();
    java.lang.String[] var27 = new java.lang.String[] { "Delimiter=< > SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var28 = var21.withHeader(var27);
    org.apache.commons.csv.CSVFormat var30 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var31 = var30.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var32 = var30.withSkipHeaderRecord();
    boolean var33 = var30.isCommentMarkerSet();
    boolean var34 = var30.getIgnoreHeaderCase();
    java.lang.String[] var36 = new java.lang.String[] { "Delimiter=< > SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var37 = var30.withHeader(var36);
    org.apache.commons.csv.CSVFormat var38 = var21.withHeader(var36);
    java.lang.String var39 = var19.format((java.lang.Object[])var36);
    org.apache.commons.csv.CSVFormat var40 = var12.withHeader(var36);
    org.apache.commons.csv.CSVFormat var41 = var1.withHeader(var36);
    org.apache.commons.csv.CSVFormat var42 = var1.withAllowMissingColumnNames();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat var44 = var42.withEscape((java.lang.Character)' ');
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == ' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var39.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test107");


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
    org.apache.commons.csv.CSVFormat var20 = var18.withAllowMissingColumnNames(true);
    java.lang.String var21 = var18.getNullString();
    
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
    assertTrue("'" + var21 + "' != '" + "Delimiter=< > QuoteChar=<#> NullString=<Delimiter=< > SkipHeaderRecord:true> SurroundingSpaces:ignored SkipHeaderRecord:false"+ "'", var21.equals("Delimiter=< > QuoteChar=<#> NullString=<Delimiter=< > SkipHeaderRecord:true> SurroundingSpaces:ignored SkipHeaderRecord:false"));

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test108");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var4 = var1.withSkipHeaderRecord(true);
    boolean var5 = var1.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var8 = var1.withAllowMissingColumnNames();
    boolean var9 = var8.getIgnoreEmptyLines();
    java.lang.Character var10 = var8.getEscapeCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test109");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withNullString("");
    org.apache.commons.csv.CSVFormat var5 = var1.withIgnoreEmptyLines();
    java.lang.String var6 = var5.toString();
    org.apache.commons.csv.CSVFormat var7 = var5.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var9 = var7.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var11 = var7.withDelimiter('a');
    boolean var12 = var11.getAllowMissingColumnNames();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test110");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    char var2 = var1.getDelimiter();
    java.lang.String var3 = var1.getNullString();
    boolean var4 = var1.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var5 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var7 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var8 = var7.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var10 = var7.withNullString("");
    org.apache.commons.csv.CSVFormat var11 = var7.withIgnoreEmptyLines();
    java.lang.String[] var12 = var11.getHeaderComments();
    org.apache.commons.csv.CSVFormat var14 = var11.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var16 = var11.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat var18 = var16.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var20 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var21 = var20.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var22 = var20.withSkipHeaderRecord();
    boolean var23 = var20.isCommentMarkerSet();
    boolean var24 = var20.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var26 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var27 = var26.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var29 = var26.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var31 = var26.withNullString("Delimiter=< > SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var32 = var31.withIgnoreSurroundingSpaces();
    java.lang.Object[] var33 = new java.lang.Object[] { var31};
    java.lang.String var34 = var20.format(var33);
    java.lang.String[] var36 = new java.lang.String[] { "Default Excel MySQL RFC4180 TDF"};
    org.apache.commons.csv.CSVFormat var37 = var20.withHeader(var36);
    org.apache.commons.csv.CSVFormat var38 = var16.withHeader(var36);
    org.apache.commons.csv.CSVFormat var39 = var16.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var41 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var42 = var41.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var43 = var41.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var45 = var43.withIgnoreSurroundingSpaces(true);
    boolean var46 = var45.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var48 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var49 = var48.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var50 = var48.withSkipHeaderRecord();
    java.lang.String var51 = var50.toString();
    org.apache.commons.csv.CSVFormat var53 = var50.withNullString("");
    org.apache.commons.csv.CSVFormat var55 = var50.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var57 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var58 = var57.withAllowMissingColumnNames();
    boolean var59 = var57.isNullStringSet();
    java.lang.String[] var61 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var62 = var57.withHeader(var61);
    java.lang.String var63 = var55.format((java.lang.Object[])var61);
    org.apache.commons.csv.CSVFormat var64 = var45.withHeader(var61);
    org.apache.commons.csv.CSVFormat var65 = var16.withHeaderComments((java.lang.Object[])var61);
    org.apache.commons.csv.CSVFormat var66 = var5.withHeader(var61);
    java.lang.String[] var67 = var66.getHeader();
    
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
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false"+ "'", var34.equals("Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var51.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + ""+ "'", var63.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test111");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var4 = var1.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var6 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var7 = var6.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var9 = var6.withNullString("");
    org.apache.commons.csv.CSVFormat var10 = var6.withIgnoreEmptyLines();
    java.lang.String[] var11 = var10.getHeaderComments();
    org.apache.commons.csv.CSVFormat var13 = var10.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var15 = var10.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat.Predefined[] var16 = org.apache.commons.csv.CSVFormat.Predefined.values();
    org.apache.commons.csv.CSVFormat var17 = var15.withHeaderComments((java.lang.Object[])var16);
    org.apache.commons.csv.CSVFormat var18 = var1.withHeaderComments((java.lang.Object[])var16);
    java.lang.String[] var19 = var1.getHeaderComments();
    boolean var20 = var1.isNullStringSet();
    char var21 = var1.getDelimiter();
    java.lang.String var22 = var1.getNullString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == ' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test112");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var7 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var8 = var7.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var9 = var7.withSkipHeaderRecord();
    java.lang.String var10 = var9.toString();
    org.apache.commons.csv.CSVFormat var12 = var9.withNullString("");
    org.apache.commons.csv.CSVFormat var14 = var9.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var16 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var17 = var16.withAllowMissingColumnNames();
    boolean var18 = var16.isNullStringSet();
    java.lang.String[] var20 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var21 = var16.withHeader(var20);
    java.lang.String var22 = var14.format((java.lang.Object[])var20);
    java.lang.String var23 = var5.format((java.lang.Object[])var20);
    org.apache.commons.csv.CSVFormat var25 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var26 = var25.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var28 = var25.withNullString("");
    org.apache.commons.csv.CSVFormat var29 = var25.withIgnoreEmptyLines();
    java.lang.String[] var30 = var29.getHeaderComments();
    org.apache.commons.csv.CSVFormat var32 = var29.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var34 = var29.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat var36 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var37 = var36.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var38 = var36.withSkipHeaderRecord();
    boolean var39 = var36.isCommentMarkerSet();
    boolean var40 = var36.getIgnoreHeaderCase();
    java.lang.String[] var42 = new java.lang.String[] { "Delimiter=< > SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var43 = var36.withHeader(var42);
    org.apache.commons.csv.CSVFormat var44 = var29.withHeaderComments((java.lang.Object[])var42);
    java.lang.String var45 = var5.format((java.lang.Object[])var42);
    boolean var46 = var5.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var48 = var5.withEscape((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var50 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var51 = var50.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var53 = var50.withNullString("");
    org.apache.commons.csv.CSVFormat var54 = var50.withIgnoreEmptyLines();
    java.lang.String[] var55 = var54.getHeaderComments();
    org.apache.commons.csv.CSVFormat var57 = var54.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var59 = var54.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat var61 = var59.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var63 = var59.withIgnoreEmptyLines(true);
    boolean var64 = var5.equals((java.lang.Object)var59);
    org.apache.commons.csv.CSVFormat var66 = var59.withQuote('#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var45.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
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
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test113");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var4 = var1.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var6 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var7 = var6.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var9 = var6.withNullString("");
    org.apache.commons.csv.CSVFormat var10 = var6.withIgnoreEmptyLines();
    java.lang.String[] var11 = var10.getHeaderComments();
    org.apache.commons.csv.CSVFormat var13 = var10.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var15 = var10.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat.Predefined[] var16 = org.apache.commons.csv.CSVFormat.Predefined.values();
    org.apache.commons.csv.CSVFormat var17 = var15.withHeaderComments((java.lang.Object[])var16);
    org.apache.commons.csv.CSVFormat var18 = var1.withHeaderComments((java.lang.Object[])var16);
    java.lang.String[] var19 = var1.getHeaderComments();
    org.apache.commons.csv.CSVFormat var21 = var1.withQuote((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var23 = var1.withIgnoreEmptyLines(false);
    java.lang.String var24 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var26 = var1.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var28 = var26.withNullString("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:true Header:[]");
    boolean var29 = var28.getIgnoreSurroundingSpaces();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test114");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    java.lang.String var4 = var1.toString();
    java.lang.String[] var5 = var1.getHeaderComments();
    org.apache.commons.csv.CSVFormat var7 = var1.withRecordSeparator("Default Excel MySQL RFC4180 TDFhi!");
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var10 = var1.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var12 = var10.withAllowMissingColumnNames(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Delimiter=< > SkipHeaderRecord:false"+ "'", var4.equals("Delimiter=< > SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test115");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    boolean var4 = var1.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var6 = var1.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var8 = var1.withQuote((java.lang.Character)'4');
    java.lang.String var9 = var1.toString();
    org.apache.commons.csv.CSVFormat var11 = var1.withRecordSeparator("Delimiter=< > QuoteChar=<#> RecordSeparator=<4> EmptyLines:ignored SkipHeaderRecord:false");
    boolean var12 = var1.isCommentMarkerSet();
    
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
    assertTrue("'" + var9 + "' != '" + "Delimiter=< > SkipHeaderRecord:false"+ "'", var9.equals("Delimiter=< > SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test116");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    char var2 = var1.getDelimiter();
    java.lang.String var3 = var1.getNullString();
    boolean var4 = var1.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var5 = var1.withSkipHeaderRecord();
    java.lang.Character var6 = var1.getQuoteCharacter();
    boolean var7 = var1.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var9 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var10 = var9.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var12 = var9.withNullString("");
    org.apache.commons.csv.CSVFormat var13 = var9.withIgnoreEmptyLines();
    java.lang.String[] var14 = var13.getHeaderComments();
    org.apache.commons.csv.CSVFormat var16 = var13.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var18 = var13.withRecordSeparator('4');
    org.apache.commons.csv.QuoteMode var19 = var18.getQuoteMode();
    org.apache.commons.csv.CSVFormat var21 = var18.withQuote((java.lang.Character)'#');
    org.apache.commons.csv.CSVFormat var22 = var21.withAllowMissingColumnNames();
    boolean var23 = var1.equals((java.lang.Object)var22);
    org.apache.commons.csv.CSVFormat var24 = var22.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var26 = var24.withIgnoreSurroundingSpaces(false);
    java.lang.String[] var27 = var24.getHeader();
    org.apache.commons.csv.CSVFormat var29 = var24.withEscape((java.lang.Character)'4');
    
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
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test117");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var3 = var2.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var5 = var2.withNullString("");
    org.apache.commons.csv.CSVFormat var6 = var2.withIgnoreEmptyLines();
    java.lang.String[] var7 = var6.getHeaderComments();
    org.apache.commons.csv.CSVFormat var9 = var6.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var11 = var6.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat var13 = var11.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVParser var14 = org.apache.commons.csv.CSVParser.parse("", var13);
    long var15 = var14.getRecordNumber();
    java.util.Iterator var16 = var14.iterator();
    long var17 = var14.getRecordNumber();
    java.util.Map var18 = var14.getHeaderMap();
    java.util.Iterator var19 = var14.iterator();
    
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
    assertTrue(var15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test118");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withAllowMissingColumnNames(true);
    java.lang.String var6 = var5.getRecordSeparator();
    boolean var7 = var5.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var9 = var5.withIgnoreHeaderCase(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test119");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var4 = var1.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var6 = var4.withSkipHeaderRecord(false);
    boolean var7 = var6.getIgnoreSurroundingSpaces();
    java.lang.String var8 = var6.getNullString();
    java.lang.Character var9 = var6.getEscapeCharacter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test120");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var7 = var5.withQuote((java.lang.Character)'4');
    boolean var8 = var7.getIgnoreHeaderCase();
    boolean var9 = var7.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var10 = var7.withIgnoreSurroundingSpaces();
    java.lang.String var11 = var7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Delimiter=< > QuoteChar=<4> SurroundingSpaces:ignored SkipHeaderRecord:true"+ "'", var11.equals("Delimiter=< > QuoteChar=<4> SurroundingSpaces:ignored SkipHeaderRecord:true"));

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test121");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    char var2 = var1.getDelimiter();
    java.lang.String var3 = var1.getNullString();
    boolean var4 = var1.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var5 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var6 = var5.withSkipHeaderRecord();
    boolean var7 = var6.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var9 = var6.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var11 = var9.withNullString("Delimiter=<4> SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var13 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var14 = var13.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var16 = var13.withNullString("");
    org.apache.commons.csv.CSVFormat var17 = var13.withIgnoreEmptyLines();
    java.lang.String[] var18 = var17.getHeaderComments();
    org.apache.commons.csv.CSVFormat var20 = var17.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var22 = var17.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat var24 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var25 = var24.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var26 = var24.withSkipHeaderRecord();
    java.lang.String var27 = var26.toString();
    org.apache.commons.csv.CSVFormat var29 = var26.withNullString("");
    org.apache.commons.csv.CSVFormat var31 = var26.withIgnoreSurroundingSpaces(true);
    boolean var32 = var26.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var34 = var26.withQuote('a');
    org.apache.commons.csv.CSVFormat var36 = var34.withNullString("Delimiter=< > RecordSeparator=< > SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var38 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var39 = var38.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var41 = var38.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var43 = var38.withNullString("Delimiter=< > SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var45 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var46 = var45.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var48 = var45.withNullString("");
    org.apache.commons.csv.CSVFormat var49 = var45.withIgnoreEmptyLines();
    java.lang.String var50 = var49.toString();
    org.apache.commons.csv.CSVFormat var52 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var53 = var52.withAllowMissingColumnNames();
    boolean var54 = var52.isNullStringSet();
    java.lang.String[] var56 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var57 = var52.withHeader(var56);
    org.apache.commons.csv.CSVFormat var58 = var49.withHeader(var56);
    org.apache.commons.csv.CSVFormat var59 = var38.withHeader(var56);
    java.lang.String var60 = var59.toString();
    org.apache.commons.csv.CSVFormat var62 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var63 = var62.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var65 = var62.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var67 = var62.withNullString("Delimiter=< > SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var69 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var70 = var69.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var72 = var69.withNullString("");
    org.apache.commons.csv.CSVFormat var73 = var69.withIgnoreEmptyLines();
    java.lang.String var74 = var73.toString();
    org.apache.commons.csv.CSVFormat var76 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var77 = var76.withAllowMissingColumnNames();
    boolean var78 = var76.isNullStringSet();
    java.lang.String[] var80 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var81 = var76.withHeader(var80);
    org.apache.commons.csv.CSVFormat var82 = var73.withHeader(var80);
    org.apache.commons.csv.CSVFormat var83 = var62.withHeader(var80);
    java.lang.String var84 = var59.format((java.lang.Object[])var80);
    org.apache.commons.csv.CSVFormat var85 = var34.withHeader(var80);
    java.lang.String var86 = var22.format((java.lang.Object[])var80);
    java.lang.String var87 = var11.format((java.lang.Object[])var80);
    
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
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var27.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false"+ "'", var50.equals("Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "Delimiter=< > SkipHeaderRecord:false Header:[]"+ "'", var60.equals("Delimiter=< > SkipHeaderRecord:false Header:[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false"+ "'", var74.equals("Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var84 + "' != '" + ""+ "'", var84.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var86 + "' != '" + "4"+ "'", var86.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var87 + "' != '" + ""+ "'", var87.equals(""));

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test122");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withCommentMarker('#');
    java.lang.String[] var5 = var1.getHeaderComments();
    char var6 = var1.getDelimiter();
    java.lang.String var7 = var1.getNullString();
    org.apache.commons.csv.CSVFormat var9 = var1.withRecordSeparator('a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == ' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test123");


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
    var15.close();
    java.util.Iterator var17 = var15.iterator();
    java.util.Map var18 = var15.getHeaderMap();
    
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
    assertNull(var18);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test124");


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
    org.apache.commons.csv.CSVFormat var25 = var19.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var27 = var25.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVParser var28 = org.apache.commons.csv.CSVParser.parse("#", var27);
    
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
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test125");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withNullString("");
    org.apache.commons.csv.CSVFormat var5 = var1.withIgnoreEmptyLines();
    java.lang.String[] var6 = var5.getHeaderComments();
    org.apache.commons.csv.CSVFormat var8 = var5.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var10 = var5.withRecordSeparator('4');
    org.apache.commons.csv.QuoteMode var11 = var10.getQuoteMode();
    org.apache.commons.csv.CSVFormat var13 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var14 = var13.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var15 = var13.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var17 = var15.withAllowMissingColumnNames(true);
    java.lang.String var18 = var17.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var20 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var21 = var20.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var23 = var20.withNullString("");
    org.apache.commons.csv.CSVFormat var24 = var20.withIgnoreEmptyLines();
    java.lang.String var25 = var24.toString();
    org.apache.commons.csv.CSVFormat var27 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var28 = var27.withAllowMissingColumnNames();
    boolean var29 = var27.isNullStringSet();
    java.lang.String[] var31 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var32 = var27.withHeader(var31);
    org.apache.commons.csv.CSVFormat var33 = var24.withHeader(var31);
    java.lang.String var34 = var17.format((java.lang.Object[])var31);
    org.apache.commons.csv.CSVFormat var35 = var10.withHeader(var31);
    java.lang.String var36 = var10.toString();
    java.lang.String var37 = var10.toString();
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false"+ "'", var25.equals("Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + ""+ "'", var34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "Delimiter=< > RecordSeparator=<4> EmptyLines:ignored SkipHeaderRecord:false"+ "'", var36.equals("Delimiter=< > RecordSeparator=<4> EmptyLines:ignored SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "Delimiter=< > RecordSeparator=<4> EmptyLines:ignored SkipHeaderRecord:false"+ "'", var37.equals("Delimiter=< > RecordSeparator=<4> EmptyLines:ignored SkipHeaderRecord:false"));

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test126");


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
    org.apache.commons.csv.CSVFormat var14 = var10.withAllowMissingColumnNames(false);
    org.apache.commons.csv.CSVFormat var16 = var14.withEscape((java.lang.Character)'#');
    
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
    assertNotNull(var16);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test127");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    boolean var3 = var2.isCommentMarkerSet();
    boolean var4 = var2.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVParser var5 = org.apache.commons.csv.CSVParser.parse("", var2);
    boolean var6 = var5.isClosed();
    java.util.Map var7 = var5.getHeaderMap();
    var5.close();
    boolean var9 = var5.isClosed();
    var5.close();
    boolean var11 = var5.isClosed();
    
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
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test128");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var4 = var1.withSkipHeaderRecord(true);
    boolean var5 = var1.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var7 = var1.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var8 = var1.withAllowMissingColumnNames();
    boolean var9 = var1.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var10 = var1.withAllowMissingColumnNames();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat var12 = var1.withQuote(' ');
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test129");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withNullString("");
    org.apache.commons.csv.CSVFormat var5 = var1.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var7 = var5.withRecordSeparator('#');
    org.apache.commons.csv.CSVFormat var9 = var7.withSkipHeaderRecord(false);
    java.lang.String var10 = var7.getRecordSeparator();
    boolean var11 = var7.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var13 = var7.withRecordSeparator(' ');
    boolean var14 = var13.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var16 = var13.withIgnoreSurroundingSpaces(false);
    
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
    assertTrue("'" + var10 + "' != '" + "#"+ "'", var10.equals("#"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test130");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    boolean var3 = var1.isNullStringSet();
    boolean var4 = var1.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var6 = var1.withCommentMarker((java.lang.Character)'4');
    boolean var7 = var1.isNullStringSet();
    org.apache.commons.csv.CSVFormat var9 = var1.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var11 = var9.withEscape((java.lang.Character)'#');
    boolean var12 = var11.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var14 = var11.withDelimiter('a');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat var16 = var11.withCommentMarker('#');
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
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test131");


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
    char var70 = var1.getDelimiter();
    
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
    assertTrue(var70 == ' ');

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test132");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withRecordSeparator("hi!");
    boolean var5 = var4.isCommentMarkerSet();
    java.lang.Character var6 = var4.getEscapeCharacter();
    org.apache.commons.csv.CSVFormat var8 = var4.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var10 = var4.withQuote((java.lang.Character)'4');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test133");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    boolean var4 = var1.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var6 = var1.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var8 = var6.withNullString("Delimiter=< > RecordSeparator=<#> EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var9 = var8.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var11 = var8.withEscape((java.lang.Character)'a');
    char var12 = var11.getDelimiter();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == ' ');

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test134");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var3 = var2.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var5 = var2.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVParser var6 = org.apache.commons.csv.CSVParser.parse("", var5);
    long var7 = var6.getCurrentLineNumber();
    long var8 = var6.getCurrentLineNumber();
    java.util.List var9 = var6.getRecords();
    long var10 = var6.getCurrentLineNumber();
    java.util.Map var11 = var6.getHeaderMap();
    java.util.List var12 = var6.getRecords();
    boolean var13 = var6.isClosed();
    long var14 = var6.getCurrentLineNumber();
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test135");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    boolean var3 = var1.isNullStringSet();
    java.lang.Character var4 = var1.getEscapeCharacter();
    org.apache.commons.csv.CSVFormat var6 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var7 = var6.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var9 = var6.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var11 = var6.withNullString("Delimiter=< > SkipHeaderRecord:true");
    boolean var12 = var11.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var14 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var15 = var14.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var16 = var14.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var18 = var16.withAllowMissingColumnNames(true);
    java.lang.String var19 = var18.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var21 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var22 = var21.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var24 = var21.withNullString("");
    org.apache.commons.csv.CSVFormat var25 = var21.withIgnoreEmptyLines();
    java.lang.String var26 = var25.toString();
    org.apache.commons.csv.CSVFormat var28 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var29 = var28.withAllowMissingColumnNames();
    boolean var30 = var28.isNullStringSet();
    java.lang.String[] var32 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var33 = var28.withHeader(var32);
    org.apache.commons.csv.CSVFormat var34 = var25.withHeader(var32);
    java.lang.String var35 = var18.format((java.lang.Object[])var32);
    org.apache.commons.csv.CSVFormat var36 = var11.withHeaderComments((java.lang.Object[])var32);
    org.apache.commons.csv.CSVFormat var37 = var1.withHeaderComments((java.lang.Object[])var32);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat var39 = var1.withCommentMarker(' ');
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
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false"+ "'", var26.equals("Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false"));
    
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
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + ""+ "'", var35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test136");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    java.lang.String var4 = var3.toString();
    org.apache.commons.csv.CSVFormat var6 = var3.withNullString("");
    org.apache.commons.csv.CSVFormat var8 = var3.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var10 = var3.withNullString("Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var12 = var3.withRecordSeparator(' ');
    org.apache.commons.csv.CSVFormat var13 = var12.withIgnoreEmptyLines();
    java.lang.String var14 = var12.toString();
    org.apache.commons.csv.CSVFormat var16 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var17 = var16.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var18 = var16.withSkipHeaderRecord();
    java.lang.String var19 = var18.toString();
    org.apache.commons.csv.CSVFormat var21 = var18.withNullString("");
    org.apache.commons.csv.CSVFormat var23 = var18.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var24 = var23.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var25 = var23.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var27 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var28 = var27.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var30 = var27.withNullString("");
    org.apache.commons.csv.CSVFormat var31 = var27.withIgnoreEmptyLines();
    java.lang.String[] var32 = var31.getHeaderComments();
    org.apache.commons.csv.CSVFormat var34 = var31.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var36 = var34.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var37 = var36.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var39 = var37.withRecordSeparator("Default Excel MySQL RFC4180 TDF");
    org.apache.commons.csv.CSVFormat var41 = var39.withCommentMarker((java.lang.Character)'4');
    java.lang.Character var42 = var41.getQuoteCharacter();
    boolean var43 = var41.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var45 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var46 = var45.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var47 = var45.withSkipHeaderRecord();
    boolean var48 = var45.isCommentMarkerSet();
    java.lang.Character var49 = var45.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var50 = var45.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var52 = var45.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var54 = var45.withDelimiter(' ');
    java.lang.String var55 = var45.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var57 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var58 = var57.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var60 = var57.withRecordSeparator("hi!");
    boolean var61 = var60.isCommentMarkerSet();
    boolean var62 = var60.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var64 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var65 = var64.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var67 = var64.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var69 = var64.withNullString("Delimiter=< > SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var71 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var72 = var71.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var74 = var71.withNullString("");
    org.apache.commons.csv.CSVFormat var75 = var71.withIgnoreEmptyLines();
    java.lang.String var76 = var75.toString();
    org.apache.commons.csv.CSVFormat var78 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var79 = var78.withAllowMissingColumnNames();
    boolean var80 = var78.isNullStringSet();
    java.lang.String[] var82 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var83 = var78.withHeader(var82);
    org.apache.commons.csv.CSVFormat var84 = var75.withHeader(var82);
    org.apache.commons.csv.CSVFormat var85 = var64.withHeader(var82);
    org.apache.commons.csv.CSVFormat var86 = var60.withHeaderComments((java.lang.Object[])var82);
    org.apache.commons.csv.CSVFormat var87 = var45.withHeaderComments((java.lang.Object[])var82);
    org.apache.commons.csv.CSVFormat var88 = var41.withHeaderComments((java.lang.Object[])var82);
    org.apache.commons.csv.CSVFormat var89 = var23.withHeader(var82);
    org.apache.commons.csv.CSVFormat var90 = var12.withHeader(var82);
    org.apache.commons.csv.CSVFormat var91 = var12.withIgnoreSurroundingSpaces();
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Delimiter=< > RecordSeparator=< > SkipHeaderRecord:true"+ "'", var14.equals("Delimiter=< > RecordSeparator=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var19.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false"+ "'", var76.equals("Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test137");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withNullString("");
    org.apache.commons.csv.CSVFormat var5 = var1.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var7 = var5.withRecordSeparator('#');
    org.apache.commons.csv.CSVFormat var9 = var7.withSkipHeaderRecord(false);
    java.lang.String var10 = var7.getRecordSeparator();
    boolean var11 = var7.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var12 = var7.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var14 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var15 = var14.withAllowMissingColumnNames();
    boolean var16 = var14.isNullStringSet();
    java.lang.Character var17 = var14.getEscapeCharacter();
    org.apache.commons.csv.CSVFormat var19 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var20 = var19.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var22 = var19.withNullString("");
    org.apache.commons.csv.CSVFormat var23 = var19.withIgnoreEmptyLines();
    java.lang.String[] var24 = var23.getHeaderComments();
    org.apache.commons.csv.CSVFormat var26 = var23.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var28 = var23.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat var30 = var28.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var32 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var33 = var32.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var34 = var32.withSkipHeaderRecord();
    boolean var35 = var32.isCommentMarkerSet();
    boolean var36 = var32.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var38 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var39 = var38.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var41 = var38.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var43 = var38.withNullString("Delimiter=< > SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var44 = var43.withIgnoreSurroundingSpaces();
    java.lang.Object[] var45 = new java.lang.Object[] { var43};
    java.lang.String var46 = var32.format(var45);
    java.lang.String[] var48 = new java.lang.String[] { "Default Excel MySQL RFC4180 TDF"};
    org.apache.commons.csv.CSVFormat var49 = var32.withHeader(var48);
    org.apache.commons.csv.CSVFormat var50 = var28.withHeader(var48);
    org.apache.commons.csv.CSVFormat var51 = var14.withHeaderComments((java.lang.Object[])var48);
    org.apache.commons.csv.CSVFormat var52 = var7.withHeader(var48);
    
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
    assertTrue("'" + var10 + "' != '" + "#"+ "'", var10.equals("#"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false"+ "'", var46.equals("Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test138");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var4 = var1.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var6 = var4.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var8 = var6.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var10 = var6.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var11 = var10.withSkipHeaderRecord();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat var13 = var10.withCommentMarker((java.lang.Character)' ');
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test139");


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
    org.apache.commons.csv.CSVFormat var22 = var17.withAllowMissingColumnNames(false);
    org.apache.commons.csv.CSVFormat var24 = var17.withEscape((java.lang.Character)'a');
    
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
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test140");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withAllowMissingColumnNames(true);
    java.lang.String var6 = var5.getRecordSeparator();
    java.lang.Character var7 = var5.getCommentMarker();
    boolean var8 = var5.getIgnoreEmptyLines();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test141");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var4 = var1.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var6 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var7 = var6.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var9 = var6.withNullString("");
    org.apache.commons.csv.CSVFormat var10 = var6.withIgnoreEmptyLines();
    java.lang.String[] var11 = var10.getHeaderComments();
    org.apache.commons.csv.CSVFormat var13 = var10.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var15 = var10.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat.Predefined[] var16 = org.apache.commons.csv.CSVFormat.Predefined.values();
    org.apache.commons.csv.CSVFormat var17 = var15.withHeaderComments((java.lang.Object[])var16);
    org.apache.commons.csv.CSVFormat var18 = var1.withHeaderComments((java.lang.Object[])var16);
    java.lang.String[] var19 = var1.getHeaderComments();
    org.apache.commons.csv.CSVFormat var21 = var1.withQuote((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var23 = var1.withIgnoreEmptyLines(false);
    java.lang.String var24 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var26 = var1.withCommentMarker('a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test142");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    boolean var3 = var1.isNullStringSet();
    java.lang.Character var4 = var1.getCommentMarker();
    char var5 = var1.getDelimiter();
    org.apache.commons.csv.CSVFormat var7 = var1.withEscape((java.lang.Character)'#');
    org.apache.commons.csv.CSVFormat var9 = var7.withRecordSeparator('a');
    org.apache.commons.csv.CSVFormat var10 = var9.withIgnoreSurroundingSpaces();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == ' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test143");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    boolean var4 = var1.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var6 = var1.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var8 = var1.withQuote((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var10 = var8.withSkipHeaderRecord(false);
    
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
    assertNotNull(var10);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test144");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    boolean var4 = var1.isCommentMarkerSet();
    java.lang.Character var5 = var1.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var6 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var8 = var6.withQuote((java.lang.Character)'a');
    java.lang.Character var9 = var8.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var11 = var8.withEscape((java.lang.Character)'a');
    java.lang.Character var12 = var11.getEscapeCharacter();
    
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
    assertTrue("'" + var9 + "' != '" + 'a'+ "'", var9.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + 'a'+ "'", var12.equals('a'));

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test145");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withIgnoreSurroundingSpaces();
    java.lang.Character var3 = var1.getCommentMarker();
    java.lang.String var4 = var1.getNullString();
    org.apache.commons.csv.QuoteMode var5 = var1.getQuoteMode();
    org.apache.commons.csv.CSVFormat var7 = var1.withCommentMarker((java.lang.Character)'a');
    boolean var8 = var1.getIgnoreSurroundingSpaces();
    java.lang.Character var9 = var1.getCommentMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test146");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var3 = var2.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var4 = var2.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var6 = var4.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var8 = var6.withRecordSeparator("Delimiter=< > SkipHeaderRecord:true");
    org.apache.commons.csv.CSVParser var9 = org.apache.commons.csv.CSVParser.parse("Delimiter=< > RecordSeparator=<hi!> SkipHeaderRecord:false", var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test147");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    java.lang.String var4 = var3.toString();
    org.apache.commons.csv.CSVFormat var6 = var3.withNullString("");
    org.apache.commons.csv.CSVFormat var8 = var3.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var9 = var8.withAllowMissingColumnNames();
    boolean var10 = var8.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var12 = var8.withRecordSeparator("Delimiter=<#> SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var14 = var12.withCommentMarker((java.lang.Character)'a');
    
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
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test148");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var3 = var2.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var5 = var2.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVParser var6 = org.apache.commons.csv.CSVParser.parse("", var5);
    java.util.Iterator var7 = var6.iterator();
    java.util.Iterator var8 = var6.iterator();
    long var9 = var6.getCurrentLineNumber();
    long var10 = var6.getRecordNumber();
    long var11 = var6.getRecordNumber();
    long var12 = var6.getRecordNumber();
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test149");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    char var2 = var1.getDelimiter();
    org.apache.commons.csv.CSVFormat var3 = var1.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var5 = var3.withRecordSeparator("#");
    org.apache.commons.csv.CSVFormat var7 = var3.withIgnoreEmptyLines(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == ' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test150");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    boolean var4 = var1.isCommentMarkerSet();
    java.lang.Character var5 = var1.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var6 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var10 = var1.withDelimiter(' ');
    java.lang.String var11 = var1.getRecordSeparator();
    java.lang.String[] var12 = var1.getHeaderComments();
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test151");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var6 = var3.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var8 = var6.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var10 = var8.withRecordSeparator('#');
    org.apache.commons.csv.CSVFormat var12 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var13 = var12.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var15 = var12.withNullString("");
    org.apache.commons.csv.CSVFormat var16 = var12.withIgnoreEmptyLines();
    java.lang.String[] var17 = var16.getHeaderComments();
    org.apache.commons.csv.CSVFormat var19 = var16.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var21 = var16.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat.Predefined[] var22 = org.apache.commons.csv.CSVFormat.Predefined.values();
    org.apache.commons.csv.CSVFormat var23 = var21.withHeaderComments((java.lang.Object[])var22);
    boolean var24 = var10.equals((java.lang.Object)var23);
    org.apache.commons.csv.CSVFormat var26 = var23.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var28 = var26.withSkipHeaderRecord(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
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
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test152");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withIgnoreSurroundingSpaces();
    boolean var3 = var2.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var5 = var2.withDelimiter('a');
    org.apache.commons.csv.CSVFormat var6 = var2.withIgnoreSurroundingSpaces();
    
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

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test153");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    boolean var4 = var1.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var6 = var1.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var8 = var1.withQuote((java.lang.Character)'4');
    boolean var9 = var8.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var11 = var8.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var13 = var8.withIgnoreEmptyLines(false);
    
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
    assertNotNull(var13);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test154");


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
    boolean var16 = var15.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var17 = var15.withIgnoreEmptyLines();
    boolean var18 = var17.getAllowMissingColumnNames();
    
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
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test155");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    boolean var4 = var1.isCommentMarkerSet();
    boolean var5 = var1.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var7 = var1.withAllowMissingColumnNames(false);
    java.lang.String[] var8 = var1.getHeader();
    org.apache.commons.csv.CSVFormat var10 = var1.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var11 = var10.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var12 = var10.withIgnoreSurroundingSpaces();
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test156");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withIgnoreSurroundingSpaces(true);
    boolean var6 = var5.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var8 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var9 = var8.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var10 = var8.withSkipHeaderRecord();
    java.lang.String var11 = var10.toString();
    org.apache.commons.csv.CSVFormat var13 = var10.withNullString("");
    org.apache.commons.csv.CSVFormat var15 = var10.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var17 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var18 = var17.withAllowMissingColumnNames();
    boolean var19 = var17.isNullStringSet();
    java.lang.String[] var21 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var22 = var17.withHeader(var21);
    java.lang.String var23 = var15.format((java.lang.Object[])var21);
    org.apache.commons.csv.CSVFormat var24 = var5.withHeader(var21);
    boolean var25 = var24.isQuoteCharacterSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test157");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var3 = var2.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var5 = var2.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var7 = var2.withNullString("Delimiter=< > SkipHeaderRecord:true");
    boolean var8 = var7.isQuoteCharacterSet();
    java.lang.String[] var9 = var7.getHeader();
    org.apache.commons.csv.CSVFormat var11 = var7.withEscape('a');
    org.apache.commons.csv.CSVFormat var13 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var14 = var13.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var15 = var13.withSkipHeaderRecord();
    java.lang.String var16 = var15.toString();
    java.lang.String[] var17 = var15.getHeader();
    org.apache.commons.csv.CSVFormat var18 = var15.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var20 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var21 = var20.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var22 = var20.withSkipHeaderRecord();
    java.lang.String var23 = var22.toString();
    org.apache.commons.csv.CSVFormat var25 = var22.withNullString("");
    org.apache.commons.csv.CSVFormat var27 = var25.withEscape((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var29 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var30 = var29.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var31 = var29.withSkipHeaderRecord();
    boolean var32 = var29.isCommentMarkerSet();
    boolean var33 = var29.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var35 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var36 = var35.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var38 = var35.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var40 = var35.withNullString("Delimiter=< > SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var41 = var40.withIgnoreSurroundingSpaces();
    java.lang.Object[] var42 = new java.lang.Object[] { var40};
    java.lang.String var43 = var29.format(var42);
    java.lang.String[] var45 = new java.lang.String[] { "Default Excel MySQL RFC4180 TDF"};
    org.apache.commons.csv.CSVFormat var46 = var29.withHeader(var45);
    org.apache.commons.csv.CSVFormat var47 = var25.withHeader(var45);
    java.lang.String var48 = var18.format((java.lang.Object[])var45);
    org.apache.commons.csv.CSVFormat var49 = var11.withHeader(var45);
    org.apache.commons.csv.CSVParser var50 = org.apache.commons.csv.CSVParser.parse("Default Excel MySQL RFC4180 TDF", var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var16.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var23.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false"+ "'", var43.equals("Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "Default Excel MySQL RFC4180 TDF"+ "'", var48.equals("Default Excel MySQL RFC4180 TDF"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test158");


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
    org.apache.commons.csv.CSVFormat var13 = var10.withSkipHeaderRecord();
    java.lang.String var14 = var13.getNullString();
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test159");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    java.lang.String var4 = var3.toString();
    org.apache.commons.csv.CSVFormat var6 = var3.withNullString("");
    org.apache.commons.csv.CSVFormat var8 = var3.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var10 = var3.withNullString("Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var12 = var3.withRecordSeparator(' ');
    java.lang.String var13 = var12.toString();
    org.apache.commons.csv.CSVFormat var15 = var12.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var17 = var15.withEscape('4');
    org.apache.commons.csv.CSVFormat var19 = var17.withQuote((java.lang.Character)'#');
    org.apache.commons.csv.CSVFormat var21 = var19.withRecordSeparator(' ');
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Delimiter=< > RecordSeparator=< > SkipHeaderRecord:true"+ "'", var13.equals("Delimiter=< > RecordSeparator=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test160");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withRecordSeparator("hi!");
    boolean var5 = var4.isCommentMarkerSet();
    java.lang.Character var6 = var4.getEscapeCharacter();
    org.apache.commons.csv.CSVFormat var8 = var4.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var10 = var4.withAllowMissingColumnNames(false);
    org.apache.commons.csv.CSVFormat var12 = var4.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var14 = var4.withIgnoreEmptyLines(false);
    org.apache.commons.csv.QuoteMode var15 = var4.getQuoteMode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
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
    assertNull(var15);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test161");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var3 = var2.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var5 = var2.withNullString("");
    org.apache.commons.csv.CSVFormat var6 = var2.withIgnoreEmptyLines();
    java.lang.String[] var7 = var6.getHeaderComments();
    org.apache.commons.csv.CSVFormat var9 = var6.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var11 = var6.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat.Predefined[] var12 = org.apache.commons.csv.CSVFormat.Predefined.values();
    org.apache.commons.csv.CSVFormat var13 = var11.withHeaderComments((java.lang.Object[])var12);
    org.apache.commons.csv.CSVFormat var15 = var11.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var17 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var18 = var17.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var19 = var17.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var21 = var19.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var23 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var24 = var23.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var25 = var23.withSkipHeaderRecord();
    java.lang.String var26 = var25.toString();
    org.apache.commons.csv.CSVFormat var28 = var25.withNullString("");
    org.apache.commons.csv.CSVFormat var30 = var25.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var32 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var33 = var32.withAllowMissingColumnNames();
    boolean var34 = var32.isNullStringSet();
    java.lang.String[] var36 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var37 = var32.withHeader(var36);
    java.lang.String var38 = var30.format((java.lang.Object[])var36);
    java.lang.String var39 = var21.format((java.lang.Object[])var36);
    org.apache.commons.csv.CSVFormat var40 = var15.withHeader(var36);
    org.apache.commons.csv.CSVFormat var42 = var15.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVParser var43 = org.apache.commons.csv.CSVParser.parse("ALL MINIMAL NON_NUMERIC NONE", var15);
    org.apache.commons.csv.CSVFormat var44 = var15.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var46 = var15.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var48 = var15.withSkipHeaderRecord(true);
    java.lang.String var49 = var48.getNullString();
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
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
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + ""+ "'", var38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + ""+ "'", var39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test162");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withNullString("");
    org.apache.commons.csv.CSVFormat var5 = var1.withIgnoreEmptyLines();
    java.lang.String[] var6 = var5.getHeaderComments();
    org.apache.commons.csv.CSVFormat var8 = var5.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var10 = var8.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var12 = var10.withRecordSeparator("Default Excel MySQL RFC4180 TDF");
    org.apache.commons.csv.CSVFormat var14 = var10.withDelimiter('4');
    java.lang.String[] var15 = var10.getHeader();
    org.apache.commons.csv.CSVFormat var17 = var10.withRecordSeparator('4');
    
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
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test163");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withNullString("");
    org.apache.commons.csv.CSVFormat var5 = var1.withIgnoreEmptyLines();
    java.lang.String[] var6 = var5.getHeaderComments();
    org.apache.commons.csv.CSVFormat var8 = var5.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var10 = var5.withRecordSeparator('4');
    org.apache.commons.csv.QuoteMode var11 = var10.getQuoteMode();
    org.apache.commons.csv.CSVFormat var13 = var10.withQuote((java.lang.Character)'#');
    org.apache.commons.csv.CSVFormat var15 = var13.withCommentMarker('4');
    java.lang.Character var16 = var15.getCommentMarker();
    java.lang.String var17 = var15.toString();
    boolean var18 = var15.getIgnoreSurroundingSpaces();
    boolean var19 = var15.isQuoteCharacterSet();
    
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
    assertTrue("'" + var16 + "' != '" + '4'+ "'", var16.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Delimiter=< > QuoteChar=<#> CommentStart=<4> RecordSeparator=<4> EmptyLines:ignored SkipHeaderRecord:false"+ "'", var17.equals("Delimiter=< > QuoteChar=<#> CommentStart=<4> RecordSeparator=<4> EmptyLines:ignored SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test164");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    java.lang.String var4 = var1.toString();
    java.lang.String[] var5 = var1.getHeaderComments();
    org.apache.commons.csv.CSVFormat var7 = var1.withRecordSeparator("Default Excel MySQL RFC4180 TDFhi!");
    org.apache.commons.csv.CSVFormat var8 = var1.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var10 = var1.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var12 = var1.withQuote((java.lang.Character)'4');
    boolean var13 = var12.getIgnoreSurroundingSpaces();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Delimiter=< > SkipHeaderRecord:false"+ "'", var4.equals("Delimiter=< > SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test165");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var3 = var2.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var5 = var2.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVParser var6 = org.apache.commons.csv.CSVParser.parse("", var5);
    long var7 = var6.getRecordNumber();
    long var8 = var6.getRecordNumber();
    boolean var9 = var6.isClosed();
    boolean var10 = var6.isClosed();
    boolean var11 = var6.isClosed();
    
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test166");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var3 = var2.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var4 = var2.withSkipHeaderRecord();
    java.lang.Character var5 = var4.getCommentMarker();
    org.apache.commons.csv.CSVParser var6 = org.apache.commons.csv.CSVParser.parse("Delimiter=< > RecordSeparator=<4> SkipHeaderRecord:false", var4);
    org.apache.commons.csv.CSVFormat var8 = var4.withIgnoreSurroundingSpaces(true);
    boolean var9 = var8.getAllowMissingColumnNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test167");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var3 = var2.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var5 = var2.withNullString("");
    org.apache.commons.csv.CSVFormat var6 = var2.withIgnoreEmptyLines();
    java.lang.String[] var7 = var6.getHeaderComments();
    org.apache.commons.csv.CSVFormat var9 = var6.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var11 = var6.withRecordSeparator('4');
    org.apache.commons.csv.QuoteMode var12 = var11.getQuoteMode();
    org.apache.commons.csv.CSVParser var13 = org.apache.commons.csv.CSVParser.parse("Delimiter=< > QuoteChar=<a> SkipHeaderRecord:false", var11);
    java.util.Map var14 = var13.getHeaderMap();
    var13.close();
    long var16 = var13.getCurrentLineNumber();
    
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
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0L);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test168");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var3 = var2.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var5 = var2.withNullString("");
    org.apache.commons.csv.CSVFormat var6 = var2.withIgnoreEmptyLines();
    java.lang.String[] var7 = var6.getHeaderComments();
    org.apache.commons.csv.CSVFormat var9 = var6.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var11 = var6.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat.Predefined[] var12 = org.apache.commons.csv.CSVFormat.Predefined.values();
    org.apache.commons.csv.CSVFormat var13 = var11.withHeaderComments((java.lang.Object[])var12);
    org.apache.commons.csv.CSVFormat var15 = var11.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var17 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var18 = var17.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var19 = var17.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var21 = var19.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var23 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var24 = var23.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var25 = var23.withSkipHeaderRecord();
    java.lang.String var26 = var25.toString();
    org.apache.commons.csv.CSVFormat var28 = var25.withNullString("");
    org.apache.commons.csv.CSVFormat var30 = var25.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var32 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var33 = var32.withAllowMissingColumnNames();
    boolean var34 = var32.isNullStringSet();
    java.lang.String[] var36 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var37 = var32.withHeader(var36);
    java.lang.String var38 = var30.format((java.lang.Object[])var36);
    java.lang.String var39 = var21.format((java.lang.Object[])var36);
    org.apache.commons.csv.CSVFormat var40 = var15.withHeader(var36);
    org.apache.commons.csv.CSVFormat var42 = var15.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVParser var43 = org.apache.commons.csv.CSVParser.parse("ALL MINIMAL NON_NUMERIC NONE", var15);
    org.apache.commons.csv.CSVFormat var44 = var15.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var46 = var15.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var48 = var15.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var49 = var15.withAllowMissingColumnNames();
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
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
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + ""+ "'", var38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + ""+ "'", var39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test169");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('#');
    org.apache.commons.csv.CSVFormat var3 = var1.withRecordSeparator("#");
    org.apache.commons.csv.CSVFormat var5 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var6 = var5.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var8 = var5.withNullString("");
    boolean var9 = var5.isNullStringSet();
    boolean var10 = var5.getAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var12 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var13 = var12.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var14 = var12.withSkipHeaderRecord();
    boolean var15 = var12.isCommentMarkerSet();
    java.lang.Character var16 = var12.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var17 = var12.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var19 = var12.withIgnoreEmptyLines(true);
    boolean var20 = var5.equals((java.lang.Object)var12);
    boolean var21 = var1.equals((java.lang.Object)var5);
    java.lang.Character var22 = var5.getQuoteCharacter();
    boolean var23 = var5.isNullStringSet();
    java.lang.String var24 = var5.getRecordSeparator();
    boolean var25 = var5.getIgnoreEmptyLines();
    java.lang.Character var26 = var5.getEscapeCharacter();
    java.lang.String var27 = var5.getNullString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test170");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withAllowMissingColumnNames(true);
    java.lang.String var6 = var5.getRecordSeparator();
    java.lang.Character var7 = var5.getCommentMarker();
    org.apache.commons.csv.CSVFormat var9 = var5.withEscape('4');
    java.lang.String var10 = var9.getNullString();
    org.apache.commons.csv.CSVFormat var12 = var9.withQuote((java.lang.Character)'a');
    boolean var13 = var9.getIgnoreHeaderCase();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test171");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('a');
    org.apache.commons.csv.CSVFormat var3 = var1.withIgnoreHeaderCase(false);
    java.lang.String var4 = var3.getRecordSeparator();
    org.apache.commons.csv.QuoteMode var5 = var3.getQuoteMode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test172");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var7 = var5.withQuote((java.lang.Character)'4');
    boolean var8 = var7.getIgnoreHeaderCase();
    boolean var9 = var7.isEscapeCharacterSet();
    char var10 = var7.getDelimiter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == ' ');

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test173");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withIgnoreSurroundingSpaces();
    java.lang.Character var3 = var1.getCommentMarker();
    java.lang.String var4 = var1.getNullString();
    java.lang.String var5 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Delimiter=< > SkipHeaderRecord:false"+ "'", var5.equals("Delimiter=< > SkipHeaderRecord:false"));

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test174");


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
    java.lang.String var16 = var1.getNullString();
    org.apache.commons.csv.CSVFormat var18 = var1.withRecordSeparator('#');
    org.apache.commons.csv.CSVFormat var20 = var18.withQuote((java.lang.Character)'4');
    
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
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test175");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withNullString("");
    org.apache.commons.csv.CSVFormat var5 = var1.withIgnoreEmptyLines();
    java.lang.String[] var6 = var5.getHeaderComments();
    org.apache.commons.csv.CSVFormat var8 = var5.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var10 = var5.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat var12 = var10.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var13 = var12.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var15 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var16 = var15.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var17 = var15.withSkipHeaderRecord();
    boolean var18 = var15.isCommentMarkerSet();
    boolean var19 = var15.getIgnoreHeaderCase();
    java.lang.String[] var21 = new java.lang.String[] { "Delimiter=< > SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var22 = var15.withHeader(var21);
    org.apache.commons.csv.CSVFormat var24 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var25 = var24.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var26 = var24.withSkipHeaderRecord();
    boolean var27 = var24.isCommentMarkerSet();
    boolean var28 = var24.getIgnoreHeaderCase();
    java.lang.String[] var30 = new java.lang.String[] { "Delimiter=< > SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var31 = var24.withHeader(var30);
    org.apache.commons.csv.CSVFormat var32 = var15.withHeader(var30);
    org.apache.commons.csv.CSVFormat var34 = var32.withIgnoreSurroundingSpaces(true);
    java.lang.Character var35 = var32.getCommentMarker();
    java.lang.Character var36 = var32.getCommentMarker();
    org.apache.commons.csv.CSVFormat var38 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var39 = var38.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var40 = var38.withSkipHeaderRecord();
    java.lang.String var41 = var40.toString();
    org.apache.commons.csv.CSVFormat var43 = var40.withNullString("");
    org.apache.commons.csv.CSVFormat var45 = var40.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var46 = var45.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var48 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var49 = var48.withIgnoreSurroundingSpaces();
    java.lang.Character var50 = var48.getCommentMarker();
    java.lang.String var51 = var48.getNullString();
    org.apache.commons.csv.CSVFormat var52 = var48.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var54 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var55 = var54.withAllowMissingColumnNames();
    boolean var56 = var54.isNullStringSet();
    java.lang.String[] var58 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var59 = var54.withHeader(var58);
    org.apache.commons.csv.CSVFormat var61 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var62 = var61.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var63 = var61.withSkipHeaderRecord();
    boolean var64 = var61.isCommentMarkerSet();
    boolean var65 = var61.getIgnoreHeaderCase();
    java.lang.String[] var67 = new java.lang.String[] { "Delimiter=< > SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var68 = var61.withHeader(var67);
    org.apache.commons.csv.CSVFormat var70 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var71 = var70.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var72 = var70.withSkipHeaderRecord();
    boolean var73 = var70.isCommentMarkerSet();
    boolean var74 = var70.getIgnoreHeaderCase();
    java.lang.String[] var76 = new java.lang.String[] { "Delimiter=< > SkipHeaderRecord:true"};
    org.apache.commons.csv.CSVFormat var77 = var70.withHeader(var76);
    org.apache.commons.csv.CSVFormat var78 = var61.withHeader(var76);
    java.lang.String var79 = var59.format((java.lang.Object[])var76);
    org.apache.commons.csv.CSVFormat var80 = var52.withHeader(var76);
    java.lang.String var81 = var45.format((java.lang.Object[])var76);
    org.apache.commons.csv.CSVFormat var82 = var32.withHeaderComments((java.lang.Object[])var76);
    java.lang.String var83 = var12.format((java.lang.Object[])var76);
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
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
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
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
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var79.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var81 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var81.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var83 + "' != '" + "Delimiter=< > SkipHeaderRecord:true4"+ "'", var83.equals("Delimiter=< > SkipHeaderRecord:true4"));

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test176");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withIgnoreSurroundingSpaces();
    boolean var3 = var2.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var4 = var2.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var6 = var2.withEscape('a');
    boolean var7 = var2.getSkipHeaderRecord();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test177");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var3 = var2.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var5 = var2.withNullString("");
    org.apache.commons.csv.CSVFormat var6 = var2.withIgnoreEmptyLines();
    java.lang.String[] var7 = var6.getHeaderComments();
    org.apache.commons.csv.CSVFormat var9 = var6.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var11 = var6.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat.Predefined[] var12 = org.apache.commons.csv.CSVFormat.Predefined.values();
    org.apache.commons.csv.CSVFormat var13 = var11.withHeaderComments((java.lang.Object[])var12);
    org.apache.commons.csv.CSVFormat var15 = var11.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var17 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var18 = var17.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var19 = var17.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var21 = var19.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var23 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var24 = var23.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var25 = var23.withSkipHeaderRecord();
    java.lang.String var26 = var25.toString();
    org.apache.commons.csv.CSVFormat var28 = var25.withNullString("");
    org.apache.commons.csv.CSVFormat var30 = var25.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var32 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var33 = var32.withAllowMissingColumnNames();
    boolean var34 = var32.isNullStringSet();
    java.lang.String[] var36 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var37 = var32.withHeader(var36);
    java.lang.String var38 = var30.format((java.lang.Object[])var36);
    java.lang.String var39 = var21.format((java.lang.Object[])var36);
    org.apache.commons.csv.CSVFormat var40 = var15.withHeader(var36);
    org.apache.commons.csv.CSVFormat var42 = var15.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVParser var43 = org.apache.commons.csv.CSVParser.parse("ALL MINIMAL NON_NUMERIC NONE", var15);
    org.apache.commons.csv.CSVFormat var44 = var15.withIgnoreEmptyLines();
    boolean var45 = var15.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var47 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var48 = var47.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var49 = var47.withSkipHeaderRecord();
    boolean var50 = var47.isCommentMarkerSet();
    boolean var51 = var47.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var53 = var47.withAllowMissingColumnNames(false);
    org.apache.commons.csv.CSVFormat var55 = var53.withIgnoreEmptyLines(true);
    char var56 = var53.getDelimiter();
    org.apache.commons.csv.CSVFormat var58 = var53.withSkipHeaderRecord(true);
    java.lang.String[] var59 = var53.getHeader();
    org.apache.commons.csv.CSVFormat var61 = var53.withCommentMarker((java.lang.Character)'4');
    org.apache.commons.csv.CSVFormat var63 = var53.withQuote('#');
    boolean var64 = var15.equals((java.lang.Object)'#');
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
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
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + ""+ "'", var38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + ""+ "'", var39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
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
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == ' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test178");


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
    org.apache.commons.csv.CSVFormat var20 = var18.withDelimiter('4');
    org.apache.commons.csv.CSVFormat var22 = var18.withIgnoreEmptyLines(false);
    org.apache.commons.csv.CSVFormat var24 = var18.withDelimiter('#');
    org.apache.commons.csv.CSVFormat var26 = var24.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.QuoteMode var27 = var24.getQuoteMode();
    
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
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test179");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withRecordSeparator("hi!");
    boolean var5 = var4.isCommentMarkerSet();
    boolean var6 = var4.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var8 = var4.withRecordSeparator("Delimiter=< > SkipHeaderRecord:truehi!");
    boolean var9 = var8.getIgnoreSurroundingSpaces();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test180");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    boolean var3 = var2.isCommentMarkerSet();
    boolean var4 = var2.getIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVParser var5 = org.apache.commons.csv.CSVParser.parse("", var2);
    boolean var6 = var2.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var8 = var2.withDelimiter('a');
    java.lang.String var9 = var8.getNullString();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test181");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var4 = var1.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var6 = var1.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var8 = var6.withQuote('#');
    org.apache.commons.csv.CSVFormat var10 = var8.withEscape('4');
    org.apache.commons.csv.CSVFormat var11 = var8.withSkipHeaderRecord();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test182");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    boolean var4 = var1.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var6 = var1.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var8 = var1.withQuote((java.lang.Character)'4');
    java.lang.String[] var9 = var8.getHeader();
    org.apache.commons.csv.CSVFormat var12 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var13 = var12.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var14 = var12.withSkipHeaderRecord();
    java.lang.String var15 = var14.toString();
    org.apache.commons.csv.CSVFormat var17 = var14.withNullString("");
    org.apache.commons.csv.CSVFormat var19 = var14.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var20 = var19.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var21 = var20.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVParser var22 = org.apache.commons.csv.CSVParser.parse("DefaultaExcelaMySQLaRFC4180aTDF", var20);
    org.apache.commons.csv.CSVFormat var24 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var25 = var24.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var27 = var24.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var29 = var24.withNullString("Delimiter=< > SkipHeaderRecord:true");
    org.apache.commons.csv.CSVFormat var31 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var32 = var31.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var34 = var31.withNullString("");
    org.apache.commons.csv.CSVFormat var35 = var31.withIgnoreEmptyLines();
    java.lang.String var36 = var35.toString();
    org.apache.commons.csv.CSVFormat var38 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var39 = var38.withAllowMissingColumnNames();
    boolean var40 = var38.isNullStringSet();
    java.lang.String[] var42 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var43 = var38.withHeader(var42);
    org.apache.commons.csv.CSVFormat var44 = var35.withHeader(var42);
    org.apache.commons.csv.CSVFormat var45 = var24.withHeader(var42);
    org.apache.commons.csv.CSVFormat var46 = var45.withIgnoreEmptyLines();
    org.apache.commons.csv.QuoteMode var47 = var46.getQuoteMode();
    org.apache.commons.csv.CSVFormat var49 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var50 = var49.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var51 = var49.withSkipHeaderRecord();
    java.lang.String var52 = var51.toString();
    org.apache.commons.csv.CSVFormat var54 = var51.withNullString("");
    org.apache.commons.csv.CSVFormat var56 = var51.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var58 = var51.withNullString("Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var60 = var51.withRecordSeparator(' ');
    java.lang.String var61 = var60.toString();
    org.apache.commons.csv.CSVFormat var63 = var60.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var65 = var63.withEscape('4');
    org.apache.commons.csv.CSVFormat var67 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var68 = var67.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var69 = var67.withSkipHeaderRecord();
    java.lang.String var70 = var69.toString();
    org.apache.commons.csv.CSVFormat var72 = var69.withNullString("");
    org.apache.commons.csv.CSVFormat var74 = var69.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var76 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var77 = var76.withAllowMissingColumnNames();
    boolean var78 = var76.isNullStringSet();
    java.lang.String[] var80 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var81 = var76.withHeader(var80);
    java.lang.String var82 = var74.format((java.lang.Object[])var80);
    java.lang.String var83 = var65.format((java.lang.Object[])var80);
    org.apache.commons.csv.CSVFormat var84 = var46.withHeaderComments((java.lang.Object[])var80);
    java.lang.String var85 = var20.format((java.lang.Object[])var80);
    org.apache.commons.csv.CSVFormat var86 = var8.withHeaderComments((java.lang.Object[])var80);
    org.apache.commons.csv.CSVFormat var87 = var8.withIgnoreEmptyLines();
    java.lang.Character var88 = var8.getCommentMarker();
    
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
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var15.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false"+ "'", var36.equals("Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var52.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "Delimiter=< > RecordSeparator=< > SkipHeaderRecord:true"+ "'", var61.equals("Delimiter=< > RecordSeparator=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var70.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var82 + "' != '" + ""+ "'", var82.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var83 + "' != '" + ""+ "'", var83.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + ""+ "'", var85.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var88);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test183");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    boolean var3 = var1.isNullStringSet();
    java.lang.String[] var5 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var6 = var1.withHeader(var5);
    java.lang.String var7 = var1.getNullString();
    org.apache.commons.csv.QuoteMode var8 = var1.getQuoteMode();
    boolean var9 = var1.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var11 = var1.withCommentMarker('#');
    
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
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test184");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    boolean var4 = var1.isCommentMarkerSet();
    boolean var5 = var1.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var7 = var1.withAllowMissingColumnNames(false);
    org.apache.commons.csv.CSVFormat var9 = var7.withNullString("ALL MINIMAL NON_NUMERIC NONE");
    boolean var10 = var9.isNullStringSet();
    java.lang.String var11 = var9.toString();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Delimiter=< > NullString=<ALL MINIMAL NON_NUMERIC NONE> SkipHeaderRecord:false"+ "'", var11.equals("Delimiter=< > NullString=<ALL MINIMAL NON_NUMERIC NONE> SkipHeaderRecord:false"));

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test185");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var3 = var1.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var5 = var3.withAllowMissingColumnNames(true);
    boolean var6 = var3.getIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var8 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var9 = var8.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var11 = var8.withRecordSeparator("hi!");
    boolean var12 = var11.isCommentMarkerSet();
    boolean var13 = var11.isEscapeCharacterSet();
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
    org.apache.commons.csv.CSVFormat var37 = var11.withHeaderComments((java.lang.Object[])var33);
    org.apache.commons.csv.CSVFormat var38 = var3.withHeader(var33);
    org.apache.commons.csv.CSVFormat var40 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var41 = var40.withAllowMissingColumnNames();
    boolean var42 = var40.isNullStringSet();
    boolean var43 = var40.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var45 = var40.withCommentMarker((java.lang.Character)'4');
    boolean var46 = var40.isNullStringSet();
    org.apache.commons.csv.CSVFormat var47 = var40.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var49 = var47.withRecordSeparator("Delimiter=< > SkipHeaderRecord:true#");
    boolean var50 = var3.equals((java.lang.Object)"Delimiter=< > SkipHeaderRecord:true#");
    org.apache.commons.csv.CSVFormat var52 = var3.withNullString("Delimiter=< > RecordSeparator=<Default Excel MySQL RFC4180 TDF> EmptyLines:ignored SkipHeaderRecord:true");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
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
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test186");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withNullString("");
    org.apache.commons.csv.CSVFormat var5 = var1.withIgnoreEmptyLines();
    java.lang.String[] var6 = var5.getHeaderComments();
    org.apache.commons.csv.CSVFormat var8 = var5.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var10 = var5.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat var12 = var10.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var13 = var12.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var14 = var13.withSkipHeaderRecord();
    java.lang.Character var15 = var14.getCommentMarker();
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test187");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withNullString("");
    org.apache.commons.csv.CSVFormat var5 = var1.withIgnoreEmptyLines();
    java.lang.String[] var6 = var5.getHeaderComments();
    org.apache.commons.csv.CSVFormat var8 = var5.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var10 = var5.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat.Predefined[] var11 = org.apache.commons.csv.CSVFormat.Predefined.values();
    org.apache.commons.csv.CSVFormat var12 = var10.withHeaderComments((java.lang.Object[])var11);
    org.apache.commons.csv.CSVFormat var14 = var10.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var16 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var17 = var16.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var18 = var16.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var20 = var18.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var22 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var23 = var22.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var24 = var22.withSkipHeaderRecord();
    java.lang.String var25 = var24.toString();
    org.apache.commons.csv.CSVFormat var27 = var24.withNullString("");
    org.apache.commons.csv.CSVFormat var29 = var24.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var31 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var32 = var31.withAllowMissingColumnNames();
    boolean var33 = var31.isNullStringSet();
    java.lang.String[] var35 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var36 = var31.withHeader(var35);
    java.lang.String var37 = var29.format((java.lang.Object[])var35);
    java.lang.String var38 = var20.format((java.lang.Object[])var35);
    org.apache.commons.csv.CSVFormat var39 = var14.withHeader(var35);
    org.apache.commons.csv.CSVFormat var41 = var39.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var43 = var39.withRecordSeparator('a');
    boolean var44 = var39.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var46 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var47 = var46.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var48 = var46.withSkipHeaderRecord();
    boolean var49 = var46.isCommentMarkerSet();
    java.lang.Character var50 = var46.getQuoteCharacter();
    org.apache.commons.csv.CSVFormat var51 = var46.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var53 = var51.withRecordSeparator('4');
    boolean var54 = var53.isQuoteCharacterSet();
    org.apache.commons.csv.QuoteMode var55 = var53.getQuoteMode();
    org.apache.commons.csv.CSVFormat var56 = var53.withSkipHeaderRecord();
    boolean var57 = var39.equals((java.lang.Object)var53);
    org.apache.commons.csv.CSVFormat var58 = var39.withIgnoreEmptyLines();
    boolean var59 = var58.getIgnoreSurroundingSpaces();
    
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
    assertNotNull(var11);
    
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
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var25.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + ""+ "'", var37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + ""+ "'", var38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test188");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var4 = var1.withCommentMarker((java.lang.Character)'a');
    boolean var5 = var4.getIgnoreEmptyLines();
    java.lang.String[] var6 = var4.getHeaderComments();
    org.apache.commons.csv.QuoteMode var7 = var4.getQuoteMode();
    org.apache.commons.csv.CSVFormat var9 = var4.withAllowMissingColumnNames(false);
    java.lang.String var10 = var4.getNullString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test189");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var2 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var4 = var1.withSkipHeaderRecord(true);
    org.apache.commons.csv.CSVFormat var6 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var7 = var6.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var9 = var6.withNullString("");
    org.apache.commons.csv.CSVFormat var10 = var6.withIgnoreEmptyLines();
    java.lang.String[] var11 = var10.getHeaderComments();
    org.apache.commons.csv.CSVFormat var13 = var10.withIgnoreSurroundingSpaces(false);
    org.apache.commons.csv.CSVFormat var15 = var10.withRecordSeparator('4');
    org.apache.commons.csv.CSVFormat.Predefined[] var16 = org.apache.commons.csv.CSVFormat.Predefined.values();
    org.apache.commons.csv.CSVFormat var17 = var15.withHeaderComments((java.lang.Object[])var16);
    org.apache.commons.csv.CSVFormat var18 = var1.withHeaderComments((java.lang.Object[])var16);
    org.apache.commons.csv.CSVFormat var20 = var1.withRecordSeparator("Delimiter=< > QuoteChar=<a> SkipHeaderRecord:false");
    org.apache.commons.csv.CSVFormat var22 = var1.withDelimiter('a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test190");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withNullString("");
    org.apache.commons.csv.CSVFormat var5 = var1.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var7 = var5.withRecordSeparator('#');
    boolean var8 = var5.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var10 = var5.withDelimiter('a');
    java.lang.String var11 = var10.toString();
    java.lang.String[] var12 = var10.getHeader();
    
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Delimiter=<a> EmptyLines:ignored SkipHeaderRecord:false"+ "'", var11.equals("Delimiter=<a> EmptyLines:ignored SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test191");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    java.lang.String var2 = var1.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var4 = var1.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var6 = var1.withNullString("Delimiter=< > SkipHeaderRecord:true");
    boolean var7 = var6.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var9 = var6.withIgnoreEmptyLines(false);
    java.lang.String[] var10 = var9.getHeader();
    org.apache.commons.csv.CSVFormat var12 = var9.withNullString("Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false");
    java.lang.String var13 = var12.toString();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Delimiter=< > NullString=<Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false> SkipHeaderRecord:false"+ "'", var13.equals("Delimiter=< > NullString=<Delimiter=< > NullString=<Delimiter=< > SkipHeaderRecord:true> SkipHeaderRecord:false> SkipHeaderRecord:false"));

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test192");


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
    org.apache.commons.csv.CSVFormat var21 = var18.withNullString("DefaultaExcelaMySQLaRFC4180aTDF");
    org.apache.commons.csv.CSVFormat var23 = var21.withRecordSeparator(' ');
    
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
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test193");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var3 = var2.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var5 = var2.withCommentMarker((java.lang.Character)'a');
    org.apache.commons.csv.CSVParser var6 = org.apache.commons.csv.CSVParser.parse("", var5);
    long var7 = var6.getRecordNumber();
    java.util.List var8 = var6.getRecords();
    java.util.Map var9 = var6.getHeaderMap();
    boolean var10 = var6.isClosed();
    var6.close();
    long var12 = var6.getCurrentLineNumber();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest5.test194");


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
    org.apache.commons.csv.CSVFormat var20 = var18.withDelimiter('4');
    org.apache.commons.csv.CSVFormat var22 = var18.withIgnoreEmptyLines(false);
    org.apache.commons.csv.CSVFormat var24 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var25 = var24.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var26 = var24.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var28 = var26.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var30 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var31 = var30.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var32 = var30.withSkipHeaderRecord();
    java.lang.String var33 = var32.toString();
    org.apache.commons.csv.CSVFormat var35 = var32.withNullString("");
    org.apache.commons.csv.CSVFormat var37 = var32.withIgnoreSurroundingSpaces(true);
    org.apache.commons.csv.CSVFormat var39 = org.apache.commons.csv.CSVFormat.newFormat(' ');
    org.apache.commons.csv.CSVFormat var40 = var39.withAllowMissingColumnNames();
    boolean var41 = var39.isNullStringSet();
    java.lang.String[] var43 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var44 = var39.withHeader(var43);
    java.lang.String var45 = var37.format((java.lang.Object[])var43);
    java.lang.String var46 = var28.format((java.lang.Object[])var43);
    org.apache.commons.csv.CSVFormat var47 = var18.withHeaderComments((java.lang.Object[])var43);
    boolean var48 = var18.getIgnoreSurroundingSpaces();
    boolean var49 = var18.isEscapeCharacterSet();
    org.apache.commons.csv.CSVFormat var51 = var18.withIgnoreSurroundingSpaces(true);
    
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
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "Delimiter=< > SkipHeaderRecord:true"+ "'", var33.equals("Delimiter=< > SkipHeaderRecord:true"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + ""+ "'", var45.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + ""+ "'", var46.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

}
