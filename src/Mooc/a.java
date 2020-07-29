package Mooc;

public class a {
  public static void main(String[] args) {
    //        int number = Integer.parseInt(args[0]);
    //        int o =1;
    //        boolean tag=true;
    //        for (int i=0;i<number;i++){
    //
    //            for (int u=0;u<o;u++){
    //                System.out.print("*");
    //            }
    //
    //            if ((o < number) && tag){
    //                o+=2;
    //            }else {
    //                tag = false;
    //                o-=2;
    //            }
    //            System.out.println();

    int n = Integer.parseInt(args[0]);
    for (int i = 0; i < n; i++) {
      // 5/2-0=2-0=2
      // 5/2-1=2-1=1
      // 5/2-2=2-2=0
      // 5/2-3=2-3=-1
      // 5/2-4=2-4=-2
      for (int kongge = Math.abs(n / 2 - i); kongge > 0; kongge--) {
        System.out.print(" ");
      }
      // 5-2*2=1
      // 5-2*1=3
      for (int xingxing = n - 2 * Math.abs(n / 2 - i); xingxing > 0; xingxing--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
