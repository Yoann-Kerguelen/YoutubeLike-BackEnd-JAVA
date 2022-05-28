package fr.yo.youtube.dao.hibernate;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.yo.youtube.entities.Category;

/**
 * le repository pour les crud de category
 */

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {

}
