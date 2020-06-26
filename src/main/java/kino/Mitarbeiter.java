package kino;

public class Mitarbeiter {

	private final MitarbeiterID mitarbeiterID;


	public Mitarbeiter(){
		this.mitarbeiterID= MitarbeiterID.create();

	}

	public void blockierGewünschtenSitzOderSitze(Sitz ... sitz){
		for(Sitz s: sitz){
			s.blockieren();
		}

	}

	public void entblockiereGewünschteSitzoderSitze(Sitz ... sitz){
		for(Sitz s: sitz){
			s.entblockieren();
		}
	}


	public void reserviereGewünschteSitzoderSitze(Vorfuehrung vorfuehrung, String name, String email, ReservierungsRepository reservierungsRepository,Sitz ... sitz){
		for(Sitz s: sitz){
			Reservierung reservierung= new Reservierung(vorfuehrung, s, name, email);
			reservierungsRepository.saveReservierungen(reservierung);
		}
	}


}
