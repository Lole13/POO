

package mighetto.desafio1excepciones;

public class Desafio1Excepciones {
    
    public static void main(String[] args) {
        
        Desafio desafio = new Desafio();
        
        //  Realizar pruebas con diferentes valores para “a” y “b”
        
        System.out.println(desafio.dividir(4,2));
        System.out.println(desafio.dividir(6,3));
        System.out.println(desafio.dividir(128,64));
        
        
        
        System.out.println(desafio.dividir(4,0));
        
        
    }

}
