package kino;

import java.util.HashMap;

public class VorfuehrungRepository {

	private final HashMap<VorfuehrungID,Vorfuehrung> vorfuehrungen = new HashMap<>();

	public void saveVorfuehurng(Vorfuehrung... vorfuehrung){
		for(Vorfuehrung vorf: vorfuehrung)
			vorfuehrungen.put(vorf.getVorfuehrungID(), vorf);
	}

	public Vorfuehrung findVorfuehrungByID(VorfuehrungID id){
		return vorfuehrungen.get(id);
	}

	public void deleteVorfuehrung(VorfuehrungID id){
		vorfuehrungen.remove(id);
	}

}
