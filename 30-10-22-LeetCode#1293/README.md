You are given an `m x n` integer matrix `grid` where each cell is either `0` (empty) or `1` (obstacle). You can move up, down, left, or right from and to an empty cell in __one step__.

Return the minimum number of __steps__ to walk from the upper left corner `(0, 0)` to the lower right corner `(m - 1, n - 1)` given that you can eliminate __at most__ `k` obstacles. If it is not possible to find such walk return `-1`.

__Example 1:__

![short1-grid](https://user-images.githubusercontent.com/99130418/199107313-ef9fcd93-fc4c-4f6c-9c29-5af30ba232bc.jpg)

`Input: grid = [[0,0,0],[1,1,0],[0,0,0],[0,1,1],[0,0,0]], k = 1
Output: 6
Explanation: 
The shortest path without eliminating any obstacle is 10.
The shortest path with one obstacle elimination at position (3,2) is 6. Such path is (0,0) -> (0,1) -> (0,2) -> (1,2) -> (2,2) -> (3,2) -> (4,2).
`

__Example 2:__

![short2-grid](https://user-images.githubusercontent.com/99130418/199107414-da22df7a-c400-4ce4-b4ef-555a79c154c2.jpg)

`Input: grid = [[0,1,1],[1,1,1],[1,0,0]], k = 1
Output: -1
Explanation: We need to eliminate at least two obstacles to find such a walk.
`

__Constraints:__

+ `m == grid.length`
+ `n == grid[i].length`
+ `1 <= m, n <= 40`
+ `1 <= k <= m * n`
+ `grid[i][j]` is either `0` __or__ `1`.
+ `grid[0][0] == grid[m - 1][n - 1] == 0`
