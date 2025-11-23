package arbolesbinarios;

public class Nodo {
    int valor;
    String valorStr;
    Nodo izquierdo, derecho;

    // Constructor para valores numéricos
    public Nodo(int item) {
        valor = item;
        izquierdo = derecho = null;
    }

    // Constructor para valores String
    public Nodo(String item) {
        valorStr = item;
        izquierdo = derecho = null;
    }
    
    // Método para mostrar el nodo
    @Override
    public String toString() {
        if (valorStr == null) {
            return String.valueOf(valor);
        } else {
            return valorStr;
        }
    }
}