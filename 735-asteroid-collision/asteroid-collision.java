class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        Stack<Integer> stk=new Stack<>();
        for(int a:asteroids){
            while(!stk.isEmpty()&& a<0&& stk.peek()>0){
                int diff=a+stk.peek();
                if (diff<0){
                    stk.pop();
                }
                else if(diff>0){
                    a=0;
                }
                else{
                    a=0;
                    stk.pop();
                }
            }
            if(a!=0){
                stk.push(a);
            }
        }
         int[] result=new int[stk.size()];
            for(int i=0;i<stk.size();i++){
                result[i]=stk.get(i);
            }

            return result;
    }
}