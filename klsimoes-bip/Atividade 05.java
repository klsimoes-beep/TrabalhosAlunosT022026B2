class Pedido {
    String nomeCliente;
    int quantidadeLanches;
    double precoLanche;
    double taxaEntrega;
    String status;

    void adicionarLanches(int quantidade) {
        if (status.equals("Finalizado")) {
            System.out.println("Erro: pedido finalizado, não pode adicionar lanches!");
        } else if (quantidade <= 0) {
            System.out.println("Erro: quantidade inválida!");
        } else {
            quantidadeLanches = quantidadeLanches + quantidade;
            System.out.println(quantidade + " lanche adicionado!");
        }
    }

    double calcularTotal() {
        double valorLanches = quantidadeLanches * precoLanche;

        if (quantidadeLanches >= 3) {
            valorLanches = valorLanches - (valorLanches * 0.10);
        }

        double total = valorLanches + taxaEntrega;
        return total;
    }

    void finalizarPedido() {
        status = "Finalizado";
        System.out.println("Pedido finalizado!");
    }

    void exibirPedido() {
        System.out.println("----- Pedido -----");
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Lanches: " + quantidadeLanches);
        System.out.println("Preço do lanche: R$ " + precoLanche);
        System.out.println("Taxa de entrega: R$ " + taxaEntrega);
        System.out.println("Status: " + status);
        System.out.println("Total: R$ " + calcularTotal());
    }
}

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.nomeCliente = "Ariel";
        pedido.precoLanche = 18.00;
        pedido.taxaEntrega = 7.00;
        pedido.status = "Aberto";

        pedido.adicionarLanches(1);
        pedido.adicionarLanches(2);

        System.out.println("Total: R$ " + pedido.calcularTotal());

        pedido.finalizarPedido();

        pedido.adicionarLanches(1);

        pedido.exibirPedido();
    }
}