523.Continious Subarray Sum
===
Given an integer array nums and an integer k, return `true` if `nums` has a __good subarray__ or `false` otherwise.

A __good subarray__ is a subarray where:

+ its length is __at least two__, and
+ the sum of the elements of the subarray is a multiple of `k`.
__Note__ that:

+ A __subarray__ is a contiguous part of the array.
+ An integer `x` is a multiple of `k` if there exists an integer `n` such that `x = n * k`. `0` is __always__ a multiple of `k`.

__Example 1:__
```
Input: nums = [23,2,4,6,7], k = 6
Output: true
Explanation: [2, 4] is a continuous subarray of size 2 whose elements sum up to 6.
```
__Example 2:__
```
Input: nums = [23,2,6,4,7], k = 6
Output: true
Explanation: [23, 2, 6, 4, 7] is an continuous subarray of size 5 whose elements sum up to 42.
42 is a multiple of 6 because 42 = 7 * 6 and 7 is an integer.
```
__Example 3:__
```
Input: nums = [23,2,6,4,7], k = 13
Output: false
``` 

__Constraints:__

+ `1 <= nums.length <= 105`
+ `0 <= nums[i] <= 109`
+ `0 <= sum(nums[i]) <= 2^31 - 1`
+ `1 <= k <= 2^31 - 1`
