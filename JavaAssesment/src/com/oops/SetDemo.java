package com.oops;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet
				HashSet h=new HashSet();
				h.add("HEllo");
				h.add(126);
				h.add(1.20012);
				
				/*//LinkedHashSet
						LinkedHashSet lhs=new LinkedHashSet();
						lhs.add("HEllo");
						lhs.add(126);
						lhs.add(1.20012);*/
				/*//LinkedHashSet
				LinkedHashSet lhs=new LinkedHashSet();
				lhs.add("HEllo");
				lhs.add(126);
				lhs.add(1.20012);*/
				/*//SortedSet
				SortedSet ss=new SortedSet();
				ss.add("HEllo");
				ss.add(126);
				ss.add(1.20012);*/
				/*//TreeSet
				TreeSet ts=new TreeSet();
				ts.add("HEllo");
				ts.add(126);
				ts.add(1.20012);*/

				Iterator it=h.iterator();
				while(it.hasNext()){
					System.out.println(it.next());
				}
				

			}

		}