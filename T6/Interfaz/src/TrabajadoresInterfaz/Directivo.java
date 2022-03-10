package TrabajadoresInterfaz;

public final class Directivo extends Persona implements Comision{
    private int capital;

    public Directivo() {
    }

    public Directivo(String nombre, String apellido, String dni, int capital) {
        super(nombre, apellido, dni);
        this.capital = capital;

    }


    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Capital "+capital);
    }

    @Override
    public double votar() {
        double voto = (Math.random()*11)/2;
        return voto;
    }

    @Override
    public void obtenerBeneficios(int beneficio) {
        System.out.println("El beneficio es :" +beneficio*0.20);
    }


}
