package com.ThunderGym.maintenance;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MaintenanceRepository extends CrudRepository<Project, Long> {

}
