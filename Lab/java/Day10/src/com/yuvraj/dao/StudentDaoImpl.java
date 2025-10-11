package com.yuvraj.dao;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.yuvraj.beans.Student;

public class StudentDaoImpl implements StudentDao{
	static Set <Student> eset;
	
	static {
		eset=new HashSet<>();
		
		eset.add(new Student(101,"yuvraj",99));
		eset.add(new Student(102,"raju",94));
		eset.add(new Student(103,"raj",49));
		eset.add(new Student(104,"sairaj",20));
		eset.add(new Student(105,"sai",56));
	}
	
	


	@Override
	public boolean save(Student e) {
			
			return eset.add(e);
		}
		@Override
		public Set<Student> findAll() {
			
			return eset;
		}
		@Override
		public Student findById(int id) {
			for(Student e : eset) {
				if(e.getSid()==id) {
					return e;
				}
			}
			
		Optional<Student> ob= eset.stream().filter(e->e.getSid()==id).findFirst();
		 if(ob.isPresent()) {
		 return ob.get();
			 }
		return null;
		}
		@Override
		public Set<Student> findByName(String nm) {
		   Set<Student> es = new HashSet<>();
		   for(Student e : eset) {
			   if(e.getSname().equals(nm)) {
				   es.add(e);
			   }
		   }
//			Set<Student> es = eset.stream().filter(e->e.getSname().equals(nm)).collect(Collectors.toSet());
		    
			if(es.size()>0) {
			   return es;
		   }
			return null;
		}
		@Override
		public Set<Student> findByMark(int mk) {
		    Set<Student> es = new HashSet<>();
		    for (Student s : eset) {
		        if (s.getM1() < mk) {
		            es.add(s);
		        }
		    }
		    return es.isEmpty() ? null : es;
		}


		
		
		
		
		
//		@Override
//		public boolean removeBySal(double sal) {
//		// TODO Auto-generated method stub
//			return eset.removeIf(e->e.getmark()>sal);
//			
//		}
//		
//		@Override
//		public boolean removeById(int id) {
//			return eset.remove(new Student(id));
//		}
//		
//		@Override
//		public boolean updateBySal(int id, double sal) {
//			// TODO Auto-generated method stub
//			Student e = findById(id);
//			if(e != null) {
//				e.setSal(sal);
//				return true;
//			}
//			return false;
//		}
//		
	
//		@Override
//		public Set<Student> sortByRoll() {
//			Set<Student> tset=new TreeSet<>();
//			for(Student e:eset) {
//				tset.add(e);
//			}
//			return tset;
//			
//		}
		@Override
		public List<Student> sortByName() {
			Comparator<Student> c=(o1,o2)->{
				System.out.println("in name comparator "+o1.getSname()+"-----"+o2.getSname());
				return o1.getSname().compareTo(o2.getSname());
			};
			//duplicate names will not be considered
			//Set<Student> tset=new TreeSet<>(c);
			List<Student> elist=new ArrayList<>();
			for(Student e:eset) {
				elist.add(e);
			}
			elist.sort(c);
			return elist;
		}
//		@Override
//		public List<Student> sortBySal() {
//			Comparator<Student> csal=(o1,o2)->{
//				System.out.println("in sal comparator "+o1.getSal()+"-----"+o2.getSal());
//				return (int)(o1.getSal()-o2.getSal());
//			};
//			List<Student> elist=new ArrayList<>();
//			for(Student e:eset) {
//				elist.add(e);
//			}
//			elist.sort(csal);
//			return elist;
//			
//		}
//		@Override
//		public boolean removeByMark(int mark) {
//			// TODO Auto-generated method stub
//			return false;
//		}

    
	    
	
}
