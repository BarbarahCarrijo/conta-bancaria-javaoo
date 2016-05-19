package conta.bancaria;

/**
 *
 * @author Bárbara Carrijo
 */
public class ContaCorrente extends Conta {

    public void atualiza(double taxajuro) {
        this.saldo += this.saldo * taxajuro;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

}
