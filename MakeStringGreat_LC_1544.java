class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()){
            if(!stack.isEmpty() && Math.abs(stack.peek()-c) == 32){
                stack.pop(); //cancel out the pair
            }else {
                stack.push(c);
            }
        }
        //Build result from stack
        StringBuilder result = new StringBuilder();
        for(char c: stack){
            result.append(c);
        }
        return result.toString();
    }
}
