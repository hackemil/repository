import java.util.Iterator;

public class Main3 {
public static void main(String[] args) {
	Bookk[] boooks = new Bookk[3];
	
	boooks[0] = new Bookk("Letting Go","Philip Roth");
	boooks[1] = new Bookk("Fear of Flying"," Erica Jong");
	boooks[2] = new Bookk("dasd","asdsad");
	
	
	
	for (int i = 0; i < boooks.length; i++) {
		System.out.println(boooks[i].getBookkInfo());
	}
}
}
