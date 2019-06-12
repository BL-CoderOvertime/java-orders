package com.wkdrabbit.crudycustomers.service

import com.wkdrabbit.crudycustomers.model.Orders

interface OrdersService {

    fun findAll(): MutableList<Orders>

    fun findOrdersById(id: Long): Orders

    fun findOrdersByName(name: String): Orders

    fun delete(id: Long)

    fun save(agent: Orders): Orders

    fun update(agent: Orders, id: Long): Orders
}