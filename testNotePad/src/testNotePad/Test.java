package testNotePad;


class TestConnection {
	private boolean isOpen = false; 			// 커넥션 연결 여부
	private int data1;
	private int data2;
	
	public TestConnection() {
		this.isOpen = true;						// 커넥션 객체 생성 시 true
	}
	
	public void method1 (int data) {
		if(this.isOpen) {
			this.data1 = data;
			this.close();
		} else {
			System.out.println("연결이 닫혀있습니다.");
		}
	}
	
	
	public void close() {
		this.isOpen = false;
	}
	
}


























public class Test {

	public static void main(String[] args) {


	}

}
