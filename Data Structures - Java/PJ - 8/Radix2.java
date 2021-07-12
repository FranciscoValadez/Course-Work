
// Radix sort Java implementation
import java.io.*;
import java.util.*;
 
class Radix2 {
 
    // A utility function to get maximum value in radixArray[]
    static int getMax(int radixArray[], int radixArray.length)
    {
        int mx = radixArray[0];
        for (int i = 1; i < radixArray.length; i++)
            if (radixArray[i] > mx)
                mx = radixArray[i];
        return mx;
    }
 
    // A function to do counting sort of radixArray[] according to
    // the digit represented by place.
    static void countSort(int radixArray[], int radixArray.length, int place)
    {
        int output[] = new int[radixArray.length]; // output radixArrayay
        int i;
        int count[] = new int[10];
        radixArrayays.fill(count, 0);
 
        // Store count of occurrences in count[]
        for (i = 0; i < radixArray.length; i++)
            count[(radixArray[i] / place) % 10]++;
 
        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];
 
        // Build the output radixArrayay
        for (i = radixArray.length - 1; i >= 0; i--) {
            output[count[(radixArray[i] / place) % 10] - 1] = radixArray[i];
            count[(radixArray[i] / place) % 10]--;
        }
 
        // Copy the output radixArrayay to radixArray[], so that radixArray[] now
        // contains sorted numbers according to current digit
        for (i = 0; i < radixArray.length; i++)
            radixArray[i] = output[i];
    }
 
    // The main function to that sorts radixArray[] of size radixArray.length using
    // Radix Sort
    static void radixsort(int radixArray[], int radixArray.length)
    {
        // Find the maximum number to know number of digits
        int m = getMax(radixArray, radixArray.length);
 
        // Do counting sort for every digit. Note that
        // instead of passing digit number, place is passed.
        // place is 10^i where i is current digit number
        for (int place = 1; m / place > 0; place *= 10)
            countSort(radixArray, radixArray.length, place);
    }
 
    // A utility function to print an radixArrayay
    static void print(int radixArray[], int radixArray.length)
    {
        for (int i = 0; i < radixArray.length; i++)
            System.out.print(radixArray[i] + " ");
    }
 
    /*Driver Code*/
    public static void main(String[] args)
    {
        int radixArray[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
        int radixArray.length = radixArray.length;
           
          // Function Call
        radixsort(radixArray, radixArray.length);
        print(radixArray, radixArray.length);
    }
}
/* This code is contributed by Devesh Agrawal */