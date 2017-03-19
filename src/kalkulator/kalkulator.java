package kalkulator;
 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.Scanner;

public class kalkulator {
 
  //Kalkulator wykonuje dzialania takie jak +,-,*,/ na trzech liczbach
 
    public static void main(String[] args) 
    {
       float pierwsza_l = 0;  	// pierwsza wczytana liczba 
       float druga_l = 0;		// druga wczytana liczba 
       float trzecia_l = 0;		// trzecia wczytana liczba 
       char znak = 0;       	// zmienna przechowuj¹ca symbol operacji do wykonania
       char znak2 = 0;	    	//zmienna przechowuj¹ca symbol operacji do wykonania
       float wynik=0;
       int wybor = 0;      
       int wartosc;
       
       Scanner wej = new Scanner(System.in);
       
       System.out.println("KALKULATOR");
       System.out.println("Wybierz 1 - jesli ma czytac z klawiatury");
       System.out.println("Wybierz 2 - jesli ma czytac z pliku");
       wybor = wej.nextInt();
       
       switch(wybor)
       {
	       case 1:
	       {
		       while( znak !='$' && znak2 !='$') //po wpisaniu znaku konczy dzialanie
		       {
		    	   
		       
		    	   Scanner wej1 = new Scanner(System.in);   
		    	   System.out.println("\nPodaj pierwsz¹ liczbê:"); 
		    	   pierwsza_l = wej1.nextInt();
		       
		    	   System.out.println("Podaj drug¹ liczbê:");
		    	   druga_l = wej1.nextInt();
		    	   System.out.println("Podaj trzecia liczbe:"); 
		    	   trzecia_l = wej1.nextInt();
		       
			       System.out.println("Jaka operacje chcesz wykonac na pierwszych dwoch liczbach");
			       znak2 = wej1.next().charAt(0);
			       
			       System.out.println("Jaka operacje chcesz wykonac na drugiej i trzeciej liczbie");
			       znak = wej1.next().charAt(0);
		       
			       if(znak2 == '+')
			       {
			    	   if(znak == '*')
			    		   wynik = pierwsza_l+(druga_l*trzecia_l);
			    	   if(znak == '/')
			    		   wynik = pierwsza_l+(druga_l/trzecia_l);
			    	   if(znak == '-')
			    		   wynik = pierwsza_l+druga_l-trzecia_l;
			    	   if(znak == '+')
			    		   wynik = pierwsza_l+druga_l+trzecia_l;
			       }
			       if(znak2 == '-')
			       {
			    	   if(znak == '*')
			    		   wynik = pierwsza_l-(druga_l*trzecia_l);
			    	   if(znak == '/')
			    		   wynik = pierwsza_l-(druga_l/trzecia_l);
			    	   if(znak == '-')
			    		   wynik = pierwsza_l-druga_l-trzecia_l;
			    	   if(znak == '+')
			    		   wynik = pierwsza_l-druga_l+trzecia_l;
			       }
			       if(znak2 == '*')
			       {
			    	   if(znak == '*')
			    		   wynik = pierwsza_l*druga_l*trzecia_l;
			    	   if(znak == '/')
			    		   wynik = pierwsza_l*druga_l/trzecia_l;
			    	   if(znak == '-')
			    		   wynik = (pierwsza_l*druga_l)-trzecia_l;
			    	   if(znak == '+')
			    		   wynik = (pierwsza_l*druga_l)+trzecia_l;
			       }   
			       if(znak2 == '/')
			       {
			    	   if(znak == '*')
			    		   wynik = pierwsza_l/druga_l*trzecia_l;
			    	   if(znak == '/')
			    		   wynik = pierwsza_l/druga_l/trzecia_l;
			    	   if(znak == '-')
			    		   wynik = (pierwsza_l/druga_l)-trzecia_l;
			    	   if(znak == '+')
			    		   wynik = (pierwsza_l/druga_l)+trzecia_l;
			       }
			       
			       
			       System.out.format("%.2f %c %.2f %c %.2f = %.2f",pierwsza_l,znak2,druga_l,znak,trzecia_l,wynik);
		       }
	       }
	       case 2:
		    {
		    	FileReader fr = null;
				try {
		            fr = new FileReader("plik.txt");
		         } catch (FileNotFoundException e) {
		               System.out.println("B£¥D PRZY OTWIERANIU PLIKU!");
		               System.exit(1);
		         }

		         StreamTokenizer st = new StreamTokenizer(fr);
		         //odczyt z pliku:
		         try {
		            
					while( (wartosc = st.nextToken()) != StreamTokenizer.TT_EOF ){
		                  if(wartosc == StreamTokenizer.TT_WORD)
		                        System.out.println("Wczytano s³owo: "+ st.sval);
		                  else if(wartosc == StreamTokenizer.TT_NUMBER)  
		                        System.out.println("Wczytano liczbê: "+ st.nval);
		             }
		          } catch (IOException e) {
		                System.out.println("B£¥D ODCZYTU Z PLIKU!");
		                System.exit(2);
		          }

		          //zamykanie pliku
		          try {
		             fr.close();
		          } catch (IOException e) {
		               System.out.println("B£¥D PRZY ZAMYKANIU PLIKU!");
		               System.exit(3);
		          }
		    	
			  break;
		    }
       }
    }
}