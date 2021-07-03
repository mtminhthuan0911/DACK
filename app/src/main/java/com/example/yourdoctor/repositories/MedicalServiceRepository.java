package com.example.yourdoctor.repositories;

import com.example.yourdoctor.helpers.ApiHelper;
import com.example.yourdoctor.models.MedicalService;

import java.util.ArrayList;
import java.util.List;

public class MedicalServiceRepository {
    private ApiHelper apiHelper;

    public MedicalServiceRepository() {
        apiHelper = new ApiHelper();
    }

    public List<MedicalService> getAll() {
        List<MedicalService> list = new ArrayList<>();
        // TODO Call api
        // apiHelper.getClient().get(apiHelper.getApiUrl() + "/medical-services");
        return list;
    }

    public MedicalService getById(int id) {
        return null;
    }

    public void create() {

    }

    public void update() {

    }

    public void delete() {

    }
}
