public class Test {
    public static void main(String[] args) {
        Book book = new Book("The Game of Thrones");
        System.out.println("Книга: " + book.getTitle());
        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
        BookMover fromArchivedStatusMover = new FromArchivedStatusMover();
        BookMover fromBorrowedStatusMover = new FromBorrowedStatusMover();
        BookMover fromOverduedStatusMover = new FromOverduedStatusMover();
        fromAvailableStatusMover.moveToStatus(book, Status.ARCHIVED);
        fromArchivedStatusMover.moveToStatus(book, Status.OVERDUED);
        fromArchivedStatusMover.moveToStatus(book, Status.AVAILABLE);
        fromAvailableStatusMover.moveToStatus(book, Status.BORROWED);
        fromBorrowedStatusMover.moveToStatus(book, Status.OVERDUED);
        fromOverduedStatusMover.moveToStatus(book, Status.AVAILABLE);
    }
}
