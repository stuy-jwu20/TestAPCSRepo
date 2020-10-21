public class Demo {
  public static void main (String[] args) {
    int value;
    if (args.length == 0) {
      value = 5;
    } else {
      value = Integer.parseInt(args[0]);
    }
    printLoop(value);
    int []arrayOne = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    System.out.println(arrToString(arrayOne));
  }


  public static void printLoop(int n){
    for(int i = 1; i <= n; i++) {
      for(int j = i-1; j < n; j++) {
         System.out.print(i);
      }
      System.out.println("");
    }
  }

  public static String arrToString(int[] arr){
    String aString = "{";
    for (int i = 0; i < arr.length; i++) {
      if (i == 0) {
        aString += arr[i];
      } else {
        aString += ", " + arr[i];
  }
    }
    aString += "}";
    return aString;
  }
}
