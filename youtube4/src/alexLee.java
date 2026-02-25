
public class alexLee {
	String food;
	char size;
	int a = 0; 
	int c = 9;
	static class Inside{
		int b = 5;
	}
	
	public void setData(String food,char size) {
		this.food = food;
		this.size= size;
	}
	public static void main(String[] args) {
		
		alexLee t = new alexLee();
		t.setData("soup",'L');
		System.out.println(t.food);
		System.out.println(t.size);
		
		alexLee.Inside i = new alexLee.Inside();
		System.out.println(i.b);
		
		alexLee z = new alexLee(); 
		System.out.println(z.a+z.c +i.b);
		
	}

}
