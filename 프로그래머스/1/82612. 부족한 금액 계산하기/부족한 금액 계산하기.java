class Solution {
    public long solution(int price, long money, int count) {
        long tmp = price;

        for (long i = 0; i < count; i++) {
            money -= price;
            price += tmp;
        }
        if (money <= 0) {
            return (long) money * -1;
        }
        return 0;
    }
}