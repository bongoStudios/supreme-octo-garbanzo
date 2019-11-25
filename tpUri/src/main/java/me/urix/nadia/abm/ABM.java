package me.urix.nadia.abm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public final class ABM {
    private static Map<String,Pet> pets = new HashMap<String,Pet>();
    private static Scanner scanner = new Scanner(System.in);
    private ABM() {}

    public static void run() {
        while(true) {
            int in;
            System.out.println("1. Set Pet\n2. Remove Pet\n3. Modify existing Pet\n4. Feed Pet\n5. Greet Pet\n0. Go away");
            if(scanner.hasNextInt()) {
                in = scanner.nextInt();
                scanner.nextLine();
            } else {
                continue;
            }
            switch(in) {
                case 1:
                    set();
                    break;
                case 4:
                    feeds();
                    break;
                case 2:
                    kill();
                    break;
                case 3:
                    modify();
                    break;
                case 5:
                    greets();
                    break;
                case 0:
                    return;
            }
            System.out.println("Continue... (press enter)");
            if(scanner.hasNextLine()) scanner.nextLine();
        }
    }


    public static void kill() {
        String namae;
        while(true) {
            System.out.println("Name?");
            if(scanner.hasNextLine()) {
                namae = scanner.nextLine();
                break;
            }
        }
        if(ABM.pets.containsKey(namae)) {
            ABM.pets.remove(namae);
            System.out.println("Pet has been killed");
        } else {
            System.out.println("That pet doesn't exist!");
        }
    }

    public static void modify() {
        Pet pet;
        while(true) {
            System.out.println("Name?");
            if(scanner.hasNextLine()) {
                String namae;
                namae = scanner.nextLine();
                if(ABM.pets.containsKey(namae)) {
                    pet = ABM.pets.get(namae);
                    break;
                }
            }
        }
        boolean sings = false;
        if(pet instanceof Bird && pet.getGreetings() != "pio") sings = true;
        while(true) {
            System.out.println("number?\n1. modify name\n2. modify owner");
            if(sings) {
                System.out.println("3. modify singing");
            }
            System.out.println("0. exit");

            int in;
            if(scanner.hasNextInt()) {
                in = scanner.nextInt();
            } else {
                continue;
            }
            scanner.nextLine();
            switch(in) {
                case 1:
                    String namae;
                    while(true) {
                        System.out.println("name?");
                        if(scanner.hasNextLine()) {
                            namae = scanner.nextLine();

                            if(ABM.pets.containsKey(namae)) {
                                System.out.println("already exists");
                                continue;
                            }
                            break;
                        }
                    }
                    pets.remove(pet.getName());
                    pet.setName(namae);
                    pets.put(namae, pet);
                    break;
                case 2:
                    String owner;
                    while(true) {
                        System.out.println("new owner");

                        if(scanner.hasNextLine()) {
                            owner = scanner.nextLine();
                            break;
                        }
                    }
                    pet.setOwner(owner);
                    pets.put(pet.getName(), pet);
                    break;
                case 3:
                    if(!sings) break;

                    String singing;
                    while(true) {
                        System.out.println("singing?");
                        if(scanner.hasNextLine()) {
                            singing = scanner.nextLine();
                            break;
                        }
                    }
                    pet.setGreetings(singing);
                    pets.put(pet.getName(), pet);
                    break;
                case 0:
                    return;
            }
        }
    }

    public static void set() {
        String namae;
        String owner;
        String type;
        Pet pet = null;

        while(true) {
            System.out.println("Name?");
            if(scanner.hasNextLine()) {
                namae = scanner.nextLine();
                if(ABM.pets.containsKey(namae)) {
                    System.out.println("it already exists"); continue;
                }
                break;
            }
        }
        while(true) {
            System.out.println("Owner?");
            if(scanner.hasNextLine()) {
                owner = scanner.nextLine();
                break;
            }
        }
        while(true) {
            System.out.println("Type?");
            if(scanner.hasNextLine()) {
                type = scanner.nextLine();
                switch(type.toLowerCase()) {
                    case "dog": 
                        pet = new Dog(namae, owner);
                        break;
                    case "cat":
                        pet = new Cat(namae, owner);
                        break;
                    case "fish":
                        pet = new Fish(namae, owner);
                        break;
                    case "bird":
                        boolean sings = false;
                        while(true) {
                            System.out.println("Sings?");
                            if(scanner.hasNextBoolean()) {
                                sings= scanner.nextBoolean();
                                scanner.nextLine();
                                break;
                            }
                        }
                        if(sings) {
                            String canto;
                            while(true) {
                                System.out.println("How?");
                                if(scanner.hasNextLine()) {
                                    canto = scanner.nextLine();
                                    break;
                                }
                            }
                            pet = new Bird(namae, owner, canto);
                        } else {
                            pet = new Bird(namae, owner);
                        }
                }
                if(pet != null) {
                    break;
                }
            }
        }
        ABM.pets.put(namae, pet);
    }

    public static void greets() {
        Pet peet;
        String owner;

        while(true) {
            System.out.println("name?");
            if(scanner.hasNextLine()) {
                String namae = scanner.nextLine();
                if(ABM.pets.containsKey(namae)) {
                    peet = ABM.pets.get(namae);
                    break;
                }
            }
        }
        
        while(true) {
            System.out.println("who is greeting?");
            if(scanner.hasNextLine()) {
                owner = scanner.nextLine();
                break;
            }
        }

        try {
            System.out.println(peet.greet(owner));
            pets.put(peet.getName(), peet);
        } catch (Death death) {
            pets.remove(peet.getName());
            System.out.println("YOU KILLED HIM!");
        }
    }

    public static void feeds() {
        Pet pet;

        while(true) {
            System.out.println("name?");
            if(scanner.hasNextLine()) {
                String namae = scanner.nextLine();

                if(ABM.pets.containsKey(namae)) {
                    pet = ABM.pets.get(namae);
                    break;
                }
            }
        }

        pet.feed();
        pets.put(pet.getName(), pet);
    }
}
