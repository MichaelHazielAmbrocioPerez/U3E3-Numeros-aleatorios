package u3e3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
       Scanner V = new Scanner(System.in);
       ClasePila pila = new ClasePila();
    
       boolean salir = false;
       int dato;
    
    do {
        salir = false;
        System.out.println(
                "Metodo de una pila"
                + "\n[1]Insertar"
                + "\n[2]Eliminar"
                + "\n[3]Mostrar cima"
                + "\n[4]Generar numeros random"
                + "\n[5]Mostrar si la pila esta vacia"
                + "\n[6]Mostrar pila"
                + "\n[7]Mostrar tamaño de la pila"
                + "\n[8]Salir");
        
        int opc = V.nextInt();
        
        switch (opc) {
            case 1:
                System.out.println("Ingrese un numero");
                dato = V.nextInt();
                pila.Agregar(dato);
                break;
                
            case 2:
                if (!pila.EstaVacia()) {
                    System.out.println("Numero elimidado: " + pila.Quitar());
                } else {
                    System.out.println("La pila esta vacia");
                }
                break;
                
            case 3:
                if (!pila.EstaVacia()) {
                    System.out.println("Ultimo numero agregado: " + pila.Cima());
                } else {
                    System.out.println("La pila esta vacia");
                }
                break;
                
            case 4:
                pila.NumerosRandom();
                System.out.println("Numeros random generados");
                break;
                
            case 5:
                if (pila.EstaVacia()) {
                    System.out.println("La pila esta vacia");
                } else {
                    System.out.println("La pila tiene " + pila.Tamanio());
                }
                break;
                
            case 6:
                if (!pila.EstaVacia()) {
                    pila.MostrarPila();
                } else {
                    System.out.println("La pila esta vacia");
                }
                break;
                
            case 7:
                System.out.println("Tamaño de la pila: " + pila.Tamanio());
                break;
                
            case 8:
                salir = true;
                break;
                
            default:
                System.out.println("Opcion no valida");
                break;
        }
        System.out.println("");
    } while (!salir);
}
}
