package arbolesbinarios;

public class ArbolBinarioBusqueda {
    Nodo raiz;

    public ArbolBinarioBusqueda() {
        raiz = null;
    }

    // Insertar para valores numéricos
    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private Nodo insertarRec(Nodo raiz, int valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }

        if (valor < raiz.valor)
            raiz.izquierdo = insertarRec(raiz.izquierdo, valor);
        else if (valor > raiz.valor)
            raiz.derecho = insertarRec(raiz.derecho, valor);

        return raiz;
    }

    // Insertar para valores String
    public void insertar(String valor) {
        raiz = insertarRec(raiz, valor);
    }

    private Nodo insertarRec(Nodo raiz, String valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }

        if (valor.compareTo(raiz.valorStr) < 0)
            raiz.izquierdo = insertarRec(raiz.izquierdo, valor);
        else if (valor.compareTo(raiz.valorStr) > 0)
            raiz.derecho = insertarRec(raiz.derecho, valor);

        return raiz;
    }

    // Buscar para valores numéricos
    public boolean buscar(int valor) {
        return buscarRec(raiz, valor);
    }

    private boolean buscarRec(Nodo raiz, int valor) {
        if (raiz == null)
            return false;

        System.out.print(raiz + " → ");

        if (raiz.valorStr == null && raiz.valor == valor)
            return true;

        if (valor < raiz.valor)
            return buscarRec(raiz.izquierdo, valor);
        else
            return buscarRec(raiz.derecho, valor);
    }

    // Buscar para valores String
    public boolean buscar(String valor) {
        return buscarRec(raiz, valor);
    }

    private boolean buscarRec(Nodo raiz, String valor) {
        if (raiz == null)
            return false;

        System.out.print(raiz + " → ");

        if (raiz.valorStr != null && raiz.valorStr.equals(valor))
            return true;

        if (valor.compareTo(raiz.valorStr) < 0)
            return buscarRec(raiz.izquierdo, valor);
        else
            return buscarRec(raiz.derecho, valor);
    }

    // Eliminar para valores numéricos
    public void eliminar(int valor) {
        raiz = eliminarRec(raiz, valor);
    }

    private Nodo eliminarRec(Nodo raiz, int valor) {
        if (raiz == null) return raiz;

        if (valor < raiz.valor)
            raiz.izquierdo = eliminarRec(raiz.izquierdo, valor);
        else if (valor > raiz.valor)
            raiz.derecho = eliminarRec(raiz.derecho, valor);
        else {
            // Nodo con un solo hijo o sin hijos
            if (raiz.izquierdo == null)
                return raiz.derecho;
            else if (raiz.derecho == null)
                return raiz.izquierdo;

            // Nodo con dos hijos: obtener el sucesor inorden
            raiz.valor = minValor(raiz.derecho);

            // Eliminar el sucesor inorden
            raiz.derecho = eliminarRec(raiz.derecho, raiz.valor);
        }
        return raiz;
    }

    private int minValor(Nodo raiz) {
        int minv = raiz.valor;
        while (raiz.izquierdo != null) {
            minv = raiz.izquierdo.valor;
            raiz = raiz.izquierdo;
        }
        return minv;
    }

    // Recorrido inorden
    public void inorden() {
        inordenRec(raiz);
        System.out.println();
    }

    private void inordenRec(Nodo raiz) {
        if (raiz != null) {
            inordenRec(raiz.izquierdo);
            System.out.print(raiz + " ");
            inordenRec(raiz.derecho);
        }
    }
    
    // Método para mostrar el árbol de forma gráfica (opcional)
    public void mostrarArbol() {
        mostrarArbolRec(raiz, 0);
    }
    
    private void mostrarArbolRec(Nodo raiz, int nivel) {
        if (raiz != null) {
            mostrarArbolRec(raiz.derecho, nivel + 1);
            for (int i = 0; i < nivel; i++) {
                System.out.print("    ");
            }
            System.out.println(raiz);
            mostrarArbolRec(raiz.izquierdo, nivel + 1);
        }
    }
}