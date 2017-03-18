package kalkulator;
 
import java.util.Scanner;

public class kalkulator {
 
  /* Prosty kalkulator wykonuj¹cy operacje dodawania, odejmowania, mno¿enia
   * dzielenia oraz operacjê modulo w zale¿noœci od wyboru u¿ytkownika
   */
 
    public static void main(String[] args) 
    {
       int pierwsza_l;  // dwie liczby, na których bêdziemy wykonywaæ operacjê
       int druga_l;
       int trzecia_l;
       char znak;      // zmienna przechowuj¹ca symbol operacji do wykonania
       int wynik=0;
       
       
       Scanner wej = new Scanner(System.in);   // wczytywanie zmiennych przy pomocy Scanner
       System.out.println("Podaj pierwsz¹ liczbê:"); 
       pierwsza_l = wej.nextInt();
       System.out.println("Podaj drug¹ liczbê:");
       druga_l = wej.nextInt();
       System.out.println("Podaj trzecia liczbe:"); 
       trzecia_l = wej.nextInt();
 
    
      
 
       System.out.println("Jak¹ operacje chcesz wykonac na pierwszych dwoch liczbach?");
       
       System.out.println("Dodawanie - wciœnij +");
       System.out.println("Odejmowanie - wciœnij -");
       System.out.println("Mno¿enie - wciœnij *");
       System.out.println("Dzielenie - wciœnij /");
       
       
       
       znak = wej.next().charAt(0);  // pobieramy symbol operacji od u¿ytkownika
       
       switch(znak)     // w zale¿noœci od wyboru wykonujemy dan¹ operacjê
       {
           case '+':    // dodawanie dwóch zmiennych
           {

        	   System.out.format("%d + %d = %d",pierwsza_l, druga_l,pierwsza_l + druga_l);
        	   wynik=(pierwsza_l + druga_l);
        	   
               break;
          
           }
           case '-':    // odejmowanie dwóch zmiennych
           {
        	   System.out.format("%d - %d = %d",pierwsza_l, druga_l,pierwsza_l - druga_l);
        	   wynik=(pierwsza_l - druga_l);
               break;
           }
           case '*':    // mno¿enie dwóch zmiennych
           {
        	   System.out.format("%d * %d = %d",pierwsza_l, druga_l,pierwsza_l * druga_l);
        	   wynik=(pierwsza_l * druga_l);
               break;
           }
           case '/':   // sprawdzenie, czy druga zmienna nie jest zerem oraz
           {           // dzielenie dwóch zmiennych 
               if(druga_l !=0)
               {
                 
                 System.out.format("%d / %d = %d",pierwsza_l, druga_l,pierwsza_l / druga_l + "oraz reszty: " + pierwsza_l % druga_l);
                 wynik=(pierwsza_l / druga_l);
               }
               else
               {
                   System.out.println("Nie dzielimy przez zero!!!");
               }
               break;
           }

       }
       
       /////////////////////////druga operacja
       
       System.out.println("\nJak¹ operacje chcesz wykonac na drugiej i trzeciej liczbie?");
       
 znak = wej.next().charAt(0);  
       
       switch(znak)     
       {
           case '+':    // dodawanie dwóch zmiennych
           {

        	   System.out.format("%d + %d = %d",wynik, trzecia_l, wynik + trzecia_l);
        	  
               break;
          
           }
           case '-':    // odejmowanie dwóch zmiennych
           {
        	   System.out.format("%d - %d = %d",wynik, trzecia_l, wynik - trzecia_l);
               break;
           }
           case '*':    // mno¿enie dwóch zmiennych
           {
        	   System.out.format("%d * %d = %d",wynik, trzecia_l, wynik * trzecia_l);
               break;
           }
           case '/':   // sprawdzenie, czy druga zmienna nie jest zerem oraz
           {           // dzielenie dwóch zmiennych 
               if(trzecia_l !=0)
               {
                 
                 System.out.format("%d / %d = %d",wynik, trzecia_l, wynik / trzecia_l);
               }
               else
               {
                   System.out.println("Nie dzielimy przez zero!!!");
               }
               break;
           }

       }
       
       
       
       
 
    }
}