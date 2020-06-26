package kino;

public class Sitz {

	private char sitzreihe;
	private int sitznummer;
//	private final SitzID sitzID;
	private boolean blockiert;


	public Sitz(char sitzreihe, int sitznummer){
		this.sitzreihe= sitzreihe;
		this.sitznummer = sitznummer;
//		this.sitzID = SitzID.create();

	}

	public void blockieren(){
		this.blockiert=true;
	}

	public void entblockieren(){
		this.blockiert=false;
	}

	public boolean getBlockiert(){
		return blockiert;
	}

	public char getSitzreihe(){
		return sitzreihe;
	}

	public int getSitznummer(){
		return sitznummer;
	}

	public void printSitz(){
		System.out.print(sitzreihe);
		System.out.print(sitznummer);
	}


/*
	public SitzID getSitzID() {
		return sitzID;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Sitz sitz = (Sitz) o;
		return sitzID.equals(sitz.sitzID);
	}

	@Override
	public int hashCode() {
		return Objects.hash(sitzID);
	}
*/
}
