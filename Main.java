public class Main {
    public static void main(String[] args) {

//        3) Создайте класс Book с полями author, title и yearOfPublishing. Создайте массив типа Book и заполните его книгами.
//        Найдите в массиве все книги, названия которых начинаются на «А» изданные после 2020 года.
        Book[] books = new Book[2];
        books[0] = new Book("Avalon", 2010);
        books[1] = new Book("Aloha", 2023);

        for (Book book : books) {
            if ((book.getYearOfPublishing() > 2020  && (book.getTitle().startsWith("A")))) {
                System.out.println(book);
            }
        }
//        ***********************************************
//        2) Создайте массив из всех нечётных чисел от 1 до 99, выведите его элементы на экран в обратном порядке.
        int num = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) num++;
        }
        int[] numbers = new int[num];
        for (int i = 1, b = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                numbers[b] = i;
                b++;
            }
        }
        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
//        ************************************************
//        1) Найти максимальный по значению элемент массива.
        int[] numbers = {15, 99, 3478, 9389848, 14, 1};
        int max = numbers[0];
        for (int num =1; num < numbers.length; num++) {
            if(numbers[num] > max)  {
                max = numbers[num];
            }
        }
        System.out.println(max);
    }
}