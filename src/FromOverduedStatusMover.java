public class FromOverduedStatusMover extends BookMover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        String errorMessage = "Перевод книги из статуса `X` в статус `Y` невозможен";
        if (book.getStatus() != Status.OVERDUED) {
            System.out.println(errorMessage);
            return;
        }
        switch (requestedStatus) {
            case AVAILABLE -> book.setStatus(Status.AVAILABLE);
            case ARCHIVED -> book.setStatus(Status.ARCHIVED);
            default -> System.out.println(errorMessage);
        }
    }
}