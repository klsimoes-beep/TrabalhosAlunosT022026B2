class Time {
    String nome;
    int vitorias;
    int empates;
    int derrotas;
    int pontos;

    void registrarVitoria() {
        vitorias++;
        pontos = pontos + 3;
    }

    void registrarEmpate() {
        empates++;
        pontos = pontos + 1;
    }

    void registrarDerrota() {
        derrotas++;
    }

    void exibirEstatisticas() {
        System.out.println(nome);
        System.out.println("Vitórias: " + vitorias);
        System.out.println("Empates: " + empates);
        System.out.println("Derrotas: " + derrotas);
        System.out.println("Pontos: " + pontos);
    }
}

public class Main {
    public static void main(String[] args) {
        Time time1 = new Time();
        time1.nome = "Flamengo";

        Time time2 = new Time();
        time2.nome = "Palmeiras";

        time1.registrarVitoria();
        time1.registrarVitoria();
        time1.registrarDerrota();

        time2.registrarVitoria();
        time2.registrarEmpate();

        time1.exibirEstatisticas();
        time2.exibirEstatisticas();

        if (time1.pontos > time2.pontos) {
            System.out.println(time1.nome + " tem mais pontos");
        } else if (time2.pontos > time1.pontos) {
            System.out.println(time2.nome + " tem mais pontos");
        } else {
            System.out.println("Empate na classificação");
        }
    }
}