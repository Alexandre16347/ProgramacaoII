package aula_2_Manoel;

//Fator primo 13195 são:       5 ,7 ,13 e 29.
//Qual maior fator primo de :   600851475143
public class Main {


public static void main(String[] args) {

 long maior = maiorFatorPrimo(600851475143L); 
 System.out.println("O maior fator primo eh: " + maior);
 
}

public static long maiorFatorPrimo(long numero){
     long aux = 0;
 for(long i = numero - 1; i > 2; i--){
     if(ehPrimo(i) && numero % i == 0){
         aux = i;
     }
     //System.out.print(i+" ");
 }
 return aux;
}

public static boolean ehPrimo(long numero){
	System.out.print("Entrei ... "+ numero);
 for(long i = 2; i > numero; i++){
     if(numero % i == 0){
    	 System.out.println(" Sai");
         return false;
     }
 }
 
 System.out.println(" Sai");
 return true;

}

 
}

