package cn.rain.ssm.demo2.mapper;

import java.util.List;
import cn.rain.ssm.demo2.po.ItemsCustom;
import cn.rain.ssm.demo2.po.ItemsQueryVo;

public interface ItemsMapperCustom {
    //商品查询列表
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)throws Exception;
}