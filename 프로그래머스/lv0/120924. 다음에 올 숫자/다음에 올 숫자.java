class Solution {
    public int solution(int[] common) {
        int result = 2000;
        if(common[2] - common[1] == common[1] - common[0]) {
            result = common[common.length - 1] + (common[1] - common[0]);
        } else {
            result = common[common.length - 1] * (common[1] / common[0]);
        }
        return result;
    }
}