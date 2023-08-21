public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Alice", 25);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}

/** Neste exemplo, temos uma classe Pessoa com dois atributos privados, nome e idade. Esses atributos são encapsulados, o que significa que não podem ser acessados diretamente fora da classe. Em vez disso, utilizamos métodos públicos getNome() e getIdade() para obter os valores desses atributos.

 No método Main, criamos um objeto Pessoa e usamos os métodos públicos para acessar e imprimir os valores dos atributos encapsulados. Isso protege os detalhes internos da classe Pessoa e nos permite controlar como os atributos são acessados e modificados.

 O encapsulamento aqui torna mais claro como os dados podem ser acessados e evita que esses dados sejam inadvertidamente modificados de forma inadequada, garantindo maior controle sobre o comportamento da classe e sua integridade. **/
