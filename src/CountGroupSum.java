public class CountGroupSum {





    //Methode, die aus einer Auswahl an Werten aus einem Array berechnet, ob sich mit diesen eine target-Zahl summieren
    //laesst
    static boolean groupSum(int start, int[] nums, int target) {
        if (start >= nums.length){
            if (target == 0){
                return true;
            } else {
                return false;
            }
        }
        int nextTarget = target - nums[start];
        if (groupSum(start + 1, nums, nextTarget)){
            return true;
        }
        if (groupSum(start + 1, nums, target)){
            return true;
        }
        return false;
    }

}
