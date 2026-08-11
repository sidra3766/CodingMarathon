class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
           
    }
    private String build(String str){
        Deque<Character> stack = new ArrayDeque<>();
        
        for(char c : str.toCharArray()){
            if(c != '#'){
                stack.push(c);
            }else if(!stack.isEmpty()){
                stack.pop();
            }
        }
        return String.valueOf(stack);
    }
}
