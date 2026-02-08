
public class Main {
    public static void main(String[] args) {
int n=4;
int m=1;
        for(int i=1;i<=5;i++){
            for (int j=1;j<=n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=m;k++){
                System.out.print("*");
            }
            n--;
            m++;
            System.out.println( );
        }

    }
}