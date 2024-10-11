class Solution {
    public long solution(int price, long money, int count) {
        long tmp = price;

        for (long i = 0; i < count; i++) {
            money -= price;
            price += tmp;
        }

        return money >= 0 ? 0 : money * -1;
    }
}