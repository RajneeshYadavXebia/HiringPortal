package com.portal.Repository.CoreRepository;

import com.portal.Entity.Core.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@RepositoryRestResource
public interface LocationRepository extends CrudRepository<Location, Long> {
    List<Location> findByName(String name);
    Location findById(long id);
    List<Location> findByProject(long projctId);
}