class IngyEnt{
	public static void main(String[] args) 
	{
		
		
		String word = "Aingy";
		System.out.println("New Language word: " + word);


		String sentence = "Frientgidingy wientntertime. Aingy tientnyingy moentnitoringy ruentns. Beenttrayedingy byingy theent byteents.";
		String output = "";
		System.out.println("\nSentence in the New Language: " + sentence + "\n");
		
		String ingy = "ingy";
String a = word.substring(word.indexOf("ent")-1,word.indexOf("ent"));
		 for (int i = sentence.length(); i >= 0; i--) {
        if (sentence.indexOf(" ") >= 0) {
        word = sentence.substring(0, sentence.indexOf(" "));
        sentence = sentence.substring(sentence.indexOf(" ") +1);
if (word.substring(word.length()-1,word.length()).equals("."))
{
if (word.substring(word.length()-1-ingy.length(),word.length()-1).equals("ingy"))
word = word.replace("ingy", "");
}
else
{
if (word.substring(word.length()-ingy.length(),word.length()).equals("ingy"))
word = word.replace("ingy", "");	
}

if (a.toLowerCase().equals("a") || a.toLowerCase().equals("e") || a.toLowerCase().equals("i") || a.toLowerCase().equals("o") || a.toLowerCase().equals("u"))
word=word.replace("ent", "");
else
word=word;

output += word + " ";
		}}
		System.out.println("Word translated to English: " + word);
						   

		System.out.println("Sentence translated to English: " + output);
  }
}