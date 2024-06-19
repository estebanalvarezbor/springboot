package com.springboot.app.productos.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.app.productos.models.dao.ProductoDao;
import com.springboot.app.productos.models.entity.Producto;

@Service
public class ProductoServiceImpl implements IProductoService{
	
	@Autowired
	private ProductoDao productoDao;

	@Override
	@Transactional(readOnly=true)
	public List<Producto> encontrarTodos() {
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	public Producto encontarPorId(long id) {
		return (Producto) productoDao.findById(id).orElse(null);
	}

}
