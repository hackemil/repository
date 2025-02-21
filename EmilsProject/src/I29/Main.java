package I29;

import java.util.Iterator;

public class Main {
public static void main(String[] args) {
	Instrument[] instruments = {new Guitar(),new Piano()};
	for (Instrument instrument : instruments) {
		instrument.playsound();
		
	}
}
}
