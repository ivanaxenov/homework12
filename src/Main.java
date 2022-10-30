public class Main {
    public static void main(String[] args) {
        Author authorOne = new Author("Александр", " Пушкин");
        Book bookOne = new Book(authorOne, "Капитанская дочка: ", 1836);
        Author authorTwo = new Author("Лев", "Толстой");
        Book bookTwo = new Book(authorTwo, "Детсво: ", 1852);
        bookTwo.setYear(1900);// Новая дата второй книги
        System.out.println("Книга 1 - " + bookOne.getTitle() + authorOne.getName() + authorOne.getLastName() +
                " " + bookOne.getYear());
        System.out.println("Книга 2 - " + bookTwo.getTitle() + authorOne.getName() + authorOne.getLastName() +
                " " + bookTwo.getYear());
        System.out.println("Новая дата книги - " + bookTwo.getYear());

    }
}