package snakeladder;

/**
 * Created by ashvinikumar on 25/11/16.
 */
import java.util.Scanner;

public class Dijkstra {

    static Scanner scan;

    public static void main(String[] args){

        int[] preD = new int[30];
        int min = 999, nextNode = 0;
        scan = new Scanner(System.in);
        int[] distance = new int[30];
        int[][] matrix = new int[30][30];
        int[] visited = new int[30];

        System.out.println("Enter the cost matrix");
        int lad[]=new int[30];
        for(int i=0;i<30;i++)
        {
            lad[i]=0;
        }
        lad[2]=21;
        lad[4]=7;
        lad[10]=lad[25];
        lad[19]=28;
        lad[16]=3;
        lad[18]=6;
        lad[20]=8;
        lad[26]=0;

        for(int i=0;i<30;i++)
        {
            for(int j=0;j<30;j++)
            {
                matrix[i][j]=999;
            }
        }

        for(int i = 0; i < distance.length; i++){

            visited[i] = 0;

            preD[i] = 0;

            for(int j = 0; j <=6 && i+j<30 ; j++){

                matrix[i][i+j] = 1;

                if(i==j){

                    matrix[i][j] = 999;

                }

            }

        }

        for(int i=0;i<30;i++)
        {
            if(lad[i]!=0)
            {
                int j=i;int k=1;
                while(j-k>=0 && k<=6)
                {
                    matrix[j-k][lad[i]]=1;
                    k++;
                }
            }
        }
        for(int i=0;i<30;i++)
        {
            for(int j=0;j<30;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }


        distance = matrix[0];
        visited[0] = 1;
        distance[0] = 0;

        for(int counter = 0; counter < 30; counter++){

            min = 999;

            for(int i = 0; i < 30; i++){

                if(min > matrix[0][i] && visited[i]!=1){

                    min = matrix[0][i];
                    nextNode = i;

                }

            }

            visited[nextNode] = 1;

            for(int c = 0; c < 30; c++){

                if(visited[c]!=1){

                    if(min+matrix[nextNode][c] < matrix[0][c]){

                        matrix[0][c]= min+matrix[nextNode][c];
                        preD[c] = nextNode;


                    }

                }

            }

        }

        System.out.println("|");

        int j;
        for(int i = 0; i < 30; i++){

            if(i!=0){

                System.out.print("Path = " + i);
                j = i;
                do{

                    j=preD[j];
                    System.out.print(" <- " + j);

                }while(j!=0);

            }

            System.out.println();

        }
        for(int i=0;i<30;i++)
        {
            System.out.print(" "+matrix[0][i]);
        }
        System.out.println();
    }

}
