Aimport java.util.Date;

public class AlfredQuotes {
    /*
    * Inputs: None
    * Return Type: String
    * Description: Returns a generic greeting that Alfred will say to anyone.
    */

    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    /* 
    * Inputs: String name, String dayPeriod 
    *                      Assume "morning", "afternoon" or "evening".
    * Return Type: String
    * Description: Returns a greeting that includes the person's name
    *         as well as the day period. For example:
    *        "Good evening, Beth Kane. Lovely to see you."
    * Tip: Try using the String.format method for string interpolation in Java.
    */
    public String guestGreeting(String name, String dayPeriod) {
        // NOTE: line 25/26, I did not need these as they are already parameters, the arguments come from AlfredTest.java
        // String name = new Name();  
        // String dayPeriod =  new DayPeriod();
        String greeting = String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
        return greeting;
    }
    /* 
    * Inputs: None
    * Return Type: String
    * Description: Returns a polite announcement of the current date.
    */
    public String dateAnnouncement() {
        Date date = new Date();
        return "Yes, Yes, today's date is: " + date;
    }
    /*********************************************
    Final Challenge!
    Alfred is listening. Write a method that accepts any string of conversation. 
    If "Alexis" appears in the conversation return a snarky response, such as:
    "Right away, sir. She certainly isn't sophisticated enough for that." 
    
    If "Alfred" is in the conversation return an obliging response, for example: 
    "At your service. As you wish, naturally." 
    
    If neither name is found, return an appropriate response, for instance:
    "Right. And with that I shall retire." 
    **********************************************/
    /*
    * Inputs: String (A conversation)
    * Return Type: String (Something Alfred would say in response)
    * 
    * Tip: Use the indexOf String method
    */
    public String respondBeforeAlexis(String conversation) {

        if(conversation.indexOf("Alexis") >= 0) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if(conversation.indexOf("Alfred") >= 0) {
            return "At your service. As you wish, naturally.";
        } else {return "Right. And with that I shall retire.";}
    }

    public String guestGoodBye(String name, String superHero) {
        String fareWell = String.format("%s, have a wonderful evening. Tell %s they aren't good at their job", name, superHero);
        return fareWell;
    }
}