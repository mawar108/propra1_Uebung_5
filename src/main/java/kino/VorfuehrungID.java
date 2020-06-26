package kino;

import java.util.UUID;

public class VorfuehrungID extends AbstractID   {
	protected VorfuehrungID(UUID id){
		super(id);
	}

	public static VorfuehrungID create(){
		return new VorfuehrungID(UUID.randomUUID());
	}


}




