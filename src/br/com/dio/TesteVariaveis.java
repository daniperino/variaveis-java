package br.com.dio;

// Exemplo variáveis, exercitando

public class TesteVariaveis {
    public static void main(String[] args) {

        int i;
        //int i; // igual a de cima
        int I;
        //int 1a; //não se inicia com números
        int _1a; //não é uma boa pratica
        int $aq; // não é uma boa pratica

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10;
        //j = 15; não pode mudar o valor pq é final(constante)
        int asrn24678md; //não é uma boa pratica
       // int asrn246 78md; espaço não pode
        int asrn2$4678_md = 10; // não é uma boa pratica
        // int asrn2$46%78_md = 10; não pode usar palavras reservadas

        asrn24678md = 100;
        asrn2$4678_md = 10;

        int quantidadeProduto = 50;
        //int QuantidadeProduto; não é uma boa pratica
        final int NUMERO_TENTATIVAS = 5;
        //final int numeroTentativas = 5; não é uma boa pratica
        int QUANTIDADE_OPCOES = 25; // não é uma boa pratica
        //int qtdProd; não tem expressividade

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);



    }


}
