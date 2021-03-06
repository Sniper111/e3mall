package cn.e3mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemService;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {
	@Autowired
	private TbItemMapper itemMapper;

	@Override
	public TbItem findByItemId(Long itemid) {
		return itemMapper.selectByPrimaryKey(itemid);
	}

}
