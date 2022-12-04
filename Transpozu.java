import java.util.Arrays;
public class Transpozu {
    public static void main(String[] args) {

            int[][] matris={{1,2,3,4},{5,6,7,8,9}};
            int[][] transpoz=new int[4][3];

            System.out.println("Matrisi : ");
            for (int[] row:matris){
                for (int col:row){
                    System.out.print(col +" ");
                }
                System.out.println();
                System.out.println();
            }


            for (int i = 0; i < transpoz.length ; i++) {
                for (int j = 0; j < matris.length ; j++) {
                    transpoz[i][j]=matris[j][i];
                }
            }


            System.out.println("Transpozu : ");
            for (int[] row:transpoz){
                for (int col:row){
                    System.out.print(col +" ");
                }
                System.out.println();
            }
    }
}