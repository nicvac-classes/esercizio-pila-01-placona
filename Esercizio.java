//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        Pila<Character> pila = new Pila<>();
        String parola;
        do{
            
            System.out.print("Inserire parola");
            parola = in.nextLine();

            if(!parola.equalsIgnoreCase("X")){
                for(int i = 0; i < parola.length(); ++i){
                    pila.push(parola.charAt(i));
                }

                String palindrom = "";
                while(!pila.isEmpty()){
                    palindrom += pila.pop();
                }

                if(parola.equalsIgnoreCase(palindrom)){
                    System.out.println("la parola" + parola + " è palindorma");
                }
            }
        }while(!parola.equalsIgnoreCase("x"));
    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md