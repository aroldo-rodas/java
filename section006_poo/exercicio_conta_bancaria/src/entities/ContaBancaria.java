package entities;

    public class ContaBancaria {
        private int numeroConta;
        private String nomeConta;
        private double saldoConta;

        //Construtor
        public ContaBancaria(int numeroConta, String nomeConta) {
            this.numeroConta = numeroConta;
            this.nomeConta = nomeConta;
        }

        public ContaBancaria(int numeroConta, String nomeConta, double depositoConta) {
            this.numeroConta = numeroConta;
            this.nomeConta = nomeConta;
            this.realizarDeposito(depositoConta);
        }

        //Getters e Setters
        public int getNumeroConta() {
            return numeroConta;
        }
        
        public String getNomeConta() {
            return nomeConta;
        }

        public void setNomeConta(String nomeConta) {
            this.nomeConta = nomeConta;
        }

        public double getSaldoConta() {
            return saldoConta;
        }

        //Métodos de operações
        public void realizarDeposito(double valor) {
            this.saldoConta += valor;
        }

        public void realizarSaque(double valor) {
            if(this.getSaldoConta() <= 0.0) {
                System.out.println("Não é possível realizar saque, sem saldo!");
            }
            else {
                this.saldoConta -= (valor + 5.0);
            }
        }

        public String toString() {
            return "\nConta: " + getNumeroConta() +
                ", proprietário: " + getNomeConta() +
                ", saldo: R$" + String.format("%.2f", getSaldoConta());
        }
    }