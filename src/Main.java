public class Main {
    public static void main(String[] args) {


        //El resto de metodos de las clases persona son utilizados en la de GramEtsisi, por lo  que su funcionamiento
        //queda demostrado con el uso de la misma.
        //Creamos el grupo con los objetos persona
        GramETSISI gramETSISI = new GramETSISI(20);
        Persona p0 = new Persona("Juan","Albufera","123456");
        Persona p1 = new Persona("Jose","Princesa","231465");
        Persona p2 = new Persona("Eva","Gaztambide","321654");
        Persona p3 = new Persona("Alicia","Castellana","789654");
        Persona p4 = new Persona("Ernesto","Arboleda","654321");
        Persona p5 = new Persona("Guillermo","Arapiles","159267");
        Persona p6 = new Persona("Alberto","Gaztambide","511421");
        Persona p7 = new Persona("Lucas","Princesa","231465");
        Persona p8 = new Persona("Clara","Castellana","789456");
        Persona p9 = new Persona("Mario", "Fustes", "124124");
        Persona p10 = new Persona("Juanjo", "Fustes", "124124");

        //Añadimos los objetos personas al grafo
        gramETSISI.insertaVertice(p0);
        gramETSISI.insertaVertice(p1);
        gramETSISI.insertaVertice(p2);
        gramETSISI.insertaVertice(p3);
        gramETSISI.insertaVertice(p4);
        gramETSISI.insertaVertice(p5);
        gramETSISI.insertaVertice(p6);
        gramETSISI.insertaVertice(p7);
        gramETSISI.insertaVertice(p8);
        gramETSISI.insertaVertice(p9);


        //Insertamos aristas entre los vertices del grafo
        gramETSISI.insertaArista(0,1);
        gramETSISI.insertaArista(0,4);
        gramETSISI.insertaArista(0,5);
        gramETSISI.insertaArista(1,4);
        gramETSISI.insertaArista(4,5);
        gramETSISI.insertaArista(2,9);
        gramETSISI.insertaArista(2,7);
        gramETSISI.insertaArista(9,7);
        gramETSISI.insertaArista(3,6);
        gramETSISI.insertaArista(6,8);


        //Probamos los métodos pedidos.
        System.out.println("\n  ---Imprimimos el grafo completo---");
        gramETSISI.imprimirGrafo();
        System.out.println("\n ---Contamos los grupos que existen en el grafo---");
        System.out.println("Numero de grupos: "+gramETSISI.contarGrupos());
        System.out.println("---Mostramos los amigos de Juan---");
        gramETSISI.mostrarAmigos("Eva");
        System.out.println("---Mostramos el mayor grupo---");
        gramETSISI.mayorGrupo();
        //System.out.println("Numero de grupos "+gramETSISI.contarGrupos());
    }
}
