class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> valid = new HashMap<>();
        Stack<Character> openPara = new Stack<>();

        valid.put(')', '(');
        valid.put('}', '{');
        valid.put(']', '[');

        //pushing open bracket inside stack
        for(char ch : s.toCharArray()){
            //closed bracket - pop open braces from stack
            if(valid.containsKey(ch)){
                if(!openPara.isEmpty() && openPara.peek() == valid.get(ch)){
                    openPara.pop();
                }
                else{
                    return false;
                }
            }
            //open bracket
            else{
                openPara.push(ch);
            }
        }
        return openPara.isEmpty();
    }
}