package com.example.demo;

import java.util.List;

@Service
public class Service
{
 private Repository repository;
 public List<model> allData(){
	 return repository.findAll();
 }
 public model saveData(model model) {
	 return repository.save(model);
 }
}