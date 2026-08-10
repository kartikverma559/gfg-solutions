class Solution {
 
public int task(int[] h, int[] l, int index, int prev, int[][] dp) {
 
if (index == h.length) {
return 0;
}
 
if (dp[index][prev] != -1) {
return dp[index][prev];
}
 
 
int leffort = l[index] +
task(h, l, index + 1, 1, dp);
 
 
int notask =
task(h, l, index + 1, 0, dp);
 
 
int heffort = Integer.MIN_VALUE;
 
if (prev == 0) {
heffort = h[index] +
task(h, l, index + 1, 1, dp);
}
 
return dp[index][prev] =
Math.max(notask, Math.max(leffort, heffort));
}
 
public int maxTask(int[] h, int[] l) {
 
int n = h.length;
 
int[][] dp = new int[n + 1][2];
 
for (int i = 0; i < dp.length; i++) {
Arrays.fill(dp[i], -1);
}
 
return task(h, l, 0, 0, dp);
}
}