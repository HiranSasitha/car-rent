package lk.ijse.carrent.layerd.repository.custom.impl;

import lk.ijse.carrent.layerd.entity.CarCategoryEntity;
import lk.ijse.carrent.layerd.repository.CrudUtil;
import lk.ijse.carrent.layerd.repository.custom.CarCategoryRepo;

import java.util.ArrayList;
import java.util.List;

public class CarCategoryRepoImpl implements CarCategoryRepo {
    @Override
    public Integer add(CarCategoryEntity carCategoryEntity) throws Exception {
       return new CrudUtil().add(carCategoryEntity);
    }

    @Override
    public CarCategoryEntity get(String s) throws Exception {
        return null;
    }

    @Override
    public List<CarCategoryEntity> getAll() throws Exception {
        List<Object> t = new CrudUtil().getAll("FROM CarCategoryEntity");
        List<CarCategoryEntity>carCategoryEntities = new ArrayList<>();

        for (Object type:t)
              {
            CarCategoryEntity entity = (CarCategoryEntity) type;
            carCategoryEntities.add(entity);


        }

        return carCategoryEntities;



    }
}
