public class Conta {
    // atributos
    double saldo;
    int agencia; // posso setar valor na própria classe
    int numero;
    String titular;

    // método
    void deposita(double valor) { // void pois não tem retorno
        this.saldo += valor; // referência para o objeto que chama o método
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        } return false;
        
    }
}
