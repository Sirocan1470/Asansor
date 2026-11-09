
import java.util.Scanner;


public class Asansor {

    public static void main(String[] args) {
        
              
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Mevcut kati giriniz:");
        int kat = sc.nextInt();
        System.out.println("Hedef kati giriniz:");
        int hedef = sc.nextInt();
        
        String hareket = ("Hicbirsey");
        
        if (0 < kat && kat < 11 && 0 < hedef && hedef < 11) {
            
            if (kat > hedef) {
                hareket = "Asagı";
            } else {
                
                if (kat == hedef) {
                    hareket = "Hareket yok";
                } else {
                    hareket = "Yukari";
                }}
                
            
                
            int mesafe = (hedef - kat);
                
            if (mesafe < 0) {
            mesafe = (mesafe*(-1));
            }
                
            System.out.println(kat+". kattan "+hedef+". kata, "+hareket+" yonunde gidildi. Gidilen mesafe: "+mesafe);
                
                
                
                
                
                
                
                
                
                
                
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }else{
            System.out.println("Tekrar deneyin!");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
