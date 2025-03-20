package View;
import Model.Biblioteca;
import Model.Persona;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(1,"BibliotecaSamuel");
        int opcion;
        do {
            menu();
            opcion = leernum("Seleccione una opcion");
            realizarOpcion(opcion,biblioteca);
        } while (opcion != 9);
    }

    public static void menu() {
        System.out.println("1. Añadir Persona a biblioteca");
        System.out.println("2. Eliminar Persona de biblioteca");
        System.out.println("3. Buscar Persona de biblioteca");
        System.out.println("4. Mostrar todas las personas de biblioteca");
        System.out.println("5. Añadir libro a persona");
        System.out.println("6. Eliminar libro a persona");
        System.out.println("7. Buscar libro a persona");
        System.out.println("8. Mostrar todas las libros");
        System.out.println("9. Salir");
    }

    public static void realizarOpcion(int opcion, Biblioteca biblioteca) {
        switch (opcion) {
            case 1:
                addPersona(biblioteca);
                break;
            case 2:
                eliminarPersona(biblioteca);
                break;
            case 3:
                buscarPersona(biblioteca);
                break;
            case 4:
                listarPersonas(biblioteca);
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;

        }
    }

    //leer strings
    public static String leerString(String texto){
        System.out.println(texto);
        Scanner sc=new Scanner(System.in);
        return sc.nextLine();
    }
    //leer booleanos
    public static boolean leerboleano(String texto){
        System.out.println(texto);
        Scanner sc=new Scanner(System.in);
        return sc.nextBoolean();
    }
    //leer numeros
    public static int leernum(String texto){
        System.out.println(texto);
        Scanner sc=new Scanner(System.in);
        return sc.nextInt();
    }

    //metodos biblioteca

    //añadir persona
    public static void addPersona(Biblioteca b) {
        Persona p= new Persona(leerString("Nombre:"),leerString("Apellido:"),leerString("Dni:"));
        if(b.addPersona(p)){
            System.out.println("Persona agregada con exito");
        }else {
            System.out.println("Persona no agregada, ha habido un error");
        }
    }
    //eliminar persona
    public static void eliminarPersona(Biblioteca b) {
        String dni = leerString("Elige una dni");
        if(b.removePersona(dni)){
            System.out.println("Persona eliminada con exito");
        }else{
            System.out.println("Persona no eliminada, ha habido un error");
        }
    }
    //buscar persona
    public static void buscarPersona(Biblioteca b){
        String dni = leerString("Elige una dni");
        for (Persona p : b.getListaPersonas()){
            if(p.getsDni().equals(dni)){
                System.out.printf(b.getPersona(dni).toString());
            }else {
                System.out.println("No encontrado");
            }
        }
    }
    public static void listarPersonas(Biblioteca b){
        if(b.getListaPersonas()!=null){
            System.out.println(b.getListaPersonas().toString());
        }
    }
}