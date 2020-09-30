package com.bkap.repositories;

import com.bkap.entity.News;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Project-SemIV
 *
 * @author Tung lam
 * @created_at 22/07/2020 - 17:51
 * @created_by Tung lam
 * @since 22/07/2020
 */
@Repository
public interface NewsRepository extends JpaRepository<News, Long> {
    @Query("from News p where p.status =1")
    List<News> findAllProductByStatus();

    News findByName(String name);

    // query ham` search , search theo name va description
//    @Query("SELECT p FROM News p"
//            + " WHERE (p.name LIKE %:searchValue% OR p.description LIKE %:searchValue%)")
//    // phan trang
//    Page<News> findBySearchValue(@Param("searchValue") String searchValue, Pageable pageable);
//
//    @Query(value = "SELECT p FROM News p INNER JOIN p.categories c WHERE c.id = :id")
//    Page<News> getAllProductByCategory(@Param("id") Long id, Pageable pageable);
//
//    List<News> getProductByCategoriesId(Long id);
//
//    List<News> getProductByCategoriesName(String name);

}
