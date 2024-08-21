public class Quadrado extends FiguraUmaUnidade implements Funcoes{

    //Construtores
    public Quadrado() {

    }

    public Quadrado(Integer unidade) {
        super(unidade);
    }

    //Métodos
    @Override
    public void imprimir() {
        for(int i = 1; i <= this.getUnidade(); i++) {
            for(int j = 1; j <= this.getUnidade(); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
