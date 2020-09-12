package com.udacity.jokesource;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JokeSource {
    private List<String> mJokes;

    public JokeSource() {
        mJokes = new ArrayList<>();
        mJokes.add("A man walks into a zoo, the only animal in the entire zoo is a dog. It was a Shitzu.");
        mJokes.add("Did you guys hear the joke about the high wall? It's hilarious, I'm still trying to get over it!");
        mJokes.add("Two hunters are out in the woods when one of them collapses. He\'s not breathing and his eyes are glazed. The other guy whips out his cell phone and calls 911.\n" +
                "\n" +
                "\"I think my friend is dead!\" he yells. \"What can I do?\"\n" +
                "\n" +
                "The operator says, \"Calm down. First, let\'s make sure he\'s dead.\"\n" +
                "\n" +
                "There\'s a silence, then a shot. Back on the phone, the guy says, \"OK, now what?\"");
        mJokes.add("A turtle is crossing the road when he\'s mugged by two snails. When the police show up, they ask him what happened. The shaken turtle replies, \"I don\'t know. It all happened so fast.\"");
        mJokes.add("A priest, a minister, and a rabbi want to see who\'s best at his job. So they each go into the woods, find a bear, and attempt to convert it. Later they get together. The priest begins: \"When I found the bear, I read to him from the Catechism and sprinkled him with holy water. Next week is his First Communion.\"\n" +
                "\n" +
                "\"I found a bear by the stream,\" says the minister, \"and preached God\'s holy word. The bear was so mesmerized that he let me baptize him.\"\n" +
                "\n" +
                "They both look down at the rabbi, who is lying on a gurney in a body cast. \"Looking back,\" he says, \"maybe I shouldn\'t have started with the circumcision.\"");
        mJokes.add("Why do they lock gas station bathrooms? Are they afraid someone will clean them?");
        mJokes.add("A guy spots a sign outside a house that reads \"Talking Dog for Sale.\" Intrigued, he walks in.\n" +
                "\n" +
                "\"So what have you done with your life?\" he asks the dog.\n" +
                "\n" +
                "\"I\'ve led a very full life,\" says the dog. \"I lived in the Alps rescuing avalanche victims. Then I served my country in Iraq. And now I spend my days reading to the residents of a retirement home.\"\n" +
                "\n" +
                "The guy is flabbergasted. He asks the dog\'s owner, \"Why on earth would you want to get rid of an incredible dog like that?\"\n" +
                "\n" +
                "The owner says, \"Because he\'s a liar! He never did any of that!\"");
        mJokes.add("In surgery for a heart attack, a middle-aged woman has a vision of God by her bedside. \"Will I die?\" she asks.\n" +
                "\n" +
                "God says, \"No. You have 30 more years to live.\"\n" +
                "\n" +
                "With 30 years to look forward to, she decides to make the best of it. So since she\'s in the hospital, she gets breast implants, liposuction, a tummy tuck, hair transplants, and collagen injections in her lips. She looks great! The day she\'s discharged, she exits the hospital with a swagger, crosses the street, and is immediately hit by an ambulance and killed. Up in heaven, she sees God. \"You said I had 30 more years to live,\" she complains.\n" +
                "\n" +
                "\"That\'s true,\" says God.\n" +
                "\n" +
                "\"So what happened?\" she asks.\n" +
                "\n" +
                "God shrugs. \"I didn\'t recognize you.\"");
        mJokes.add("A car hit an elderly man. The paramedic says, \"Are you comfortable?\"\n" +
                "\n" +
                "The man says, \"I make a good living.\"");
        mJokes.add("A poodle and a collie are walking together when the poodle suddenly unloads on his friend. \"My life is a mess,\" he says. \"My owner is mean, my girlfriend ran away with a schnauzer, and I\'m as jittery as a cat.\"\n" +
                "\n" +
                "\"Why don\'t you go see a psychiatrist?\" suggests the collie.\n" +
                "\n" +
                "\"I can\'t,\" says the poodle. \"I\'m not allowed on the couch.\"");
    }

    public String getJoke() {
        Random random = new Random(System.currentTimeMillis());
        return mJokes.get(random.nextInt(10));
    }
}