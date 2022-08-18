package projectA13;

class ButtonA {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	void touch() {
		this.listener.OnClick();
	}
	
	interface OnClickListener {
		void OnClick();
	}
}

class WindowA {
	ButtonA button1 = new ButtonA();
	ButtonA button2 = new ButtonA();
	
	ButtonA.OnClickListener listener = new ButtonA.OnClickListener() {
		
		public void OnClick() {
			System.out.println("전화를 겁니다.");
			
			
			
		};
	}
	
}


}

public class projectA1308 {

	public static void main(String[] args) {
		

	}

}
