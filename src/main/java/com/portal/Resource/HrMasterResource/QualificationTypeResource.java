package com.portal.Resource.HrMasterResource;

import com.portal.Service.HrMasterServices.QualificationTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 24/5/2018
 */
@RestController
@RequestMapping("/rest/qulyType")
public class QualificationTypeResource {

    @Autowired
    private QualificationTypeService qualificationTypeService;

}