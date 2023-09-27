package me.dio.santanderdevweek2023.exceptions;

public class NoSuchElementException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public NoSuchElementException(String message) {
        super(message);
    }

    public <T> NoSuchElementException(T id, String entidade) {
        super("Não foi encontrado(a) " + entidade + " com o id = " + id);
    }
}
