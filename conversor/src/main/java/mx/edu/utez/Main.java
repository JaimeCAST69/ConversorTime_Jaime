package mx.edu.utez;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Bienvenido");
        System.out.println("Eliga un opcion");
        System.out.println("1.Horas a minutos");
        System.out.println("2.Minutos a segundos");
        System.out.println("3.Días a horas");
        System.out.println("4.Semanas a días\n");
        int opc = sc.nextInt() ;
        switch (opc) {
            case 1:
                System.out.println("Ingresa la hora");
                int hora = sc.nextInt();

                int minutos = (hora * 60 );

                System.out.println("Minutos: " + minutos);
                break;
            case  2:
                System.out.println("Ingresa los minutos");
                int min = sc.nextInt();

                int segs = (min * 60 );

                System.out.println("Segundos: " + segs);
                break;
            case 3:
                System.out.println("Ingresa los dias");
                int dias = sc.nextInt();

                int horas = (dias * 24 );
                System.out.println("Horas: " + horas);
                break;
            case 4:
                System.out.println("Ingresa las semanas");
                int sem = sc.nextInt();

                int dia = (sem * 7 );
                System.out.println("Dias: " + dia);
                break;
            // ... más casos
            default:
                // Bloque de código a ejecutar si la expresión no coincide con ningún caso
        }
    }
}