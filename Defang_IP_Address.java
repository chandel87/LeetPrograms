/*
    https://leetcode.com/problems/defanging-an-ip-address/
    Given a valid (IPv4) IP address, return a defanged version of that IP address.
    A defanged IP address replaces every period "." with "[.]".

    Example 1:
    Input: address = "1.1.1.1"
    Output: "1[.]1[.]1[.]1"
*/

class Solution {
    public String defangIPaddr(String address) {
        
        // solution 1
        //return address.replace(".", "[.]"); 
        String[] strs = address.split("\\.");

        // solution 2
        String temp = "";
        for(String str : strs){
            temp = temp.concat(str.concat("[.]"));
        }
        return temp.substring(0, temp.length()-3);
        
    }
}