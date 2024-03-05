import java.util.Scanner;
import java.io.IOException;

public class Main{
        public static void main (String[] args) throws IOException {
            System.out.println("Ola mundo");
            char ch;
            ch = 'x';
            System.out.println("Ch contains" + ch);
            ch++; // incrementa ch
            System.out.println("Ch is now" + ch);
            ch = 90; // da ch o valor Z
            System.out.println("Ch is now" + ch);

            byte tipoByte = 127;
            short tipoShort = 32767;
            char   tipoChar = 'c';
            float tipoFloat = 2.6f;
            double tipoDouble = 3.59;
            int tipoInt = 2147483647;
            long tipoLong = 2337203685477058007L;
            boolean tipoBoleano = true;
            System.out.println("valor do tipoByte = " + tipoByte);
            System.out.println("Valor tipoShort =" + tipoShort );
            System.out.println("Valor tipochar = " + tipoChar);
            System.out.println("Valor tipofloat =" + tipoFloat);
            System.out.println("Valor tipoDouble =" + tipoDouble);
            System.out.println("Valor tipoInt =" + tipoInt);
            System.out.println("Valor tipoLong = " + tipoLong);
            System.out.println("Valor tipoBoolean" + tipoBoleano);

            // Projeto 2 menu
            System.out.println("Exemplo do while");
            int opcao = -1;
            Scanner in = new Scanner(System.in);
            do {
                System.out.println("****** Sistema de cadastro ******");
                System.out.println("Opcao 1: cadastrar cliente");
                System.out.println("Opcao 2: cadastrar Produto");
                System.out.println("Opcao 3: cadastrar Vendedor");
                System.out.println("Opcao 0: Sair ");
                System.out.println("***************************");
                System.out.println("Digite a opcao: ");
                opcao = in.nextInt();
                System.out.println("****************************");
                switch (opcao) {
                    case 1:
                        System.out.println("Opcao 1 escolhida");
                        //cadastrarClinete();
                    case 2:
                        System.out.println("Opcao 2 escolhida");
                        //cadastrarproduto
                    case 3:
                        System.out.println("Opcao 3 escolhida ");
                        // cdastrarVendedor
                    case 0:
                        System.out.println("Opcao 0 escolhida");
                        //sair
                        break;
                    default:
                        System.out.println("O número escolhido e invalido");
                }
            }while (opcao != 0);

        }


}