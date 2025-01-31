package classes;

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
      Picture beach = new Picture("images/beach.jpg");
      beach.explore();
      beach.keepOnlyBlue();
      beach.explore();
  }
  
  public static void testBottomHalfBlue()
  {
      Picture beach = new Picture("images/beach.jpg");
      beach.explore();
      beach.setBlueToHalfValueInBottomHalf();
      beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testmirrorVerticalLeftToRight()
  {
      Picture caterpillar = new Picture("caterpillar.jpg");
      caterpillar.explore();
      caterpillar.mirrorVerticalLeftToRight();
      caterpillar.explore();
  }
  
  public static void testMirrorHorizontally()
  {
      Picture caterpillar = new Picture("caterpillar.jpg");
      caterpillar.explore();
      caterpillar.mirrorHorizontally();
      caterpillar.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
      Picture caterpillar = new Picture("caterpillar.jpg");
      caterpillar.explore();
      caterpillar.mirrorHorizontalBotToTop();
      caterpillar.explore();
  }
  
  public static void testMirrorDiagonal()
  {
      Picture caterpillar = new Picture("images/beach.jpg");
      caterpillar.explore();
      caterpillar.mirrorDiagonal();
      caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture temple = new Picture("snowman.jpg");
    temple.explore();
    temple.mirrorArms();
    temple.explore();
  }
  
  public static void testMirrorGull()
  {
      Picture gull = new Picture("seagull.jpg");
      gull.explore();
      gull.mirrorGull();
      gull.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.explore();
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("swan.jpg");
    swan.explore();
    swan.edgeDetection2(10);
    swan.explore();
  }
  
  public static void testGetGreenCount()
  {
      Picture gull = new Picture("seagull.jpg");
      gull.explore();
      System.out.println(gull.getCountGreenOverValue(50));
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testmirrorVerticalLeftToRight();
    //testMirrorHorizontally();
    //testMirrorHorizontalBotToTop();
    //testMirrorDiagonal();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testBottomHalfBlue();
    testGetGreenCount();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}