package exp3_s7_francisco_vargas;

import java.util.ArrayList;
import java.util.Scanner;


public class Exp3_S7_Francisco_Vargas {
    static double acoTotal =0.0;
    static String ubiAsientos="";
    static String descuento="";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String despedida ="Gracias por  su compra\n Que disfrute su funcion en  Teatro Moro" ;
       double dctoEstudiante = 0.90;
       double dctoTercera = 0.85;
       int valorBalcon = 10000;
       int valorPlatea = 15000;
       int valorVip = 20000;
       double valorTotal=0;
       int opcion=0;
       int opcion2= 0;
       int opcion3=0;
       int salida=0;
       boolean salir=false;
       ArrayList <String> list = new ArrayList<>();
       ArrayList <Object>list2 = new ArrayList<>();
       
       list.add("Ubicacion: ");
       list.add("Costo Base: ");
       list.add("Descuento Aplicado: ");
       list.add("Costo Final: ");
       
       
        
     
      do{  
           
        System.out.println("Bienvenidos al Cafe  Moro");
        do{
        System.out.println("Seleccione tipo de Asiento \nPrecione 1 para VIP  2 para Platea 3 para Balcon");
        opcion=scanner.nextInt();
        }while(opcion >3 || opcion<1);
       switch (opcion){
           case 1 ->{
               System.out.println("Bienvenidos A La Seccion VIP");
               do{
               System.out.println("Para Descuento Estudiante Presione 1 Para Tercera Edad Presione 2 Publigo General presione 3");
               opcion2=scanner.nextInt();
               }while(opcion2>3 || opcion2<1);
               
               ubiAsientos="VIP";
               if (opcion2==1){
               valorTotal=valorVip*dctoEstudiante;
               descuento="10%";
              }else if(opcion2==2){
              valorTotal=valorVip*dctoTercera;
               descuento="15%";
              }else if(opcion2==3){
              valorTotal=valorVip;
               descuento="0";
              }
               
               list2.add(ubiAsientos);
               list2.add(valorVip);
               list2.add(descuento);
               list2.add(valorTotal);
            for (int i = 0; i <list.size();i++){
                 System.out.println(list.get(i)+" "+ list2.get(i));}
           
           }
           case 2->{
               System.out.println("Bienvenidos A La Seccion Platea");
               do{
               System.out.println("Para Descuento Estudiante Presione 1 Para Tercera Edad Presione 2 Publigo General presione 3");
               opcion2=scanner.nextInt();
               }while(opcion2>3||opcion2<1);
               ubiAsientos="Platea";
               if (opcion2==1){
               valorTotal=valorPlatea*dctoEstudiante;
               descuento="10%";
              }else if(opcion2==2){
              valorTotal=valorPlatea*dctoTercera;
               descuento="15%";
              }else if(opcion2==3){
              valorTotal=valorPlatea;
               descuento="0";
              }
               
               list2.add(ubiAsientos);
               list2.add(valorPlatea);
               list2.add(descuento);
               list2.add(valorTotal);
            for (int i = 0; i <list.size();i++){
                 System.out.println(list.get(i)+" "+ list2.get(i));}
           }
           case 3-> {
               System.out.println("Bienvenidos A La Seccion Balcon");
               do{
               System.out.println("Para Descuento Estudiante Presione 1 Para Tercera Edad Presione 2 Publigo General presione 3");
               opcion2=scanner.nextInt();
               }while(opcion2>3|| opcion2<1);
               ubiAsientos="Balcon";
               if (opcion2==1){
               valorTotal=valorBalcon*dctoEstudiante;
               descuento="10%";
              }else if(opcion2==2){
              valorTotal=valorBalcon*dctoTercera;
               descuento="15%";
              }else if(opcion2==3){
              valorTotal=valorBalcon;
               descuento="0";
              }
               
               list2.add(ubiAsientos);
               list2.add(valorBalcon);
               list2.add(descuento);
               list2.add(valorTotal);
            for (int i = 0; i <list.size();i++){
                 System.out.println(list.get(i)+" "+ list2.get(i));}
           }
       }
        
       do{
         System.out.println("Para continuar con su boleta Presione 1 Para salir 2");
         opcion3=scanner.nextInt();
       }while(opcion3>2 || opcion3<1);
         if (opcion3==1){
             System.out.println("----------------------------------------");
             System.out.println("            Teatro Moro       ");
             System.out.println("----------------------------------------");
            for (int i = 0; i <list.size();i++){
                 System.out.println(list.get(i)+" "+ list2.get(i));}
             System.out.println("----------------------------------------");
             System.out.println("gracias por su visita al Teatro Moro");
             System.out.println("----------------------------------------");
           }
         acoTotal+=valorTotal;
       do{  
         System.out.println("Para salir Precione 1 Para comprar otra entrada presione 2");
            salida=scanner.nextInt();
       }while(salida>2||salida<1);
            if (salida==1){
            salir=true;
            
            }
    }while (salir==false );
         
         System.out.println("----------------------");
         System.out.println(despedida);
         System.out.println("----------------------");
         System.out.println("Valor Total de las ventas: "+acoTotal);
    
     scanner.close();
    }
    
}
