package murder;

/** @author Max */

import java.util.Scanner;
import java.util.Random;

public class Murder {
    
    //Variáveis Globais
    
    static Scanner sc = new Scanner(System.in);
    static Random rd = new Random();
    
    public static void main(String[] args) {
        int op;
        
        do{
            menu();
            op = lerOpcao();
            if(op == 2 || op == 3){
                creditos(op);
            }else{
                
            }
        }while(op != 4);
        
        
    }
    
    //Menu do jogo
    
    public static void menu(){
        System.out.println("\n1 - Jogar\n"
                + "2 - Intruções\n"
                + "3 - Créditos\n"
                + "4 - Sair\n");
    }
    
    public static int lerOpcao(){
        System.out.print("Digite uma opção: ");
        int op = sc.nextInt();
        System.out.println("");
        return op;
    }
    
    //Intruções e créditos do jogo
    
    public static void creditos(int op){
        if(op == 2){
            System.out.println("Instruções do jogo...");
        }else{
            System.out.println("Créditos do jogo...");
        }
    }
    
    //Selecionar o assassino
    
    public static int gerarRandom(){
        int assassino = rd.nextInt(5);


        int op;
        
        op = sc.nextInt();
        
        switch (op){
            case 0:
                
                break;
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
                
                break;
        }
        
         return assassino;       
    }
   
    //Mover o jogador pelas salas
    
    public static void salas(int mover){
        
    }

    public static int moverJogador() {
        int mover = 0;
        
        return mover;
    }
    
    //Gerar perguntas aleatórias
    
    public static String[][] gerarPergunta (){
        String[][] listaPergunta = new String[2][2]; 
        listaPergunta[0][0] = "Pergunta 1";
        listaPergunta[0][1] = "Resposta 1";
        
        int escolherPergunta = rd.nextInt(1);
        
        
        return listaPergunta;
    }

}
