package ru.chalovai.PR2.practice1;

public class TestAuthor {
    public static void main (String []args) {
        Author author = new Author("Клиффорд Саймак", "simak_ff@gmail.com", 'M');
        System.out.println(author);
        author.setEmail("clifford_sim@russ.ru");
        System.out.println(author);
    }
}
