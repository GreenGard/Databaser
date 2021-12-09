package org.example;

public class Main {
    public static void main(String[] args) {
        ElectricCarDaoImpl electricCarDaoImpl=new ElectricCarDaoImpl();

        // create new object
        //electricCarDaoImpl.create(new ElectricCar("Mazda","Mx-30",265,9.7,366,432900));
        //electricCarDaoImpl.create(new ElectricCar("Kia","EV6",528,3.5,490,749600));
        //electricCarDaoImpl.create(new ElectricCar( "Kia","e-niro",455,7.8,451,481900));
        //electricCarDaoImpl.create(new ElectricCar( "Kia","e-soul",452,7.6,315,437900));
        //electricCarDaoImpl.create(new ElectricCar(  "Volvo","XC40",418,7.4,413,539100));
        //electricCarDaoImpl.create(new ElectricCar( "BMW","i4",590,3.9,470,625000));

        // get by ID
        //System.out.println(electricCarDaoImpl.getById(13));

        // update
        //ElectricCar electricCar =electricCarDaoImpl.getById(13);
        //electricCar.setAcceleration(7.9);
        //electricCarDaoImpl.update(electricCar);

        //delete
        //electricCarDaoImpl.delete(electricCarDaoImpl.getById(13));

        // sort by brand
        // for (ElectricCar brand: electricCarDaoImpl.sortByBrand()){
        // System.out.println(brand);}
        
        // by price
        // System.out.println(electricCarDaoImpl.getByPriceInterval(300000,452900).toString());

        // Drive range
        // System.out.println(electricCarDaoImpl.getByDriveRange(400,600).toString());
    }
}