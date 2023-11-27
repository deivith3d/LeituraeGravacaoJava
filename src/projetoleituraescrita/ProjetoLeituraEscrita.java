package projetoleituraescrita;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class ProjetoLeituraEscrita {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("arq.txt"); //,true);
            fw.write("Tecnico em Desenvolvimento de Sistemas - SENAC TECH");
            for(int i=0;i<10;i++)
            {
                fw.write("\n"+i);
            }
            fw.close();
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
        
        try{
            FileReader fr = new FileReader("arq.txt");
            BufferedReader bf = new BufferedReader(fr);
            String linha = bf.readLine();
            System.out.println(linha);
            while(linha!=null)
            {
                System.out.println(linha);
                linha = bf.readLine();
            }
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }
 }
