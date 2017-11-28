package mas.rocketgame;

/**
 * Created by ZackMyrick on 11/28/17.
 */

public class Questions {

    public String myQuestions[] = {

            "An asthma attack can be triggered by getting mad.",
            "Many people with asthma also have allergies.",
            "If exercise triggers asthma attacks, you should avoid working out.",
    };

    public String myAnswers[] = {
            "true",
            "true",
            "false",
    };

    public String getQuestion(int number)
    {
        return myQuestions[number];
    }

    public String getAnswer(int number)
    {
        return myAnswers[number];
    }
}
