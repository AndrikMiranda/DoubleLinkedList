package app;

import doubleLinkedList.doubleLinkedList;
import node.Node;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		doubleLinkedList<String> names = new doubleLinkedList<String>();
		
		names.addStart("Juanga");
		names.addStart("EseBatoLoko");
		names.addStart("Julio");
		names.addStart("Pancho");
		names.addStart("Gaby");
		names.addStart("Bato");
		names.addEnd("Este compa va al final");
		
		//names.Remplace("Gaby", "Gabo");
		names.AddBefore("Juanga", "kjahsdfkajhsdf");
		names.AddAfter("Juanga", "Pepappig");
		names.Size();
		//names.removeFirst();
		//names.removeLast();
		names.GetFirst();
		//names.GetLast();
		names.Reindex();
		names.IndexOf("Juanga");
		//names.Remove("Julio");
		
		//String resu = names.IsEmpty();
		//System.out.println(resu);
		
		//names.ClearAll();
		names.RemoveAfter("Gaby");
		names.RemoveBefore("Gaby");
		
		//Node<String> thaName = names.Search("pepa");
		//if(thaName!=null)
		//System.out.println(thaName.getValue());
		
		names.pranter();	
		
		
		//System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		//names.pronter();

			

	}

}
