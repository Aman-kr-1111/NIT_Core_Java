package dec05.illegal_state_exception;

public class IllegalStateExceptionDemo {
	public static void throwIllegalException() {
		try {
			throw new IllegalStateException("MyException");
		} catch (IllegalStateException objA) {
			System.out.println("caught:" + objA);
		}
	}

	public static void main(String[] args) {

		System.out.println("Calling throwIllegalException from main method.");
		throwIllegalException();
	}

}
