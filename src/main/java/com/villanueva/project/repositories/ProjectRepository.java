package com.villanueva.project.repositories;

import com.villanueva.project.models.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {

    @Override
    default Iterable<Project> findAllById(Iterable<Long> longs) {
        return null;
    }
}
