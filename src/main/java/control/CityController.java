package control;

import domain.City;
import org.springframework.web.bind.annotation.*;
import service.CityService;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/db/city") //url以/db/city开始
public class CityController {
    @Resource
    private CityService cityService; //控制器依赖于CityService，由Spring自动注入

    //访问url： http://localhost:8080/db/city/all
    @GetMapping("/all")
    public List<City> findAllCity() {
        return cityService.queryAllCity();
    }

    //访问url： http://localhost:8080/db/city/one/38
    @GetMapping("/one/{id}")
    public City findCityById(@PathVariable(value = "id") Integer id) {
        return cityService.queryCityById(id);
    }

    //访问url： http://localhost:8080/db/city/add
    //需要Post的Json数据: {"name":"仙桃","province":"湖北","country":"中国"}， 注意不用指定id
    @PostMapping("/add")
    public String addCity(@RequestBody City city) {
        cityService.AddCity(city);
        return "添加City成功";
    }

    //访问url： http://localhost:8080/db/city/update
    //需要Post的Json数据: {"id":39,"name":"潜江","province":"湖北","country":"中国"}， 必须指定id
    //把插入的城市仙桃改成潜江
    @PostMapping("/update")
    public String updateCity(@RequestBody City city) {
        cityService.ModifyCity(city);
        return "修改City成功";
    }

    //访问url： http://localhost:8080/db/city/delete/39
    @GetMapping("/delete/{id}")
    public String deleteCity(@PathVariable(value="id") int id){
        cityService.removeCityBydId(id);
        return "删除City成功";
    }
}