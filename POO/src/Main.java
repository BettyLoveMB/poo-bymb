import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        printSquare(10);
        System.out.println("--------");
        printSquare(20);

    }

    public static void printSquare(int lenght) {
        for (int i = 1; i <= lenght; i++) {
            //for taht print height
            for (int j = 1; j <= lenght; j++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }


    }
}