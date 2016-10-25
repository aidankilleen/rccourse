package ie.rccourse;

import java.util.ArrayList;

public class SimpleCms {

	protected ArrayList<String> names;
	
	public SimpleCms() {
		names = new ArrayList<String>();
		names.add("David");
		names.add("Eoin");
		names.add("Annette");
		names.add("Leigh");
		names.add("Grainne");
		names.add("Aidan");
	}

	public ArrayList<String> getNames() {
		return names;
	}

	public void setNames(ArrayList<String> names) {
		this.names = names;
	}
	
}
