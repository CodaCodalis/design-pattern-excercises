package strategy;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hund husky = new Husky();
        husky.printArt();
        husky.setBellVerhalten(new LautBellen());
        husky.setLaufVerhalten(new NormalLaufen());
        husky.belle();
        husky.laufe();
        System.out.println("Soll der " + husky.getArt() + " gefüttert werden? [j/n]");
        if (scanner.nextLine().equals("j")) {
            husky.setLaufVerhalten(new SchnellLaufen());
        }
        husky.laufe();
        System.out.println("Soll der " + husky.getArt() + " leise sein? [j/n]");
        if (scanner.nextLine().equals("j")) {
            husky.setBellVerhalten(new LeiseBellen());
        }
        husky.belle();

        Hund bulldogge = new Bulldogge();
        bulldogge.printArt();
        bulldogge.belle();
        bulldogge.laufe();
        bulldogge.setBellVerhalten(new LautBellen());
        bulldogge.belle();

        Hund pudel = new Pudel();
        bulldogge.printArt();
        pudel.belle();
        pudel.laufe();
        pudel.setBellVerhalten(new LautBellen());
        pudel.belle();

        Hund hundAttrappe = new HundAttrappe();
        hundAttrappe.printArt();
        hundAttrappe.belle();
        System.out.println("Soll die " + hundAttrappe.getArt() + " von der guten Fee zum Leben erweckt werden? [j/n]");
        if (scanner.nextLine().equals("j")) {
            hundAttrappe.setBellVerhalten(new LautBellen());
        }
        hundAttrappe.belle();
    }
}

