
class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> set = new HashSet<>();

        int a = 1;

        while (a < bound) {
            int b = 1;

            while (a + b <= bound) {
                set.add(a + b);

                if (y == 1) {
                    break;
                }

                b *= y;
            }

            if (x == 1) {
                break;
            }

            a *= x;
        }

        return new ArrayList<>(set);
    }
}
