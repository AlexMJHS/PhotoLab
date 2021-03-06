package pixLab.classes;
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
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
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
  
  public static void testMirrorVerticalRightToLeft()
  {
	  Picture caterpillar = new Picture("caterpillar.jpg");
	    caterpillar.explore();
	    caterpillar.mirrorVerticalRightToLeft();
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
  
  public static void testRandomColor()
  {
	  Picture randomCat = new Picture("caterpillar.jpg");
	  randomCat.explore();
	  randomCat.randomColor();
	  randomCat.explore();
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
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
	  Picture seagull = new Picture("seagull.jpg");
	  seagull.keepOnlyBlue();
	  seagull.explore();
  }
  
  public static void testKeepOnlyRed()
  {
	  Picture seagull = new Picture("seagull.jpg");
	  seagull.keepOnlyRed();
	  seagull.explore();
  }
  
  public static void testKeepOnlyGreen()
  {
	  Picture seagull = new Picture("seagull.jpg");
	  seagull.keepOnlyGreen();
	  seagull.explore();
  }
  
  public static void testMirrorHorizontal()
  {
	  Picture koala = new Picture("koala.jpg");
	  koala.mirrorHorizontal();
	  koala.explore();
  }
  
  public static void testMirrorHorizontalBottomToTop()
  {
	  Picture koala = new Picture("koala.jpg");
	  koala.mirrorHorizontalBottomToTop();
	  koala.explore();
  }
  
  public static void testMirrorArms()
  {
	  Picture snowman = new Picture("snowman.jpg");
	  snowman.mirrorArms();
	  snowman.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    testKeepOnlyBlue();
    testKeepOnlyRed();
    testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
	//testRandomColor();
    //testMirrorVertical();
    testMirrorVerticalRightToLeft();
    testMirrorHorizontal();
    testMirrorHorizontalBottomToTop();
    testMirrorTemple();
    testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
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