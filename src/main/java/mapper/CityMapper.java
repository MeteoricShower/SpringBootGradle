package mapper;

import domain.City;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Mybatis Mapper接口，实际上就是实现了Dao层功能
 */
@Mapper
public interface CityMapper {
    @Select("select * from city where id = #{id}")
//如果数据库字段名和Java类数据字段名一致，以下注解不需要
//id属性可以在其它位置被引用
    @Results(id = "cityMap", value = {
            @Result(property = "id", column = "id", id = true),
            @Result(property = "name", column = "name"),
            @Result(property = "province", column = "province"),
            @Result(property = "country", column = "country")
    })
    City getOne(int id);

    @Select("select * from city")
    @ResultMap(value="cityMap") //value属性引用上面的定义
    List<City> getAll();

    @Insert("insert into city(name,province,country) values(#{name}, #{province}, #{country})")
    void insert(City city);

    @Update("update city set name = #{name}, province = #{province}, country = #{country} where id = #{id}")
    void update(City city);

    @Delete("delete from city where id = #{id}")
    void delete(int id);

}