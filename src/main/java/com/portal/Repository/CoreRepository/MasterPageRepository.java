package com.portal.Repository.CoreRepository;

import com.portal.Entity.Core.MasterPage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@RepositoryRestResource
public interface MasterPageRepository extends CrudRepository<MasterPage, Long> {
    MasterPage findByMrfNumber(long mrfNumber);
    MasterPage findById(long id);
}
