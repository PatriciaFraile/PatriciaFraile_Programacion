package TrabajosHerencia;


import java.util.ArrayList;

public class Empresa {
    private ArrayList<Trabajadores> lista;
    Trabajadores trabajadores = new Trabajadores();

    public Empresa() {
        lista = new ArrayList<>();
    }

    public void añadirPersonal(Trabajadores trabajador) {
        if (existePersona(trabajador.getDin()) == null) {
            lista.add(trabajador);
            System.out.println("Añadido correctamente");
        }
    }

    private Trabajadores existePersona(String dni) {
        Trabajadores persona = null;
        for (Trabajadores item : lista) {
            if (item.getDin().equalsIgnoreCase(item.getDin())) {
                return item;
            }

        }
        return persona;
    }

    private void depedirTrabajador(String dni) {
        boolean encontrado = false;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getDin().equalsIgnoreCase(dni)) {
                System.out.println("Trabajador despedido");
                encontrado = true;
                lista.remove(i);

            }
        }
        System.out.println("Trabajador no encontrado");

    }

    public void mostrarDatos() {
        for (Trabajadores item : lista) {
            item.mostrarDatos(item.din);
        }
    }

    public void listarTodas() {
        for (Trabajadores item : lista) {
            System.out.println(item.getClass().getSimpleName());
            item.mostrarDatoss();
        }
    }

    public void listarAutonomos() {
        for (Trabajadores item : lista) {
            if (item instanceof Autonomos) {
                System.out.println(item.getClass().getSimpleName());
                item.mostrarDatoss();
            }
        }
    }

    public void listarAsalariados() {
        for (Trabajadores item : lista) {
            if (item instanceof Asalariados) {
                System.out.println(item.getClass().getSimpleName());
                item.mostrarDatoss();
            }
        }
    }
}






