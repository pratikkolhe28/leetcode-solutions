
class ProductOfNumbers {

    ArrayList<Integer> prefix;

    public ProductOfNumbers() {
        prefix = new ArrayList<>();
    }

    public void add(int num) {

        if(num == 0) {
            prefix.clear();
        } 
        else {
            int product = num;

            if(!prefix.isEmpty()) {
                product *= prefix.get(prefix.size() - 1);
            }

            prefix.add(product);
        }
    }

    public int getProduct(int k) {

        int n = prefix.size();

        if(k > n) {
            return 0;
        }

        if(k == n) {
            return prefix.get(n - 1);
        }

        return prefix.get(n - 1) / prefix.get(n - k - 1);
    }
}
