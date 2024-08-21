public class Triangulo extends FiguraUmaUnidade implements Funcoes {

    //Construtores
    public Triangulo(Integer unidade) {
        super(unidade);
    }

    @Override
    public void imprimir() {

        for(int i = 1; i <= this.getUnidade(); i++) {
            for(int j = 0; j < i; j++) {
               System.out.print("*");
            }
            System.out.println();
        }
    }

}
