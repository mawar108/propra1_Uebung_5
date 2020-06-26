package kino;

import java.util.HashMap;

public class ReservierungsRepository {

	private final HashMap<ReservierungID, Reservierung> reservierungen= new HashMap<>();

	public void saveReservierungen(Reservierung reservierung){
		reservierungen.put(reservierung.getReservierungId(), reservierung);
	}

	public Reservierung findSaalByID(ReservierungID id){
		return reservierungen.get(id);
	}


}
