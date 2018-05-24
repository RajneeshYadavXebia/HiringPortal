package com.portal.Repository;

import com.portal.Entity.ReferalBuddy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@RepositoryRestResource
public interface ReferalBuddyRepository extends CrudRepository<ReferalBuddy, Long> {
    ReferalBuddy findById(long id);
}
