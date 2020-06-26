package kino;

public class Vorfuehrung {

	private Saal saal;
	private Zeitslot zeitslot;
	private final VorfuehrungID vorfuehrungID;


	public Vorfuehrung(Saal saal, Zeitslot zeitslot){
		this.saal=saal;
		this.zeitslot=zeitslot;
		this.vorfuehrungID= VorfuehrungID.create();
	}

	public void blockieren(Sitz sitz){
		saal.getSitz(sitz).blockieren();
	}

	public Saal getSaal() {
		return saal;
	}

	public Zeitslot getZeitslot() {
		return zeitslot;
	}

	public VorfuehrungID getVorfuehrungID() {
		return vorfuehrungID;
	}

	public void vorfuehrungsPlan(){
		for(int i = 0; i<saal.getReihen();i++){
			for(int j =1 ; j<=saal.getSitzeProReihe(); j++){
				if(saal.getSitz(i* saal.getSitzeProReihe()+j).getBlockiert() == false){
					System.out.print("_");
				}
				else{
					System.out.print("X");
				}
			}
			System.out.println();
		}
	}


}
