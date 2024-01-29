import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        printSquare(10);
        System.out.println("--------");
        printSquare(20);
        System.out.println("------------");
        printTriangule(6);
        System.out.println("------------");
        printTriangule(4);


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
    public static void printTriangule(int base){
        for (int i = 0; i <= base - 1; i++) {
            //for that print height
            for (int j = 1; j <= i +1; j++) {
                System.out.print(" * ");
            }

            System.out.print("\n");
        }
    }
}