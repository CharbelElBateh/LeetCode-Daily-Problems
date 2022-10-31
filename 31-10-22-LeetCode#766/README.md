❗ This is a problem that has a follow-up, future visits will focus on them
===

Given an `m x n matrix`, return `true` if the matrix is _Toeplitz_. Otherwise, return `false`.

A matrix is __Toeplitz__ if every diagonal from top-left to bottom-right has the same elements.

__Example 1:__

![ex1](https://user-images.githubusercontent.com/99130418/199110031-68e46416-4bb5-4c13-9eca-b0217edebd91.jpg)

`Input: matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]
Output: true
Explanation:
In the above grid, the diagonals are:
"[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]".
In each diagonal all elements are the same, so the answer is True.
`
__Example 2:__

![ex2](https://user-images.githubusercontent.com/99130418/199110105-4383ded1-11f0-4e7c-8064-9253fe616c3f.jpg)

`
Input: matrix = [[1,2],[2,2]]
Output: false
Explanation:
The diagonal "[1, 2]" has different elements.
`

__Constraints:__

+ `m == matrix.length`
+ `n == matrix[i].length`
+ `1 <= m, n <= 20`
+ `0 <= matrix[i][j] <= 99`
 
__Follow up:__

+ What if the `matrix` is stored on disk, and the memory is limited such that you can only load at most one row of the matrix into the memory at once?
+ What if the `matrix` is so large that you can only load up a partial row into the memory at once?
