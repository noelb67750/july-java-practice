
public class Solution {
    public int solve(int n, int m, int a, int b)
    {
    int costSingle = a * n;

    int costAllMulti =((n + m - 1) / m) * b;

    int costMixed = (n/m) * b + (n % m) * a;
    return Math.min(costSingle, Math.min(costAllMulti, costMixed));
    }
}