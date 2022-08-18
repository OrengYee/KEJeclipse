package projectA11S01;

public class projectA1106 {

	public static void main(String[] args) {
		Airplane airplane = new Airplane();
		
		airplane.takeOff();
		airplane.fly();
		airplane.land();
		
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();

	}

}
