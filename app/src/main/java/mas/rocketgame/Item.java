package mas.rocketgame;

/**
 * Created by ZackMyrick on 11/28/17.
 */

public class Item {

    private String question, answer;

    public Item(String question, String answer){
        this.question = question;
        this.answer = answer;

    }

    public String getQuestion(){
        return question;
    }

    public String getAnswer(){
        return answer;
    }
}
