package in.sp.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sp.main.entites.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
