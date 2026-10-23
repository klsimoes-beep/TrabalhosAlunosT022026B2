class MaquinaRefrigerante {

    int quantidadeEstoque;
    double preco;
    double dinheiroArrecadado;

    public MaquinaRefrigerante(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
        this.preco = 4.50;
        this.dinheiroArrecadado = 0;
    }

    public void comprar(int quantidade, double valorPago) {
        double total = quantidade * preco;

        if (quantidade <= 0) {
            System.out.println("Quantidade invalida.");
        } else if (quantidade > quantidadeEstoque) {
            System.out.println("Estoque insuficiente. Disponivel: " + quantidadeEstoque);
        } else if (valorPago < total) {
            System.out.printf("Dinheiro insuficiente. Total da compra: R$ %.2f%n", total);
        } else {
            quantidadeEstoque = quantidadeEstoque - quantidade;
            dinheiroArrecadado = dinheiroArrecadado + total;
            System.out.println("Compra realizada: " + quantidade + " refrigerante(s).");

            double troco = valorPago - total;
            if (troco > 0) {
                System.out.printf("Troco: R$ %.2f%n", troco);
            }
        }
    }

    public void reporEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("A quantidade para repor deve ser maior que zero.");
        } else {
            quantidadeEstoque = quantidadeEstoque + quantidade;
            System.out.println("Estoque reposto: +" + quantidade);
        }
    }

    public void exibirEstado() {
        System.out.println("Estoque: " + quantidadeEstoque);
        System.out.printf("Preco: R$ %.2f%n", preco);
        System.out.printf("Dinheiro arrecadado: R$ %.2f%n", dinheiroArrecadado);
    }
}

public class Main {

    public static void main(String[] args) {
        MaquinaRefrigerante maquina = new MaquinaRefrigerante(10);

        maquina.comprar(2, 10.00);
        maquina.comprar(20, 100.00);

        maquina.reporEstoque(10);
        maquina.exibirEstado();
    }
}