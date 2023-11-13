public class Vehiculo {
    private String color;
    private int ventana;
    private int  puerta;
    private int luces;
    private boolean cajuela;
    private boolean matricula;
    private double kilometraje;
  
    public Vehiculo(String color, int ventana,int puerta ,int luces, boolean cajuela, boolean matricula,double kilometraje) {
       this.color=color;
       this.ventana=ventana;
       this.puerta=puerta;
       this.matricula=matricula;
       this.cajuela=cajuela;
       this.luces=luces;
       this.kilometraje=kilometraje;

    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVentana() {
        return ventana;
    }

    public void setVentana(int ventana) {
        this.ventana = ventana;
    }

    public int getPuerta() {
        return puerta;
    }

    public void setPuerta(int puerta) {
        this.puerta = puerta;
    }

    public int getLuces() {
        return luces;
    }

    public void setLuces(int luces) {
        this.luces = luces;
    }

    public boolean isCajuela() {
        return cajuela;
    }

    public void setCajuela(boolean cajuela) {
        this.cajuela = cajuela;
    }

    public boolean isMatricula() {
        return matricula;
    }

    public Vehiculo(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;

    
    }

   

}