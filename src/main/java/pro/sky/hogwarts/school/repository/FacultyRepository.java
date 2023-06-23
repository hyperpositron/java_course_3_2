package pro.sky.hogwarts.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.hogwarts.school.model.Faculty;

import java.util.Collection;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {

    Collection<Faculty> findByColorLike(String color);
}