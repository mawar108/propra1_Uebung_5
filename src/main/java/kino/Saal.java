package kino;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Objects;

public class Saal {

//	private Zeitslot zeitslot;
//	private LinkedHashMap<SitzID, Sitz> sitz= new LinkedHashMap<SitzID, Sitz>();
	private int reihen;
	private int sitzeProReihe;
	private LinkedList<Sitz> saal= new LinkedList<>();
	private final SaalID id;

	public Saal(int reihen, int sitzeProReihe/*, Zeitslot zeitslot*/){
		if (reihen < 1  || sitzeProReihe<5) {
			throw new IllegalArgumentException("Saal zu klein, mindestens fünf Sitze und eine Reihe");
		}
		else{
			this.reihen=reihen;
			this.sitzeProReihe=sitzeProReihe;
//			this.zeitslot=zeitslot;
			for(int j= 1; j<=reihen; j++){
				for(int i =1; i<= sitzeProReihe; i++){
					Sitz sitz= new Sitz((char)(j+64) ,i);// Warum 64? Hier wird ASCII Code verwendet um druch das Alphabet gehen zu können
//					this.sitz.put(sitz.getSitzID(), sitz);
					this.saal.add(sitz);

				}
			}
			this.id= SaalID.create();
		}

	}

	public int getReihen() {
		return reihen;
	}

	public int getSitzeProReihe() {
		return sitzeProReihe;
	}

	public Sitz getSitz(int sitz){
		return saal.get(sitz -1);
	}

	public Sitz getSitz(Sitz sitz){// Verbesserung?
		int sitzplatz= getSitzeProReihe()*((int)sitz.getSitzreihe()-65)+ (sitz.getSitznummer()-1);// Bestimmung der Postion des Sitzes in der Liste
		return saal.get(sitzplatz);
	}

	public SaalID getSaalID(){
		return id;
	}
/*
	public Zeitslot getZeitslot() {
		return zeitslot;
	}
*/
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Saal saal = (Saal) o;
		return id.equals(saal.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

}
