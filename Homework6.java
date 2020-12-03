package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework6 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ScientificBook book = new ScientificBook("text",200, 19,400 );
        System.out.println(book.expensive());
        int n,m;
        do {
            System.out.println("Input number of fiction book");
            n = scanner.nextInt();
        } while(n<=0);
        List<FictionBook> fiction = createFictionBookList(n);
        do{
            System.out.println("Input number of scientific book");
            m = scanner.nextInt();
        } while (m<=0);
        List<ScientificBook> scientific = createScientificBookList(m);

        System.out.println("Most popular Fiction books");
        printMaxPopularity(fiction, maxPopular(fiction));
        System.out.println("Scientific Books ");
        printScientificBooks(scientific, averageExpecive(scientific), maxLib(scientific));

        System.out.println("Make sure the first line is a subsequence of the second.");
        System.out.println("Input First string");
        String first= scanner.nextLine();
        System.out.println("Input second string");
        String second= scanner.nextLine();
        System.out.println(hasString(first, second));
    }

    public static List<FictionBook> createFictionBookList(int n){
        List<FictionBook> fiction = new ArrayList<FictionBook>();
        for (int i=0; i<n; i++){
            System.out.println("Input title of " + (i+1) +"-th fiction book");
            String title = scanner.nextLine();
            System.out.println("Input number of" + (i+1) + "-th book editions");
            int edition = scanner.nextInt();
            System.out.println("Input number of" + (i+1) + "-th book sales");
            int soldBooks = scanner.nextInt();
            fiction.add(new FictionBook(title, edition, soldBooks));
        }
        return fiction;
    }

    public static List<ScientificBook> createScientificBookList(int m){
        List<ScientificBook> scientific = new ArrayList<ScientificBook>();
        for (int i=0; i<m; i++){
            System.out.println("Input title of " + (i+1) + "-th scientific book");
            String title = scanner.nextLine();
            System.out.println("Input price of " + (i+1) + "-th scientific book");
            int price = scanner.nextInt();
            System.out.println("Input number of pages of " + (i+1) + "-th scientific book");
            int num = scanner.nextInt();
            System.out.println("Input number of library copies of " + (i+1) + "-th scientific book");
            int libCopy = scanner.nextInt();
            scientific.add(new ScientificBook(title,price,num,libCopy));
        }
        return scientific;
    }
    public static double maxPopular(List<FictionBook> fiction) {
        double max = fiction.get(0).popularity();
        for (int i = 0; i < fiction.size(); i++) {
            if (fiction.get(i).popularity() > max) {
                max = fiction.get(i).popularity();
            }
        }
        return max;
    }

    public static void printMaxPopularity(List<FictionBook> fict, double maxValue) {
        for (int i = 0; i < fict.size(); i++) {
            if (fict.get(i).popularity() == maxValue) {
                System.out.println(fict.get(i).getBookTitle());
            }
        }
    }

    public static double averageExpecive(List<ScientificBook> scient) {
        double avg = 0.0;
        for (ScientificBook sc: scient) {
            avg += sc.expensive();
        }
        return avg / scient.size();
    }

    public static double maxLib(List<ScientificBook> scientific) {
        double max = scientific.get(0).getNumberOfGivenLibraries();
        for (int i = 0; i < scientific.size(); i++) {
            if (scientific.get(i).getNumberOfGivenLibraries() > max) {
                max = scientific.get(i).getNumberOfGivenLibraries();
            }
        }
        return max;
    }

    public static void printScientificBooks(List<ScientificBook> scientific, double avg, double max) {
        int k = 0;
        for (ScientificBook sc : scientific) {
            if ((sc.expensive() < avg) && (sc.getNumberOfGivenLibraries() == max)) {
                k++;
                System.out.println(sc.getBookTitle());
            }
        }
        if (k == 0) {
            System.out.println("Not found");
        }
    }

    public static boolean hasString(String first, String second) {
        if (first.length() > second.length()) {
            return false;
        }
        if (first.length() == second.length()) {
            if(first.equals(second)){
                return true;
            }
            else {
                return false;
            }
        }
        if(!first.equals(second.substring(0,first.length()))) {
            return hasString(first, second.substring(1));
        }
        return true;
    }

}
