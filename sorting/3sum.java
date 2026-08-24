class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate first numbers
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < nums.length - 1; j++) {

                // Skip duplicate second numbers
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                for (int k = j + 1; k < nums.length; k++) {

                    // Skip duplicate third numbers
                    if (k > j + 1 && nums[k] == nums[k - 1]) {
                        continue;
                    }

                    if (nums[i] + nums[j] + nums[k] == 0) {

                        List<Integer> triplet = Arrays.asList(
                            nums[i],
                            nums[j],
                            nums[k]
                        );

                        result.add(triplet);
                    }
                }
            }
        }

        return result;
    }
}