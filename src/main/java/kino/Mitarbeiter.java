package kino;

public class Mitarbeiter {

	private final MitarbeiterID mitarbeiterID;


	public Mitarbeiter(){
		this.mitarbeiterID= MitarbeiterID.create();

	}

	public void blockierGewuenschtenSitzOderSitze(Vorfuehrung vorfuehrung, Sitz ... sitz){
		for(Sitz s: sitz){
			vorfuehrung.blockieren(s);
		}

	}

	public void entblockiereGewuenschteSitzoderSitze(Vorfuehrung vorfuehrung, Sitz ... sitz){
		for(Sitz s: sitz){
			s.entblockieren();
		}
	}


	public void reserviereGewuenschteSitzoderSitze(Vorfuehrung vorfuehrung, String name, String email, ReservierungsRepository reservierungsRepository,Sitz ... sitz){
		for(Sitz s: sitz){
			Reservierung reservierung= new Reservierung(vorfuehrung, s, name, email);
			reservierungsRepository.saveReservierungen(reservierung);
		}
	}


}
