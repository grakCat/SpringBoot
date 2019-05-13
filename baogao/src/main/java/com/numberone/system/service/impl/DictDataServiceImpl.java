package com.numberone.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.numberone.system.mapper.DictDataMapper;
import com.numberone.system.domain.DictData;
import com.numberone.system.service.IDictDataService;
import com.numberone.common.support.Convert;

/**
 * 字典数据 服务层实现
 * 
 * @author numberone
 * @date 2019-05-09
 */
@Service
public class DictDataServiceImpl implements IDictDataService 
{
	@Autowired
	private DictDataMapper dictDataMapper;

	/**
     * 查询字典数据信息
     * 
     * @param dictCode 字典数据ID
     * @return 字典数据信息
     */
    @Override
	public DictData selectDictDataById(Integer dictCode)
	{
	    return dictDataMapper.selectDictDataById(dictCode);
	}
	
	/**
     * 查询字典数据列表
     * 
     * @param dictData 字典数据信息
     * @return 字典数据集合
     */
	@Override
	public List<DictData> selectDictDataList(DictData dictData)
	{
	    return dictDataMapper.selectDictDataList(dictData);
	}
	
    /**
     * 新增字典数据
     * 
     * @param dictData 字典数据信息
     * @return 结果
     */
	@Override
	public int insertDictData(DictData dictData)
	{
	    return dictDataMapper.insertDictData(dictData);
	}
	
	/**
     * 修改字典数据
     * 
     * @param dictData 字典数据信息
     * @return 结果
     */
	@Override
	public int updateDictData(DictData dictData)
	{
	    return dictDataMapper.updateDictData(dictData);
	}

	/**
     * 删除字典数据对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteDictDataByIds(String ids)
	{
		return dictDataMapper.deleteDictDataByIds(Convert.toStrArray(ids));
	}
	
}
