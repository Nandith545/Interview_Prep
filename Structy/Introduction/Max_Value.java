class Source {
  public static double maxValue(double[] numbers) {
    double max = Integer.MIN_VALUE;

    for(int i=0; i< numbers.length; i++){
      if(numbers[i] > max){
        max = numbers[i];
      }
    }
    return max;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function, but should not remove it
  }
}

/*
    n = length of array
    Time: O(n)
    Space: O(1)
 */

