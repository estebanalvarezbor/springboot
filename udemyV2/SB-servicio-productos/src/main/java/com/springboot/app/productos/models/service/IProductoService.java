package com.springboot.app.productos.models.service;

import java.util.List;

import com.springboot.app.productos.models.entity.Producto;

public interface IProductoService {
	
	public List<Producto> encontrarTodos();
	
	public Producto encontarPorId(long id);

}
