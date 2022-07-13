public class Sort {
    /** Sorts strings destructively. */

    public static void sort(String[] x) {
        //Find the smallest item
        //Move it to the front
        //Selection sort the rest (using recursion??)
    }

    public static String findSmallest(String[] x) {
        int smallestIndex = 0;
        for(int i = 0; i < x.length; i++) {
            int cmp = x[i].compareTo(x[smallestIndex]);
            if (cmp < 0) {
                smallestIndex = i;
            }
        }
        return x[smallestIndex];
    }
}
