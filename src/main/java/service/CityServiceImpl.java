package service;

import domain.City;
import mapper.CityMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CityServiceImpl implements CityService{
    @Resource
    private CityMapper cityMapper; //CityService的实现依赖于CityMapper, 由Spring自动注入
    /**
     * 根据id查询city
     *
     * @param id City的id
     * @return
     */
    @Override
    public City queryCityById(int id) {
        //这里只是简单调用CityMapper的getOne方法查询记录
        //实际上这里应该是更复杂的业务逻辑，下面其他方法一样
        return cityMapper.getOne(id);
    }

    /**
     * 查询所有City
     *
     * @return
     */
    @Override
    public List<City> queryAllCity() {
        return cityMapper.getAll();
    }

    /**
     * 插入City
     *
     * @param city 要插入的City
     */
    @Override
    public void AddCity(City city) {
        cityMapper.insert(city);
    }

    /**
     * 修改City
     *
     * @param city ：新的City
     */
    @Override
    public void ModifyCity(City city) {
        cityMapper.update(city);
    }

    /**
     * 根据id删除City
     *
     * @param id 要删除的City的id
     */
    @Override
    public void removeCityBydId(int id) {
        cityMapper.delete(id);
    }
}
