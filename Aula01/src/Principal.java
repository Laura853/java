import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        //Criar o objeto responsável por ler os dados digitados no teclado

        Scanner leitor = new Scanner (System.in);

        //Criar um objeto tenis com os valores digitados pelo usuário

        System.out.println("Digite a cor do tênis");
        String cor = leitor.nextLine();

        System.out.println("Digite o tamanho do tênis");
        int tamanho = leitor.nextInt();

        System.out.println("Digite o modelo do tênis");
        String modelo = leitor.nextLine() + leitor.nextLine();

        System.out.println("Digite o preço do tênis");
        double preco = leitor.nextDouble();

        System.out.println("Digite se o tênis está disponível");
        boolean disponivel = leitor.nextBoolean();

        //Criando o objeto tênis

        Tenis tenis = new Tenis();

        //Colocar os valores lidos dentro do objeto
        tenis.modelo = modelo;
        tenis.cor = cor;
        tenis.disponivel = disponivel;
        tenis.tamanho = tamanho;
        tenis.preco = preco;

        //Exibir os valores que estão dentro do objeto

        System.out.println("Modelo: " + tenis.modelo);
        System.out.println("Cor: " + tenis.cor);
        System.out.println("Tamanho: " + tenis.tamanho);
        System.out.println("Disponível: " + tenis.disponivel);
        System.out.println("Preço: " + tenis.preco);

    }


}
