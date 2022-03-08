class Solution {
    public double average(int[] salary) {
        int count = salary.length -2;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double totalSal = 0d;
        for(int i=0;i<salary.length;i++)
        {
            if(salary[i]>max) max = salary[i];
            if(salary[i]<min) min = salary[i];
            totalSal += salary[i];
        }
        totalSal = totalSal - max - min ;
        return totalSal/count;
    }
}