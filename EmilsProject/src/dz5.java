
public class dz5 {
public static void main(String[] args) {
	StringBuilder sBuilder = new StringBuilder("Programming");
	sBuilder.append(" java is awesome");
	System.out.println(sBuilder);
	
	StringBuilder sBuilder1 = new StringBuilder("java is awesome");
	sBuilder.delete(10,14);
	System.out.println(sBuilder);
	
	StringBuilder sBuilder2 = new StringBuilder("Programming");
	sBuilder.append(" java is awesome");
	System.out.println(sBuilder);
	
	StringBuilder sBuilder3 = new StringBuilder("java is awesome");
	sBuilder.reverse();
	System.out.println(sBuilder);
	
	StringBuilder sBuilder4 = new StringBuilder("java is awesome");
	sBuilder.replace(8,14,"fantastic");
	System.out.println(sBuilder);
	
	
}
}
