import java.util.Scanner;
public class Carro extends Vehiculo {
Scanner lector=new Scanner(System.in);
private int espejo;
private int asiento;
private int llantas;

    public Carro(String color, int ventana, int puerta, int luces, boolean cajuela, boolean matricula,double kilometraje,int espejo,int asiento,int llantas) {
        super(color, ventana, puerta, luces, cajuela, matricula,kilometraje);
      
        this.espejo=espejo;
        this.asiento=asiento;
        this.llantas=llantas;
    }
    public String dirigir(String dirgir){
        System.out.println("Desea cambiar de grados");
         dirgir=lector.nextLine();
        return dirgir;
    }
    public String  palanca_velocidad(String palanca){
        System.out.println("A que velocidad desea cambiar");
        palanca=lector.nextLine();
        return palanca;
    }
    public int  Moverse( int  moverse){
        System.out.println("Desea 1)incrementar 2) decrementar");
        moverse=lector.nextInt();
        return moverse;


    }
    
}


