package chapter6;
import com.ljx.hello.StaticImport;
public class TestStaticImport {

	public static void main(String[] args) {
		StaticImport s = new StaticImport();
		com.ljx.hello.StaticImport s3 = new com.ljx.hello.StaticImport();
		s3.debug();
		s.debug();
	}
}
