package com.qa.SentenceReduction;

public class test {

	public test() {
		// TODO Auto-generated constructor stub
	}
	private static String[] inputs = {"I heard the pastor sing live verses easily.", 
			"Deep episodes of Deep Space Nine came on the television only after the news.", 
			"Digital alarm clocks scare area children."};

public static void main(String[] args) {
for(int x = 0; x < inputs.length; x++) {
String[] words = inputs[x].split(" ");
String finalOutput = "";

for(int i = 1; i < words.length; i++) {
    int letterCount = 1;
    int highestValidLetterCount = 0;

    while(letterCount <= words[i - 1].length() && letterCount <= words[i].length()) {
	    if(words[i - 1].substring(words[i - 1].length() - letterCount, words[i - 
1].length()).equals(words[i].substring(0, letterCount)))
		    highestValidLetterCount = letterCount;
	
	    letterCount++;
    }

    if(highestValidLetterCount > 0 && i == words.length - 1)
	    finalOutput += words[i - 1].substring(0, words[i - 1].length() - highestValidLetterCount) + " " + 
words[i].substring(highestValidLetterCount);
    else if(i == words.length - 1)
	    finalOutput += words[i - 1] + " " + words[i];
    else if(highestValidLetterCount > 0)
	    finalOutput += words[i - 1].substring(0, words[i - 1].length() - highestValidLetterCount);
    else
	    finalOutput += words[i - 1] + " ";
}

System.out.println(finalOutput);
}
}

}