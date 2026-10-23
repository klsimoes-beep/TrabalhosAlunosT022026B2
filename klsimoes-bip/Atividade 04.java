class Cofrinho {
    String dono;
    double saldo;
    double metaEconomia;

    void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Depósito de R$ " + valor + " realizado!");
        } else {
            System.out.println("Erro: o depósito deve ser positivo!");
        }
    }

    void retirar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: valor de retirada inválido!");
        } else if (valor > saldo) {
            System.out.println("Erro: saldo insuficiente!");
        } else {
            saldo = saldo - valor;
            System.out.println("Retirada de R$ " + valor + " realizada!");
        }
    }

    void verificarMeta() {
        if (saldo >= metaEconomia) {
            System.out.println("Meta atingida! Parabéns, " + dono + "!");
        } else {
            double falta = metaEconomia - saldo;
            System.out.println("Ainda faltam R$ " + falta + " para a meta.");
        }
    }

    void exibirSaldo() {
        System.out.println("----- Cofrinho -----");
        System.out.println("Dono: " + dono);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Meta: R$ " + metaEconomia);
    }
}

public class Main {
    public static void main(String[] args) {
        Cofrinho cofrinho = new Cofrinho();
        cofrinho.dono = "Ariel";
        cofrinho.metaEconomia = 200.00;

        cofrinho.depositar(50.00);
        cofrinho.depositar(80.00);
        cofrinho.retirar(500.00);

        cofrinho.exibirSaldo();
        cofrinho.verificarMeta();
    }
}