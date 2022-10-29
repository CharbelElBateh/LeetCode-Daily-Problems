2136.Earliest Possible Day of Full Bloom
===
You have `n` flower seeds. Every seed must be planted first before it can begin to grow, then bloom. Planting a seed takes time and so does the growth of a seed. You are given two __0-indexed integer__ arrays `plantTime` and `growTime`, of length `n` each:

+ `plantTime[i]` is the number of __full days__ it takes you to __plant__ the `i^th` seed. Every day, you can work on planting exactly one seed. You __do not__ have to work on planting the same seed on consecutive days, but the planting of a seed is not complete __until__ you have worked `plantTime[i]` days on planting it in total.
+ `growTime[i]` is the number of __full days__ it takes the `i^th` seed to grow after being completely planted. __After__ the last day of its growth, the flower __blooms__ and stays bloomed forever.
From the beginning of day `0`, you can plant the seeds in __any__ order.

Return the __earliest__ possible day where __all__ seeds are blooming. 

__Example 1:__

![1](https://user-images.githubusercontent.com/99130418/198828411-7b138dbc-48d7-4621-b6a9-3ca53c4d8e72.png)

```
Input: plantTime = [1,4,3], growTime = [2,3,1]
Output: 9
Explanation: The grayed out pots represent planting days, colored pots represent growing days, and the flower represents the day it blooms.
One optimal way is:
On day 0, plant the 0th seed. The seed grows for 2 full days and blooms on day 3.
On days 1, 2, 3, and 4, plant the 1st seed. The seed grows for 3 full days and blooms on day 8.
On days 5, 6, and 7, plant the 2nd seed. The seed grows for 1 full day and blooms on day 9.
Thus, on day 9, all the seeds are blooming.
```
__Example 2:__

![2](https://user-images.githubusercontent.com/99130418/198828422-262bbbc5-e20b-4f26-bb1c-c109658b5773.png)

```
Input: plantTime = [1,2,3,2], growTime = [2,1,2,1]
Output: 9
Explanation: The grayed out pots represent planting days, colored pots represent growing days, and the flower represents the day it blooms.
One optimal way is:
On day 1, plant the 0th seed. The seed grows for 2 full days and blooms on day 4.
On days 0 and 3, plant the 1st seed. The seed grows for 1 full day and blooms on day 5.
On days 2, 4, and 5, plant the 2nd seed. The seed grows for 2 full days and blooms on day 8.
On days 6 and 7, plant the 3rd seed. The seed grows for 1 full day and blooms on day 9.
Thus, on day 9, all the seeds are blooming.
```
__Example 3:__
```
Input: plantTime = [1], growTime = [1]
Output: 2
Explanation: On day 0, plant the 0th seed. The seed grows for 1 full day and blooms on day 2.
Thus, on day 2, all the seeds are blooming.
```

__Constraints:__

+ `n == plantTime.length == growTime.length`
+ `1 <= n <= 10^5`
+ `1 <= plantTime[i], growTime[i] <= 10^4`
