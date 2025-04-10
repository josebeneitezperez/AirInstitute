package com.example.demo.service;

import com.example.demo.dto.ProjectDto;

/**
 * Servicio encargado de las operaciones relacionadas con projectos.
 */
public interface ProjectsService {

    /**
     * Inserta el ProjectDto en base de datos
     * 
     * @param projectDto
     *            objeto a insertar
     * @return true si se insertó correctamente, false caso contrario
     */
    boolean add(ProjectDto projectDto);
}
