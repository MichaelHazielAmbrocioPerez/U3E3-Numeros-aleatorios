package u3e3;

public class ClasePila {
 NodoPila cima;
    int tamaño;

    public ClasePila() {
        this.cima = null;
        this.tamaño = 0;
    }

    public boolean EstaVacia() {
        return cima == null;
    }

    public void Agregar(int d) {
        NodoPila nuevo = new NodoPila(d);
        nuevo.siguiente = cima;
        cima = nuevo;
        tamaño++;
    }

    public int Quitar() {
        int aux = cima.dato;
        cima = cima.siguiente;
        tamaño--;
        return aux;
    }

    public int Cima() {
        return cima.dato;
    }

    public int Tamanio() {
        return tamaño;
    }

    public void MostrarPila() {
        NodoPila aux = cima;
        while (aux != null) {
            System.out.println("[" + aux.dato + "]");
            aux = aux.siguiente;
        }
        System.out.println("");
    }

    public void NumerosRandom() {
        for (int i = 0; i < 10; i++) {
            int ram = ((int) Math.random() * 500 + 50);
            Agregar(ram);
        }
    }
}    
