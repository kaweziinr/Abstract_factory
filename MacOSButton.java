package button;

public class MacOSButton implements Button{
	
	//Um dos tipos de Button reescrevendo o metodo paint do button
	
	@Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}