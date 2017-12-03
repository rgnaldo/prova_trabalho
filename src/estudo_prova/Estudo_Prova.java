/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudo_prova;

/**
 *
 * @author naldo
 */
public class Estudo_Prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String arq = "teste.txt";
        /**
         //Gravação
        String texto = "Ao contrário do que se acredita, Lorem Ipsum não é simplesmente um texto randômico. \r\n"
                + "Com mais de 2000 anos, suas raízes podem ser encontradas em uma obra de literatura latina clássica \r\n"
                + "datada de 45 AC. Richard McClintock, um professor de latim do Hampden-Sydney College na Virginia, \r\n"
                + "pesquisou uma das mais obscuras palavras em latim, consectetur, oriunda de uma passagem de Lorem Ipsum, \r\n"
                + "e, procurando por entre citações da palavra na literatura clássica, descobriu a sua indubitável origem.\r\n ";
        
                if(Arquivo.White(arq, texto))
                    System.out.println("Arquivo gravado com sucesso");
                else
                    System.out.println("Erro ao gravar o arquivo");
        //Leitura       
        String texto = Arquivo.Read(arq);
        if(texto.isEmpty())
            System.out.println("Erro ao ler o arquivo");
        else
            System.out.println(texto);
       */
    
        String ArqConfig = "conf.con";
        /*
        String nome = "Reginaldo";
        String login = "admin";
        String versao = "1.0";
        
        String print = nome+";"+login+";"+versao;
        Arquivo.White(ArqConfig, print);
        */
        
        String conteudo = Arquivo.Read(ArqConfig);
        String c1 = conteudo.split(";")[0];
        String c2 = conteudo.split(";")[1];
        String c3 = conteudo.split(";")[2];
        
        System.out.println("Nome: "+c1);
        System.out.println("Login: "+c2);
        System.out.println("Versão: "+c3);
}
    
}
