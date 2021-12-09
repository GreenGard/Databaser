package org.example;

import java.util.List;

public interface ElectricCarDAO {

    public void create(ElectricCar electricCar);
    public ElectricCar getById(int id);
    public void update(ElectricCar electricCar);
    public void delete(ElectricCar electricCar);
    public List<ElectricCar>  sortByBrand();
    public List<ElectricCar> getByPriceInterval(int from, int to);
    public List<ElectricCar> getByDriveRange(int from, int to);
}
