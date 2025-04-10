package com.example.demo.controller;

import com.example.demo.common.Constants;
import com.example.demo.dto.ProjectDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectsRestController {

    // Simula la base de datos
    private static final List<ProjectDto> listProjectDto = new ArrayList<>();

    /**
     * Inserta el projecto recibido en la base de datos
     * 
     * @param projectDto
     *            objeto a persistir
     * @return
     */
    @PostMapping(value = "add", consumes = Constants.ENDPOINT_CONSUME, produces = Constants.ENDPOINT_CONSUME)
    public boolean addProject(@RequestBody ProjectDto projectDto) {
        listProjectDto.add(projectDto);
        return true; // TODO cambiar a objeto Response
    }

    /**
     * Obtiene la lista completa de ProjectDto.
     *
     * @return Lista de proyectos
     */
    @GetMapping(value = "list", produces = Constants.ENDPOINT_CONSUME)
    public List<ProjectDto> getProjects() {
        return listProjectDto;
    }
}
