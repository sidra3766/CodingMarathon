class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Integer[] pricenums = new Integer[prices.length];
        Integer[] discountnums = new Integer[discounts.length];
        
        for(int i=0;i<prices.length;i++){
            pricenums[i]=prices[i];
        }
        for(int i=0;i<discounts.length;i++){
            discountnums[i]=discounts[i];
        }

        Arrays.sort(pricenums,Collections.reverseOrder());
        Arrays.sort(discountnums,Collections.reverseOrder());

        double total = 0;
        int price_length = prices.length;
        int discount_length = discounts.length;

        for(int i=0;i<Math.min(price_length,discount_length);i++){
            double price = pricenums[i];
            double discount = discountnums[i];

            total = total+((price * (100 - discount))/100);
        }
        if(price_length>discount_length){
            for(int i=discount_length;i<price_length;i++){
                total=total+pricenums[i];
            }
        }
        return total;


    }
}
