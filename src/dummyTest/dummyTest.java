package dummyTest;
import org.testng.annotations.*;

@Test
public class dummyTest {


	
	@Test(invocationCount=3,timeOut =3000)
	public void computer() {
		System.out.println("driver");
	}
	
	@Test(invocationCount =3,timeOut=3000)
	public void age() {
		System.out.println(28);
	}
@Test(invocationCount =3,timeOut=3000)
	public void book() {
		System.out.println("shakespeare");
	}
	
	

}


