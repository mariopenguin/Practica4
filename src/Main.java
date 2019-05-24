public class Main {
    public static void main(String[] args) {
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
        //gramETSISI.insertaArista(1,4);

        //gramETSISI.insertaArista(2,5);
        //gramETSISI.imprimirGrafo();
        //gramETSISI.mostrarAmigos("b");
        //System.out.println("---Mayor Grupo---");
        gramETSISI.mayorGrupo();
        //System.out.println("Numero de grupos: "+gramETSISI.contarGrupos());
        //gramETSISI.imprimirGrafo();
       // gramETSISI.mostrarAmigos("Mario");

        //System.out.println("Numero de grupos "+gramETSISI.contarGrupos());
    }
}
