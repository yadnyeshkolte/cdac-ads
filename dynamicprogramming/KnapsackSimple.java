package dynamicprogramming;

import java.util.*;

public class KnapsackSimple{
    
    static int[] w;  // weights
    static int[] v;  // values
    static int n;    // number of items
    static Map<String, Integer> memo = new HashMap<>();
    
    public static void main(String[] args) {
        // Items: G(3), B(1), A(2), F(4), L(6)
        w = new int[] {0, 3, 1, 2, 4, 6};  // index 0 unused, items start at index 1
        v = new int[] {0, 15, 10, 12, 20, 25};  // values for items
        n = 5;  // 5 items
        int capacity = 10;
        
        System.out.println("Items:");
        System.out.println("G: weight=3, value=15");
        System.out.println("B: weight=1, value=10");
        System.out.println("A: weight=2, value=12");
        System.out.println("F: weight=4, value=20");
        System.out.println("L: weight=6, value=25");
        System.out.println("\nCapacity: " + capacity);
        System.out.println("\nStarting dp(10, 1)...\n");
        
        int result = dp(capacity, 1);
        System.out.println("\nMaximum value: " + result);
    }
    
    /**
     * dp(c, i) - EXACT structure from your diagram
     * c = capacity
     * i = ith item (1-indexed)
     */
    static int dp(int c, int i) {
        // if(i > n) return 0
        if (i > n) {
            return 0;
        }
        
        // Check memo
        String key = c + "," + i;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        
        int result;
        
        // if(c < w[i]) return dp(c, i+1)
        if (c < w[i]) {
            result = dp(c, i + 1);
        } 
        // else return max(dp(c, i+1), v[i] + dp(c-w[i], i+1))
        else {
            int skip = dp(c, i + 1);
            int take = v[i] + dp(c - w[i], i + 1);
            result = Math.max(skip, take);
        }
        
        memo.put(key, result);
        return result;
    }
}

/*
EXAMPLE TRACE (following your diagram):

dp(10, 1):
  Item G (w=3, v=15)
  ├─ skip: dp(10, 2)
  └─ take: 15 + dp(7, 2)

dp(10, 2):
  Item B (w=1, v=10)
  ├─ skip: dp(10, 3)
  └─ take: 10 + dp(9, 3)

dp(7, 2):
  Item B (w=1, v=10)
  ├─ skip: dp(7, 3)
  └─ take: 10 + dp(6, 3)

dp(10, 3):
  Item A (w=2, v=12)
  ├─ skip: dp(10, 4)
  └─ take: 12 + dp(8, 4)

dp(9, 3):
  Item A (w=2, v=12)
  ├─ skip: dp(9, 4)
  └─ take: 12 + dp(7, 4)

dp(7, 3):
  Item A (w=2, v=12)
  ├─ skip: dp(7, 4)
  └─ take: 12 + dp(5, 4)

dp(6, 3):
  Item A (w=2, v=12)
  ├─ skip: dp(6, 4)
  └─ take: 12 + dp(4, 4)

... and so on

ANSWER: Maximum value depends on item values (you didn't specify values in diagram)
*/