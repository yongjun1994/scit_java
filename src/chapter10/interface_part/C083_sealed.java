package chapter10.interface_part;

abstract sealed class Language 
// 3가지 클래스에 대해서만 상속을 허용
	permits Java, Cpp, CSharp { }

// 허가를 못받아 상속 못함
//final class Python extends Language ( )  // 상속 제한
final class Java 	extends Language { }
//final class Cpp 	extends Language { }
//final class CSharp 	extends Language { }

//final class OpenJava extends Java { }	// 상속 제한
// Cpp로부터는 두 개의 클래스 파생 가능
sealed class Cpp extends Language permits C11, C20{ }
final class C11 extends Cpp { }
final class C20 extends Cpp { }

// CSharp로 부터는 임의의 클래스 파생 가능
non-sealed class CSharp extends Language { }
final class CSharpCore extends CSharp { }

public class C083_sealed {

	public static void main(String[] args) {
		
		/*
		 * 	상속 제한
		 * 	final		: 더 이상 파생할 수 없다.
		 *  sealed		: 지정한 후손에 대해서만 파생을 허가
		 *  non-sealed	: 제한 없이 파생 가능
		 */
		Language lang_java = new Java();
		outLanguageName(lang_java);
	}
	
	public static void outLanguageName(Language lang) {
		if (lang instanceof Java) {
			System.out.println("자바");
		} else if (lang instanceof Cpp) {
			System.out.println("C++");
		} else if (lang instanceof CSharp) {
			System.out.println("C#");
		}
	}

}
