package phase;

public class StringSearch extends AbstractSearch{
	
	@Override
	public boolean search(Object [] obj_list, Object obj) {
		for (Object o : obj_list) {
            if (o instanceof String && o.equals(obj)) {
                return true;
            }
        }
		return false;
	}


}
