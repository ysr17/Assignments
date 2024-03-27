package phase;

public class IntegerSearch extends AbstractSearch {
	
	@Override
	public boolean search(Object [] obj_list, Object obj) {

    for(int index=0; index<obj_list.length;index++) {
	int objFromList=(int) obj_list[index];
	if(objFromList == (int)obj ) {	
	    System.out.println("Eureka Eureka !!!");
		return true;
	}else {
		System.out.println("OMG where is the obj");
	}
}
// TODO Auto-generated method stub
return false;
}
}