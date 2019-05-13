package com.numberone.system.controller;

import com.numberone.common.annotation.Log;
import com.numberone.common.base.AjaxResult;
import com.numberone.common.enums.BusinessType;
import com.numberone.common.page.TableDataInfo;
import com.numberone.common.utils.poi.ExcelUtil;
import com.numberone.framework.web.base.BaseController;
import com.numberone.system.domain.DictData;
import com.numberone.system.service.IDictDataService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 字典数据 信息操作处理
 * 
 * @author numberone
 * @date 2019-05-09
 */
@Controller
@RequestMapping("/system/dictData")
public class DictDataController extends BaseController
{
    private String prefix = "system/dictData";
	
	@Autowired
	private IDictDataService dictDataService;
	
	@RequiresPermissions("system:dictData:view")
	@GetMapping()
	public String dictData()
	{
	    return prefix + "/dictData";
	}
	
	/**
	 * 查询字典数据列表
	 */
	@RequiresPermissions("system:dictData:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(DictData dictData)
	{
		startPage();
        List<DictData> list = dictDataService.selectDictDataList(dictData);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出字典数据列表
	 */
	@RequiresPermissions("system:dictData:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DictData dictData)
    {
    	List<DictData> list = dictDataService.selectDictDataList(dictData);
        ExcelUtil<DictData> util = new ExcelUtil<DictData>(DictData.class);
        return util.exportExcel(list, "dictData");
    }
	
	/**
	 * 新增字典数据
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存字典数据
	 */
	@RequiresPermissions("system:dictData:add")
	@Log(title = "字典数据", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(DictData dictData)
	{		
		return toAjax(dictDataService.insertDictData(dictData));
	}

	/**
	 * 修改字典数据
	 */
	@GetMapping("/edit/{dictCode}")
	public String edit(@PathVariable("dictCode") Integer dictCode, ModelMap mmap)
	{
		DictData dictData = dictDataService.selectDictDataById(dictCode);
		mmap.put("dictData", dictData);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存字典数据
	 */
	@RequiresPermissions("system:dictData:edit")
	@Log(title = "字典数据", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(DictData dictData)
	{		
		return toAjax(dictDataService.updateDictData(dictData));
	}
	
	/**
	 * 删除字典数据
	 */
	@RequiresPermissions("system:dictData:remove")
	@Log(title = "字典数据", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(dictDataService.deleteDictDataByIds(ids));
	}
	
}
