package math;

public class MakePyramid {
    public static void main(String[] args) {

        //   Implement a large Pyramid of stars in the screen with java.
        //
        //                    *
        //                   * *
        //                  * * *
        //                 * * * *
        //                * * * * *
        //               * * * * * *
        for (int x= 0;x<6;x++) { //for my rows

            for (int y = 5; y>= x; y--) {//for spaces
                System.out.print(" ");
            }
            for (int z = 0; z <=x; z++) {//for stars *
                System.out.print("* ");
            }
            System.out.println("");

        }
        /*for (int i =6; i <=12; i++ ){
            for(int j = 0; j<=6;j++ ){
                System.out.print("* ");
            }
            System.out.println("")
        }*/
        }


  }
