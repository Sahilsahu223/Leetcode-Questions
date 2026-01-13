class Solution {
    public String countAndSay(int n) {
        String val = "1";
        for (int i = 0; i < n - 1; i++) {
            StringBuilder sb = new StringBuilder();
        
            int count = 1;
            
            for (int j = 0; j < val.length(); j++) {
                if (j == val.length() - 1 || val.charAt(j) != val.charAt(j + 1)) {
                    sb.append(count);
                    sb.append(val.charAt(j));
                    
                                 count = 1;
                } else {
             
                    count++;
                }
            }
            val = sb.toString();
        }

        return val;
    }
}