package com.company.softwaremarket.repositories;

import com.company.softwaremarket.models.entities.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;

@Repository
public interface UserRepository extends CrudRepository<UserEntity,Long> {
    @Query("SELECT pe.rol.roleName FROM UserEntity u" +
            "  JOIN PerfilEntity pe " +
            "ON u.id=pe.id" )

    Set<String> findRoleByUserId(@Param("userId") Long userId);

    @Query("SELECT u FROM UserEntity u WHERE u.username=:username")
    Optional<UserEntity> findByUsername(@Param("username") String username);
}
