package service;

import domain.City;

import java.util.List;

/**
 * Service层的接口
 * Service层通常实现比Dao层更复杂的业务逻辑
 * Demo里只是简单的调用Dao层的dao对象的方法
 */
public interface CityService {
    /**
     * 根据id查询city
     * @param id City的id
     * @return
     */
    public City queryCityById(int id);
    /**
     * 查询所有City
     * @return
     */
    public List<City> queryAllCity();
    /**
     * 插入City
     * @param city 要插入的City
     */
    public void AddCity(City city);
    /**
     * 修改City
     * @param city：新的City
     */
    public void ModifyCity(City city);
    /**
     * 根据id删除City
     * @param id 要删除的City的id
     */
    public void removeCityBydId(int id);
}