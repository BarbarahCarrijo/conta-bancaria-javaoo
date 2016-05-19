package conta.bancaria;

/**
 *
 * @author Bárbara Carrijo
 */
public class ContaPoupanca extends Conta {

    void atualiza(double taxajuro) {
        this.saldo += this.saldo * taxajuro * 2;
    }

}
