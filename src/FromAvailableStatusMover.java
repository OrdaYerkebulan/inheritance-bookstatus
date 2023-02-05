public class FromAvailableStatusMover extends BookMover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        String errorMessage = "Перевод книги из статуса `X` в статус `Y` невозможен";
        if (book.getStatus() != Status.AVAILABLE) {
            System.out.println(errorMessage);
            return;
        }
        switch (requestedStatus) {
            case BORROWED -> book.setStatus(Status.BORROWED);
            case ARCHIVED -> book.setStatus(Status.ARCHIVED);
            default -> System.out.println(errorMessage);
        }
    }
}