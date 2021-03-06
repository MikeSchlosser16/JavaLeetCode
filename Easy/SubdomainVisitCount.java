/*A website domain like "discuss.leetcode.com" consists of various subdomains. At the top level, we have "com", at the next level, we have "leetcode.com", and at the lowest level, "discuss.leetcode.com". When we visit a domain like "discuss.leetcode.com", we will also visit the parent domains "leetcode.com" and "com" implicitly.
Now, call a "count-paired domain" to be a count (representing the number of visits this domain received), followed by a space, followed by the address. An example of a count-paired domain might be "9001 discuss.leetcode.com".
We are given a list cpdomains of count-paired domains. We would like a list of count-paired domains, (in the same format as the input, and in any order), that explicitly counts the number of visits to each subdomain.
Example 2:
Input:
["900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"]
Output:
["901 mail.com","50 yahoo.com","900 google.mail.com","5 wiki.org","5 org","1 intel.mail.com","951 com"]
Explanation:
We will visit "google.mail.com" 900 times, "yahoo.com" 50 times, "intel.mail.com" once and "wiki.org" 5 times. For the subdomains, we will visit "mail.com" 900 + 1 = 901 times, "com" 900 + 50 + 1 = 951 times, and "org" 5 times. */

class Solution {
      public List<String> subdomainVisits(String[] cpdomains) {

        Map<String, Integer> map = new HashMap();

        for(String str : cpdomains){
            // Get Number value
            String[] line = str.split(" ");
            int count = Integer.valueOf(line[0]);

            // Split on . to get each subdomain
            String[] domains = line[1].split("\\.");

            String temp = "";
            for(int i = domains.length - 1;i >= 0;i--){
                // Makes it so we get 'built up values', built backwards
                temp = domains[i] + (temp.equals("") ? temp : "." + temp);
                if(!map.containsKey(temp)){
                    map.put(temp, count);
                }else{
                    map.put(temp, map.get(temp) + count);
                }
            }
        }
        // Need to return list so just formatting correctly
        List<String> res = new ArrayList();
        for(String str : map.keySet()){
            res.add(map.get(str) + " " + str);
        }

        return res;
    }
}
