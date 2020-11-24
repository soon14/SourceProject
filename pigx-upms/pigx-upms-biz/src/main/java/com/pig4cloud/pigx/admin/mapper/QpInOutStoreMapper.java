/*
 *    Copyright (c) 2018-2025, lengleng All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the pig4cloud.com developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: lengleng (wangiegie@gmail.com)
 */

package com.pig4cloud.pigx.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pig4cloud.pigx.admin.entity.QpInOutStore;
import com.pig4cloud.pigx.common.data.datascope.DataScope;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 气瓶出入库记录表
 *
 * @author wh
 * @date 2020-04-03 14:05:09
 */
public interface QpInOutStoreMapper extends BaseMapper<QpInOutStore> {

	/**
	 * 分页查询
	 * @param page
	 * @param qpInOutStore
	 * @param dataScope
	 * @return
	 */
	IPage getQpInOutStorePage(Page page, @Param("query") QpInOutStore qpInOutStore, DataScope dataScope);


	List<Map<String, Object>> getQpInOutStoreListByCode(@Param("query") QpInOutStore qpInOutStore);

}
