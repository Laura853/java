import java.util.Scanner;

public class MediaAluno {

    public static void main(String[] args) {

        Scanner leitor = new Scanner (System.in);

        Aluno aluno = new Aluno();

        System.out.printf("Digite seu nome: ");
        String nomeDoAluno = leitor.nextLine();

        System.out.printf("Digite sua nota 1: ");
        double nota1 = leitor.nextDouble();

        System.out.printf("Digite sua nota 2: ");
        double nota2 = leitor.nextDouble();

        System.out.printf("Digite sua nota 3: ");
        double nota3 = leitor.nextDouble();


        //Exibir a média do aluno

        double mediaFinal = (nota1 + nota2 + nota3) /3;

        System.out.println("A média é " + mediaFinal);



        }

    }
