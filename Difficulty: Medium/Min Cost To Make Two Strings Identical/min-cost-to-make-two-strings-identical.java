class Solution {
int n, m;
public int solve(int i, int j, String s1, String s2, int [][] dp) {

if (i == n || j == m) {
return 0;
}

if (dp[i][j] != -1) {
return dp[i][j];
}

int len = 0;
if (s1.charAt(i) == s2.charAt(j)) {
len = 1 + solve(i + 1, j + 1, s1, s2, dp);
} else {
len = Math.max(solve(i + 1, j, s1, s2, dp), solve(i, j + 1, s1, s2, dp));
}

return dp[i][j] = len;
}
public int findMinCost(String s1, String s2, int costS1, int costS2) {
// code here
n = s1.length();
m = s2.length();
int ans = 0;
int LCS = 0;
int [][] dp = new int[n + 1][m + 1];
for (int [] rows : dp) {
Arrays.fill(rows, -1);

}

LCS = solve(0, 0, s1, s2, dp);

int del1 = n - LCS;
int del2 = m - LCS;

ans = del1 * costS1 + del2 * costS2;
return ans;
}
}