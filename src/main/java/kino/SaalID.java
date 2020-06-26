package kino;

import java.util.UUID;

public class SaalID extends AbstractID {

	protected SaalID(UUID id){
		super(id);
	}

	public static SaalID create(){
		return new SaalID(UUID.randomUUID());
	}


}
