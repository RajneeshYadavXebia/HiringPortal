package com.portal.Service.CoreImpl;

import com.portal.Entity.Core.BusinessUnit;
import com.portal.Repository.CoreRepository.BusinessUnitRepository;
import com.portal.Service.Core.BusinessUnitService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 06/6/2018
 */
@Service
public class BusinessUnitServiceImpl implements BusinessUnitService{

    private static Logger logger= LogManager.getLogger(BusinessUnitServiceImpl.class);

    @Autowired
    private BusinessUnitRepository businessUnitRepository;

    @Override
    public BusinessUnit save(BusinessUnit businessUnit) {
        BusinessUnit businessUnit1=null;
        logger.info("Inside ");
        try {
            businessUnit1=businessUnitRepository.save(businessUnit);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return businessUnit1;
    }

    @Override
    public BusinessUnit findById(long id) {
        try {
            return businessUnitRepository.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Iterable<BusinessUnit> findAll() {
        Iterable<BusinessUnit> businessUnits = null;
        try {
            businessUnits=businessUnitRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return businessUnits;
    }
}
