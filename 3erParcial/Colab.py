from typing import List

class Solution:
    def twoProduct(self, nums: list[int], target: int) -> List[int]:
        num_map = {}
        best_pair = None
        for i, num in enumerate(nums):
            if num == 0 and target == 0:
                return [i, i]
            if num != 0 and target % num == 0:
                complement = target // num
                if complement in num_map:
                    if best_pair is None or [num_map[complement], i] < best_pair:
                        best_pair = [num_map[complement], i]
            num_map[num] = i
        return best_pair

sol = Solution()
result = sol.twoProduct([2, 4, 5, 10, 7], 20)
print("Found Indices:", result)