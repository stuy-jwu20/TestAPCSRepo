public class Demo {
  public static void main (String[] args) {
    int value;
    if (args.length == 0) {
      value = 5;
    } else {
      value = Integer.parseInt(args[0]);
    }
    printLoop(value);
  }

  public static void printLoop(int n){
    for(int i = 1; i <= n; i++) {
      for(int j = i-1; j < n; j++) {
         System.out.print(i);
      }
      System.out.println("");
    }
  }

}
