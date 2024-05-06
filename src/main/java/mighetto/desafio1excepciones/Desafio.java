
package mighetto.desafio1excepciones;

public class Desafio {
    
    public int dividir(int a,int b){
        try {
        return a/b;
        } catch (ArithmeticException e) {
            return 0;
        }
    }
}
