class Solution {
    public String removeStars(String s) {
        Stack<Character> st= new Stack<>();

        for(char temp: s.toCharArray()){
            if(!st.empty() && temp=='*'){
                st.pop();
            }
            else{
                if(temp !='*') st.push(temp);
            }
        }

        StringBuilder result= new StringBuilder();
        while(!st.empty()){
            result.append(st.pop());
        }

        return result.reverse().toString();
    }
}