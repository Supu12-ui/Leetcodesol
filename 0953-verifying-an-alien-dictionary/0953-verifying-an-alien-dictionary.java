class Solution {
    public boolean isAlienSorted(String[] W, String order1) {
        Map<Character,Integer> order = new HashMap<>();
        for (int i = 0; i < order1.length(); i++)
            order.put(order1.charAt(i), i);
        for (int i = 1; i < W.length; i++) {
            String a = W[i-1];
            String b = W[i];
            for (int j = 0; j < a.length(); j++) {
                if (j == b.length()){
                    return false;
                }
                char cha = a.charAt(j);
                char chb = b.charAt(j);
                if (order.get(cha) < order.get(chb)){
                    break;
                }
                if (order.get(cha) > order.get(chb)){
                    return false;
                }
            }
        }
        return true;
    }
}