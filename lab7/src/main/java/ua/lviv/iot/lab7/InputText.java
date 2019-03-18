package ua.lviv.iot.lab7;

public class InputText {
	public String inputText;
	public int loundes = 0;

	public String getInputText() {
		return inputText;
	}

	public void setInputText(String inputText) {
		this.inputText = inputText;
	}

	public InputText(String inputText) {
		this.inputText = inputText;
	}
	
	public int countLoudLetters () {
		loundes = 0;
		for(char c : inputText.toCharArray()){
		   if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
			   loundes++;
		   }
		   if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
			   loundes++;
		   }
		}
		return loundes; 
	}
	
	public void showResults() {
		System.out.println("Number of loundes: "+loundes);
	}
	
}
