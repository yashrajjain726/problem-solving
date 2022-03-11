class Solution {
    public int[] sortArrayByParity(int[] arr) {
         Queue<Integer> incq= new LinkedList<>();
        Queue<Integer> decq= new LinkedList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                incq.add(arr[i]);
            }
            else{
                decq.add(arr[i]);
            }
        }
         System.out.println(incq);
        System.out.println(decq);
        int j=0;
        while(!incq.isEmpty())
        {
            arr[j]= incq.poll();
            j++;
        }
        while(!decq.isEmpty())
        {
            arr[j] = decq.poll();
            j++;
        }
        
        return arr;
    }
}