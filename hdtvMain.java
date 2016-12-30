//assignment 9.1
package java_session9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

	class hdtv
	{
		String Brandname;
		int    Size;
		ArrayList<hdtv> al= new ArrayList<hdtv>();
		
			hdtv(String Brandname,int Size)
			{
				this.Brandname=Brandname;
				this.Size=Size;
				
			}
		
		public hdtv() {
				// TODO Auto-generated constructor stub
			}

			//for adding to arraylist
			void add(hdtv o)
			{
				al.add(o);
			}
	}
	
	class hdtvarr implements Comparator
	{
		

		public int compare(Object arg0, Object arg1) {
			// TODO Auto-generated method stub
			hdtv tv1 = (hdtv)arg0;
			hdtv tv2 = (hdtv)arg1;
			
			if(tv1.Size==tv2.Size)
				return 0;
			else if(tv1.Size>tv2.Size)
				return 1;
			else
				return -1;
		} 
	}

public class hdtvMain{

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hdtv tv11 = new hdtv();
		ArrayList<hdtv> al= new ArrayList<hdtv>();
		
		
		hdtv tv1 = new hdtv("Sony bravia",55);
		hdtv tv2 = new hdtv("Sony bravia",42);
		hdtv tv3 = new hdtv("Sony bravia",65);
		
		al.add(tv1);
		al.add(tv2);
		al.add(tv3);
		
		System.out.println("Tv before sorting");
		System.out.println("=================");
		
		tv1=null;
		tv2=null;
		tv3=null;
		
		Iterator<hdtv> it = al.iterator();
		tv11 = new hdtv(); 
		while(it.hasNext())
			{
			tv11 = it.next();
			System.out.println("BrandName = "+tv11.Brandname+"\nSize = "+tv11.Size);
			}
		
			Collections.sort(al, new hdtvarr());
			
			
			System.out.println("Tv after sorting");
			System.out.println("=================");
			
			tv1=null;
			tv2=null;
			tv3=null;
			
			Iterator<hdtv> it1 = al.iterator();
			while(it1.hasNext())
				{
				tv11 = it1.next();
				System.out.println("BrandName = "+tv11.Brandname+"\nSize = "+tv11.Size);
				}
			
				
	}

}
