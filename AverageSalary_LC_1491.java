class Solution {
    public double average(int[] salary) {
        double average = 0.00;
        Arrays.sort(salary);
        double sum = 0.00;

        for(int i=1; i<salary.length -1; i++){
            sum += salary[i];
        }
        average = sum/(salary.length - 2);
        return average;
    }
}
