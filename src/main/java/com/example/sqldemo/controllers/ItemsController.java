package com.example.sqldemo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.sqldemo.models.Item;

@RestController
@RequestMapping("/api/v1/items")
public class ItemsController {
	@GetMapping
	public List<Item> list() {
		List<Item> items = new ArrayList<>();
		return items;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Item item) {
		
	}
	
//	@GetMapping("/${id}")
//	public Item get(@PathVariable("id") long id) {
//		return new Item();
//	}
}