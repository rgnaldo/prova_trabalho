/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudo_prova;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *
 * @author naldo
 */
public class Arquivo {
    public static String Read(String Caminho){
        String conteudo = "";
       try{
           FileReader arq = new FileReader(Caminho);//tentar criar ou encontrar oarquivo,cria umclasse para tratar o arquivo
           BufferedReader lerArq = new BufferedReader(arq);//umecapsula outr
            String linha= "";
           try{
               linha = lerArq.readLine();
                while(linha != null){
                    conteudo+= linha+"\n";
                    linha = lerArq.readLine();
                }
                arq.close();
           }catch(IOException ex){
               System.out.println("Erro, Nao foi possivel ler o arquivo");
           }
       }catch(FileNotFoundException ex){
           System.out.println("Erro, Arquivo nao encontrado");
       }
       
       if(conteudo.contains("Erro"))
           return "";
       else
           return conteudo;
    }
            
    public static boolean White(String Caminho, String Texto){
        try{
            FileWriter arq = new FileWriter(Caminho);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.println(Texto);
            gravarArq.close();
            return true;
        }catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }   
    }  
}