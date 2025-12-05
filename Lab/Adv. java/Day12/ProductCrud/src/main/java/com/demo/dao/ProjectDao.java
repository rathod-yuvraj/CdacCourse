package com.demo.dao;

import java.util.Set;

import com.demo.beans.Project;

public interface ProjectDao {

	void save(ProjectDao p);
	Set<ProjectDao> findbypid (String[] parr);
	
	Project findbypid(int pid);
	
	
}
