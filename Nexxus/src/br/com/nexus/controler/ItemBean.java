package br.com.nexus.controler;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import br.com.nexus.DAO.ItemDAO;
import br.com.nexus.model.Item;

@ManagedBean
public class ItemBean extends Bean{
	
	private static final long serialVersionUID = 1L;
	
	private Item item = new Item();
	private List<Item> items;
	private Item itemPesquisa;
	private Item selectItem = new Item();
	
	@Inject 
	ItemDAO itemDAO;
	
	public void init() {
		itemPesquisa = new Item();
//		selectItem = new Item();
	}

	public void adicionaItem() {
		this.item.setId(null);
		itemDAO.save(this.item);
		this.item = new Item();
	}
	
	public Item getItemPesquisa() {
		return itemPesquisa;
	}
	
	public void setItemPesquisa(Item itemPesquisa) {
		this.itemPesquisa = itemPesquisa;
	}
	
	public ItemDAO getItemDAO() {
		return itemDAO;
	}
	
	public void setItemDAO(ItemDAO itemDAO) {
		this.itemDAO = itemDAO;
	}

	public void alterarItem() {
		itemDAO.alterarItem(selectItem);
		this.selectItem = new Item();
	}

	public List<Item> getItems() {
		if (items == null) {
			items = (List<Item>) itemDAO.getAll(Item.class);
		}
		return items;
	}
	
	public Item getSelectItem() {
		return selectItem;
	}

	public void setSelectItem(Item selectItem) {
		this.selectItem = selectItem;
	}

	public Item getItem() {
		return item;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public void setItem(Item item) {
		this.item = item;
	}

}
	