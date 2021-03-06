package edu.mum.mumsched.repository;


import edu.mum.mumsched.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Integer> {
	Role findByRole(String role);
	Set<Role> findAllByRole(String role);
	Set<Role> findDistinctByRoleIn(List<Role> roles);
	List<Role> findAllByRoleIsNotAndRoleIsNot(String role1, String role2);
}
