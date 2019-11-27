package proyecto.ej2;

import java.util.ArrayList;
import java.util.Scanner;


public final class  Main {

    public static void main(String[] args) {

        ArrayList<MascotaNueva> facundoGambacorta = new ArrayList<MascotaNueva>();
        Scanner scan = new Scanner(System.in);
        String opt = "";
        String opt2 = "";
        String opt3 = "";
        int opt4 = 0;
        int opt5 = 0;
        int opt6 = 0;
        String opt7 = "";

        while(true) {
        System.out.println("Quiere ingresar un animal?");
        System.out.println("(si/no)");
        System.out.println();
        System.out.println();

        opt = scan.nextLine();
        if(opt.compareTo("no") == 0) {

            System.out.println("k chau");
            return;
        }

        else if(opt.compareTo("si") != 0)
        System.out.println("Voy a tomar eso como un si.");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("que quiere ingresar? (1/2/3)");
        System.out.println("1. dawg");
        System.out.println("2. ket");
        System.out.println("3. turtol");
        opt = "";
        opt = scan.nextLine();
        System.out.println("Me parece correcto. Como se llama?");
        opt2 = scan.nextLine();
        System.out.println("Muy nice. Como se llama usted?");
        opt3 = scan.nextLine();
        System.out.println("dia");
        opt4 = scan.nextInt();
        System.out.println("mes");
        opt5 = scan.nextInt();
        System.out.println("ano");
        opt6 = scan.nextInt();
        if(opt.compareTo("3") == 0)
        facundoGambacorta.add(new Tortuga(opt2, opt3, opt4, opt5, opt6));
        else if(opt.compareTo("2") == 0) {
            System.out.println("raza?");
            opt7 = scan.nextLine();
            facundoGambacorta.add(new Gato(opt2, opt3, opt4, opt5, opt6, opt7));
        }
        else if(opt.compareTo("1") == 0) {
            System.out.println("raza?");
            opt7 = scan.nextLine();
            facundoGambacorta.add(new Perro(opt2, opt3, opt4, opt5, opt6, opt7));
        }

        }




    }

    public static boolean checkVisitasObligatorias(MascotaNueva gary) {

        int auxPower = 0;
        for(int j = 0; j < gary.visitas.size(); j++) {

            if(gary.visitas.get(j).getAno() == 2019)
            auxPower++;
        }

        if(gary.es() == 1) {
            if(auxPower > 1)
            return true;
            else return false;
        }
        else if(gary.es() == 2) {
            System.out.println("hola soy dog");
            System.out.println("fui al medico " + auxPower + " veces");
            if(auxPower > 3) {
            return true;
            }
            else return false;
        }
        else if(gary.es() == 3) {
            if(auxPower > 0)
            return true;
            else return false;
        }

        return false;

    }

    public static boolean checkAsistenciaPerfecta(MascotaNueva gary) {

        if(gary.es() == 1) {
            int opt = 2019 - gary.getNac().getAno()+1;
            if(gary.visitas.size() == opt*2)
            return true;
            else return false;
        }

        else if(gary.es() == 2) {
            System.out.println("so un perro");
            int opt = 2019 - gary.getNac().getAno()+1;
            if(opt*4 == gary.visitas.size())
            return true;
            else return false;
        }

        else if(gary.es() == 3) {

            if(gary.visitas.size() == (2019 - gary.getNac().getAno()))
            return true;
            else return false;
        }

        return false;

    }

    public static ArrayList<String> razasQueNoCumplieron(ArrayList<MascotaNueva> jaja) {

        int aux = 0;
        ArrayList<String> razas = new ArrayList<String>();
        for(int i = 0; i < jaja.size(); i++) {

            if(jaja.get(i).es() == 2) {

                for(Fecha visita: jaja.get(i).visitas) {

                    if(visita.getAno() == 2019)
                    aux++;
                }
                if(aux < 4)
                if(razas.indexOf(jaja.get(i).getRaza()) != -1)
                System.out.println();
                else {
                    razas.add(jaja.get(i).getRaza());
                }
            }
            aux = 0;
        }
        return razas;
    }

    public int mejorMascota(ArrayList<MascotaNueva> jaja) {

        int aux1 = 0;
        int aux2 = 0;
        int aux3 = 0;

        for(int i = 0; i < jaja.size(); i++) {

            if(jaja.get(i).es() == 1) {
                for(Fecha cac: jaja.get(i).visitas) {
                    if(cac.getAno() == 2019)
                    aux1++;
                }
            }

            else if(jaja.get(i).es() == 2) {
                for(Fecha cac: jaja.get(i).visitas) {
                    if(cac.getAno() == 2019)
                    aux2++;
                }
            }

            else if(jaja.get(i).es() == 3) {
                for(Fecha cac: jaja.get(i).visitas) {
                    if(cac.getAno() == 2019)
                    aux3++;
                }
            }

        }
        if(aux3 > aux2) {
            if(aux3 > aux1) {
                return 3;
            }
            else return 1;
        } else if(aux2 > aux1)
            return 2;
            else return 1;


    }
}
