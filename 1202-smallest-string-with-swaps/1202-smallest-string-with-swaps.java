class Solution {
     public void dfs(List<List<Integer>> adj,int n,String s,
                     Queue<Integer> iq,Queue<Character> cq,boolean[] v)
     {
        v[n]=true;
        cq.offer(s.charAt(n));
        iq.offer(n);
        for(int nei:adj.get(n)){
            if(!v[nei]){
                dfs(adj,nei,s,iq,cq,v);
            }
        }
    }
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            adj.add(new ArrayList<>());
        }
        for(List<Integer> p:pairs){
            adj.get(p.get(0)).add(p.get(1));
            adj.get(p.get(1)).add(p.get(0));
        }
        boolean[] v=new boolean[s.length()];
        char[] ch=new char[s.length()];
        for(int i=0;i<s.length();i++){
            if(!v[i]){
                Queue<Character> cq=new PriorityQueue<>();
                Queue<Integer> iq=new PriorityQueue<>();
                dfs(adj,i,s,iq,cq,v);
                while(!cq.isEmpty()){
                    ch[iq.poll()]=cq.poll();
                }
            }
        }
        return new String(ch);
    }
}