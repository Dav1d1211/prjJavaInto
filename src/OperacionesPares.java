

public class OperacionesPares {
    private int a, b;

    public OperacionesPares(int a, int b){
        if((a%2!=0) || (b%2!=0))
        {
            this.a = 0;
            this.b = 0;
        }else{
            this.a = a;
            this.b = b;
        }
        
        
        System.out.println("Operaciones a trabajar.....  ");
    }

    public void Division() {
        int c;
        if (b>0){
             c= a/b;
            System.out.println("La division es: "+c);
        }else {
            System.out.println("La divisiòn es imposible");
        }
    }

    public void Multiplicacion() {
            int c;
            c= a*b;
            System.out.println("El producto es: "+c);
        }

    public void Resta() {
            int c;
            c= a-b;
            System.out.println("La resta es: "+c);
        }
    
    /**
     * Suma de numeros enteros
     */
    public void Suma() {
            int c;
            c = a+b;
            System.out.println("La suma es: "+c);
        } 
}
