import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test 
	public void testReverseInPlace2() {
    int[] input1 = { 1, 2, 3, 4, 5 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 5, 4, 3, 2, 1 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
  @Test
  public void testReversed2() {
    int[] input1 = {1,2,3};
    assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageOneElement() {
    double[] input1 = {100};
    assertEquals(0, ArrayExamples.averageWithoutLowest(input1), 0.01);
  }

  @Test
  public void testAverageZeroElements() {
    double[] input1 = {};
    assertEquals(0, ArrayExamples.averageWithoutLowest(input1), 0.01);
  }

  @Test
  public void testAverageRepeatedLowest() {
    double[] input1 = {10, 10, 10, 11, 12, 58};
    assertEquals(27, ArrayExamples.averageWithoutLowest(input1), 0.01);
  }
}
