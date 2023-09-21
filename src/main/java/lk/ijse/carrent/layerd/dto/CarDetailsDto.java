package lk.ijse.carrent.layerd.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class CarDetailsDto {
    private String id;

    private String carCategoryId;

    private String userName;

    private String brand;

    private String model;

    private Integer year;

    private String vehicleNumber;

    private Double pricePerDay;

    private String CarCategoryName;

    public CarDetailsDto(String id) {
        this.id = id;
    }
}
