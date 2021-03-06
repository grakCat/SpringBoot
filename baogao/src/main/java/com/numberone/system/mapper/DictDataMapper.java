package com.numberone.system.mapper;

import com.numberone.system.domain.DictData;
import java.util.List;	

/**
 * 字典数据 数据层
 * 
 * @author numberone
 * @date 2019-05-09
 */
public interface DictDataMapper 
{
	/**
     * 查询字典数据信息
     * 
     * @param dictCode 字典数据ID
     * @return 字典数据信息
     */
	public DictData selectDictDataById(Integer dictCode);
	
	/**
     * 查询字典数据列表
     * 
     * @param dictData 字典数据信息
     * @return 字典数据集合
     */
	public List<DictData> selectDictDataList(DictData dictData);
	
	/**
     * 新增字典数据
     * 
     * @param dictData 字典数据信息
     * @return 结果
     */
	public int insertDictData(DictData dictData);
	
	/**
     * 修改字典数据
     * 
     * @param dictData 字典数据信息
     * @return 结果
     */
	public int updateDictData(DictData dictData);
	
	/**
     * 删除字典数据
     * 
     * @param dictCode 字典数据ID
     * @return 结果
     */
	public int deleteDictDataById(Integer dictCode);
	
	/**
     * 批量删除字典数据
     * 
     * @param dictCodes 需要删除的数据ID
     * @return 结果
     */
	public int deleteDictDataByIds(String[] dictCodes);
	
}