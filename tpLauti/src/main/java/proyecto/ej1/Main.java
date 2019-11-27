package proyecto.ej1;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public final class Main {

    public static HashSet<Mascota> mascotas = new HashSet<Mascota>();
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
    
        
        System.out.println("Bienvenido a este asombroso ABM de animales, donde los torturamos, maltratamos y esclavizamos y vos ni te das cuenta!");
        System.out.println();
        System.out.println();
        System.out.println("Presione enter para continuar.");
        scan.nextLine();
        redirect();

    }

    public static void redirect() {

        switch (menu()) {
            
            case 1:
                menuAgregarMascota();
                break;
        
            case 2:

                borrarMascota();
                break;
            
            case 3:
                
                menuModificarMascota();
                break;

            case 4:

                saludarAnimal();
                break;

            case 5:

                alimentarAnimal();
                break;

            case 0:

                break;
            

            default:

                System.out.println("Incorrecto. Vuelva a intentar.");
                redirect();
                break;
        }
    }
    public static int menu() {

        
        int opt = 0;
        System.out.println("1. Agregar animal");
        System.out.println("2. Borrar animal");
        System.out.println("3. Modificar animal");
        System.out.println("4. Saludar animal");
        System.out.println("5. Alimentar animal");
        System.out.println("0. Salir");

        if(scan.hasNextInt()) {
            opt = scan.nextInt();
            scan.nextLine();

            if((opt > 5) && (opt < 0)) {

                System.out.println("Invalido. Intente de nuevo.");
                opt = Main.menu();
            }
        }
        return opt;
    }

    public static void menuAgregarMascota() {
        
        
        int tipo = 0;
        System.out.println("Que desea agregar?");
        System.out.println();
        System.out.println("1. Pez");
        System.out.println("2. Perro");
        System.out.println("3. Gato");
        System.out.println("4. Pajarito");
        System.out.println("0. Volver");
        try {

                tipo = scan.nextInt();
                scan.nextLine();
            } catch (InputMismatchException e) {

                System.out.println("Invalido, intente de nuevo.");
                menuAgregarMascota();
                return;
                }

        agregarMascota(tipo);
    }

    public static void agregarMascota(int tipo) {

        
        String animal = "";
        String newName = "";
        String newDueno = "";
        String auxLaPrecuela = "";
        String aux = "";
        boolean auxLaSecuela = true;

        switch (tipo) {
            case 1:
                
                animal = "pez";
                break;
            case 2:

                animal = "perro";
                break;

            case 3:

                animal = "gato";
                break;

            case 4:

                animal = "pajarito";
                break;

            case 0:

                redirect();
                break;

            default:

                System.out.println("Invalido, intente de nuevo.");
                menuAgregarMascota();
                break;
        }

        System.out.println("Como se llama su " + animal +"?");
        if(scan.hasNextLine()) newName = scan.nextLine();
        System.out.println("Como se llama el dueno de " + newName + "?");
        if(scan.hasNextLine()) newDueno = scan.nextLine();
        if(tipo == 4) {

            System.out.println(animal + " canta?  (si/no/volver)");
            if(scan.hasNextLine()) auxLaPrecuela = scan.nextLine();
            switch(auxLaPrecuela) {
                case "si":
                    System.out.println("Y como canta?");
                    if(scan.hasNextLine()) aux = scan.nextLine();
                    mascotas.add(new Pajarito(newName, newDueno, aux));
                    auxLaSecuela = false;
                    break;
                case "no":
                    mascotas.add(new Pajarito(newName, newDueno));
                    auxLaSecuela = false;
                    break;
                case "volver":
                    menuAgregarMascota();
                    return;
                default:
                    System.out.println("Incorrecto");
                    menuAgregarMascota();
                    return;
            }




        }
        else if(tipo == 3) {

            mascotas.add(new Gato(newName, newDueno));
            menuAgregarMascota();
            return;
        }

        else if(tipo == 2) {
            
            mascotas.add(new Perro(newName, newDueno));
            menuAgregarMascota();
            return;
        }

        else if(tipo == 1) {
            
            mascotas.add(new Pez(newName, newDueno));
            menuAgregarMascota();
            return;
        }

        menu();
    }

    public static void borrarMascota( ) {

        
        String aux = "";
        System.out.println("Diga el nombre de la mascota que quiere borrar");
        System.out.println("");
        if(scan.hasNextLine()) aux = scan.nextLine();
        if(hasName(aux)) {
        mascotas.remove(getMascota(aux));
        } else {
        System.out.println("No hay mascota con ese nombre.");
        if(scan.hasNextLine()) scan.nextLine();
        borrarMascota();
        }
        return;

    }

    public static void menuModificarMascota( ) {

        
        String aux = "";
        String aux2 = "";
        System.out.println("Como se llama la mascota que desea modificar?   (escriba 0 para cancelar)" );
        if(scan.hasNextLine()) aux = scan.nextLine();
        if(aux.equals("0"))
        redirect();
        else { 

            if(hasName(aux)) {

                System.out.println("+---------------------+");
                System.out.println();
                System.out.println("Nombre:   " + getMascota(aux).getNombre());
                System.out.println();
                System.out.println("Especie:   " + getMascota(aux).es());
                System.out.println();
                System.out.println("Dueno:   " + getMascota(aux).getDueno());
                System.out.println();
                System.out.println("+---------------------+");

                if(scan.hasNextLine()) scan.nextLine();
                while (!aux2.equals("si") && !aux2.equals("no")) {
                    
                    System.out.println("Quiere modificar esta mascota? (si/no)");
                    if(scan.hasNextLine()) aux2 = scan.nextLine();
                }
                 if (aux2.equals("0")) {
                        
                    modificarMascota(getMascota(aux));
                }

                else redirect();
            }

            else {

                System.out.println("No encontramos ninguna mascota con ese nombre!");
                scan.nextLine();
                redirect();
            }
        }
    }

    public static void modificarMascota(Mascota mascota) {

        
        int aux = 0;
        String aux2 = "";
        System.out.println("Que quiere cambiar de la mascota? (si desea volver, ponga 0)");
        System.out.println();
        System.out.println("1. Nombre");
        System.out.println("2. Dueno");

        try {
            
            aux = scan.nextInt();
            scan.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Opcion no valida, intente de nuevo.");
            modificarMascota(mascota);
        }

        if (aux == 0) 
            menuModificarMascota();
        else if (aux == 1) {
            
            System.out.println("(0 para cancelar)");
            System.out.println("Nombre actual de la mascota: " + mascota.getNombre());
            System.out.print("Nombre nuevo: ");
            if(scan.hasNextLine()) aux2 = scan.nextLine();
            if (aux2.equals("0")) 
            menuModificarMascota();
            else 
                if (hasName(aux2)) {
                    
                    System.out.println("Nombre ya en uso.");
                    modificarMascota(mascota);
                }
                else {
                    
                    mascotas.remove(getMascota(mascota.getNombre()));
                    mascota.setNombre(aux2);
                    mascotas.add(mascota);

                }
        }

        else if (aux == 2) {
            
            System.out.println("(0 para cancelar)");
            System.out.println("Dueno actual de la mascota: " + mascota.getDueno());
            System.out.print("Dueno nuevo: ");
            if(scan.hasNextLine()) aux2 = scan.nextLine();
            if (aux2.equals("0")) 
            modificarMascota(mascota);
            else {
                mascota.setDueno(aux2);
                mascotas.remove(getMascota(mascota.getNombre()));
                mascotas.add(mascota);

            }
            
        }
        else {
            System.out.println("Seleccion invalida.");
            modificarMascota(mascota);
        }
        
    }

    public static void saludarAnimal() {

        
        String aux = "";
        String aux2 = "";
        boolean aux3 = false;
        System.out.println("Como se llama el animal que quiere saludar?       (0 para volver)" );
        if(scan.hasNextLine()) aux = scan.nextLine();
        if(aux.equals("0")) {
            menu();
            return;
        }
        System.out.println("Como se llama usted?       (0 para volver)");
        if(scan.hasNextLine()) aux2 = scan.nextLine();
        if(aux2.equals("0"))
        return;
        for (Mascota var : mascotas) {
            if(var.getNombre().equals(aux)) {
                try {
                    var.saludar(aux2);
                    mascotas.remove(getMascota(aux));
                    mascotas.add(var);
                    aux3 = true;
                } catch(Murio e) {
                    mascotas.remove(getMascota(aux));
                }
            }
        }
        if(!aux3) {
            System.out.println("NO se encontro el animal.");
            saludarAnimal();
        }

        menu();
        return;
    }

    public static void alimentarAnimal() {

        
        String aux = "";
        String aux2 = "";
        System.out.println("Como se llama el animal que quiere alimentar?       (0 para volver)" );
        if(scan.hasNextLine()) aux = scan.nextLine();
        if(aux.equals("0"))
        return;
        else if(!hasName(aux)) {

            System.out.println("No encontramos semejante criatura.");
            saludarAnimal();
            
        }

        else {

            for (Mascota var : mascotas) {
                if(var.getNombre().equals(aux)) {

                    var.alimentar();
                    mascotas.remove(getMascota(aux));
                    mascotas.add(var);
                    
                }
            }

        }

        return;
    }
 
 
    public static Mascota getMascota(String newName) {

        Mascota aux = null;
        for (Mascota var : mascotas) {

            if(var.getNombre().equals(newName)) {
                
                aux = var;
                break;
            }
        }
        return aux;
    }

    public static boolean hasName(String name) {
        return (getMascota(name) != null);


    }
}

