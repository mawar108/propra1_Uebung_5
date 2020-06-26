package kino;

import java.util.UUID;

public class ReservierungID extends AbstractID{

	protected ReservierungID(UUID id){
		super(id);
	}

	public static ReservierungID create(){
		return new ReservierungID(UUID.randomUUID());
	}
}