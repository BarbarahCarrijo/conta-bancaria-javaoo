package conta.bancaria;

/**
 *
 * @author Bárbara Carrijo
 */
public class Conta {

    protected double saldo;

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) {
        this.saldo -= valor;
    }

    void atualiza(double taxajuro) {
        this.saldo += this.saldo * taxajuro;
    }

    public double getSaldo() {
        return this.saldo;
    }
}
