package kino;

public class Reservierung {

//	private Zeitslot zeitslot;
//	private Mitarbeiter mitarbeiter;
	private String name;
	private String email;
	private Sitz sitz;
	private Vorfuehrung vorfuehrung;
//	private Zeitslot zeitslot;
	final private ReservierungID id;


	public Reservierung(){
		this.id=null;
	}

//	public Reservierung(Sitz sitz, Zeitslot zeitslot, String name, String email) {
	public Reservierung(Vorfuehrung vorfuehrung, Sitz sitz, String name, String email){
		if(sitz.getBlockiert()==false){
			this.id= null;
			System.out.println("Erst blockieren/vorbestellen!");
		}
		else {
			this.name = name;
			this.email = email;
			this.sitz = sitz;
			vorfuehrung.getSaal().equals(sitz);
//		this.zeitslot= zeitslot;
			this.id = ReservierungID.create();
		}
	}

	public String getName() {
		return name;
	}

	public String getEmail(){
		return email;
	}

	public ReservierungID getReservierungId() {
		return id;
	}

/*	public Zeitslot getZeitslot(){
		return zeitslot;
	}
*/
	public Sitz getSitz(){
		return sitz;
	}


	public Reservierung loescheReservierung(ReservierungID id){

		return new Reservierung();
	}

	public void sendeReservierungAnKunde(Reservierung reservierung){
		System.out.println("Sende Email an "+ reservierung.name+ " mit der Email "+ reservierung.email +" und der ReservierungsID "+ reservierung.id);
	}


	//Evtl wichtig wenn man sich vertippt?
	public void changeName(String name) {
		this.name = name;
	}
}
