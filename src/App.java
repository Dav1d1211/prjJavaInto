import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int a=0, b=0, c=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese valores pares para a y b: ");
        a = sc.nextInt();
        b = sc.nextInt();

       

        OperacionesPares o = new OperacionesPares(a, b);
        o.Suma();
        o.Resta();
        o.Multiplicacion();
        o.Division();
        sc.close();       
    }

}
