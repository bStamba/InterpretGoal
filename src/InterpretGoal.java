import java.util.HashMap;

public class InterpretGoal {

    public String interpret(String command) {

        StringBuilder ans = new StringBuilder();

        //Loop through the String, if the letter is G then we add G to our stringbuilder,
        //if its not G, then we check i + 1 element to see if it is an 'a' or a ')'. We then add
        //the appropriate letters o, or al, and increment i accordingly.
        for(int i = 0; i < command.length(); i++){
            if(command.charAt(i) == 'G'){
                ans.append("G");
            }
            else if(command.charAt(i + 1)  == ')'){
                ans.append("o");
                i = i + 1;
            }
            else{
                ans.append("al");
                i = i + 3;
            }
        }

        return ans.toString();
    }
}
