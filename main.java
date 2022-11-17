import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        // Condicional IF
        int numeroIf = 5;
        if (numeroIf > 0){
            System.out.println("Es positivo");
        }else if (numeroIf < 0){
            System.out.println("Es negativo");
        }else{
            System.out.println("Es 0");
        }
        
        // Condicional While
        int numeroWhile = 1;
        
        while(numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        
        // Condicional DoWhile
        int numeroDoWhile = 3;
        do{
            System.out.println(numeroDoWhile);
        }while(numeroDoWhile < 3);
        
        // Condicional For
        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }
        
        // Condicional Switch
        String estacion = "Invierno";
        
        switch (estacion){
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            case "Primavera":
                System.out.println("Es primavera");
                break;
            case "Otoño":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("No es una estacion");
           
        }

    }
}
