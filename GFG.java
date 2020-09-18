// Java program to implement the 
// above approach 
import java.util.*; 
  
class GFG{ 
  
// Function to return minimum distinct 
// character after M removals 
static int distinctNumbers(int arr[], int m, 
                                      int n) 
{ 
    Map<Integer,  
        Integer> count = new HashMap<Integer, 
                                     Integer>(); 
  
    // Count the occurences of number 
    // and store in count 
    for (int i = 0; i < n; i++) 
    count.put(arr[i], 
              count.getOrDefault(arr[i], 0) + 1); 
      
    // Count the occurences of the 
    // frequencies 
    System.out.println(count);
    System.out.println(count.values());
    int[] fre_arr = new int[n + 1]; 
    for(Integer it : count.values()) 
    { 
         
        System.out.println(fre_arr[it]++);
    } 
  for(int x:fre_arr)
  System.out.print(x);
  System.out.println();
    // Take answer as total unique numbers 
    // and remove the frequency and 
    // subtract the answer 
    int ans = count.size(); 
  
    for(int i = 1; i <= n; i++)  
    { 
        int temp = fre_arr[i]; 
        if (temp == 0) 
            continue; 
  
        // Remove the minimum number 
        // of times 
        int t = Math.min(temp, m / i); 
        System.out.println(t+"t"+ans+"ans");
        ans -= t; 
        m -= t; 
    } 
  
    // Return the answer 
    return ans; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
      
    // Initialize array 
    int arr[] = { 1,1,1,2,3,4}; 
      
    // Size of array 
    int n = arr.length; 
    int m = 3; 
      
    // Function call 
    System.out.println(distinctNumbers(arr, m, n));  
} 
} 