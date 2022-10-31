835.Image Overlap
===

You are given two images, `img1` and `img2`, represented as binary, square matrices of size `n x n`. A binary matrix has only `0`s and `1`s as values.

We __translate__ one image however we choose by sliding all the `1` bits left, right, up, and/or down any number of units. We then place it on top of the other image. We can then calculate the __overlap__ by counting the number of positions that have a `1` in __both__ images.

Note also that a translation does __not__ include any kind of rotation. Any `1` bits that are translated outside of the matrix borders are erased.

Return the _largest possible overlap_.

Example 1:

![overlap1](https://user-images.githubusercontent.com/99130418/198827844-70ef49e7-1e83-410a-84f6-ed52d2851c93.jpg)

```
Input: img1 = [[1,1,0],[0,1,0],[0,1,0]], img2 = [[0,0,0],[0,1,1],[0,0,1]]
Output: 3
Explanation: We translate img1 to right by 1 unit and down by 1 unit.
```

![overlap_step1](https://user-images.githubusercontent.com/99130418/198827827-d195aea5-f314-459d-a9ff-67e2d0ccb64f.jpg)

```
The number of positions that have a 1 in both images is 3 (shown in red).
```

![overlap_step2](https://user-images.githubusercontent.com/99130418/198827821-168d9925-be8b-4857-8c8b-fb1986ef91c7.jpg)

__Example 2:__

```
Input: img1 = [[1]], img2 = [[1]]
Output: 1
```

__Example 3:__

```
Input: img1 = [[0]], img2 = [[0]]
Output: 0
```

__Constraints:__

+ `n == img1.length == img1[i].length`
+ `n == img2.length == img2[i].length`
+ `1 <= n <= 30`
+ `img1[i][j]` is either `0` or `1`.
+ `img2[i][j]` is either `0` or `1`.
