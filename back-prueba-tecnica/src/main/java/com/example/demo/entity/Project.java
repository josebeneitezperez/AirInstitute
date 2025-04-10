package com.example.demo.entity;

/**
 * Entidad que representa un proyecto en la base de datos.
 */
// @Entity
public class Project {

    /** Identificador único del proyecto. */
    private int    id;

    /** Título del proyecto. */
    private String title;

    /** Descripción del proyecto. */
    private String description;

    /** Constructor por defecto. */
    public Project() {
    }

    /**
     * Constructor con todos los campos.
     *
     * @param id
     *            Identificador del proyecto
     * @param title
     *            Título del proyecto
     * @param description
     *            Descripción del proyecto
     */
    public Project(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
