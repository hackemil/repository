package I31;

import java.nio.channels.UnsupportedAddressTypeException;

public class Penguin extends Bird {
@Override

public void fly() {
throw new UnsupportedOperationException("Penguins cant fly!");

}
}
