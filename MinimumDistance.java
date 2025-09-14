class MinimumDistance {

    public int minimumDistance(int[] nums) {

        int min = nums[0];
        //Get the minimum in the list
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        int minFirstIndex = -1;
        int minDistance = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == min) {
                //At minimum next
                if (minFirstIndex != -1) {
                    //At mimimum 1
                    int distance = i - minFirstIndex;
                    if (distance < minDistance) {
                        minDistance = distance;
                    }
                }
                //At minimum 0
                minFirstIndex = i;
            }
        }

        return minDistance;


    }
    public static void main(String[] args) {
        MinimumDistance m = new MinimumDistance();
        System.out.println(m.minimumDistance(new int[]{5, 1, 3, 4, 1, 7}));
    }
}