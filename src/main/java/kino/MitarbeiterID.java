package kino;

import java.util.UUID;

public class MitarbeiterID extends AbstractID{

	protected MitarbeiterID(UUID id){
		super(id);
	}

	public static MitarbeiterID create(){
		return new MitarbeiterID(UUID.randomUUID());
	}

}
