import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Tables {
    static class Books {
        private String title;
        private String author;

        public Books(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }
    }

    //Metoda znajdująca książkę o podanym tytule w tablicy
    public static Books FindByTitle(Books[] book, String title) {
        for (Books books : book) {
            if (books != null && books.getTitle().equals(title)) {
                return books;
            }
        }
        return null;
    }

    //Komparator do porównywania książek na podstawie tytułu
    public static class BookTitleComparator implements Comparator<Books> {
        @Override
        public int compare(Books book1, Books book2) {
            return book1.getTitle().compareTo(book2.getTitle());
        }
    }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //Tworzymy tablice typów prostych
            int[] intArray = new int[4];

            intArray[0] = 5;
            intArray[1] = 135;
            intArray[2] = 87;
            intArray[3] = 31;

            //Wyświetlamy tablice
            for (int i = 0; i < intArray.length; i++) {
                System.out.println(intArray[i]);
            }

            //Tworzymy tablice obiektów
            Books[] book = new Books[4];

            book[0] = new Books("R", "L");
            book[1] = new Books("O", "P");
            book[2] = new Books("I", "K");
            book[3] = new Books("Z", "E");

            //Wyświetlamy tablice
            for (int i = 0; i < book.length; i++) {
                System.out.println("Title: " + book[i].getTitle() + " Author: " + book[i].getAuthor());
            }

            //Sortujemy książki według tytułu
            Arrays.sort(book, new BookTitleComparator());
            System.out.println("\n");

            //Wyświetlamy posortowane tablice
            for (int i = 0; i < book.length; i++) {
                System.out.println("Title: " + book[i].getTitle() + " Author: " + book[i].getAuthor());
            }

            //Wyszukiewamy książke po tytule
            System.out.println("Title to find: ");
            String findTitle = scanner.nextLine();

            Books foundBook = FindByTitle(book, findTitle);

            //Wyświetlamy wyniku wyszukiwania
            if (foundBook != null) {
                System.out.println("Found title: " + foundBook.getTitle() + ", Author: " + foundBook.getAuthor());
            } else {
                System.out.println("There is no books with such title");
            }
        }
    }


