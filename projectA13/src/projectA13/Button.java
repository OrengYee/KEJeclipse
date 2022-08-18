package projectA13;

public class Button {
	
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.OnClick();
	}
	
	interface OnClickListener {
		void OnClick();
		
	}

}
