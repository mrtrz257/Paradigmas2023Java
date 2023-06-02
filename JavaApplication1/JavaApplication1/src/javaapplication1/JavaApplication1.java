/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author lia-lb-05
 */
public class JavaApplication1 {
    static Scanner entrada = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        do{
            System.out.println("Menu de Opciones");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("opcion 1");
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Ingresar opcion valida");
            }
        }while (opcion != 2); 
    }
    
}
