package arbolesbinarios;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ÁRBOL BINARIO DE BÚSQUEDA ===");
        
        // Ejercicio 1: Crear árbol A
        System.out.println("\n1. CREANDO ÁRBOL A: {10,43,24,-10,54,0,23,82,43}");
        ArbolBinarioBusqueda arbolA = crearArbolA();
        System.out.print("Recorrido inorden árbol A: ");
        arbolA.inorden();
        
        // Ejercicio 2: Crear árbol B
        System.out.println("\n2. CREANDO ÁRBOL B: {32,67,43,25,52,56,78,64,23,67}");
        ArbolBinarioBusqueda arbolB = crearArbolB();
        System.out.print("Recorrido inorden árbol B: ");
        arbolB.inorden();

        // Ejercicio 3: Crear árbol C
        System.out.println("\n3. CREANDO ÁRBOL C: {A,Y,E,F,G,X,W,U,Z,R,B}");
        ArbolBinarioBusqueda arbolC = crearArbolC();
        System.out.print("Recorrido inorden árbol C: ");
        arbolC.inorden();

        // Ejercicio 4: Búsquedas en árbol A
        System.out.println("\n4. BÚSQUEDAS EN ÁRBOL A:");
        buscarEnArbolA(arbolA);

        // Ejercicio 5: Búsquedas en árbol B
        System.out.println("\n5. BÚSQUEDAS EN ÁRBOL B:");
        buscarEnArbolB(arbolB);

        // Ejercicio 6: Búsquedas en árbol C
        System.out.println("\n6. BÚSQUEDAS EN ÁRBOL C:");
        buscarEnArbolC(arbolC);

        // Ejercicio 7: Adicionar claves al árbol A
        System.out.println("\n7. AÑADIENDO CLAVES AL ÁRBOL A: {-5,-3,22,44}");
        adicionarClavesA(arbolA);
        System.out.print("Árbol A después de adiciones: ");
        arbolA.inorden();

        // Ejercicio 8: Adicionar claves al árbol B
        System.out.println("\n8. AÑADIENDO CLAVES AL ÁRBOL B: {24,26,27}");
        adicionarClavesB(arbolB); // CORREGIDO: era "addcionarClavesB"
        System.out.print("Árbol B después de adiciones: ");
        arbolB.inorden();

        // Ejercicio 9: Adicionar claves al árbol C
        System.out.println("\n9. AÑADIENDO CLAVES AL ÁRBOL C: {L,M,N,O}");
        adicionarClavesC(arbolC);
        System.out.print("Árbol C después de adiciones: ");
        arbolC.inorden();

        // Ejercicio 10: Eliminar claves del árbol A
        System.out.println("\n10. ELIMINANDO CLAVES DEL ÁRBOL A: {10,54,82}");
        eliminarClavesA(arbolA);
        System.out.print("Árbol A después de eliminaciones: ");
        arbolA.inorden();
    }
    
    // Métodos auxiliares para crear árboles
    private static ArbolBinarioBusqueda crearArbolA() {
        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();
        int[] valoresA = {10, 43, 24, -10, 54, 0, 23, 82, 43};
        for (int valor : valoresA) {
            arbol.insertar(valor);
        }
        return arbol;
    }
    
    private static ArbolBinarioBusqueda crearArbolB() {
        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();
        int[] valoresB = {32, 67, 43, 25, 52, 56, 78, 64, 23, 67};
        for (int valor : valoresB) {
            arbol.insertar(valor);
        }
        return arbol;
    }
    
    private static ArbolBinarioBusqueda crearArbolC() {
        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();
        String[] valoresC = {"A", "Y", "E", "F", "G", "X", "W", "U", "Z", "R", "B"};
        for (String valor : valoresC) {
            arbol.insertar(valor);
        }
        return arbol;
    }
    
    // Métodos para búsquedas
    private static void buscarEnArbolA(ArbolBinarioBusqueda arbol) {
        int[] busquedas = {22, 0, 24, 23};
        
        for (int clave : busquedas) {
            System.out.print("Buscando " + clave + ": ");
            boolean encontrado = arbol.buscar(clave);
            System.out.println(" → " + (encontrado ? "ENCONTRADO" : "NO ENCONTRADO"));
        }
    }

    private static void buscarEnArbolB(ArbolBinarioBusqueda arbol) {
        int[] busquedas = {23, 24, 25};
        
        for (int clave : busquedas) {
            System.out.print("Buscando " + clave + ": ");
            boolean encontrado = arbol.buscar(clave);
            System.out.println(" → " + (encontrado ? "ENCONTRADO" : "NO ENCONTRADO"));
        }
    }

    private static void buscarEnArbolC(ArbolBinarioBusqueda arbol) {
        String[] busquedas = {"U", "V", "W"};
        
        for (String clave : busquedas) {
            System.out.print("Buscando " + clave + ": ");
            boolean encontrado = arbol.buscar(clave);
            System.out.println(" → " + (encontrado ? "ENCONTRADO" : "NO ENCONTRADO"));
        }
    }
    
    // Métodos para adicionar claves
    private static void adicionarClavesA(ArbolBinarioBusqueda arbol) {
        int[] nuevasClavesA = {-5, -3, 22, 44};
        for (int clave : nuevasClavesA) {
            arbol.insertar(clave);
        }
    }
    
    private static void adicionarClavesB(ArbolBinarioBusqueda arbol) { // CORREGIDO
        int[] nuevasClavesB = {24, 26, 27};
        for (int clave : nuevasClavesB) {
            arbol.insertar(clave);
        }
    }
    
    private static void adicionarClavesC(ArbolBinarioBusqueda arbol) {
        String[] nuevasClavesC = {"L", "M", "N", "O"};
        for (String clave : nuevasClavesC) {
            arbol.insertar(clave);
        }
    }
    
    // Método para eliminar claves
    private static void eliminarClavesA(ArbolBinarioBusqueda arbol) {
        int[] eliminarA = {10, 54, 82};
        for (int clave : eliminarA) {
            System.out.println("Eliminando " + clave + "...");
            arbol.eliminar(clave);
        }
    }
}