public class GramETSISI {
    private int maxNodos;             // Tamaño máximo de la tabla.
    private int numVertices;          // Número de vértices.
    private boolean matrizAdy[][];    // Matriz de adyacencias del grafo.
    private Persona contactos[];


    public GramETSISI(int n) { //construye una matriz de nxn sin arcos
        maxNodos = n;
        numVertices = 0;
        matrizAdy = new boolean[n][n];
        contactos = new Persona[n];
    }

    public int getMaxNodos() {
        return maxNodos;
    }

    public int getNumVertices() {
        return numVertices;
    }

    // ------------------------------------

    // MÉTODOS PARA INSERTAR Y ELIMINAR VERTICES

    // ------------------------------------


    public void insertaVertice() {
        if (maxNodos == numVertices)
            System.out.println("Error, se supera el número de nodos máximo del grafo");
        else {
            for (int i = 0; i <= numVertices; i++) {
                //simplemento añado el valor false a las celdas
                matrizAdy[i][numVertices] = matrizAdy[numVertices][i] = false;
            }
            Persona nuevo = new Persona();
            nuevo.leerDatos();
            contactos[numVertices] = nuevo;
            numVertices++;
        }
    }

    public void insertaVertice(Persona a) {
        if (maxNodos == numVertices)
            System.out.println("Error, se supera el número de nodos máximo del grafo");
        else {
            for (int i = 0; i <= numVertices; i++) {
                matrizAdy[i][numVertices] = matrizAdy[numVertices][i] = false;
            }
            contactos[numVertices] = a;
            numVertices++;
        }
    }

    public void eliminarVertice(int v) {
        if (v < numVertices && v >= 0) {
            numVertices--;
            int i;
            for (i = 0; i < v; i++) {
                for (int j = v; j < numVertices; j++) {
                    matrizAdy[i][j] = matrizAdy[i][j + 1];
                }
            }
            for (i = v; i < numVertices; i++) {
                contactos[i] = contactos[i + 1];
                int j;
                for (j = 0; j < v; j++) {
                    matrizAdy[i][j] = matrizAdy[i + 1][j];
                }
                for (j = v; j < numVertices; j++) {
                    matrizAdy[i][j] = matrizAdy[i + 1][j + 1];
                }
            }
        } else System.out.println("Error, fuera de rango");
    }

    // ------------------------------------

    // MÉTODOS PARA INSERTAR Y ELIMINAR ARISTAS

    // ------------------------------------

    public void insertaArista(int i, int j) {
        if ((i >= numVertices) || (j >= numVertices))
            System.out.println("Error, los vertices no se encuentran en el grafo.");
        else {
            matrizAdy[i][j] = true;
            matrizAdy[j][i] = matrizAdy[i][j];
        }
    }

    public boolean existeArista(int i, int j) {
        if ((i >= numVertices) || (j >= numVertices)) {
            System.out.println("Error, los vertices no se encuentran en el grafo.");
            return false;
        }
        return matrizAdy[i][j];
    }


    public void mostrarAmigos(String nombre){
        boolean encontrado = false;
        int i =0;
        while (!encontrado && i<numVertices){
            if (contactos[i].getNombre().equalsIgnoreCase(nombre)){
                System.out.println("Nombre encontrado, ahora mostramos a sus amigos");
                encontrado=true;
                for (int j = 0; j < numVertices; j++) {
                    if (matrizAdy[i][j]==true){
                        contactos[j].mostrarPersona();
                    }
                }
            }
            i++;
        }
        if (encontrado==false){
            System.out.println("Nombre no encontrado");
        }

    }

    public void mayorGrupo(){
        int numeroMejorGrupo;
        String nombreMejorGrupo="";
        numeroMejorGrupo=0;
        for (int i = 0; i < numVertices; i++) {
            int contador = 0;
            for (int j = 0; j < numVertices; j++) {
                if (matrizAdy[i][j]){
                    contador++;
                }
            }
            if (contador>numeroMejorGrupo){
                numeroMejorGrupo=contador;
                nombreMejorGrupo=contactos[i].getNombre();
            }
        }
        mostrarAmigos(nombreMejorGrupo);
        //Una vez que hemos recorrido toda la array,
    }

    public int contarGrupos(){
        int numGrupos=0;
        for (int i = 0; i < numVertices; i++) {
            boolean tieneamigos= false;
            int j=0;
            while (!tieneamigos&& j<numVertices){
                if (matrizAdy[i][j]){
                    tieneamigos=true;
                }
                j++;
            }
            if (tieneamigos){}
            numGrupos++;
        }
        return numGrupos;
    }

    public void imprimirGrafo() {
        System.out.println("Contenido de la matriz: ");
        System.out.println("Existen: "+this.numVertices+" contactos");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                if (matrizAdy[i][j]) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
        }
        for (int i = 0; i < numVertices; i++) {
            contactos[i].mostrarPersona();
        }
    }
}
	  




