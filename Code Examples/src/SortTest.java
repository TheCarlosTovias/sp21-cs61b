import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SortTest {

   /** Test the Sort.sort method. */
   public static void testSort() {
       String[] input = {"i", "have", "an", "egg"};
       String[] expected = {"an", "egg", "have", "i"};

       Sort.sort(input);

       org.junit.jupiter.api.Assertions.assertArrayEquals(expected, input);
   }

    /** Test the Sort.findSmallest method. */
     public static void testFindSmallest() {
         String[] input = {"i", "have", "an", "egg"};
         String expected = "an";

         String actual = Sort.findSmallest(input);
         org.junit.jupiter.api.Assertions.assertEquals(expected, actual);

         String[] input2 = {"there", "are", "many", "pigs"};
         String expected2 = "are";

         String actual2 = Sort.findSmallest(input2);
         org.junit.jupiter.api.Assertions.assertEquals(expected2, actual2);
     }

     public static void main(String[] args) {
         testFindSmallest();
     }
}