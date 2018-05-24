package com.portal.Service.HrMasterServices;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Entity.HrMasterSetUp.Department;
import com.portal.Repository.HrMasterRepositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 24/5/2018
 */
@Service
public class DepartmentService implements CommonConstant{

    @Autowired
    private DepartmentRepository departmentRepository;

    //this method will work for save or update object
    public Department save(Department department){
        try {
            return departmentRepository.save(department);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean findByIdGiven(long id){
        try {
            return departmentRepository.existsById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Department findById(long id){
        try {
            return departmentRepository.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Department findByCode(String code){
        try {
            return departmentRepository.findByCode(code);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String delete(Department department){
        try {
            departmentRepository.delete(department);
            return DELETE;
        } catch (Exception e) {
            e.printStackTrace();
            return NOT_DELETE;
        }
    }


}
