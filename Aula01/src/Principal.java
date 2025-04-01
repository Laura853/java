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

        //Ler as informações da marca
        System.out.printf("Digite o nome da marca");
        String nomeMarca = leitor.next() + leitor.nextLine();

        System.out.printf("Insira o nome do arquivo da logo");
        String logo = leitor.next() + leitor.nextLine();

        //Criar o objeto marca
        Marca marca = new Marca();

        //Atribuir os valores ao objeto
        marca.nome = nomeMarca;
        marca.logo = logo;

        //Criando o objeto tênis

        Tenis tenis = new Tenis();

        //Colocar os valores lidos dentro do objeto
        tenis.modelo = modelo;
        tenis.cor = cor;
        tenis.disponivel = disponivel;
        tenis.tamanho = tamanho;
        tenis.preco = preco;
        tenis.marca = marca;


        //Exibir os valores que estão dentro do objeto

        System.out.println("Modelo: " + tenis.modelo);
        System.out.println("Cor: " + tenis.cor);
        System.out.println("Tamanho: " + tenis.tamanho);
        System.out.println("Disponível: " + tenis.disponivel);
        System.out.println("Preço: " + tenis.preco);

        //Exibir os dados da marca (atáves do objeto tenis)
        System.out.printf("Marca: " + tenis.marca.nome);
        System.out.printf("Logo: " + tenis.marca.logo);

        //Chamar (invocar) o método para aumentar o valor do tenis em 15
        tenis.aumentarPreço(10);

        //Exibir o valor atualizado do tenis
        System.out.printf("Valor atualizado: " + tenis.preco);

        //Chamar o método para calcular o preço com desconto
        double valorDoTenisComDesconto = tenis.aplicarDesconto(50);
        System.out.printf("Tênis  com desconto: " + valorDoTenisComDesconto);
        }

    }



