class Solution {
    public boolean isValid(String s) {
        Stack<Character> para = new Stack<>();
        Map<Character, Character> valid = new HashMap<>();
        valid.put(')', '(');
        valid.put('}', '{');
        valid.put(']', '[');

        for(char ch : s.toCharArray()){
            if(valid.containsKey(ch)){
                if(!para.isEmpty() && para.peek()==valid.get(ch)){
                    para.pop();
                }
                else{
                    return false;
                }
            }
            else {
                para.push(ch);
            }
        }
        return para.isEmpty();
    }
}
