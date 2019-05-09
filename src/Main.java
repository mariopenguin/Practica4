public class Main {
    public static void main(String[] args) {
        GramETSISI gramETSISI = new GramETSISI(7);

        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();
        Persona p5 = new Persona();

        p1.setNombre("a");p2.setNombre("b");p3.setNombre("c");p4.setNombre("d");p5.setNombre("e");

        gramETSISI.insertaVertice(p1);
        gramETSISI.insertaVertice(p2);
        gramETSISI.insertaVertice(p3);
        gramETSISI.insertaVertice(p4);
        gramETSISI.insertaVertice(p5);
        gramETSISI.insertaArista(1,2);
        gramETSISI.insertaArista(1,3);
        //gramETSISI.insertaArista(1,4);
        gramETSISI.insertaArista(3,4);
        gramETSISI.insertaArista(4,1);
        gramETSISI.insertaArista(2,4);
        gramETSISI.insertaArista(2,3);
        gramETSISI.insertaArista(2,4);
        //gramETSISI.insertaArista(2,5);
        //gramETSISI.imprimirGrafo();
        //gramETSISI.mostrarAmigos("b");
        gramETSISI.mayorGrupo();
        System.out.println("Numero de grupos: "+gramETSISI.contarGrupos());
    }
}
