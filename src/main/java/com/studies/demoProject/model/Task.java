package com.studies.demoProject.model;

/**
 * Klasa reprezentująca pojedyncze zadanie (task) w aplikacji ToDo.
 * Zawiera podstawowe informacje: identyfikator, tytuł oraz status ukończenia.
 */
public class Task {

    /**
     * Unikalny identyfikator zadania.
     */
    private Long id;

    /**
     * Tytuł zadania opisujący jego treść.
     */
    private String title;

    /**
     * Flaga oznaczająca, czy zadanie zostało ukończone.
     */
    private boolean completed;

    /**
     * Konstruktor bezargumentowy wymagany przez frameworki
     * (np. Spring, Jackson).
     */
    public Task() {
        // Konstruktor domyślny
    }

    /**
     * Konstruktor tworzący nowe zadanie z określonymi wartościami pól.
     *
     * @param id        identyfikator zadania
     * @param title     tytuł zadania
     * @param completed informacja, czy zadanie zostało ukończone
     */
    public Task(final Long id, final String title, final boolean completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    /**
     * Zwraca identyfikator zadania.
     *
     * @return identyfikator zadania
     */
    public Long getId() {
        return id;
    }

    /**
     * Ustawia identyfikator zadania.
     *
     * @param id nowy identyfikator
     */
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * Zwraca tytuł zadania.
     *
     * @return tytuł zadania
     */
    public String getTitle() {
        return title;
    }

    /**
     * Ustawia tytuł zadania.
     *
     * @param title nowy tytuł zadania
     */
    public void setTitle(final String title) {
        this.title = title;
    }

    /**
     * Zwraca informację, czy zadanie zostało ukończone.
     *
     * @return true, jeśli zadanie jest ukończone; false w przeciwnym razie
     */
    public boolean isCompleted() {
        return completed;
    }

    /**
     * Ustawia status ukończenia zadania.
     *
     * @param completed nowy status ukończenia
     */
    public void setCompleted(final boolean completed) {
        this.completed = completed;
    }

    /**
     * Zwraca reprezentację tekstową obiektu {@code Task}.
     *
     * @return ciąg tekstowy z informacjami o zadaniu
     */
    @Override
    public String toString() {
        return "Task{"
                + "id=" + id
                + ", title='" + title + '\''
                + ", completed=" + completed
                + '}';
    }
}
