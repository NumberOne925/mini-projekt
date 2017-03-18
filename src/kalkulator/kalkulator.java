package kalkulator;
 
import java.util.Scanner;

public class kalkulator {
 
  /* Prosty kalkulator wykonuj�cy operacje dodawania, odejmowania, mno�enia
   * dzielenia oraz operacj� modulo w zale�no�ci od wyboru u�ytkownika
   */
 
    public static void main(String[] args) 
    {
       int pierwsza_l;  // dwie liczby, na kt�rych b�dziemy wykonywa� operacj�
       int druga_l;
       int trzecia_l;
       char znak;      // zmienna przechowuj�ca symbol operacji do wykonania
       int wynik=0;
       
       
       Scanner wej = new Scanner(System.in);   // wczytywanie zmiennych przy pomocy Scanner
       System.out.println("Podaj pierwsz� liczb�:"); 
       pierwsza_l = wej.nextInt();
       System.out.println("Podaj drug� liczb�:");
       druga_l = wej.nextInt();
       System.out.println("Podaj trzecia liczbe:"); 
       trzecia_l = wej.nextInt();
 
    
      
 
       System.out.println("Jak� operacje chcesz wykonac na pierwszych dwoch liczbach?");
       
       System.out.println("Dodawanie - wci�nij +");
       System.out.println("Odejmowanie - wci�nij -");
       System.out.println("Mno�enie - wci�nij *");
       System.out.println("Dzielenie - wci�nij /");
       
       
       
       znak = wej.next().charAt(0);  // pobieramy symbol operacji od u�ytkownika
       
       switch(znak)     // w zale�no�ci od wyboru wykonujemy dan� operacj�
       {
           case '+':    // dodawanie dw�ch zmiennych
           {

        	   System.out.format("%d + %d = %d",pierwsza_l, druga_l,pierwsza_l + druga_l);
        	   wynik=(pierwsza_l + druga_l);
        	   
               break;
          
           }
           case '-':    // odejmowanie dw�ch zmiennych
           {
        	   System.out.format("%d - %d = %d",pierwsza_l, druga_l,pierwsza_l - druga_l);
        	   wynik=(pierwsza_l - druga_l);
               break;
           }
           case '*':    // mno�enie dw�ch zmiennych
           {
        	   System.out.format("%d * %d = %d",pierwsza_l, druga_l,pierwsza_l * druga_l);
        	   wynik=(pierwsza_l * druga_l);
               break;
           }
           case '/':   // sprawdzenie, czy druga zmienna nie jest zerem oraz
           {           // dzielenie dw�ch zmiennych 
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
       
       System.out.println("\nJak� operacje chcesz wykonac na drugiej i trzeciej liczbie?");
       
 znak = wej.next().charAt(0);  
       
       switch(znak)     
       {
           case '+':    // dodawanie dw�ch zmiennych
           {

        	   System.out.format("%d + %d = %d",wynik, trzecia_l, wynik + trzecia_l);
        	  
               break;
          
           }
           case '-':    // odejmowanie dw�ch zmiennych
           {
        	   System.out.format("%d - %d = %d",wynik, trzecia_l, wynik - trzecia_l);
               break;
           }
           case '*':    // mno�enie dw�ch zmiennych
           {
        	   System.out.format("%d * %d = %d",wynik, trzecia_l, wynik * trzecia_l);
               break;
           }
           case '/':   // sprawdzenie, czy druga zmienna nie jest zerem oraz
           {           // dzielenie dw�ch zmiennych 
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